package com.test.hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
    	a = a.toUpperCase();
    	b = b.toUpperCase();
    	char [] charA = a.toCharArray();
    	char [] charB = b.toCharArray();
    	Arrays.sort(charA);
    	Arrays.sort(charB);
    	return Arrays.equals(charB, charA);
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}