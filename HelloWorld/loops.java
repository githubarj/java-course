class loops {
    public static void main(String a[]) {

        int i = 5; // most used

        do { //willexcecuteonce even if the condition is false
            System.out.println("Hi" + " " + i);
            i++;
        } while (i <= 4);

        boolean comp = 4 < 4;
        System.out.println(comp);

        for (int j = 1; j <=5 ; j++){
            System.out.println("For loop " + j);
        }



    }
}