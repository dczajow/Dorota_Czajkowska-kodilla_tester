package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ShippingCenterTestSuite {

    @Test
    public void shouldReturnCorrectMessage(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Somestreet 90210,London,UK", 25.0);
        Assertions.assertEquals("Package delivered to: Somestreet 90210,London,UK", message);
    }

    @Test
    public void shouldReturnPackageNotDeliveredMessage(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Somestreet 90210,London,UK", 33.0);
        Assertions.assertEquals("Package not delivered to: Somestreet 90210,London,UK", message);
    }

}