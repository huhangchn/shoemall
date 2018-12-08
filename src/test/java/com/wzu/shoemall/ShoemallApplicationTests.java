package com.wzu.shoemall;

import com.wzu.shoemall.bean.Department;
import com.wzu.shoemall.bean.Employee;
import com.wzu.shoemall.mapper.DepartmentMapper;
import com.wzu.shoemall.mapper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShoemallApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Test
    public void contextLoads() throws SQLException {
        System.out.println("--------" + dataSource.getClass());
        System.out.println("--------" + dataSource.getConnection().getClass());
    }

    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    DepartmentMapper departmentMapper;

    @Test
    public void testMyBatis(){
        Employee emp = employeeMapper.getEmpById(1);
        System.out.println(emp);

        Department dept = departmentMapper.getDeptById(1);
        System.out.println(dept);
    }




}
