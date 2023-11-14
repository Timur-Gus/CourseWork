public class Employee {
    String fio;
    int salary, id, dept;
    static int totalEmployee;
    public Employee(String fio, int dept,int salary){
        this.fio = fio;
        this.dept = dept;
        this.salary = salary;
        totalEmployee++;
        id = totalEmployee;
    }
}
