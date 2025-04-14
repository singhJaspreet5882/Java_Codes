package TCS;

public class LinearSearch {
    public static int search(int[][] arr, int target) {
        if (arr.length == 0 ) return -1;

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                if (arr[i][j] == target) return j ;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {11,22,33,44},
                {21,2222,22,23}
        };
        int target = 22;
        System.out.println(search(arr,target));
    }
}
