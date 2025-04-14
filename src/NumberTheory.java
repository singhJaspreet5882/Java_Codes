package TCS;

import java.util.Scanner;

public class NumberTheory {
    public static void cubeSum(int n, int m){
        int sum = 0;
        for (int i = n; i<=m; i++){
            sum += i * i * i ;
        }
        System.out.println(sum);
    }
    public static void primeNumberSum(int n , int m){
        int sum = 0;
        for (int i=n ; i<=m; i++){
            if (isPrime(i)) {
                sum += i ;
            }
        }
        System.out.println(sum);
    }
    public static boolean isPrime(int n){
        int count = 1;
        for (int i=2; i<=n; i++){
            if (n % i == 0) count = count + 1;
        }
       if (count == 2) return true;
       return false;
    }
    public static void allPrimeNumberInRange(int min , int max){
        for (int i=min; i<= max; i++){
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPerfectNumber(int n){
        /**
        Perfect number vo hota hai jiske diviors ka sum
         wahi number aaye exculding that number
        for example - 6 : 1,2,3,6 are the divisors of 6 but excluding 6
        1+2+3 = 6 so yes this is a perfect number
         **/

        int sum = 1;
        for (int i=2; i<=n/2; i++){
            if (n % i == 0) sum += i;
        }
        if (sum == n) return true;
        return false;
    }
    public static boolean isHarshadNumber(int n){
        /**
         Harshad Number :- First of all we have calculate the sum of all digits
         after that if the number is divided by that sum the number is Harshad no.
         Ex : 12-> 1+2 = 3
         -> 12/3 = 4
         -> yes this is a harshad number
         **/

        int temp = n;
        int digitSum = 0;
        while(temp > 0) {
            int digit = temp % 10;
            digitSum = digit + digitSum;
            temp = temp/10;
        }
        if (n % digitSum == 0) return true;
        return false;
    }
    public static boolean isArmstrongNumber(int n){
        /**
         Armstrong Number : Jitne digit hai utni power har digit ke upar laga ke un
         sabka sum agar usi number ke equal hai toh vo no. Armstrong number hai
         153 = digits -> 03
         --> 1^3 + 5^3 + 3^3
         --> 3 + 125 + 27
         --> 153
         --> 153 == 153 yesss
         so, 153 is an armstrong number
         */
        int digitCount = String.valueOf(n).length();
        int temp = n;
        int sum = 0;
        while(temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit , digitCount);
            temp = temp/10;
        }
        if (sum == n) return true;
        return false;
    }
    public static void multipleOf10(int n){
        int sum = 0;
        for (int i=1; i<=n; i++){
            sum += i;
        }
        System.out.println(sum*10);
    }
    public static void secretCode(int n){
      int temp = n;
      int digitSum = 0;
      while (temp > 0){
          int digit = temp % 10;
          digitSum += digit;
          temp = temp/10;
      }
      if (digitSum % 9 ==0) System.out.println("Yes");
      else System.out.println("No");
    }
    public static int fibonacciSeries(int n){
        int one = 1;
        int two = 2;
        int sum = one+two;
        for (int i=3; i<=n;i++){
            int curr = one*two*2;
            sum += curr;
            one = two;
            two = curr;
        }
        return sum;
    }
    public static void lcm(long n1, long n2){
      long gcd = gcd(n1,n2);
      long lcm = (n1/gcd) * n2;
        System.out.println(lcm);
    }
    public static long gcd(long n1, long n2) {
        while(n2 != 0){
            long temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }
    public static int isPalindrome(int n ){
        int temp = n;
        int reverse = 0;
        while(temp > 0){
            int last_digit = temp % 10;
            reverse = reverse * 10 + last_digit;
            temp = temp / 10 ;
        }
        if (n == reverse) return reverse;
        return -1;
    }
    public static void allPalindromeInRange(int min , int max){
        for (int i=min; i<=max; i++){
            if (i == isPalindrome(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static void apSeriesSum(int n, int a, int d){
        int sum = 0;
        for (int i = 1; i<=n; i++){
            sum += a;
            a += d;
        }
        System.out.println(sum);
    }
    public static void gpSeriesSum(int n,double a,double r){
        double sum = 0.0;
        for (int i=1; i<=n; i++){
            sum += a;
            a *= r;
        }
        System.out.println(sum);
    }
    public static void maxOrmin(int n){
        int temp = n;
        int max = temp % 10;
        int min = temp % 10;
        while (temp > 0){
            int last_digit = temp % 10;
            if (last_digit < min) min = last_digit;
            else if (last_digit > max) max = last_digit;
            temp = temp/10;
        }
        System.out.println(max);
        System.out.println(min);
    }
    public static void fibbSeries(double n){
        int first = 0;
        int second = 1;
        for (int i=0; i<=n; i++){
            System.out.print(first + " ");
            int s = first + second;
            first = second;
            second = s;
        }
    }
    public static int factorial(int n){
        int factorial = 1;
        for (int i=n; i>=1; i--){
            factorial *= i;
        }
        return factorial;
    }
    public static int power(int num , int n){
        int sum = num;
        for (int i=2; i<=n; i++){
            sum *= num;
        }
        return sum;
    }
    public static void factors(int n){
        for (int i=1; i<=n; i++){
            if (n % i == 0) System.out.print(i + " ");
        }
    }
    public static void primeFactors(int n){
        for (int i=1; i<=n; i++){
            if (n % i == 0) {
                if (isPrime(i)) System.out.print(i + " ");
            }
        }
    }
    public static boolean strongNumber(int n){
        int temp = n;
        int sum = 0;
        while(temp > 0){
            int last_digit = temp % 10;
            int product = 1;
            for (int i=1; i<=last_digit; i++){
                product *= i;
            }
            sum += product;
            temp = temp/10;
        }
        if (n == sum) return true;
        return false;
    }
    public static boolean automorphicNumber(int n){
        int temp = n;
        int square = n * n;
        while(temp >0){
            int square_last_digit = square % 10;
            int temp_last_digit = temp % 10;
            if (square_last_digit != temp_last_digit) return false;
            square = square/10;
            temp /= 10;
        }
        return true;
    }
    public static boolean hN(int n){
        int temp = n;
        int sum = 0;
        while(temp>0){
            int last_digit = temp % 10;
            sum += last_digit;
            temp /= 10;
        }
        if (n % sum ==0) return true;
        return false;
    }
    public static boolean abundantNumber(int n){
        int sum = 0;
        for (int i=1; i<=n/2; i++){
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum <= n) return true;
        return false;
    }
    public static int digitSum(int n){
        int sum = 0;
        while(n>0){
            int ld = n%10;
            sum += ld;
            n /= 10;
        }
        return sum;
    }
    public static int sumInRange(int start , int end){
        int sum = 0 ;
        for (int i = start; i<=end; i++){
            sum += i;
        }
        return sum;
    }
    public static int permutation(int n , int r){
        int permutation = factorial(n) / factorial(n-r);
        return permutation;
    }
    public static void replace0s(int n){
        int temp = n;
        int num = 0;
        while(temp > 0) {
            int ld = temp % 10;
            if (ld == 0) ld = 1;
            num = num * 10 + ld;
            temp /= 10;
        }
        int reversed = 0;
        while(num > 0){
            int ld = num % 10;
            reversed = reversed * 10 + ld;
            num /= 10;
        }
        System.out.println(reversed);
    }

    public static void primeSum(int x , int y){
        int i=2;
        int max = Math.max(x,y);
        int product = 1;
        while(i!=max){
            if (isPrime(i)){
                if (i==x || i==y){
                    product *= i;
                }
                i++;

            }
        }
        System.out.println(product-1);
    }


    public static void main(String[] args) {
       primeSum(5,3);



    }
}
