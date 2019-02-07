package com.tutorialspoint;

public class Dependency1 {
public Dependency1() {}
public String method1() {
	return "From Dependency1 Class method1";
}
public void method2() {
System.out.println("constructor for Class Dependency1 Autowired");
}
}
