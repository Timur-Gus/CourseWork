public class Employee {
    String fio;
    int id, dept;
    double salary;
    static int totalEmployee;

    public Employee(String fio, int dept, double salary) {
        this.fio = fio;
        this.dept = dept;
        this.salary = salary;
        totalEmployee++;
        id = totalEmployee;
    }
    public int getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public static int getTotalEmployee() {
        return totalEmployee;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }
    public void setDept(int dept) {
        this.dept = dept;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник: " + fio +
                ". Отдел № " + dept +
                ", зарплата = " + salary +
                ", id: " + id;
    }
}

