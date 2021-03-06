package komissarov.hashtable.entity;

import komissarov.hashtable.parameter.Parameters;

public class HashTable {
    private double irrational;
    private CollisionList[] hashTable;

    public HashTable(double irrational) {
        hashTable = new CollisionList[Parameters.ARRAY_LENGTH];
        this.irrational = irrational;
    }

    public void add(int value) {
        int hash = hashFunction(value);
        if (hashTable[hash] == null) {
            hashTable[hash] = new CollisionList(value);
        } else {
            hashTable[hash].add(value);
        }
    }

    private int hashFunction(int value) {
        return (int) ((value % Parameters.PRIME_NUMBER * irrational) % 1 * hashTable.length);
    }

    public int maxCollisionListLength() {
        int length = 0;
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] != null && hashTable[i].getLength() > length)
                length = hashTable[i].getLength();
        }
        return length;
    }

    public boolean contains(int value) {
        int hash = hashFunction(value);
        return hashTable[hash].contains(value);
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] != null) {
                result += "Hash code " + i + ": " + hashTable[i].toString() + ";\n";
            } else {
                result += "Hash code " + i + ";\n";
            }
        }
        return result;
    }

}
