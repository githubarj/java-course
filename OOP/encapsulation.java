class Human {
    private int age = 23; // this variable will be only accessible inside this class
    private String name = "Richard"; //only accessible inside this class

    public int getAge () { //defined in the same class so can access age and name
        return age; //way to access the age from outside the class
    }
    public String getName () {
        return name;
    }
}


public class encapsulation {

    public static void main (String [] args){

    Human h1 = new Human();
    System.out.println("You can get the values by using the functions" + h1.getAge());
    }
}
