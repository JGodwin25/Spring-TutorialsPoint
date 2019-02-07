package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class HelloWorld {
//All are byType but @Qualifer("bean id is byName")
private Dependency1 dependency1;
//@Autowired autowires <bean id="Dependency2" directly to dependency2 w/o setters or constructors
@Autowired
private Dependency2 dependency2;
private String message;
private String message2;


//@Autowired can't be applied to basic datatypes like string int ...
private String message3;

//Auto wire byType
//Search by Datatype here Dependency1 is datatype of (Dependency1 dependency1) look below method.
//so create bean with id same as datatype name i.e Dependency1

//Auto Wire Bean
//Autowire bean to setter without using <constructor-arg="..." ref="..."/>
@Autowired
public HelloWorld(Dependency1 dep) {
	dep.method2();
}


//Auto Wire Bean
//Autowire bean to setter without using <property name="..." ref="..."/>
@Autowired
public void setDependency1(Dependency1 dependency1) {
	this.dependency1=dependency1;
}


public void setMessage(String message){
	this.message  = message;
}

//@Required if you dont set it in xml<prop name="message2"...> then it shows message2 required

@Required
public void setMessage2(String message2){
	this.message2  = message2;
}

//@Autowired can't be applied to basic datatypes like string int ... so use setters
public void setMessage3(String message3){
	this.message3  = message3;
}

public String getMessage() {
	return this.message;
}
public String getMessage2() {
	return this.message2;
}
public String getMessage3() {
	return this.message3;
}

public String getDependencyMethod() {
	return this.dependency1.method1();
}
public String getDependency2Method() {
	return this.dependency2.method1();
}

}
