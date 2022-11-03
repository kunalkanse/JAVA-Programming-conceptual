

class polymorphism {

    public static void main(String[] args) 
    {
        
        // as it is of single CashPayment form
        CashPayment c = new CashPayment();
        c.pay();

        // Now the initialization is done using runtime polymorphism and 
        // it can have many forms at runtime
        // Single payment "p" instance can be used to pay by cash and credit card
        Payment p = new CashPayment();
        p.pay(); // Pay by cash

        p = new CreditPayment();
        p.pay(); // Pay by creditcard
    }

}

/**
 * This represents payment interface
 */
interface Payment {
    public void pay();
}

/**
 * Cash IS-A Payment type
 */
class CashPayment implements Payment {

    // method overriding
    @Override
    public void pay() {
        System.out.println("This is cash payment");
    }

}

/**
 * Creditcard IS-A Payment type
 */
class CreditPayment implements Payment {

    // method overriding
    @Override
    public void pay() {
        System.out.println("This is credit card payment");
    }

}