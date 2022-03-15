package com.example.myproject.config;

import com.example.myproject.Coder;
import com.example.myproject.Computer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {


    @Bean
    public Coder coder1(@Qualifier("computer1") Computer computer){

        Coder c1 = new Coder(1001,"MR ADAM","JAVA",computer);


        return c1;

    }

    @Bean
   public Computer computer1(){
        Computer com1 = new Computer("ARUS");

return  com1;
   }



   @Bean
    public Coder coder2(@Qualifier("computer2") Computer computer){

        Coder c1 = new Coder();
        c1.setId(2002);
        c1.setName("nishat");
        c1.setLanguage("Dart");
        c1.setComputer(computer);
        return c1;

    }

    @Bean
   public Computer computer2(){
        Computer com1 = new Computer();
com1.setBrand("Mac");
return  com1;
   }
}
