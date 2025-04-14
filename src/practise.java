package TCS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class practise {
    public static int[] reverseArr(int[] arr){
        if (arr.length < 2 ) {
            return arr;
        }
        int last = arr.length-1;
        for (int i=0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[last];
            arr[last] = temp;
            last--;
        }
        return arr;
    }

    public static void frequencyArr(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++){
            map.put(arr[i] , map.getOrDefault(arr[i],0)+1);
        }
        for(int key : map.keySet()){
            System.out.println(key + ":" +map.get(key));
        }
    }
    public static void averageElements(int[] arr){
        if (arr.length == 0) {
            System.out.println(-1);
        }
        double sum = 0;
        for (int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        double avg = sum / arr.length;
        System.out.println(avg);
    }

    public static void increasingDecreasing(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        for (int i=0; i<arr.length/2; i++){
            list.add(arr[i]);
        }
        for (int i=arr.length-1; i>=arr.length/2; i--){
            list.add(arr[i]);
        }
        System.out.println(list);
    }

    public static void medianOfElements(int[] arr) {
        Arrays.sort(arr);
        int median_odd;
        double median_even;
        if (arr.length%2 != 0) {
           median_odd = arr[arr.length/2];
            System.out.println(median_odd);
        }
        else {
            int div = arr[arr.length/2] + arr[arr.length/2 - 1];
            median_even = div / 2.0;
            System.out.println(median_even);
        }
    }

    public static void removeDuplicates(int[] arr ){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i=1; i<arr.length; i++){
            if (arr[i-1] != arr[i]){
                list.add(arr[i]);
            }
        }
        int[] newArr = new int[list.size()];
        int index = 0;
        for (int i=0; i<list.size(); i++){
            newArr[index++] = list.get(i);
        }
        for (int i=0; i<newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }
    }

    public static void addingelements(int[] arr , int beg , int mid , int element , int end) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(beg);
        for (int i=0; i<arr.length; i++){
            list.add(arr[i]);
        }
        list.add(mid,element);
        list.add(end);
      int[] newArr = new int[list.size()];
      int indx = 0;
      for (int i=0; i<list.size(); i++){
          newArr[indx++] = list.get(i);
      }
      for (int i=0; i<newArr.length; i++){
          System.out.print(newArr[i] + " ");
      }
    }

    public static void repeatingElements(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for (int i=1; i<arr.length; i++){
            if (arr[i] == arr[i-1]) {
                set.add(arr[i]);
            }
        }
        Integer[] newArr = new Integer[set.size()];
        int index = 0;
        for (int id : set){
            newArr[index++] = id;
        }
        for(int i=0; i<newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }
    }

    public static void nonrepeatingElements(int[] arr) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for (int i=0; i<arr.length; i++){
           map.put(arr[i] , map.getOrDefault(arr[i] , 0)+1);
       }
       for (int key : map.keySet()){
           if (map.get(key) == 1){
               System.out.print(key + " ");
           }
       }
    }

    public static void maxPrdSum(int[] arr){
        int prd = 1;
        for (int i=0; i<arr.length; i++){
            int currsum = prd * arr[i];
            if (currsum > prd) {
                prd = currsum;
            }
        }
        System.out.println(prd);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,-3,0,-4,-5};
//        for (int i=0; i<res.length; i++){
//            System.out.print(res[i] + " ");
//        }
        maxPrdSum(arr);
    }
}
