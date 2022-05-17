package com.example.TestParameta.service;

import com.example.TestParameta.exceptions.AgeMayor18Exception;
import com.example.TestParameta.model.Employee;
import com.example.TestParameta.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService{


    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> ListAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public String SaveEmployee(Employee employee) {
        try {
            if (employee!=null){

                String ageEmployee =employee.getBirthday().toString();
                DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                 LocalDate BirthdayDate = LocalDate.parse(ageEmployee, fmt);
                LocalDate now = LocalDate.now();

                //Period periodo = Period.between(ageEmployee, now);
               Period period1 = Period.between(LocalDate.from(BirthdayDate), now);
//second part
                String ebondingDateE =employee.getEbondingDate().toString();
                LocalDate ebondingDate = LocalDate.parse(ebondingDateE, fmt);
                Period period2 = Period.between(LocalDate.from(ebondingDate), now);

                if (period1.getYears()>=18){
                    System.out.printf("Your age is: %s years, %s months and %s days, you can register in the platform because you are mayor age",
                            period1.getYears(), period1.getMonths(), period1.getDays());

                    System.out.printf("Your time with our company is: %s years and %s months",
                            period2.getYears(), period2.getMonths());

                    employeeRepository.save(employee);
                    return "Your age is: %s years, %s months and %s days, you can register in the platform because you are mayor age"+
                            period1.getYears()+ period1.getMonths()+ period1.getDays()+"Your time with our company is: %s years and %s months"+
                    period1.getYears()+ period1.getMonths();
                }else {
                    throw new AgeMayor18Exception("The employee must be of legal age ");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return  null;
    }

    @Override
    public Employee findByIdEmployee(int id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public void deleteEmployee(int id) {
    employeeRepository.deleteById(id);
    }
}
