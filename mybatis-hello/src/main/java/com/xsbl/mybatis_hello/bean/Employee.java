package com.xsbl.mybatis_hello.bean;

import lombok.Data;

/**
 * @描述:
 * @创建人: Isaac
 * @创建日期: 2020/5/25 22:06
 */
@Data
public class Employee {

  private Integer id;

  private String lastName;

  private String email;

  private String gender;
}
