public class Recursion {
    public static void main(String[] args){
            f1(0);
            System.out.println("The factorial is :" + factorial(5));
    }

    public static void f1(int i){

        if (i < 10){
            System.out.println("\n" + i);
            i++;
            f1(i);
        }

    }

    public static int factorial(int n){
        if ( n !=  0 ) {
            return n * factorial(n - 1);
        }
       return 1;
    }
}
