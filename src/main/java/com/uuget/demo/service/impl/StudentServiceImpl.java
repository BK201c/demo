package com.uuget.demo.service.impl;

import com.uuget.demo.model.dao.StudentDao;
import com.uuget.demo.model.entity.Student;
import com.uuget.demo.service.intf.StudentServiceIntf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("StudentServiceIntf")
public class StudentServiceImpl implements StudentServiceIntf {
  private final StudentDao studentDao;

  public StudentServiceImpl(StudentDao studentDao) {
    this.studentDao = studentDao;
  }

  @Override
  public Student getById(Integer id) {
    return this.studentDao.getById(id);
  }
}
