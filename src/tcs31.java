package TCS;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;

public class tcs31 {

    public static boolean leapYear(int n){
        if (n == 0 ) {System.out.println("Invalid") ;}
        if (n >=1 && n <= 1000 ) { System.out.println("Invalid");}
        if ( (n % 4 == 0 && n % 100 != 0) || n % 400 == 0 ) { return true;}
        return false;
    }
    public static boolean isPrme(int n){
        int count = 1;
        for (int i=2; i<=n; i++){
            if (n % i == 0 ) count++;
        }
        if (count == 2) return true;
        return false;
    }
    public static int findNthPrime(int n){
        int count = 0;
        int num = 1;
        while(count < n){
            num++;
            if (isPrme(num)) count++;
        }
        return num;
    }

    public static void sum(int x, int y){
        int a = findNthPrime(x);
        int b = findNthPrime(y);
        int prod = a * b;
        System.out.println(prod-1);
    }

    public static void rank(int[] arr){
        for (int i=0; i<arr.length; i++){
            checKIndex(arr);
        }
    }

    public static void checKIndex(int[] arr){
        int[] sortedarr = arr.clone();
        Arrays.sort(sortedarr);

        HashMap<Integer,Integer> map = new HashMap<>();
        int rank = 1;
        for (int num : sortedarr) {
            if (!map.containsKey(num)){
                map.put(num , rank++);
            }
        }

        for (int i=0; i<arr.length; i++){
            arr[i] = map.get(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void smallestAndLargestNumber(int n){
       int smallest = Integer.MAX_VALUE;
       int largest = Integer.MIN_VALUE;
       while(n > 0 ){
           int l_d = n % 10 ;
           if (l_d < smallest) {
               smallest = l_d;
           }else if (l_d > largest){
               largest = l_d;
           }
           n = n/10;
       }
        System.out.println("Largest" +" "+ largest);
        System.out.println("smallest" +" "+ smallest);
    }

    public static void maxDifference(int[] arr){
        if (arr.length == 0) { System.out.println(-1); return;}
        if (arr.length == 1) { System.out.println(0); return;}
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i] < min) {
                min = arr[i];
            }else if(arr[i] > max){
                max = arr[i];
            }
        }
        int diff = max - min;
        System.out.println(diff);
    }
    public static void familyKingdom(int[] arr){
        if (arr.length == 0) System.out.println(-1);
        if (arr.length == 1) System.out.println(arr[0]);

    }

    public static boolean isPrime(int n){
        int count = 1;
        for(int i=2; i<=n; i++){
            if (n%i==0) count++;
        }
        if (count == 2) return true;
        return false;
    }

    public static void kuchbhi(int n, int m){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<=1000; i++){
            if (isPrime(i)){
                list.add(i);
            }
        }
        int nth = list.get(n);
        int mth = list.get(m);
        int sumnth = 0;

        while(nth > 0){
            int ld = nth%10;
            sumnth += ld;
            nth /= 10;
        }
        int summth = 0;
        while(mth > 0){
            int ld = mth%10;
            summth += ld;
            mth /= 10;
        }

        int sdnth = String.valueOf(sumnth).length();
        int sdmth = String.valueOf(summth).length();
        if (sdnth >= 10 ) {
            sumnth = 0;
            while(sdnth > 0) {
                int ld = sdnth%10;
                sumnth+= ld;
                sdnth/=10;
            }
        }
        else if (sdmth >= 10 ) {
            summth = 0;
            while(sdmth > 0) {
                int ld = sdmth%10;
                summth+= ld;
                sdmth/=10;
            }
        }
        int lastSum = summth + sdnth ;
        System.out.println(nth * lastSum);
    }
    public static void main(String[] args) {
       int n = 4;
       int m = 5;
       kuchbhi(n,m);
    }
}
