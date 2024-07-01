class Human {
    private int age; // this variable will be only accessible inside this class
    private String name; //only accessible inside this class

    //constructor -  you do not specify a return type
    // name it the same as your class name
    public Human (){ // special method
        // everytime you create anew object it will call
        // the constructor
        // you can initialize the values of the object here
        age = 12;
        name = "John";
    } // default constructor

    public Human ( int age, String name) {
            this.age = age;
            this.name = name;
    }

    public Human ( String name ) {
        this.name = name;
        this.age = 12;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        //we use this because preference is given to local variable
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age; //refers to the object calling this method
    }
}


public class encapsulation {

    public static void main (String [] args){

    Human h1 = new Human();
    h1.setAge(40);
    h1.setName("Richard");
    System.out.println("You can get the values by using the functions, age : " + h1.getAge() + " and name : " + h1.getName());
    Human h2 = new Human(20, "Richard");
    System.out.println(h2.getName());
    }
}
