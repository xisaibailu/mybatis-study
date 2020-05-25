package com.xsbl.mybatis_hello.dao;

import com.xsbl.mybatis_hello.bean.Employee;

/**
 * @描述:
 * @创建人: Isaac
 * @创建日期: 2020/5/25 22:06
 */
public interface EmployeeMapper {

  public Employee getEmpById(Integer id);

}
