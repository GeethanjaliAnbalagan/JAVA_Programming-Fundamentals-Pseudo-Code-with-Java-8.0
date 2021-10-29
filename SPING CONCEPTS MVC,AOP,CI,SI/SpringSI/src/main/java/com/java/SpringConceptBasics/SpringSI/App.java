package com.java.SpringConceptBasics.SpringSI;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class App {  
    public static void main(String[] args) {  
          
      
         Resource resource=new ClassPathResource("applicationContext.xml");  
         BeanFactory factory=new XmlBeanFactory(resource);  
          
        Employee e=(Employee)factory.getBean("obj");  
        e.display();  
          
    }  
}  
