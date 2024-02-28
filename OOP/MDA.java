class MDA {
    public static void main(String a[]) {
        int mda[][] = new int[3][4];

        for (int i = 0; i < mda.length; i++) {
            for (int j = 0; j < mda[i].length; j++) {
                mda[i][j] = (int) (Math.random() * 100);
                System.out.print(mda[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int n [] : mda){
            for (int k : n){
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println();

        int arr[] = {4, 7, 18, 39};

        for (int i : arr){
            System.out.println(i);
        }




    }
}