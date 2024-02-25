class typeCC {
    public static void main(String a[]) {
        int num1 = 320;
        byte bit1 = 120;

        int modulus = 320 % 256;

        bit1 = (byte) num1; // this is called type casting, since an niterher can not be converted to a byte
                            // due to lossof data we use type casting to allow (must be in the range for a
                            // byte)

        int num2 = 256;
        byte bit2 = 10;
        num2 = bit2; // we can hoever convert a byte into an interger since there is no risk of data
                     // loss since it is bigger than a byte
        float f = 5.6f;
        int x = (int) f;

        System.out.println(bit1);
        System.out.println(modulus);

        // if you do it explicitly -eg use (byte)num1 - type casting, if donr
        // automatically that is type conversion

        byte q = 50;
        byte w = 70;

        int result = q * w;
        System.out.println(result); // type promotion, the answer is promoted to an int since it is past the rangeof
                                    // a byte

        // result += 2;
        // result *= 3;
        result++; // to post increament
        ++result; // to pre increament by one

        // they behave differently during variable assignment, int a = num++ will asign
        // num to a first , then increament
        // int a =  ++num will increament num the asign

        System.out.println(result);
        // etc //short form dor operations on a number on itelf

        int qw = 50;
        int z = qw++;
        System.out.println(qw + " " + z);

    }
}