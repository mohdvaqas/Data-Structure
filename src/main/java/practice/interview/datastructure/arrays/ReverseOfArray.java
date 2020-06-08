package practice.interview.datastructure.arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.*;

public class ReverseOfArray {

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
        int arr[] = new int[a.length];
        AtomicInteger index = new AtomicInteger(1);
        Arrays.stream(a).forEach(value -> arr[a.length - index.getAndIncrement()] = value);
        return arr;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int a[] = {4, 3, 2, 1};
        int newArray[] = reverseArray(a);
        Arrays.stream(newArray).forEach(s -> System.out.println(s));
    }
}

