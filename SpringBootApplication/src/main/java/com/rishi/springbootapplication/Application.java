package com.rishi.springbootapplication;

import com.rishi.springbootapplication.model.Diesel;
import com.rishi.springbootapplication.model.FourWheeler;
import com.rishi.springbootapplication.service.DieselService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ApplicationContext context=SpringApplication.run(Application.class, args);

        DieselService service=context.getBean(DieselService.class);
        Diesel d=context.getBean(Diesel.class);
        service.addDiesel(d);

        /* FourWheeler fw=context.getBean(FourWheeler.class);
        fw.vehicle();
        System.out.println(fw.getModel());
        */



    }

}
