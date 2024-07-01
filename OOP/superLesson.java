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
        super(x);
         System.out.println("in B int");
     }
}

public class superLesson {
    public static void main(String[] args) {
        B b = new B(); // it calls only the parameterized constructor in itself
    }
}
