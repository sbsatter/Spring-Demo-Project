package hello;

import org.springframework.*;
public class Application {

    public static void main(String [] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        
        HelloWorld helloWorldObj = context.getBean("HelloWorld");
        
        System.out.println(helloWorldObj.getMessage());

    }
}