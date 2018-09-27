package komissarov.students_merge_sort.runner;

import komissarov.students_merge_sort.entity.ChiefTable;
import komissarov.students_merge_sort.entity.WorkerTable;
import komissarov.students_merge_sort.sort.ParallelSort;
import komissarov.students_merge_sort.entity.Person;
import komissarov.students_merge_sort.entity.Worker;

public class ParallelSortRunner {
    public static void main(String[] args) {

        Person[] people = new Person[10];
        people[0] = new Person("Oleg", 23);
        people[1] = new Person("Nike", 43);
        people[2] = new Person("Willis", 37);
        people[3] = new Person("Lola", 19);
        people[4] = new Person("Hugo", 32);
        people[5] = new Person("Rick", 27);
        people[6] = new Person("Raf", 26);
        people[7] = new Person("Jack", 31);
        people[8] = new Person("John", 52);
        people[9] = new Person("Jeremy", 21);

        Worker[] workers = new Worker[10];
        workers[0] = new Worker("Oleg", 23, 1000);
        workers[1] = new Worker("Nike", 43, 2000);
        workers[2] = new Worker("Willis", 37, 3333);
        workers[3] = new Worker("Lola", 19, 3222);
        workers[4] = new Worker("Hugo", 32, 2100);
        workers[5] = new Worker("Rick", 27, 3200);
        workers[6] = new Worker("Raf", 26, 900);
        workers[7] = new Worker("Jack", 31, 3100);
        workers[8] = new Worker("John", 52, 1600);
        workers[9] = new Worker("Jeremy", 21, 1250);

        ChiefTable chiefTable = new ChiefTable(workers);
        WorkerTable workerTable = new WorkerTable(people);

        ParallelSort parallelSort = new ParallelSort(workerTable.getWorkers());
        parallelSort.parallelSort(chiefTable.getWorkers(), 0,chiefTable.getWorkers().length - 1);
        System.out.println(chiefTable);
        System.out.println(workerTable);
        
    }
}
