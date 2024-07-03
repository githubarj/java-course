import tools.*; // importing classes from packages * - import all the files
// to import folders use . notation



import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;

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

        Calc c = new Calc();
        AdvancedCalc a  = new AdvancedCalc();
        ScientificCalculator q = new ScientificCalculator();
        System.out.println(c.add(4, 5));
        System.out.println(c.sub(6, 5));
        System.out.println(a.multiply(5.5,6.68));
        System.out.println(a.divide(5,6));
        System.out.println(q.power(6.5, 3));
        System.out.println(q.divide(5F, 6 ));

        ArrayList list = new ArrayList();
    }
}

// in java multiple inheritance does not work
// but multilevel and single level inheritance work
// every java file has java.lang imported