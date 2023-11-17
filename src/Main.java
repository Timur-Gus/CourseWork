public class Main {
    public static void main(String[] args) {
        EmployeeBook myEmployeeBook = new EmployeeBook();
        myEmployeeBook.addEmployees("Козлов Виктор Сергеевич", 1, 50000);
        myEmployeeBook.addEmployees("Козлов Максим Сергеевич", 1, 50000);
        myEmployeeBook.addEmployees("Козлов Артем Сергеевич", 2, 50000);
        myEmployeeBook.addEmployees("Иванов Иван Сергеевич", 3, 50000);


        myEmployeeBook.setEmployee("Козлов Артем Сергеевич", 4, 16000);
        myEmployeeBook.printAllEployees();
        myEmployeeBook.printEmployeesDept();
        myEmployeeBook.delEmployee("Козлов Виктор Сергеевич");
        myEmployeeBook.printAllEployees();
        System.out.println(myEmployeeBook.totalMonthSalary());
        System.out.println(myEmployeeBook.averageSalary());
        myEmployeeBook.printAllFio();
        myEmployeeBook.indexingSalary(0.3);
        myEmployeeBook.addEmployees("Степанова Мария Александровна", 1, 35000);
        myEmployeeBook.minSalaryDept(2);
        System.out.println(myEmployeeBook.averageSalaryDept(1));
        System.out.println(myEmployeeBook.totalSalaryDept(1));
        myEmployeeBook.salaryMoreIndex(50000);
        myEmployeeBook.minSalary();
    }
}
