[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/E72U83df)
# Digital Payment & Billing System

Required Project Structure (DO NOT MODIFY)

```yaml
src/java/com/billing/

    model/
        BillableItem.java
        PhysicalProduct.java
        DigitalProduct.java

    payment/
        PaymentMethod.java
        CreditCardPayment.java
        BankTransferPayment.java
        QRCodePayment.java

    service/
        CheckoutService.java

    App.java
```
If you rename, move, or modify signatures -> tests fail.

## PART 1 — Abstract Class

### BillableItem

Requirements:
-	Must be abstract
-	Fields:
    -	name (String)
    -	basePrice (double)
-	Constructor:
    -	name cannot be null or blank
    -	basePrice must be > 0
    -	otherwise throw IllegalArgumentException
-	No setter for `name`
-	`setBasePrice()` allowed with validation
-	Abstract method:

    ```java
    public abstract double calculatePrice();
    ```

- Concrete method:
  ```java
  public String getDescription()
  ```
  Format:
  ```yaml
  <name> - $<calculatedPrice>
  ```

## PART 2 — Concrete Classes

They must be inherited from the abstract class `BillableItem`.

### PhysicalProduct

Additional field:
-	weight (double)

Rules:
-	weight must be > 0
-	Shipping cost = `weight × 2`
-	Final price = `basePrice + shipping`

### DigitalProduct

Additional field:
-	`fileSizeMB `(double)

Rules:
-	`fileSizeMB` must be > 0
-	Final price = `basePrice`


## PART 3 — Interface

### PaymentMethod
```java
public interface PaymentMethod {
    boolean pay(double amount);
    String getPaymentType();
}
```
### Implementations

#### `CreditCardPayment`

-	Field: cardNumber
-	cardNumber cannot be null or blank
-	Payment fails if amount > 5000
-	getPaymentType() returns "CREDIT_CARD"

#### `BankTransferPayment`

-	Always succeeds
-	getPaymentType() returns "BANK_TRANSFER"

#### `QRCodePayment`

-	Fails if amount < 1
-	getPaymentType() returns "QR_CODE"

## PART 4 — Service Layer

### CheckoutService

```java
public class CheckoutService {
    public boolean checkout(BillableItem item, PaymentMethod payment)
}
```
**Logic**:

1.	Calculate price using polymorphism
2.	Call payment.pay(amount)
3.	Return result

No extra logic.

**You can test your service layer in the `App.java` to see if it's working. And make sure all the test cases are passed ;)**

## Happy Coding!