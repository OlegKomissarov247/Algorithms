package komissarov.search;

import komissarov.search.NumbersGenerator;
import komissarov.search.BinarySearch;
import komissarov.search.InterpolationSearch;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int n = 14;
        while (n > 9) {
            ArrayList<Integer> array = NumbersGenerator.generateRandomArray(n, 0, 200);
            Collections.sort(array);
//            System.out.println(array);
            int key = NumbersGenerator.generateRandomNumber(0,array.size()-1);
            key = array.get(key);
//            System.out.println("Search item: " + key);
            long start = 0;
            long finish = 0;
            start = System.nanoTime();
            BinarySearch.runBinarySearch(array,key);
            finish = System.nanoTime();
            System.out.println("Binary search on " + array.size() + " elements: " + String.format("%,12d", (finish-start)) + " ns;");
            start = System.nanoTime();
            InterpolationSearch.runInterpolationSearch(array,key);
            finish = System.nanoTime();
            System.out.println("Interpolation search on " + array.size() + " elements: " + String.format("%,12d", (finish-start)) + " ns;");
            System.out.println();
            n--;
        }
    }
}