package komissarov.hashtable.runner;

import komissarov.hashtable.entity.HashTable;
import komissarov.hashtable.parameter.Parameters;

import java.io.IOException;
import java.util.Random;

public class HashTableRunner {
    private  static Random random = new Random();
    public static void main(String[] args) throws IOException {
        int[][] array = new int[Parameters.ARRAY_AMOUNT][Parameters.ARRAY_LENGTH];
        for (int i = 0; i < Parameters.ARRAY_AMOUNT; i++) {
            for (int j = 0; j < Parameters.ARRAY_LENGTH; j++) {
                array[i][j] = random.nextInt(Parameters.VALUE_RANGE);
            }
        }
        int avarageCollisionListLength = 0;
        for (int i = 0; i < Parameters.ARRAY_AMOUNT; i++) {
            HashTable hashTable = new HashTable(Parameters.KNUT_NUMBER);
            for (int j = 0; j < Parameters.ARRAY_LENGTH; j++) {
                hashTable.add(array[i][j]);
            }
            avarageCollisionListLength += hashTable.maxCollisionListLength();
        }
        System.out.println("Hash table with KNUT_NUMBER has maxCollisionListLength = "
                + (avarageCollisionListLength / Parameters.ARRAY_AMOUNT));

        avarageCollisionListLength = 0;
        for (int i = 0; i < Parameters.ARRAY_AMOUNT; i++) {
            HashTable hashTable = new HashTable(Parameters.QUOTIENT_1);
            for (int j = 0; j < Parameters.ARRAY_LENGTH; j++) {
                hashTable.add(array[i][j]);
            }
            avarageCollisionListLength += hashTable.maxCollisionListLength();
        }
        System.out.println("Hash table with QUOTIENT_1 has maxCollisionListLength = "
                + (avarageCollisionListLength / Parameters.ARRAY_AMOUNT));

        avarageCollisionListLength = 0;
        for (int i = 0; i < Parameters.ARRAY_AMOUNT; i++) {
            HashTable hashTable = new HashTable(Parameters.QUOTIENT_2);
            for (int j = 0; j < Parameters.ARRAY_LENGTH; j++) {
                hashTable.add(array[i][j]);
            }
            avarageCollisionListLength += hashTable.maxCollisionListLength();
        }
        System.out.println("Hash table with QUOTIENT_2 has maxCollisionListLength = "
                + (avarageCollisionListLength / Parameters.ARRAY_AMOUNT));

        avarageCollisionListLength = 0;
        for (int i = 0; i < Parameters.ARRAY_AMOUNT; i++) {
            HashTable hashTable = new HashTable(Parameters.QUOTIENT_3);
            for (int j = 0; j < Parameters.ARRAY_LENGTH; j++) {
                hashTable.add(array[i][j]);
            }
            avarageCollisionListLength += hashTable.maxCollisionListLength();
        }
        System.out.println("Hash table with QUOTIENT_3 has maxCollisionListLength = "
                + (avarageCollisionListLength / Parameters.ARRAY_AMOUNT));

        HashTable hashTable = new HashTable(Parameters.QUOTIENT_1);
        for (int i = 0; i < Parameters.ARRAY_LENGTH; i++) {
            hashTable.add(array[0][i]);
        }

        System.out.println(hashTable);
        System.out.println(hashTable.contains(100));
    }
}
