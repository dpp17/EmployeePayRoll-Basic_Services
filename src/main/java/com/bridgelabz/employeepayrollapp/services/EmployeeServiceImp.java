package com.bridgelabz.employeepayrollapp.services;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeeData;
import com.bridgelabz.employeepayrollapp.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImp implements IEmployeeServices{

    @Autowired
    private EmployeeRepo empRepo;

    List<EmployeeData> list = new ArrayList<>();

    @Override
    public EmployeeData addEmployee(EmployeeDTO employeeDTO) {
        EmployeeData empData = new EmployeeData(employeeDTO);
          list.add(empData);
//         empRepo.save(empData);
        return empData;
    }
}
