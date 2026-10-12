package com.rishi.springbootapplication.service;

import com.rishi.springbootapplication.model.Diesel;
import com.rishi.springbootapplication.repository.DieselRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DieselService {

    @Autowired
    private DieselRepository repo;

    public void addDiesel(Diesel d){
        //System.out.println("Method Called!");
        repo.save(d);
        }
    public boolean isGoodForProg(){

        return true;
    }
}
