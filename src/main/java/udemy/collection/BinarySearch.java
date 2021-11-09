package udemy.collection;

import OOPSample.CorrectConclusion;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        arrayList.add(19);
        Collections.sort(arrayList); //сначала надо обязательно отсортировать
        int index=Collections.binarySearch(arrayList, 12);

        Employee emp1=new Employee(100, "Zaur", 12345);
        Employee emp2=new Employee(100, "Igor", 1245);
        Employee emp3=new Employee(200, "Maria", 1245);
        Employee emp4=new Employee(50, "Sergei", 42345);
        Employee emp5=new Employee(2, "Kolya", 235545);
        Employee emp6=new Employee(76, "Sasha", 345);
        Employee emp7=new Employee(23, "Elena", 23455);
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);
        System.out.println(employeeList);
        Collections.sort(employeeList);
        System.out.println(employeeList);
        int index2=Collections.binarySearch(employeeList, new Employee(50, "Sergei", 42345)); //нахожим на каком индексе находится работник с заданными параметрами
        System.out.println(index2);

        int[] array= {1,3,5,3,67,24,78,34,7,8,214,65,3};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index3=Arrays.binarySearch(array,3);
        System.out.println(index3);
        Collections.reverse(employeeList);
        System.out.println(employeeList);

    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmployee) {
       int result=this.id-anotherEmployee.id;
       if(result==0) {
           result = this.name.compareTo(anotherEmployee.name);
       }
       return result;
    }
}
