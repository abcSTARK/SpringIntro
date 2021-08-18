package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Group;
import pojo.Student;

public class TestMyEmployee {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    /*     MyEmployee m=(MyEmployee) context.getBean("emp_const"); //lazy loading ,eager loading strategy
        System.out.println("Initial Object Value : "+m);

        m.setEmpName("new name");
        System.out.println("Changed Object Value : "+m);

        MyEmployee m_new=(MyEmployee) context.getBean("emp_const");
        System.out.println("On 2nd Req. Object Value : "+m_new); //scope of bean is singleton

       MyEmployee m=(MyEmployee) context.getBean("emp");//lazy loading on emp
          m=(MyEmployee) context.getBean("emp");


        Department department= (Department) context.getBean("dept");
        System.out.println(department.getEmp());
*/
        Student student = (Student) context.getBean("mystu"); //id=decapitilised class name i.e. "student"
        System.out.println(student);

        Group group=(Group) context.getBean("group");
        System.out.println(group.getStudent());



    }
}
