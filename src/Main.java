public class Main {
    public static void main(String[] args) {
            Employee[] employees = new Employee[10];
            employees[0] = new Employee("Иванов Иван Иванович", 2, 42000);
            employees[1] = new Employee("Козлов Виктор Сергеевич", 3, 50000);
            employees[2] = new Employee("Семенов Евгений Александрович", 1, 35000);
            employees[3] = new Employee("Пирогова Ольга Викторовна", 3, 37000);
            employees[4] = new Employee("Иванов Иван Иванович", 2, 45000);
            employees[5] = new Employee("Максимова Светлана Сергеевна", 1, 50000);
            employees[6] = new Employee("Петров Сергей Семенович",4,70000);
            employees[7] = new Employee("Иванов Иван Иванович", 2, 45000);
            employees[8] = new Employee("Иванова Кристина Олеговна", 3, 50000);
            employees[9] = new Employee("Иванов Иван Иванович", 2, 45000);

            printAllEployees(employees);
            System.out.println("Сумма затрат на зарпалты в месяц: " + totalMonthSalary(employees));
            System.out.println("Средняя зарплата сотрудника: " + averageSalary(employees));
            MaxSalary(employees);
            MinSalary(employees);
            printAllFio(employees);

            minSalaryDept(employees, 2);
            maxSalaryDept(employees, 2);
            System.out.println("Сумма зарплат отдела № 2: " + totalSalaryDept(employees, 2));
            System.out.println("Средняя зарплата сотрудника в отделе № 3: " + averageSalaryDept(employees, 3));
            printDept(employees, 2);
            System.out.println();
            salaryLessIndex(employees, 45000);
            System.out.println();
            salaryMoreIndex(employees, 50000);
        }
        public static void printAllEployees(Employee[] arr){
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
        public static int totalMonthSalary(Employee[] arr){
            int total = 0;
            for (int i = 0; i < arr.length; i++) {
                total += arr[i].getSalary();
            }
            return total;
        }
        public static void MinSalary(Employee[] arr) {
            int min = 0;
            for (int i = 0; i < (arr.length - 1); i++) {
                if (arr[min].getSalary() > arr[i].getSalary()) {
                    min = i;
                }
            }
            System.out.println("Сотрудник с минимальной зарплатой: " + arr[min].getFio());
        }
        public static void MaxSalary(Employee[] arr) {
            int max = 0;
            for (int i = 0; i < (arr.length - 1); i++) {
                if (arr[max].getSalary() < arr[i].getSalary()) {
                    max = i;
                }
            }
            System.out.println("Сотрудник с максимальной зарплатой: " + arr[max].getFio());
        }
        public static double averageSalary(Employee[] arr) {
            return (double) totalMonthSalary(arr) / arr.length;
        }
        public static void printAllFio (Employee[] arr){
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i].getFio());
            }
        }
        public static void indexingSalary(Employee[] arr, double index){
        for (int i = 0; i < arr.length; i++) {
            arr[i].setSalary(arr[i].getSalary() + (arr[i].getSalary() * index));
        }
        }
    public static void minSalaryDept(Employee[] arr,int dept) {
        int min = 0;
        for (int i = 0; i < (arr.length - 1); i++) {
            if (arr[min].getSalary() > arr[i].getSalary() && arr[i].getDept() == dept) {
                min = i;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой в отделе №" + dept + ": " + arr[min].getFio());
    }
    public static void maxSalaryDept(Employee[] arr,int dept) {
        int max = 0;
        for (int i = 0; i < (arr.length - 1); i++) {
            if (arr[max].getSalary() < arr[i].getSalary() && arr[i].getDept() == dept) {
                max = i;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой в отделе №" + dept + ": " + arr[max].getFio());
    }
    public static int totalSalaryDept(Employee[] arr, int dept){
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDept() == dept){
                total += arr[i].getSalary();
            }
        }
        return total;
    }
    public static double averageSalaryDept(Employee[] arr, int dept){
        double total = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDept() == dept){
                total += arr[i].getSalary();
                index++;
            }
        }
        total = total / index;
        return total;
    }
    public static void indexingDept(Employee[] arr, double index, int dept){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getDept() == dept){
                arr[i].setSalary(arr[i].getSalary() + (arr[i].getSalary() * index));
            }
        }
    }
    public static void printDept (Employee[] arr, int dept){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getDept() == dept){
                System.out.println(arr[i].getFio() +
                        ", id: " + arr[i].getId() + ", зарплата = " + arr[i].getSalary());
            }
        }
    }
    public static void salaryLessIndex(Employee[] arr, int salary){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getSalary() < salary){
                System.out.println(arr[i].getFio() +
                        ", id: " + arr[i].getId() + ", зарплата = " + arr[i].getSalary());
            }
        }
    }
    public static void salaryMoreIndex(Employee[] arr, int salary) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getSalary() >= salary){
                System.out.println(arr[i].getFio() +
                        ", id: " + arr[i].getId() + ", зарплата = " + arr[i].getSalary());
            }
        }
    }
}
