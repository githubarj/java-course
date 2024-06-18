class person {
    String name;
    int age;
    int phone_number;
    int height;
}

public class forEach {

    public static void main(String[] args) {

        person p1 = new person( );
        person p2 = new person( );
        person p3 = new person( );

        p1.name = "Richard";
        p1.age = 18;
        p1.phone_number = 1234;

        p2.name = "John";
        p2.age = 18;
        p2.phone_number = 1234;

        p3.name = "Mary";
        p3.age = 18;
        p3.phone_number = 1234;

        person people[] = new person[3];
        people[0] = p1;
        people[1] = p2;
        people[2] = p3;

        for (person n : people ){
            System.out.println("Name: " + n.name + " Age: " + n.age + " Phone Number: " + n.phone_number);
        }

    }

}
