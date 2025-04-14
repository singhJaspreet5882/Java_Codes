public class array03 {
    public static void main(String[] args) {
        // MULTIDIMENSIONAL ARRAYS
        // 2-D ARRAY

        // int...........
        int [][] flats = new int[2][3];
        flats [0][0] = 101;
        flats [0][1] = 102;
        flats [0][2] = 103;
        flats [1][0] = 201;
        flats [1][1] = 202;
        flats [1][2] = 203;
        System.out.println("PRINTING 2-D ARRAY ");
        for (int i=0; i<flats.length; i++)
            {
                for (int j = 0; j < flats[i].length; j++) {
                    System.out.print(flats[i][j]);
                    System.out.print(" ");
                }
                System.out.println("");
            }
        // string......
        System.out.println("printing names of chutiya students");
        String [][] students = new String[2][3];
       students[0][0] = "jaspreet";
        students[0][1] = "sahil";
        students[0][2] = "deepika";
        students[1][0] = "singh";
        students[1][1] = "jain";
        students[1][2] = "nagraj";
        for (int i =0; i<students.length; i++){
            for (int j=0; j<students[i].length; j++){
                System.out.print(students[i][j]);
                    System.out.print(" ");
            }
            System.out.println("  ");
        }








    }
}
