package com.guajan.app.repositories;

import com.guajan.app.entities.Appointment;
import org.springframework.data.repository.CrudRepository;

public interface IAppointmentRepository  extends CrudRepository<Appointment,Integer> {
}
