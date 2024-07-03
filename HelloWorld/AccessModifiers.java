class H {
    public void show (){
        System.out.println("In H show");
    }
}
class R extends H {

}

final class U { // making a class final stops inheritance - cannot make subclasses
   final public void show (){ // stops method overriding
        System.out.println("In U show");
    }
}

class Computer {
    public void show () {
        System.out.println("In computer show");
    }
}
class Laptop extends Computer {
    public void show () {
        System.out.println("In Laptop show");
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        R obj = new R ();
        obj.show();
        Computer obj2 = new Laptop(); // it is possible to create the reference of a super class and attach it to the object of a subclass
        obj2.show();

        final int a = 9; // value will not change - making a constant in java

    }
}

// private , public , default , protected
// private - only accessible in same class
// public - available everywhere
// default - available in the same package
// protected - available in same package and children classes

// Dynamic Method dispatch
