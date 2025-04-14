public class QuickSort {
    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr , int low , int high){
        int pivot = arr[high];
        int i = low - 1; // for smaller element
        for (int j = low ; j < high ; j++){
            if (arr[j] < pivot ){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr , i+1 , high);
        return i+1; // partition index
    }
    public static void quickSort(int[] arr , int low , int high){
        if (low < high){
            int partitionIndex = partition(arr,low,high);
            quickSort(arr,low,partitionIndex-1); // left array
            quickSort(arr,partitionIndex+1,high); // right array
        }
    }
    public static void main(String[] args) {
        int[] arr = {9 , 1 , 5 , 8 , 10, 66, 2 , 0};
        quickSort(arr , 0 , arr.length-1);
        for (int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
