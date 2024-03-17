package com.example.employeems.service;

import com.example.employeems.dto.EmployeeDTO;
import com.example.employeems.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    public String saveEmployee(EmployeeDTO employeeDTO){
        if(employeeRepo.existsById(employeeDTO.getEmpID())){
            return "yes";
        }else {
            return  "no";
        }
    }
}
