class Case {
    public static void main(String a[]) {
        int time = 12;

        switch (time) {
            case 8:
                System.out.println("Good Morning");
                break; // after each case to make sure that the code stops excecuting when it matches a case
            case 10:
                System.out.println("How are you");
                break;
            case 12:
                System.out.println("Have nice Lunch");
                break;
            case 1:
                System.out.println("Good Afternoon");
                break;
            default: // when no case matches, what should be done
                System.out.println("Enter a valid number");
        }
    }
}