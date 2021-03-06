package komissarov.hybrid_sort.creator;

import komissarov.hybrid_sort.datareader.ReaderFromFile;
import komissarov.hybrid_sort.parameter.Parameters;

import java.io.IOException;
import java.util.ArrayList;

public class FromFileArrayCreator {
    public static ArrayList<int[]> initArrays() throws IOException {
        ArrayList<int[]> arrayWithNumberArrays = new ArrayList<>(Parameters.FILE_AMOUNT);
        for (int i = 1; i <= Parameters.FILE_AMOUNT; i++) {
            String fileName = Parameters.FILE_NAME + i + Parameters.FILE_EXPANSION;
            arrayWithNumberArrays.add(ReaderFromFile.readArrayFromFile(fileName));
        }
        return arrayWithNumberArrays;
    }
}
