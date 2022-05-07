package com.uuget.demo.model.entity;

import lombok.Data;

/**
 * student 实体类
 */
@Data
public class Student {
  private static final long serialVersionUID = 1;
  private Integer id;
  private String name;
  private Integer age;
  private String sex;
}
