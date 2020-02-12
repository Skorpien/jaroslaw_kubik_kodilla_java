package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public final class SearchingFacade {

    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    public List<Company> retrieveCompaniesLikeParam(String param) {
        return companyDao.retrieveCompaniesLikeParam(param);
    }

    public List<Employee> retrieveEmployeesLikeParam(String param) {
        return employeeDao.retrieveEmployeesLikeParam(param);
    }
}

