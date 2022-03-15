package com.example.myproject;

import com.example.myproject.config.BeanConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@Import({BeanConfig.class})
public class MyProjectApplication {

    public static void main(String[] args) {
       ApplicationContext context =  SpringApplication.run(MyProjectApplication.class, args);


        Coder c = (Coder) context.getBean("coder1");
        System.out.println( c.getId());
        System.out.println( c.getName());
        System.out.println( c.getLanguage());
        System.out.println(c.getComputer().getBrand());

        Coder c1 = (Coder) context.getBean("coder2");
        System.out.println( c1.getId());
        System.out.println( c1.getName());
        System.out.println( c1.getLanguage());
        System.out.println(c1.getComputer().getBrand());
 }

}
