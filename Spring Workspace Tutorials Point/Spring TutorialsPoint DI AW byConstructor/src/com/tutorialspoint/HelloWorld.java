package com.tutorialspoint;

public class HelloWorld {

private Dependency1 dependency1;

private String message;

//Before using see Autowire byType
//Auto wire byConstructor
//Search by Datatype here Dependency1 is datatype of constructir arg HelloWorld(Dependency1 dependency1) look below method.
//so create bean with id same as datatype name i.e Dependency1
public HelloWorld(Dependency1 dependency1) {
	this.dependency1=dependency1;
}
//Also works for setters 
/*public void setDependency1(Dependency1 dep) {
	this.dependency1=dep;
}*/

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
