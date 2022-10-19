package com.nestDigital.xyzBackEndNew.dao;

import com.nestDigital.xyzBackEndNew.model.StudentModel;
import org.springframework.data.repository.CrudRepository;

public interface StudentDAO extends CrudRepository<StudentModel,Integer> {
}
