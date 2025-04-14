public class quesarray {
    public static void main(String[] args) {

        // q.1 print the sum from the given array;
        // Basic format
//        int[] arr = {1,5,3};
//        int sum = arr[0] + arr[1] + arr[2];
//        System.out.println(sum);

        // by using loops
//        int [] arr = {1,2,3,4,5,8,9,6,7,};
//        int sum = 0;
//        for (int i = 0; i<arr.length; i++){
//            sum = sum + arr[i];
//        }
//        System.out.println(sum);

        // Q.2 Find the maximum value from the given array
//        int[] array = {1,2,45,54,85,96,100};
//        int max = 0;
//        for (int i = 0 ; i < array.length ; i++){
//            if (array[i] > max){
//                max = array[i]; // upadate value of max with maximunm value;
//            }
//        }
//        System.out.println(max);

        // find the given x value in array if present then give index value if not return -1;
        int[] arr = {1,5,6,3,5,5,6};
        int x = 10;
        int ans = -1;
        for (int i=0; i<arr.length;i++){
            if (arr[i] == x){
                ans = i;
                break;
            }
        }
        if (ans == -1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Found"+ " "+  x+ " " + "at index" + " "+ ans);
        }

    }
}
