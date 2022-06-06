package com.javaSpring;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJDBCExample
{
    public static void main(String[] args)
    {
        //Reading the configuration
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        //Get EmployeeDAOImpl bean instance
        EmployeeDAOImpl dao = (EmployeeDAOImpl) context.getBean("employeeDAOImpl");
        
        //Create a new Employee object
        Employee employee = new Employee();
        employee.setId(99);
        employee.setName("JavaSpring");
        employee.setDept("Blog");
        employee.setAge(99);
        
        //creation of Employee
        dao.saveEmployee(employee);
        
        //Get a specific Employee
        Employee emp1 = dao.getEmployeeById(99);
        System.out.println(" *** Getting a specific Employee Details *** ");
        System.out.println("Employee ID   ::"+emp1.getId());
        System.out.println("Employee Name ::"+emp1.getName());
        System.out.println("Employee Age  ::"+emp1.getAge());
        System.out.println("Deptartment   ::"+emp1.getDept());
        System.out.println();
        
        //Get all the Employees
        List<Employee> employeeList = dao.getAllEmployees();
        System.out.println("*** List of all Employee ***");
        for(Employee emp2 : employeeList)
        {
            System.out.println("Employee ID   ::"+emp2.getId());
            System.out.println("Employee Name ::"+emp2.getName());
            System.out.println("Employee Age  ::"+emp2.getAge());
            System.out.println("Deptartment   ::"+emp2.getDept());
            System.out.println(" *********************");            
        }
        System.out.println();
        
        //Update existing employee
        employee.setAge(1111);
        employee.setName("JavaSpringJDBC");
        employee.setDept("Manufacturing");
        dao.updateEmployee(employee);
        
        Employee emp3 = dao.getEmployeeById(99);
        System.out.println(" *** Updated Employee Details *** ");
        System.out.println("Employee ID   ::"+emp3.getId());
        System.out.println("Employee Name ::"+emp3.getName());
        System.out.println("Employee Age  ::"+emp3.getAge());
        System.out.println("Deptartment   ::"+emp3.getDept());
        System.out.println();
        
        //Delete an Employee
        dao.deleteEmployee(99);
        List<Employee> newEmployeeList = dao.getAllEmployees();
        System.out.println("*** Remaining Employees after Deletion ***");
        for(Employee emp4 : newEmployeeList)
        {
            System.out.println("Employee ID   ::"+emp4.getId());
            System.out.println("Employee Name ::"+emp4.getName());
            System.out.println("Employee Age  ::"+emp4.getAge());
            System.out.println("Deptartment   ::"+emp4.getDept());
        }
        
        context.close();
    }
}
