import java.util.Scanner;

public class arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
//        System.out.println(arr[1]);
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
//            System.out.println(arr[i]);
        }
        //for each loop
        for(int num : arr){
            System.out.println(num);
        }

    }
}
