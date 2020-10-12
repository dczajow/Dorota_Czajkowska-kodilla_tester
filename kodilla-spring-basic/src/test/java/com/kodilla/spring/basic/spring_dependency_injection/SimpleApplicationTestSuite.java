package com.kodilla.spring.basic.spring_dependency_injection;


import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SimpleApplicationTestSuite {

    public void shouldReturnCorrectMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        MessageService bean = context.getBean(MessageService.class);
        String message = bean.send("Test", "Any receiver");
        Assertions.assertNotNull(message);
    }

}
