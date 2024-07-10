package streamapi.question;

import creational.design.prototypepattern.Student;

import java.util.*;
import java.util.stream.Collectors;

public class Client {


    // question1: sort employee based on their salaries in desc order

    public static List<Employee> sortEmployeeBasedOnSalaryDesc(List<Employee> empList){
       List<Employee> sortedEmployee =empList.stream().sorted((e1,e2) -> (int) (e2.getSalary()-e1.getSalary()))
             .collect(Collectors.toList()).stream().limit(3).collect(Collectors.toList());

        //Collections.sort(empList, (a, b) -> Double.compare(b.getSalary(), a.getSalary()));
       return sortedEmployee;
    }

    //2: fetch employee whose salary lesser to 3rd Highest salary
    public static List<Employee> salaryLesserTo3rdHighest(List<Employee> empList){
        List<Employee> sortedEmployee = empList.stream().
                sorted((e1,e2)->(int)(e1.getSalary()-e2.getSalary())).
                limit(empList.size()-3).collect(Collectors.toList());
        return sortedEmployee;
    }

    // 3: return sum of all the employee salary
    public static double costToEmployee(List<Employee> empList){
       double sum = empList.stream().mapToDouble(Employee :: getSalary).sum();
       return sum;
    }

    //4: Return list of employee having with their department name
    public static HashMap<String, List<Employee>> listOfEmployeeWithDept(List<Employee> empList){
        Map<String,List<Employee>> map = new HashMap<>();
        map = empList.stream().collect(Collectors.groupingBy(Employee::getDepartmentName)
                );
        return (HashMap<String, List<Employee>>) map;
    }

    // 5: Fetch the max salary in each department
    public static HashMap<String, Optional<Employee>> maxSalaryWithDept(List<Employee> empList){
        Map<String, Optional<Employee>> empdata =empList.stream().collect(Collectors.groupingBy(Employee::getDepartmentName,
                Collectors.minBy(Comparator.comparing(Employee::getSalary))));
        return (HashMap<String, Optional<Employee>>) empdata;
    }

    public static void main(String[] args) {


    List<Employee> list = new ArrayList<>();
        list.add(new Employee("Prakhar","Government",30000,"Rail_DE"));
        list.add(new Employee("Shiva","Government",50000,"DEV"));
        list.add(new Employee("Ashu","private",70000,"Banker"));
        list.add(new Employee("Rahul","Bank",20000,"SE"));
        list.add(new Employee("Deepak","Bank",40000,"PO"));
        list.add(new Employee("Arpit","private",80000,"PO"));
        List<Employee> sortedEmployee =sortEmployeeBasedOnSalaryDesc(list);

        // fetch all the employee whose salary less than the 3rd Highest salary
        List<Employee> empListSalaryLesserTo3rdHighest = salaryLesserTo3rdHighest(list);

        // return the sum of salaries of all employee
        double sumSalary = costToEmployee(list);

        Map<String,List<Employee>> mapList = listOfEmployeeWithDept(list);
        maxSalaryWithDept(list);



    }
}
