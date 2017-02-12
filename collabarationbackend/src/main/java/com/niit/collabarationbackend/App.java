package com.niit.collabarationbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.configuration.ApplicationConfiguration;
import com.niit.dao.UsersDao;
import com.niit.model.Users;


public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new  AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        //AnnotationConfigApplicationContext.refresh();
        UsersDao userDao=(UsersDao)annotationConfigApplicationContext.getBean("UsersDaoImpl");
        System.out.println("starting");
        Users user=new Users();
        user.setUsername("eshu");
        user.setPassword("eshu");
        userDao.registerUser(user);
        
        System.out.println("start");
    }
}
