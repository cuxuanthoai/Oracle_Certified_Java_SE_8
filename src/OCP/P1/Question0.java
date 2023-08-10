package OCP.P1;

class Question0 {  
 public static void main(String[] args) {
        Outer.Animal  animal = new Outer.Dog();
        animal.eat();//Dog eats biscuits
    }
}


class Outer {
    abstract static class Animal { //Line 2
        abstract void eat();
    }

    static class Dog extends Animal { //Line 6
        void eat() { //Line 7
            System.out.println("Dog eats biscuits");
        }
    }
}