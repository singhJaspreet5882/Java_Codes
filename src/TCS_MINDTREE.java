public class TCS_MINDTREE {
    static int gcd(int n1 , int n2){
        // we initialize the variable gcd with 1;
        int gcd = 1;
        // itreate from 1 to min value from n1 and n2 to find the common factors
        for (int i=1 ; i<=Math.min(n1 , n2); i++){
            // if n1 and n2 finds the common factors we update it in gcd
            if (n1%i==0 && n2%i==0) gcd = i;
        }
        return gcd;
    }


    static int highestElementInArray(int[] arr){
        // First we will initialize the max variable with zero
        int max = 0;
        // Here we run the loop from 0 to n
        for (int i=1; i<arr.length; i++){
            // check if the current element is greater than max if yes than update max
            if (arr[i] > max) max = arr[i];
            // after this we get the maximum element
        }
       // return max ;

        // now for finding the Second maximum we have use again this method
        int secondMax=0;
        for(int i=1;i<arr.length;i++){
            // But here we apply 2 condition if current element is less than max and greater than other no.
            // just return the second maximum element
            if (arr[i] > secondMax && arr[i] < max) secondMax = arr[i];
        }
        return secondMax;
    }


    static int factorial(int n){
        // initialize the variable to 1
        int factorial = 1 ;
        // run the loop from 1 to n
        for (int i=1; i<=n; i++){
            // multiplying the sum to another no.
            factorial *= i;
        }
        // we got the factorial of n
        return factorial;
    }


    static void swap(Integer n1 , Integer n2){
        // Swapping without third variable
        n1 = n1 + n2;
        n2 = n1 - n2 ;
        n1 = n1 - n2;
//        System.out.println(n1 + " " + n2);
        // With 3rd variable
        Integer temp = n1 ;
        n1 = n2 ;
        n2 = temp ;
        System.out.println(n1 + " " + n2);
    }


    static void palindromeNumber(int n){
        int temp = n;
        int res = 0;
        while(n > 0){
            int dig = n % 10 ;
            res =( res * 10) + dig;
            n = n/10 ;
        }
        if (temp == res) System.out.println("Palindrome");
        else System.out.println("Not Pal");
    }


    static void countDigit(int n){
        int count = 0;
        while(n > 0){
            int ld = n % 10;
            count++;
            n = n/10 ;

        }
        System.out.println(count);
    }


    static boolean isPrime(int n){
       int count = 0;
       for (int i=2; i<=n/2; i++){
           if (n%i == 0) count += 1;
       }
       return count == 0;
    }


    static void armsStrongNumber(int n){
        int cnt = String.valueOf(n).length();
        int sum = 0;
        int num = n;
        while(n > 0){
            int ld = n % 10 ;
            sum += Math.pow(ld , cnt);
            n = n/10;
        }
        if (num == sum) System.out.println("Armstorng number");
        else System.out.println("Not Armstrong");
    }


    static void isPerfectNumber(int n){
        int sum = 1;
        for (int i = 2 ; i <= n/2 ; i++){
            if (n % i == 0) sum += i;
        }
        if (sum == n){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not a perfect number");
        }
    }


    static void leapYear(int n){
        if ((n%4 == 0 && n%100 !=0) || (n%400==0)){
            System.out.print("Yes it is a leap year..");
        }else{
            System.out.print("No it is not a leap year..");
        }
    }

    static String reverseString(String s){
        StringBuilder sb = new StringBuilder();
        for (int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            sb.append(ch);
        }
        return sb.toString();
    }

    static boolean isVowels(String s){
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u') return true;
        }
        return false;
    }

    static int fibonacciSeries(int n){
        if (n <= 1) return n;
        return fibonacciSeries(n-1) + fibonacciSeries(n-2);
    }

    static boolean isPalindrome(String s){
        int length = s.length();
        for (int i=0; i<length/2; i++){
            if (s.charAt(i) != s.charAt(length-i-1)) return false ; break;
        }
        return true;
    }

    static void removeSpaces(String s){
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()){
            if (c != ' '){
                sb.append(c);
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String s = "  abc  def\t";

        s = s.strip();

        System.out.println(s);
  }
}





























