public class Main {
    public static void main(String[] args) {
            Employee[] employees = new Employee[10];
            employees[0] = new Employee("Иванов Иван Иванович", 2, 42000);
            employees[1] = new Employee("Козлов Виктор Сергеевич", 3, 50000);
            employees[2] = new Employee("Семенов Евгений Александрович", 1, 35000);
            employees[3] = new Employee("Иванов Иван Иванович", 2, 45000);
            employees[4] = new Employee("Иванов Иван Иванович", 2, 45000);
            employees[5] = new Employee("Иванов Иван Иванович", 2, 45000);
            employees[6] = new Employee("Петров Сергей Семенович",4,70000);
            employees[7] = new Employee("Иванов Иван Иванович", 2, 45000);
            employees[8] = new Employee("Иванова Кристина Олеговна", 3, 50000);
            employees[9] = new Employee("Иванов Иван Иванович", 2, 45000);

            printAllEployees(employees);
            System.out.println("Сумма затрат на зарпалты в месяц: " + totalMonthSalary(employees));
            System.out.println("Средняя зарплата сотрудника: " + averageSalary(employees));
            employeeMaxSalary(employees);
            employeeMinSalary(employees);
            printAllFio(employees);
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
        public static void employeeMinSalary(Employee[] arr) {
            int min = 0;
            for (int i = 0; i < (arr.length - 1); i++) {
                if (arr[min].getSalary() > arr[i].getSalary()) {
                    min = i;
                }
            }
            System.out.println("Сотрудник с минимальной зарплатой: " + arr[min].getFio());
        }
        public static void employeeMaxSalary(Employee[] arr) {
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
}