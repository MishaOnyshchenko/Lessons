package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySprngMain {

    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");


        //retrieve bean from spring container

        Bird bird = classPathXmlApplicationContext.getBean()


        //call methods on the bean


        //close the context

        classPathXmlApplicationContext.close();

    }
}
