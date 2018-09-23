package by.bsu.komissarov.hybrid_sort.sorts;

import java.util.Random;

import static by.bsu.komissarov.hybrid_sort.sorts.InsertionSort.insertionSort;

public class QuickSort {

//    public static int ARRAY_LENGTH = 40;
    public static int ARRAY_LENGTH = 100000;
    private static int[] array = new int[ARRAY_LENGTH];
    private static Random generator = new Random();

    public static void initArray() {
        for (int i = 0; i < ARRAY_LENGTH; i++) {
//            array[i] = generator.nextInt(30);
            array[i] = generator.nextInt(100000000);
        }
    }

    public static void printArray() {
        for (int i = 0; i < ARRAY_LENGTH - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[ARRAY_LENGTH - 1]);
    }

    public static void quickSort() {
        int startIndex = 0;
        int endIndex = ARRAY_LENGTH - 1;
        doSort(startIndex, endIndex);
    }

    private static void doSort(int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        if (cur - start > 7) {
            doSort(start, cur);
        } else {
            array = insertionSort(array);
            System.out.print("start ");
        }
        if (end - (cur + 1) > 7) {
            doSort(cur + 1, end);
        } else {
            array = insertionSort(array);
            System.out.print("end ");
        }
    }
}
