class animal  {
    String color;
    int age;
    String name;
    static String type;
    static {
        type = "domestic";
    }

    public animal(){
        color = "";
        age = 0;
        name = "";
    }

    public void show () { //instance method
        System.out.println(color + " " + age + " " + name + " " + type);
    }

    public static void show1 () {
        System.out.println("This is a static method with static value" + type); //can only use static variables here
    }
    //we can however pass an object to the static method and access them that way
    public static void show3(animal obj) {
        System.out.println("This acceses " + obj.color + " " + obj.age + " " + obj.name + " " + type );
    }
}

public class StaticMethods {

    public static void main(String[] args) {

        animal a1 = new animal() ;
        a1.name = "cat";
        a1.age = 20;
        a1.color = "orange";

        animal a2 = new animal() ;

        a1.show(); //calling an instance method
        animal.show1(); //calling a static method
        animal.show3(a1);

    }

}
