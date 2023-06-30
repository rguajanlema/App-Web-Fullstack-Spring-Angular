package com.guajan.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Appointment implements Serializable {
    @Id
    @Column(name = "ID_APPOINTMENT")
    private int idAppointment;
    @Column(name = "DOCTOR")
    private String doctor;
    @Column(name = "PATIENT")
    private String patient;
    @Column(name = "FECHA")
    private String date;
    @Column(name = "HOUR")
    private int hour;

    public Appointment() {
    }

    public Appointment(int idAppointment, String doctor, String patient, String date, int hour) {
        this.idAppointment = idAppointment;
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
        this.hour = hour;
    }

    public int getIdAppointment() {
        return idAppointment;
    }

    public void setIdAppointment(int idAppointment) {
        this.idAppointment = idAppointment;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "idAppointment=" + idAppointment +
                ", doctor='" + doctor + '\'' +
                ", patient='" + patient + '\'' +
                ", date='" + date + '\'' +
                ", hour=" + hour +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointment that = (Appointment) o;
        return idAppointment == that.idAppointment && hour == that.hour && Objects.equals(doctor, that.doctor) && Objects.equals(patient, that.patient) && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAppointment, doctor, patient, date, hour);
    }
}
