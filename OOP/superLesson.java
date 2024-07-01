class A extends Object { // every class in java extends the Object class
    public A (){
        System.out.println("in A");
    }

    public A (int a){
        // every constructor has a  method super - this makes it execute the constructor of the super class first
        System.out.println("in A int");
    }
}

class B  extends A {
    public B  (){
        super(5);
        System.out.println("in B");
        // whenever you create an object it will call the constructor
    }
     public B (int x){ // parameterized constructor
//        super(x);
         this(); // it will call the constructor of the same class
         System.out.println("in B int");
     }
}

class C {
    public C(){
        System.out.println("in C");
    }

    public void  show () {
        System.out.println("show");
    }
}

public class superLesson {
    public static void main(String[] args) {
        B b = new B(7); // it calls only the parameterized constructor in itself
        C c; // reference creation
        c = new C(); // referenced object
        new C(); // anonymous object
        new C().show(); // you can use this to call a method on an object without creating a variable
        // you cant refer to this object
        c.show();
    }
}

// java uses camel casing
// classes and interface should start with capital letters
// variables and methods - start with small
// constants - all capital
