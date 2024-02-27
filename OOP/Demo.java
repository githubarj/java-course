class Calculator {

    public int add(int a, int  b) {
        return a + b;
    }
}

public class Demo {
    public static void main (String a[]){
        int x = 45;
        int b = 567;
        Calculator calc =  new Calculator();
        System.out.println("answer: " +  calc.add(x,b));
       

    }
}