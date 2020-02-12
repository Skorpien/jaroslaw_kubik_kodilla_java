package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchingFacadeTest {

    @Autowired
    SearchingFacade searchingFacade;
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void retrieveCompaniesWhereNameLikeParam() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company dataMatter = new Company("Data Matter");

        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(dataMatter);

        //When
        List<Company> companyList  = searchingFacade.retrieveCompaniesLikeParam("Data");

        //Then
        try {
            Assert.assertEquals(2, companyList.size());
        } finally {
            //cleanup
            companyDao.deleteAll();
        }
    }

    @Test
    public void retrieveEmployeesWhereNameLikeParam() {
        //Given
        Employee employee1 = new Employee("Bob", "Bobek");
        Employee employee2 = new Employee("Fred", "Kruger");
        Employee employee3 = new Employee("Bryan", "Bobek");

        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);

        //When
        List<Employee> employeeList = searchingFacade.retrieveEmployeesLikeParam("Bob");

        //Then
        try {
            Assert.assertEquals(2, employeeList.size());
        } finally {
            //cleanup
            employeeDao.deleteAll();
        }
    }
}