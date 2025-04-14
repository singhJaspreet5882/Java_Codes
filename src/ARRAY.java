package TCS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class ARRAY {
    public static void minElementInArray(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
    public static void maxElementInArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public static void secondMinElementInArray(int[] arr) {
        // Inbuilt method
//        Arrays.sort(arr);
////        System.out.println(arr[1]);

        // manual
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        for (int i=0; i<arr.length; i++){
            if(arr[i] > min && arr[i] < secondMin){
                secondMin = arr[i];
            }
        }
        System.out.println(secondMin );
        }
    public static void secondMaxElementInArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i] > max) max = arr[i];
        }
        for (int i=0; i<arr.length; i++){
            if (arr[i] < max && arr[i] > secondMax) secondMax = arr[i];
        }
        System.out.println(secondMax);
    }
    public static void reverseArray(int[] arr){
        int lastIdx = arr.length-1;
        for (int i=0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[lastIdx];
            arr[lastIdx] = temp;
            lastIdx--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void countFrequency(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for (int i=1; i<arr.length; i++){
            if (arr[i] == arr[i-1]){
                count++;
            }
            map.put(arr[i],count);
        }
        System.out.println(map);
    }
    public static void increasingDecreasingOrder(int[] arr){
        Arrays.sort(arr);
        for (int i=0; i<arr.length/2; i++){
            System.out.print(arr[i] + " ");
        }
        for (int i=arr.length-1; i>=arr.length/2; i-- ){
            System.out.print(arr[i] + " ");
        }
    }
    public static void sumOfArray(int[] arr){
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.print(sum);
    }
    public static void rotateArray(int[] arr , int k){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=k; i<arr.length; i++){
            list.add(arr[i]);
        }
        for (int i=0; i<k; i++){
            list.add(arr[i]);
        }
        System.out.println(list);
    }
    public static void averageOfArray(int[] arr){
        double sum = 0;
        int n = arr.length;
        for (int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
        }
        double avg = sum / n ;
        System.out.println(avg);
    }
    public static void medianOfArray(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        double median = 0;

            if (n % 2 == 0) {
                int m = arr[n/2] + arr[n/2 - 1];
                median = m/2.0;
            }
            else {
                median = arr[n/2] ;
            }

        System.out.println(median);
    }
    public static void maxProductSubArrayOfTwoConsecutiveElements(int[] arr){
        int product = 0;
        for (int i=1; i<arr.length; i++){
            int maxProduct = arr[i-1] * arr[i];
            if (product < maxProduct) product = maxProduct;
        }
        System.out.println(product);
    }
    public static void removeDuplicates(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        System.out.println(set);
    }
    public static void addElements(int[] arr, int beg,int end,int mid,int midVal){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(beg);
        for (int i=0; i<arr.length; i++){
            list.add(arr[i]);
        }
        list.add(mid,midVal);
        list.add(end);
        System.out.println(list);
    }

    public static void repeatingElements(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++){
            map.put(arr[i] , map.getOrDefault(arr[i] , 0)+1) ;
        }
        for (int key : map.keySet()){
            // if we do this we got all repeating elements
            if (map.get(key) > 1) {
                // and if i do like this (map.get(key) == 1) we got non repeating elements
                System.out.print(key + " ");
            }
        }
    } // both for repeating/non-repeating elements..
    public static void secondlargestandsmallest(int[] arr) {
     // simple way ->  // if sorted array code is max = arr[arr.length-1]; min = arr[2]
      int max = Integer.MIN_VALUE;
      int secondmax = Integer.MIN_VALUE;
      for (int i=0; i<arr.length; i++){
          if (arr[i]>max){
              secondmax = max;
              max = arr[i];
          }
          else if (arr[i] > secondmax && arr[i] != max) {
              secondmax = arr[i];
          }
      }
      int min = Integer.MAX_VALUE;
      int secondmin = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i]<min){
                secondmin = min;
                min = arr[i];
            }
            else if (arr[i] < secondmin && arr[i] != max) {
                secondmin = arr[i];
            }
        }
        System.out.println(secondmin);
        System.out.println(secondmax);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
       for (int i=0; i<arr.length; i++){
           arr[i] = sc.nextInt();
       }
       secondlargestandsmallest(arr);
    }
}
