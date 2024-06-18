public class strings {

    public static void main (String[] args) {
        String a = "Hello";

        System.out.println(a + ", world");
        System.out.println(a.charAt(0));

        a = a + " my ";

        System.out.println(a.concat(", world"));

        StringBuffer b = new StringBuffer("Jeremy"); //always gives a 16 space extra - editable string
        System.out.println("Size of buffer: " + b.capacity());
        System.out.println(b.length());

        b.insert(0, " " + a );
        b.deleteCharAt(7);
        b.deleteCharAt(7);
        System.out.println(b);

        b.setLength(30);



        String a2 = b.toString(); //convert string buffer to string
        System.out.println(a2 );

        // string builder vs string builder - same methods but StringBuffer is thread safe but Stringbuilder is not


    }

}
