package udemy.regexEx;

public class PrintfEx {

    static  void  employeeInfo(Employee employee) {
        System.out.printf("%03d \t %-12s \t %-12s \t %,.1f \n",
                employee.id, employee.name, employee.surname, employee.salary*(1+ employee.bonusPct));
    }
    /*
    %03d на id выделяется три числа, то есть если id = 1, то будет записано 001
    %-12s - выравнивание по левому краю, на имя выделяется 12 символов
    %,.1f .1 - округляем до одного символа после запятой
     */
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Veronika", "Grigorovich", 12345, 0.15);
        Employee emp2 = new Employee(15, "Ivan", "Petrov", 6542, 0.05);
        Employee emp3 = new Employee(1123, "Maria", "Sidorova", 8542, 0.12);
        employeeInfo(emp1);
        employeeInfo(emp2);
        employeeInfo(emp3);
        String newString  = String.format("%03d \t %-12s \t %-12s \t %,.1f \n", emp1.id, emp1.name, emp1.surname, emp1.salary*(1+ emp1.bonusPct));
        System.out.println(newString);
    }
}

class Employee {
    int id;
    String name;
    String surname;
    int salary;
    double bonusPct;

    public Employee(int id, String name, String surname, int salary, double bonusPct) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonusPct = bonusPct;
    }
}
