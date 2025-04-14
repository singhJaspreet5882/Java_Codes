import java.util.ArrayList;

public class MergeSort {
    public static void merge(int[] arr, int low , int mid , int high){
        ArrayList<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        // storing elements in list into sorted format
        while(left <= mid && right <= high){
            if (arr[left] <= arr[right]){
                list.add(arr[left]);
                left++;
            }else{
                list.add(arr[right]);
                right++;
            }
        }

        // if any element left in left half
        while(left <= mid){
            list.add(arr[left]);
            left++;
        }
        // if any element left in right half
        while(right <= high){
            list.add(arr[right]);
            right++;
        }

        for (int i = low ; i<=high; i++){
            arr[i] = list.get(i-low);
        }
    }
    public static void mergeSort(int[] arr , int low , int high){
        if (low >= high) return;
        int mid = (low + high) / 2 ;
        mergeSort(arr , low , mid); // left half
        mergeSort(arr , mid+1 , high); // right half
        merge(arr , low , mid , high); // merges the sorted halves
    }
    public static void main(String[] args) {
        int[] arr = {10 , 2 , 8 , 6 , 1 , 3 , 4 , 99 , 0};
        mergeSort(arr , 0 , arr.length-1);
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
