package WrittenAnswers;

public class Questions {
    //1. In terms of usage, an abstract class shares same characteristics with interfaces
    //but there are a number of differences, such as:

    //In an abstract class, one can create constructors, whereas in an interface this is not possible.

    //Interface can contain methods whose visibility must always be public, whereas in an abstract
    //class one may use any of the access modifiers, protected, public or private (or none)

    //CLasses are able to implement more than one interface, whereas the class can only extend
    //no more than 1 abstract class in this case.


    //2. (a) This statement is false. Interfaces are able to have no methods and if they do are
    //referred to as markers.
    //public interface Car {
    //void isLocked();
    //}

    //(b) This statement is also false, Interfaces can create constant values.
    //final int AGE = 8;
    // It is not possible for an interface to declare instance fields in its composition.


    //(c) Also false, constructors and interfaces do not work together.



    //3. The interface specification in question 4 has this structure. When an interface is waiting for
    //an update from the calling method, other methods may be declared but are overlooked when the update
    //is relieved.


    //4. As windowListener is an interface, if a class implements this interface it would need
    //to Override the methods in this interface to be implemented. As this interface contains lots of methods
    //that do not do anything, it gives the implementing class the flexibility to pick and choose
    //which of the methods are applicable to the implementation.


    //5. The most common way would be to use a singleton design pattern which by definition only allows
    //one instance of its class. An alternate, would be to use a privately visible constructor.


    //6.



}
