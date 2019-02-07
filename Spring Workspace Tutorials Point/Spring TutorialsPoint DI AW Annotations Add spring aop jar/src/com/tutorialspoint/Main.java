package com.tutorialspoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
public class Main {
public static void main(String args[]) {

ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
HelloWorld obj=(HelloWorld)context.getBean("helloworld");
System.out.println(obj.getMessage());
System.out.println(obj.getMessage2());
System.out.println(obj.getMessage3());
System.out.println(obj.getDependencyMethod());
System.out.println(obj.getDependency2Method());
}
}

