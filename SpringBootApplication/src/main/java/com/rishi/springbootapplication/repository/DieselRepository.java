package com.rishi.springbootapplication.repository;

import com.rishi.springbootapplication.model.Diesel;
import org.springframework.stereotype.Repository;
//this class is responsoble for containing all JDBC steps
//we can perfrom CRUD operations related to a class here


//@Component
@Repository
public class DieselRepository {
    public void save(Diesel d){

        System.out.println("saved in database");
    }
}
