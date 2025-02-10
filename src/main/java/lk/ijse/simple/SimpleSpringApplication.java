package lk.ijse.simple;

import lk.ijse.simple.bean.MyConnection;
import lk.ijse.simple.bean.TestBean1;
import lk.ijse.simple.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

@SpringBootApplication
public class SimpleSpringApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        /*TestBean1 test = context.getBean(TestBean1.class);
        TestBean1 test2 = context.getBean(TestBean1.class);
        System.out.println(test);
        System.out.println(test2);

        MyConnection myConnection = context.getBean(MyConnection.class);
        MyConnection myConnection2 = context.getBean(MyConnection.class);
        System.out.println(myConnection);
        System.out.println(myConnection2);*/
        MyConnection myConnection = context.getBean(MyConnection.class);
        System.out.println("------------------------------------------------------------------------------------");
        MyConnection myConnection2 = context.getBean(MyConnection.class);

        context.registerShutdownHook();
/*
        SpringApplication.run(SimpleSpringApplication.class, args);
*/
    }

}
