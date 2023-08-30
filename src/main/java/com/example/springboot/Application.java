package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
//       ApplicationContext appContext = new AnnotationConfigApplicationContext(SchoolConfig.class);
//       School school = appContext.getBean(School.class);
//       String result = school.getTrainingProgramName();
//       System.out.println(result);
//        System.out.println("> Trước khi IoC Container được khởi tạo");
//        ApplicationContext context = SpringApplication.run(Application.class, args);
//        System.out.println("> Sau khi IoC Container được khởi tạo");
//
//        // Khi chạy xong, lúc này context sẽ chứa các Bean có đánh
//        // dấu @Component.
//
//        Girl girl = context.getBean(Girl.class);
//
//        System.out.println("> Trước khi IoC Container destroy Girl");
//        ((ConfigurableApplicationContext) context).getBeanFactory().destroyBean(girl);
//        System.out.println("> Sau khi IoC Container destroy Girl");
    }

}
