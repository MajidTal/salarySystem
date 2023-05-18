package com.codeline.sampleProject.Controller;

import com.codeline.sampleProject.Models.Employee;
import com.codeline.sampleProject.Models.Salary;
import com.codeline.sampleProject.Service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class SalaryController {
    @Autowired
    SalaryService salaryService;

    @RequestMapping("salary/create")
    public void saveSalary() {createSalary();}

    @RequestMapping("salary/get")
    public List<Salary> getSalary () {return salaryService.getSalary();}

    public void createSalary() {

    Salary salary = new Salary();
    salary.setAmount(1.2);
    salary.setCurrency("iutguy");
    salary.setOverTimeAmount(1.2);
    salary.setDeductions(1.2);
    salary.setHealthCareContribution(1.2);
    salary.setAllowances(1.2);
    salary.setBonus(1.2);
    salary.setPerDiem(1.2);

        salary.setCreatedDate(new Date());
        salary.setIsActive(true);
        salaryService.saveSalary(salary);
  }
}





