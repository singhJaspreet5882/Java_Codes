                                      public class array05prectisebyme {
    public static void main(String[] args) {
/*
        // 1.calculate the sum of all floats number
        float[] array = {52.55f, 65.23f,85.58f, 65.63f, 53.32f};
        float sum = 0;
        for (float elements:array){
            sum = sum + elements;
        }System.out.println("the value of array is: "+ sum);

        // 2. show that integer is present in array or not

        int[] integer = {52,56,54,59,57};
        int itg = 56;
        boolean isInarraY = false;
        for (int elements:integer){
            if (itg==elements){
                isInarraY = true;
                break;
            }
        }if (isInarraY){
            System.out.println("it is present");
        }else{
            System.out.println("it is not present");
        }

        //3. find the average marks of given array

        float[] avg = {4,5,6,7,8,9};
        float num = 0;
        for (float elements:avg){
            num = num + elements;
        }
        System.out.println("the average number is : "+num/avg.length);

        //4. find the two matrices of 2*3

        int[][] mat1 = {{1,2,3},
                        {4,5,6}};
        int[][] mat2 = {{6,7,8},
                        {9,1,3}};
        int[][] result = {{0,0,0},
                        {0,0,0}};
        for (int i = 0; i<mat1.length; i++){
            for (int j = 0; j<mat1[i].length; j++){
                System.out.format("setting of i=%d and j=%d",i,j);
                System.out.println("");
                result[i][j] = mat1[i][j]+mat2[i][j];
            }
        }
        for (int i = 0; i<mat1.length; i++){
            for (int j = 0; j<mat1[i].length; j++){
                System.out.format("setting of i=%d and j=%d",i,j);
                System.out.println("");
                result[i][j] = mat1[i][j]+mat2[i][j];
            }
        }
        System.out.println("THE RESULT OF TWO MATRICES IS :-");
        for (int i = 0; i<mat1.length; i++){
            for (int j = 0; j<mat1[i].length; j++){
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j]+mat2[i][j];
            }
            System.out.println("");
        }

        // CREATE THE JAVA PROGRAM IN WHICH YOU CAN REVERSE THE ARRAY

        int[] arr = { 100,101,102,103,104,105};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;
        for (int i = 0; i<arr.length-1; i++){
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }for (int element : arr){
            System.out.println(element+" ");
        }

        // print the maximum value

        int[] intn = {25,55,63,89,100};
        int max = 0;
        for (int element:intn){
            if (element > max){
                max = element;
            }
        }
        System.out.println("the maximum value is "+max);*/

        // print the minimum value

        int [] arr = {22,53,89,1,0};
        int min = arr.length;
        for (int element:arr){
            if (element<min){
                min = element;
            }
        }
        System.out.println("minimum value is  "+ min);


















    }
}
