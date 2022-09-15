package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ApiFacade {

    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;


    @Autowired
    public ApiFacade(final CompanyDao companyDao, final EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Company> selectCompanies(final String name) {
        return companyDao.selectCompaniesWithName(name);
    }

    public List<Employee> selectEmployees(final String name) {
        return employeeDao.selectEmployeesWithName(name);
    }
}

