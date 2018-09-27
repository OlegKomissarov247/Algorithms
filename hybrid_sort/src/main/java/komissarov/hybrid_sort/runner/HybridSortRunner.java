package komissarov.hybrid_sort.runner;

import komissarov.hybrid_sort.creator.FromFileArrayCreator;
import komissarov.hybrid_sort.datareader.WriterInFile;
import komissarov.hybrid_sort.parameter.Parameters;
import komissarov.hybrid_sort.sort.HybridSort;
import komissarov.hybrid_sort.sort.QuickSort;

import java.io.IOException;
import java.util.ArrayList;

public class HybridSortRunner {

    public static void main(String[] args) throws IOException {

//        for (int i = 1; i <= Parameters.FILE_AMOUNT; i++) {
//            String fileName = Parameters.FILE_NAME + i + Parameters.FILE_EXPANSION;
//            WriterInFile.writeArrayInFile(fileName);
//        }

        ArrayList<int[]> arrayWithNumberArrays = FromFileArrayCreator.initArrays();
        long start = System.nanoTime();
        for (int[] array : arrayWithNumberArrays) {
            QuickSort.quickSort(array, 0, Parameters.ARRAY_LENGTH - 1);
        }
        long finish = System.nanoTime();
        long result = (finish - start) / Parameters.FILE_AMOUNT;
        System.out.println("Average time of performance of QuickSort = " + String.format("%,12d", result) + " ns");

        arrayWithNumberArrays = FromFileArrayCreator.initArrays();
        start = System.nanoTime();
        for (int[] array : arrayWithNumberArrays) {
            HybridSort.hybridSort(array, 0, Parameters.ARRAY_LENGTH - 1);
        }
        finish = System.nanoTime();
        result = (finish - start) / Parameters.FILE_AMOUNT;
        System.out.println("Average time of performance of HybridSort = " + String.format("%,12d", result) + " ns");
        System.out.println("When TRANSITION_TO_INSERTION_SORT = " + Parameters.TRANSITION_TO_INSERTION_SORT + ";");
    }
}
