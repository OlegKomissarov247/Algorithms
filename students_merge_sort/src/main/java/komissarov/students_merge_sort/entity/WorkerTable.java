package komissarov.students_merge_sort.entity;

public class WorkerTable {
    private Person[] workers;

    public WorkerTable() {
        workers = new Person[10];
    }

    public WorkerTable(Person[] workers) {
        this.workers = workers;
    }

    public Person[] getWorkers() {
        return workers;
    }

    public void setWorkers(Person[] workers) {
        this.workers = workers;
    }

    @Override
    public String toString() {
        String result = "";
        for (Person worker : workers) {
            result = result.concat(worker.toString());
        }
        return result;
    }
}
