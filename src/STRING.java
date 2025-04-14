package TCS;

import java.util.Scanner;
import java.util.HashMap;

public class STRING {
    public static boolean isPalindrome(String str){
        StringBuilder sb = new StringBuilder();
        for (int i=str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }
        String s = sb.toString();
        if (str.equals(s)) return true;
        return false;
    }
    public static boolean InPlacePalindromeString(String s){
       int first = 0;
       int end = s.length()-1;
        for (int i=0; i<s.length(); i++){
            if (s.charAt(first) == s.charAt(end)) {
                return true;
            }
            first++;
            end--;
        }
        return false;
    }
    public static void Count(String str) {
        int countVowels = 0, countConsonants =0, countSpaces = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') countVowels++;
           else if (ch == ' ') countSpaces++;
           else if (ch >= 'a' && ch <= 'z') countConsonants++;
        }
        System.out.println("Vowels:" + countVowels);
        System.out.println("Consonants:" + countConsonants);
        System.out.println("Spaces:" + countSpaces);
    }
    public static void removeVowels(String s){
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch !='o' && ch !='u'){
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
    public static void removeSpaces(String s){
        StringBuilder sb = new StringBuilder();
     for (int i=0; i<s.length(); i++){
         if (s.charAt(i) != ' ') sb.append(s.charAt(i));
     }
        System.out.println(sb);
    }
    public static void removeChar(String s) {
    StringBuilder sb = new StringBuilder();
    for (int i=0; i<s.length(); i++){
        int ascii = (int) s.charAt(i);
       if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)){
           sb.append(s.charAt(i));
       }
    }
        System.out.println(sb);
    }
    public static void reverseString(String s) {
       StringBuilder sb = new StringBuilder();
       for (int i=s.length()-1; i>=0; i--){
           sb.append(s.charAt(i));
       }
        System.out.println(sb);
    }
    public static void removeBrackets(String s){
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) != '(' && s.charAt(i) != ')'){
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }

    public static void countNumbers(String s1){
        int count = 0;
        for (int i=0; i<s1.length(); i++){;
            if (s1.charAt(i) == ' '){
                count += 1;
            }

        }
        System.out.println(count+1);
    }
    public static void changeCase(String s1){
       StringBuilder sb = new StringBuilder();
       for (int i=0; i<s1.length(); i++){
           if (s1.charAt(i) >=65 && s1.charAt(i)<=90){
               sb.append(Character.toLowerCase(s1.charAt(i)));
           }
           else if(s1.charAt(i) >=97 && s1.charAt(i)<=122){
               sb.append(Character.toUpperCase(s1.charAt(i)));
           }
       }
        System.out.println(sb);
    }
    public static void frequency(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        int key = 1;
        for (int i=0; i<s.length(); i++){
            map.put(s.charAt(i) , map.getOrDefault(key+1,1) );
        }
        if (key >= 1){
            System.out.println();
        }
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(InPlacePalindromeString(s));
    }
}
