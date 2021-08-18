package main;

import jdbc.Employee;
import jdbc.EmployeeDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestConnection {
    public static void main(String args[]){
        ApplicationContext context =new ClassPathXmlApplicationContext("connection.xml");
        EmployeeDAO dao =(EmployeeDAO) context.getBean("employeeDAOImpl");
        //int valu =dao.addEmployee(new Employee("name","address",909,123451));
        List<Employee> out =dao.findAllEmployees();
        System.out.println(out);
    }
}
