for creating the object in spring:
--> when you creating a maven project it asks artifact id(for artifact when you give the common package for different .java files com.project), grpid(projectname), and version(automatically shown down).
  --> Go to pom.xml add the spring context dependency from www.maven repository.com type spring context add that in pom.xml 
 ** <dependencies>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context</artifactId>
			<version>5.3.32</version> <!-- or latest stable version -->
		</dependency>
</dependencies>**
  -->The spring will create automatoically a folder called maven dependencies we can check what are the dependencies installed in pom.xml.
  create a sample Employee class in src/main/java folder
  <-->for creating object in spring
  create a configuration file with spring.xml in sr/main/resources add the below code 
  <?xml version="1.0" encoding="UTF-8"?>
**<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
                           http://www.springframework.org/schema/beans/spring-beans.xsd">
                           
//creation of object in spring
<bean id="e1" class ="com.flm.model.Employee"/>  || comparsion in java (Employee emp = new Employee();)
-->Here in object is referred as "bean" in spring.
From the above java object id="e1" is referred as an emp creating a memory and class is refferred to class name.
</beans>**

  To test go to test folder create a test class in that class (check the code in git) you can understand 
  And to know what are the objects stored in the class we used ToString() by right click we can create in Employee.java file and run the file as java project
  
  
  
