package com.guajan.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Paciente implements Serializable {
    @Id
    @Column(name = "ID_PATTIENT")
    private String idPaciente;
    @Column(name = "CLINIC_HISTORY")
    private String historyClinic;
    @Column(name = "DATE_OF_BIRTH")
    private String dateOfBirth;
    @Column(name = "EPS")
    private String eps;
    @Column(name = "ID_TYPE")
    private String idType;
    @Column(name = "NAME")
    private String name;

    public Paciente() {
    }

    public Paciente(String idPaciente, String historyClinic, String dateOfBirth, String eps, String idType, String name) {
        this.idPaciente = idPaciente;
        this.historyClinic = historyClinic;
        this.dateOfBirth = dateOfBirth;
        this.eps = eps;
        this.idType = idType;
        this.name = name;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getHistoryClinic() {
        return historyClinic;
    }

    public void setHistoryClinic(String historyClinic) {
        this.historyClinic = historyClinic;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "idPaciente='" + idPaciente + '\'' +
                ", historyClinic='" + historyClinic + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", eps='" + eps + '\'' +
                ", idType='" + idType + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        return Objects.equals(idPaciente, paciente.idPaciente) && Objects.equals(historyClinic, paciente.historyClinic) && Objects.equals(dateOfBirth, paciente.dateOfBirth) && Objects.equals(eps, paciente.eps) && Objects.equals(idType, paciente.idType) && Objects.equals(name, paciente.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPaciente, historyClinic, dateOfBirth, eps, idType, name);
    }
}
