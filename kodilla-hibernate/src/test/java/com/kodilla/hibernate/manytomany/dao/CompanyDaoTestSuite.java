package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        //try {
        //    companyDao.deleteById(softwareMachineId);
        //    companyDao.deleteById(dataMaestersId);
        //    companyDao.deleteById(greyMatterId);
        //} catch (Exception e) {
        //    //do nothing
        //}
    }

    @Test
    public void testNamedQueries() {
        //Given
        Employee employee1 = new Employee("Bob", "Bobek");
        Employee employee2 = new Employee("Fred", "Kruger");
        Employee employee3 = new Employee("Bryan", "Bobek");

        Company company1 = new Company("Dupraisen");
        Company company2 = new Company("MayoIsGood4u");
        Company company3 = new Company("DuppAndSons");

        employeeDao.save(employee1);
        int idEmployee1 = employee1.getId();
        employeeDao.save(employee2);
        int idEmployee2 = employee2.getId();
        employeeDao.save(employee3);
        int idEmployee3 = employee3.getId();

        companyDao.save(company1);
        int idCompany1 = company1.getId();
        companyDao.save(company2);
        int idCompany2 = company2.getId();
        companyDao.save(company3);
        int idCompany3 = company3.getId();

        //When
        List<Employee> retrieveEmployees = employeeDao.retrieveEmployees();
        List<Company> retrieveCompanies = companyDao.retrieveCompanies();

        //Then
        try {
            Assert.assertEquals(2, retrieveEmployees.size());
            Assert.assertEquals(2, retrieveCompanies.size());
        } finally {
            //CleanUp
            employeeDao.deleteById(idEmployee1);
            employeeDao.deleteById(idEmployee2);
            employeeDao.deleteById(idEmployee3);

            companyDao.deleteById(idCompany1);
            companyDao.deleteById(idCompany2);
            companyDao.deleteById(idCompany3);
        }
    }
}