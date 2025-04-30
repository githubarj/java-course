public class Recursion {
    public static void main(String[] args){
            f1(0);
    }

    public static void f1(int i){

        if (i < 10){
            System.out.println("\n" + i);
            i++;
            f1(i);
        }

    }
}
