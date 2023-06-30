package com.guajan.app.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity

public class Doctor implements Serializable {
    @Id
    @Column(name="ID_DOCTOR")
    private String isDoctor;
    @Column(name="DOCTORS_NAME")
    private String doctorName;
    @Column(name="ID_TYPE")
    private String idType;
    @Column(name="NUMBER_PROFESSIONAL_CARD")
    private String numberProfessionalCard;
    @Column(name="SPECIALTY")
    private String specialty;
    @Column(name="YEARS_EXPERIENCE")
    private int yearsExperience;
    @Column(name="ATTENTION_START_TIME")
    private int attentionStartTime;
    @Column(name="ATTENTION_END_TIME")
    private int attentionEndTime;

    public Doctor() {

    }

    public Doctor(String isDoctor, String doctorName, String idType, String numberProfessionalCard, String specialty, int yearsExperience, int attentionStartTime, int attentionEndTime) {
        this.isDoctor = isDoctor;
        this.doctorName = doctorName;
        this.idType = idType;
        this.numberProfessionalCard = numberProfessionalCard;
        this.specialty = specialty;
        this.yearsExperience = yearsExperience;
        this.attentionStartTime = attentionStartTime;
        this.attentionEndTime = attentionEndTime;
    }

    public String getIsDoctor() {
        return isDoctor;
    }

    public void setIsDoctor(String isDoctor) {
        this.isDoctor = isDoctor;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getNumberProfessionalCard() {
        return numberProfessionalCard;
    }

    public void setNumberProfessionalCard(String numberProfessionalCard) {
        this.numberProfessionalCard = numberProfessionalCard;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    public int getAttentionStartTime() {
        return attentionStartTime;
    }

    public void setAttentionStartTime(int attentionStartTime) {
        this.attentionStartTime = attentionStartTime;
    }

    public int getAttentionEndTime() {
        return attentionEndTime;
    }

    public void setAttentionEndTime(int attentionEndTime) {
        this.attentionEndTime = attentionEndTime;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "isDoctor='" + isDoctor + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", idType='" + idType + '\'' +
                ", numberProfessionalCard='" + numberProfessionalCard + '\'' +
                ", specialty='" + specialty + '\'' +
                ", yearsExperience=" + yearsExperience +
                ", attentionStartTime=" + attentionStartTime +
                ", attentionEndTime=" + attentionEndTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return yearsExperience == doctor.yearsExperience && attentionStartTime == doctor.attentionStartTime && attentionEndTime == doctor.attentionEndTime && Objects.equals(isDoctor, doctor.isDoctor) && Objects.equals(doctorName, doctor.doctorName) && Objects.equals(idType, doctor.idType) && Objects.equals(numberProfessionalCard, doctor.numberProfessionalCard) && Objects.equals(specialty, doctor.specialty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isDoctor, doctorName, idType, numberProfessionalCard, specialty, yearsExperience, attentionStartTime, attentionEndTime);
    }
}
