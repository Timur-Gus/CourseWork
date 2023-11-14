import java.util.Objects;

public class EmployeeBook {
    private Employee[] employees = new Employee[10];

    public void addEmployees(String fio, int dept, double salary){
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] == null){
                employees[i] = new Employee(fio, dept, salary);
                break;
            }
        }
    }
    public void printAllEployees(){
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
    public int totalMonthSalary(){
        int total = 0;
        for (int i = 0; i < employees.length; i++) {
            total += employees[i].getSalary();
        }
        return total;
    }
    public void MinSalary() {
        int min = 0;
        for (int i = 0; i < (employees.length - 1); i++) {
            if (employees[min].getSalary() > employees[i].getSalary()) {
                min = i;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + employees[min].getFio());
    }
    public void MaxSalary() {
        int max = 0;
        for (int i = 0; i < (employees.length - 1); i++) {
            if (employees[max].getSalary() < employees[i].getSalary()) {
                max = i;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + employees[max].getFio());
    }
    public double averageSalary() {
        return (double) totalMonthSalary() / employees.length;
    }
    public void printAllFio (){
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFio());
        }
    }
    public void indexingSalary(double index){
        for (int i = 0; i < employees.length; i++) {
            employees[i].setSalary(employees[i].getSalary() + (employees[i].getSalary() * index));

        }
    }
    public void minSalaryDept(int dept) {
        int min = 0;
        for (int i = 0; i < (employees.length - 1); i++) {
            if (employees[min].getSalary() > employees[i].getSalary() && employees[i].getDept() == dept) {
                min = i;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой в отделе №" + dept
                + ": " + employees[min].getFio());
    }
    public void maxSalaryDept(int dept) {
        int max = 0;
        for (int i = 0; i < (employees.length - 1); i++) {
            if (employees[max].getSalary() < employees[i].getSalary() && employees[i].getDept() == dept) {
                max = i;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой в отделе №" + dept + ": " + employees[max].getFio());
    }
    public int totalSalaryDept(int dept){
        int total = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDept() == dept){
                total += employees[i].getSalary();
            }
        }
        return total;
    }
    public double averageSalaryDept(int dept){
        double total = 0;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDept() == dept){
                total += employees[i].getSalary();
                index++;
            }
        }
        total = total / index;
        return total;
    }
    public void indexingDept(double index, int dept){
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getDept() == dept){
                employees[i].setSalary(employees[i].getSalary() + (employees[i].getSalary() * index));
            }
        }
    }
    public void printDept (int dept){
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getDept() == dept){
                System.out.println(employees[i].getFio() +
                        ", id: " + employees[i].getId() + ", зарплата = " + employees[i].getSalary());
            }
        }
    }
    public void salaryLessIndex(int salary){
        for (int i = 0; i < employees.length; i++) {
        if(employees[i].getSalary() < salary) {
            System.out.println(employees[i].getFio() +
                    ", id: " + employees[i].getId() + ", зарплата = " + employees[i].getSalary());
        }
        }
    }
    public void salaryMoreIndex(int salary) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getSalary() >= salary){
                System.out.println(employees[i].getFio() +
                        ", id: " + employees[i].getId() + ", зарплата = " + employees[i].getSalary());
            }
        }
    }
    public void delEmployee(String fio){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null){
                if(Objects.equals(employees[i].getFio(),fio)){
                    employees[i] = null;
                    System.out.println("Сотрудник " + fio + " удален.");
                }
            }
        }
    }
    public void setEmployee(String fio, int dept, int salary){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null){
                if(Objects.equals(employees[i].getFio(), fio)){
                    employees[i].setDept(dept);
                    employees[i].setSalary(salary);
                }
            }
        }
    }
    public void printEmployeesDept(){
        System.out.println("Отдел №1: ");
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null){
                if (Objects.equals(employees[i].getDept(),1)) {
                    System.out.println("\t" + employees[i].getFio());
                }
            }
        }
        System.out.println("Отдел №2: ");
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null){
                if (Objects.equals(employees[i].getDept(), 2)) {
                    System.out.println("\t" + employees[i].getFio());
                }
            }
        }
        System.out.println("Отдел №3: ");
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null){
                if (Objects.equals(employees[i].getDept(), 3)) {
                    System.out.println("\t" + employees[i].getFio());
                }
            }
        }
        System.out.println("Отдел №4: ");
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null){
                if (Objects.equals(employees[i].getDept(), 4)) {
                    System.out.println("\t" + employees[i].getFio());
                }
            }
        }
        System.out.println("Отдел №5: ");
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null) {
                if (Objects.equals(employees[i].getDept(), 5)) {
                    System.out.println("\t" + employees[i].getFio());
                }
            }
        }
    }
}

