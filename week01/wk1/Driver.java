/**
 * Created by OliverW on 30/01/2016.
 */
public class Driver {
    public static void main(String[] args) {
        Storage<BankAccount> aStorage = new Storage<BankAccount>();
        Storage<String> sStorage = new Storage<String>();

        //1. Use of generics enable types (classes and interfaces)
        // to be parameters when defining classes, interfaces and methods.
        // Using type parameters provide a useful way for you to
        // re-use the same code with different inputs.


        //2. (a) Stronger type checks at compile time.
        //   (b) Elimination of casts.


        //3. Cannot resolve method.

        //Compilation successful.

        Class<BankAccount> baCls = BankAccount.class;
        try {
            BankAccount myAccount = (BankAccount) baCls.newInstance();
            aStorage.setValue(myAccount);
// Deposit
            myAccount.deposit(15);
        } catch (InstantiationException e) {
            // ...
        } catch (IllegalAccessException e) {
        }

        System.out.println( aStorage.getValue().showBalance() );
        if( aStorage.getClass() == sStorage.getClass() ) {
            System.out.println( "EQUAL" );
        } else {
            System.out.println( "NOT EQUAL" );
        }

    }   //7. Runtime output is 115.0 EQUAL.
        //Reflection is the ability of a program to
        //examine and modify the structure and behavior of an object at runtime.
        //We get the output EQUAL because when we use the getClass()
        //method, despite the class accepting two different types the
        //class call is the same.


}
