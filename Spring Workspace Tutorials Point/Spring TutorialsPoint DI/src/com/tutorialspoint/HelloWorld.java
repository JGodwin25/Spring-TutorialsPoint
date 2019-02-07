package com.tutorialspoint;

public class HelloWorld {

private Dependency1 dependency1;
private Dependency2 dependency2;

private String message;

public HelloWorld(Dependency1 dependency1){
	this.dependency1=dependency1;//obj created without new keywd passed from Ioc container.
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
