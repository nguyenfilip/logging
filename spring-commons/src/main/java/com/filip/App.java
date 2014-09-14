package com.filip;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@Configuration
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        SimpleBean simpleBean = context.getBean(SimpleBean.class);
    }
    
    @Bean
    public SimpleBean bean (){ 
    	return new SimpleBean();
    }
}
