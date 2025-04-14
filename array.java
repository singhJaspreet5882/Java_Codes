public class array {
    public static void main(String[] args) {
        int[] arr = null;
        arr = new int[5];
        System.out.println(arr);
        //set values
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        // get values
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        // for loop
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        // khudse
        int[] sunny = {10,22,55,50,11};
        arr = new int[5];
        for (int i=0;i<arr.length;i++){
            System.out.println(sunny[i]);
        }
        for (int val: sunny){
            System.out.println(val);
        }

        }


    }
}