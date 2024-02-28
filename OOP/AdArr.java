class Student {
    int rollNo;
    String name;
    int marks;
}

public class AdArr {
    public static void main(String a[]) {

        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "Richard";
        s1.marks = 90;

        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "Rose";
        s2.marks = 45;

        Student s3 = new Student();
        s3.rollNo = 3;
        s3.name = "Stacy";
        s3.marks = 96;

        Student students[] = new Student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student i : students){
            System.out.println(i);
        }

    }
}