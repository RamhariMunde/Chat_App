// Lilah has a string, s. of lowercase English letters that she repeated infinitely many times.

// Given an integer, n, find and print the number of letter a's in the first n letters of Lilah's infinite string

// For example, if the string s = 'abcac' and n = 10, the substring we consider is abcacabcac, the first 10 characters of her infinite string. There are 4 occurrences of a in the substring

// Function Description

// Complete the repeatedString function in the editor below. It should return an integer representing the number of occurrences of a in the prefix of length n in the infinitely repeating string

// repeatedString has the following parameter(s):

// ⚫s: a string to repeat

// n: the number of characters to consider

public class Repeated_String_Hackerrank {  // you use only line number 18 To 33 Code.
    static long Repeated_String_Hackerrank(String s, long n){
        int strLength = s.length();
        long q = 0, r = 0;
        q = n / strLength;
        r = n % strLength;
        long partialStrLen = (r == 0) ? 0 : r;
        long aCount = q * getLetterCount(s,s.length()) + getLetterCount(s,partialStrLen); // Counting the a in the initial stage [ q * getLetterCount(s,s.length()) ]
        // counting the number of partial String Length [ getLetterCount(s,partialStrLen) ]
         return aCount;
    }
    public static long getLetterCount(String s,long strLength){
        long count = 0;
        for (int i = 0; i < strLength; i++){
            if (s.charAt(i)== 'a')
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long n = sc.nextLong();
        long aCount = repeatedString(s,n);
        System.out.println(aCount);
        sc.close();
    }
}
