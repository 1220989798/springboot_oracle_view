package com.demo.controller;

import com.demo.entity.Employee;
import com.demo.mapper.DataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    DataMapper dataMapper;

    @RequestMapping("/emps")
    public String getEmployees(ModelMap map){

        List<Employee> employees =  dataMapper.test_query(1);
        System.out.println(employees.size());

        map.put("emps",employees);
        return "list";
    }
}
