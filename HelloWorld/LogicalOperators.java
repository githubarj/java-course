class LogicalOperators{
    public static void main (String a[]){
        //and operator
        char c = 'c';
        char b = 'b';
        b++;
        System.out.println(b);

        boolean result = b == 'f' ^ c == 'f';
        System.out.println(result);
    }
}