

class Tenant {
    int houseNo;
    String name;
    int bill;
}
public  class arrayss {
    public static void main (String[] args) {
     Tenant t1 = new Tenant();
     t1.houseNo = 101;
     t1.name = "James";
     t1.bill = 10_000;

     Tenant t2 = new Tenant();
     t2.houseNo = 102;
     t2.name = "Bob";
     t2.bill = 10_000;

     Tenant t3 = new Tenant();
     t3.houseNo = 103;
     t3.name = "John";
     t3.bill = 10_000;

     Tenant tenants[] = new Tenant[3];

     tenants[0] = t1;
     tenants[1]= t2;
     tenants[2] = t3;

     for (int i = 0 ; i < tenants.length ; i++ ){
         System.out.println("House Number :" + tenants[i].houseNo);
         System.out.println("Name :" +tenants[i].name);
         System.out.println( "Bill: " + tenants[i].bill);
         System.out.println();
     }


    }
}