
class V {
    public void show () {
        System.out.println("in v show");
    }
    public void config (){
        System.out.println("in v config");
    }
}

class T extends V {
    public void show (){ // method overriding same name as in super class but different function definition
        System.out.println("in T show");
    }

}

// difference between method overloading and overriding is that
// method overriding - same name and parameters
// overloading - same name , different parameters




public class CalcDemo {
    public static void main(String[] args) {

        T obj = new T();
        obj.show();
        obj.config();
    }
}

// in java multiple inheritance does not work
// but multilevel and single level inheritance work