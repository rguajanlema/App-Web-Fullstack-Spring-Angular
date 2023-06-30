package com.guajan.app.repositories;

import com.guajan.app.entities.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDoctorRepository  extends CrudRepository<Doctor,String> {
}
