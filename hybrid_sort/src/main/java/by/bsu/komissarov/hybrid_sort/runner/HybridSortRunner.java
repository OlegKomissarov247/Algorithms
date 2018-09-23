package by.bsu.komissarov.hybrid_sort.runner;

import static by.bsu.komissarov.hybrid_sort.sorts.QuickSort.initArray;
import static by.bsu.komissarov.hybrid_sort.sorts.QuickSort.printArray;
import static by.bsu.komissarov.hybrid_sort.sorts.QuickSort.quickSort;

public class HybridSortRunner {
    public static void main(String[] args) {
        initArray();
        printArray();
        quickSort();
        printArray();
    }
}
