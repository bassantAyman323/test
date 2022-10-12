package org.kushick.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class drawingApp {
    public static void main(String[] args) {
        ApplicationContext context2=new ClassPathXmlApplicationContext("Spring.xml");
//        BeanFactory factory=new XmlBeanFactory(new FileSystemResource("Spring.xml"));
        Triangle t= (Triangle) context2.getBean("triangle");
     //   Triangle triangle = new Triangle();
        t.draw();

    }
}
