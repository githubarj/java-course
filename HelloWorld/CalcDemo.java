

public class CalcDemo {
    public static void main(String[] args) {

        ScientificCalculator obj1 = new ScientificCalculator();
        System.out.println(obj1.add(2, 3));
        System.out.println(obj1.sub(5, 4));
        System.out.println(obj1.multiply(5, 4));
        System.out.println(obj1.divide(5, 4));
        System.out.println(obj1.power(5, 4));
    }
}

// in java multiple inheritance does not work
// but multilevel and single level inheritance work