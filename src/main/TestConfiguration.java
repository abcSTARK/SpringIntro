package main;

import config.MyConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfiguration {
    public static void main(String args[]){
        ApplicationContext context=new AnnotationConfigApplicationContext(MyConfiguration.class);
        System.out.println(context.getBean("mystu"));
    }
}
