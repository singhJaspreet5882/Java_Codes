      public class array04 {
    public static void main(String[] args) {

      // PROBLEM NO.01

     /*float [] marks = {25.5f, 35.6f, 45.7f, 55.8f, 65.9f};
     float sum = 0;
     for (float elements : marks){
         sum = sum + elements;
     }
        System.out.println("THE VALUE OF ARRAY IS\n" + sum);
*/
     // PROBLEM NO.02

        /*float [] marks = {25.5f, 35.6f, 45.7f, 55.8f, 65.9f};
        float num = 25.5f;
        boolean isInArray = false;
        for (float elements : marks){
           if (num == elements){
               isInArray = true;
               break;
           }
        }if (isInArray){
            System.out.println("the value is present in the array");
        }else{
            System.out.println("the value is not present in the array");

        }

        //PROBLEM NO.02.O

        int[] mark ={52,25,63,45,55,55};
        int no = 56;
        boolean imp = false;
        for (int elements : mark){
            if (no==elements){
                imp = true;
                break;
            }
        } if (imp){
            System.out.println("haa hai");
        }else{
            System.out.println("nahin hai");

        // PROBLEM NO.03

        int[] marks = {90, 80, 70, 60, 50, 40, 30, 20 , 10 };
        int sum = 0;
        for (int elements: marks){
            sum = sum + elements;
        }
        System.out.println("the average value is"+sum/ marks.length);

        // PROBLEM NO.04.O

        int [][] matrices = new int[2][3];
        matrices [0][0] = 100;
        matrices [0][1] = 101;
        matrices [0][2] = 102;
        matrices [1][0] = 200;
        matrices [1][1] = 201;
        matrices [1][2] = 202;
        System.out.println("the two matrices are :-");
        for (int i = 0; i<matrices.length; i++){
            for (int j=0; j< matrices[i].length; j++){
                System.out.print(matrices[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

        // PROBLEM NO. 04

        int[][] mat1 = {{1,2,3},
                        {4,5,6} };
        int[][] mat2 = {{1,2,3},
                        {4,5,6} };
        int[][] result = {{0,0,0},
                          {0,0,0} };
        for (int i=0; i<mat1.length; i++){
            for (int j=0; j<mat1[i].length; j++){
                System.out.format("setting of values i=%d and j=%d\n",i,j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }

        }
        for (int i=0; i<mat1.length; i++){
            for (int j=0; j<mat1[i].length; j++){
                System.out.print(result[i][j]);
                System.out.print(" ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println("");

        }

        // PROBLEM NO. 05 ( by me )

        int[] prog = {1,2,3,4,5,6,7,8,9,10};
        for (int i = prog.length-1; i >= 0; i--){
            System.out.println(prog[i]);
        }

        // PROBLEM NO. 05 ( by harry )

        int[] array = {1,2,3,4,5,6};
        int l = array.length;
        int n = Math.floorDiv(l,2);
        int temp;
        for (int i = 0; i < n; i++){
            temp = array[i];
            array[i] = array[l-i-1];
            array[l-i-1] = temp;
        }for (int element: array){
            System.out.print(element+" ");
        }

        //PROBLEM NO. 06

        int[] array = {1,2,3,4,5,6,5555};
        int max = 0;
        for (int element:array){
            if (element>max){
                max =element;
            }
        }
        System.out.println("maximum value is  " + max);

        // PROBLEM NO. 07*/

        int [] arr = {1,2,55,66,58};
        int min = arr.length;
        for (int element:arr){
            if (element<min){
                min = element;
            }
        }
        System.out.println("minimum value is  "+ min);

        // PROBLEM NO. 08

        int[] array = {1,8,6,3,2,5};
        boolean isSorted = true;
        for (int i=0; i<array.length; i++){
            if (array[i] > array[i+1]){
                isSorted = false;
                break;
            }
        }if (isSorted){
            System.out.println("array is sorted");
        }else{
            System.out.println("array is not sorted");
        }






















































    }
}
