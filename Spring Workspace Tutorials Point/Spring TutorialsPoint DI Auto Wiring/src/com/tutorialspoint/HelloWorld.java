package com.tutorialspoint;

public class HelloWorld {

private Dependency1 dependency1;
private Dependency2 dependency2;

private String message;

//Auto wire byName
//Search by arg name here dependency1 is name of arg in (Dependency1 dependency1) look below method.
//so create bean with id same as arg name i.e dependency1
//constructors cant be wired use setters for DI Autowire

public void setDependency1(Dependency1 dependency1) {
	this.dependency1=dependency1;
}

// even Considers setter Name
public void setDependency2(Dependency2 dependency2) {
	this.dependency2=dependency2;
}

public void setMessage(String message){
	this.message  = message;
}
public String getMessage() {
	return this.message;
}

public String getDependencyMethod() {
	return this.dependency1.method1();
}

public String getDependencyMethod2() {
	return this.dependency2.method1();
}

}
