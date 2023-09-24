package OCP.P1;

class Question52 {  
 public static void main(String[] args) {

    }
}
/* BF
    You want to create a singleton class by using the Singleton design pattern.
        Which two statements enforce the singleton nature of the design? (Choose two.)
        A. Make the class static.
        B. Make the constructor private.
        C. Override equals() and hashCode() methods of the java.lang.Object class.
        D. Use a public reference to point to the single instance.
        E. Implement the Serializable interface.
        F. Make the single instance created static and final.*/
/*sign pattern achieves this by providing a single point of access to the instance of the class.
        To enforce the singleton nature of the design, we need to follow the following rules:
        Make the constructor private: This prevents other classes from instantiating the Singleton class by
        restricting access to the constructor. The constructor is only accessible within the Singleton class itself,
        ensuring that no other instance of the class can be created.
        Make the single instance created static and final: This creates a single instance of the Singleton class that
        is accessible to all other classes. The static keyword ensures that the instance is associated with the class,
        not an instance of the class. The final keyword ensures that the instance cannot be re-assigned, making it a constant value.
        Therefore, options B and F are the two correct statements that enforce the singleton nature of the design.
        Option A is incorrect as making the class static is not necessary to create a Singleton class.
        Option C is not necessary as overriding equals() and hashCode() methods of the java.lang.Object
       class is not related to the Singleton design pattern. Option D is incorrect because we do not want to use
         public reference to point to the single instance, as this would allow other classes to create additional instances
        of the Singleton class. Option E is not necessary for creating a Singleton class, but if we do want to make
        our Singleton class Serializable, we should implement the Serializable interface.*/
