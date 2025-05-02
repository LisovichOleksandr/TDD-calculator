package org.example.codewars;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a function that takes a positive integer and returns the next bigger number that can be formed by rearranging its digits. For example:
 *
 *   12 ==> 21
 *  513 ==> 531
 * 2017 ==> 2071
 * If the digits can't be rearranged to form a bigger number, return -1 (or nil in Swift, None in Rust):
 *
 *   9 ==> -1
 * 111 ==> -1
 * 531 ==> -1
 * */

public class NextBiggerNumber {

    public static void main(String[] args) {
        allCombination(12);

    }

    public static long nextBiggerNumber(long n)
    {
        return n;
    }

    public static List<Long> allCombination(long n) {
        Long firstLong = n % 10;
        Long secondLong = n / 10;

        System.out.println("first: " + firstLong);
        System.out.println("second: " + secondLong);


        return List.of(2L);
    }
}
