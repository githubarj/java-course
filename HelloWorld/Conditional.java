class Conditional {
    public static void main(String a[]) {

        int x = 2;
        int y = 4;
        int t = 5;

        if (x > y && x > t ){
            System.out.println(x);

        }
        else if (y > t) 
        {
            System.out.println(y);
            
        } else {
            System.out.println(t);
        }

        int result = x % 2 == 0 ? 10 : 20;

        // if(x % 2 == 0) { //checking for an even or oddnumber 
        //     result = 10;
        // } else {
        //     result = 20;
        // }

        System.out.println(result);

       

    }
}