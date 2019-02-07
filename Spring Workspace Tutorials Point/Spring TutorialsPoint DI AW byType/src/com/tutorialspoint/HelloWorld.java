package com.tutorialspoint;

public class HelloWorld {

private Dependency1 dependency1;

private String message;

//Auto wire byType
//Search by Datatype here Dependency1 is datatype of (Dependency1 dependency1) look below method.
//so create bean with id same as datatype name i.e Dependency1
//constructors cant be wired use setters for DI Autowire
public void setDependency1(Dependency1 dependency1) {
	this.dependency1=dependency1;
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

}
