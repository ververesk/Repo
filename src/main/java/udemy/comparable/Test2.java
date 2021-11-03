package udemy.comparable;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Employee(100, "Zaur", "Tregulov", 12345);
        Employee emp2 = new Employee(15, "Ivan", "Petrov", 6542);
        Employee emp3 = new Employee(123, "Ivan", "Sidorov", 8542);
    //    Arrays.sort(new Employee[] {emp1, emp2, emp3});//все равно будет ошибка, не известно как именно сортировать
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        System.out.println("Перед сортировкой \n"+employeeList); //Comparator использует неестественный порядок а тот, который мы сами создали
        Collections.sort(employeeList); //метод compareTo нельзя перезаписывать, но если периодически надо другая сортировка то нудно писать классы Comparator
        System.out.println("После сортировки \n"+employeeList);

    }
}
    class Employee
           implements Comparable<Employee> {
        int id;
        String name;
        String surname;
        int salary;

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", salary=" + salary +
                    '}';
        }

        public Employee(int id, String name, String surname, int salary) {
            this.id = id;
            this.name = name;
            this.surname = surname;
            this.salary = salary;
        }

        @Override
        public int compareTo(Employee anotherEmp) { //если текущий объект больше anotherEmp должны вернуть положительное число, меньше - отрицательное, если равны то ноль
            if (this.id == anotherEmp.id) {
                return 0;
            } else if (this.id < anotherEmp.id) {
                return -1;
            } else {
                return 1;
            }
            //          return this.id-anotherEmp.id;
//            int res = this.name.compareTo(anotherEmp.name); //если будет делать сортировку по имени если имена одинаковые то сравниваем фамилии
//            if(res==0) {
//                res=this.surname.compareTo(anotherEmp.surname);
//            }
//            return res;
            //       }
        }
    }

//    class IdComparator implements Comparator<Employee> {
//        @Override
//        public int compare(Employee emp1, Employee empl2) {
//            if (emp1.id==empl2.id) {
//                return 0;
//            } else if(emp1.id<empl2.id) {
//                return -1;
//            }
//            else {
//                return 1;
//            }
//        }
//    }

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee empl2) {
      return emp1.name.compareTo(empl2.name);
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee empl2) {
        return emp1.salary-empl2.salary;
    }
}

