package com.springdemo.Beans.Demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
         Display objA = (Display) context.getBean("dispaly");

         objA.setMessage("My name is Nagaraj");
         objA.getMessage();

         Display objB = (Display) context.getBean("display");
         objB.getMessage();
      }
   }
    }
}
