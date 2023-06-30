package com.guajan.app.repositories;

import com.guajan.app.entities.Paciente;
import org.springframework.data.repository.CrudRepository;

public interface IPatientRepository extends CrudRepository<Paciente, String> {
}
