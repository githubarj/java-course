class Mobile {
    String brand; //instance variable
    int price;
    static String network; // shared by all the objects, if you change value for one it changes all

    static { // how to initialize static values of the object - only called once
        // called every time the class is loaded which happens on y once and happens first
        network="Safaricom";
    }

    //constructor - each new instance created will have these default values
    public Mobile () {
        brand = "";
        price = 200;
    }


    public void show(){
        System.out.println("Brand: " + brand + ", Price: " + price + ", Network: " + network);
    }

}

public class staticKeyword {

    public static void main (String[] args) throws ClassNotFoundException {
        Mobile obj1  = new Mobile();
        obj1.brand = "iphone";
        obj1.price = 500;
        Mobile.network = "safaricom"; // static keys should be accesed via aclassname


        Mobile obj2 = new Mobile();

        Class.forName("Mobile"); //load the class without creating an object



    }

}
