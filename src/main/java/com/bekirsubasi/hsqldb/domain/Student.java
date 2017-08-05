package com.bekirsubasi.hsqldb.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name="seq_gen_student", sequenceName="seq_student", initialValue = 3)
    @GeneratedValue(generator = "seq_gen_student")
    @Column(name = "student_id")
    private Long studentId;


    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    @Column(name ="mobile_phone", nullable = false)
    private String mobilePhone;

    @Column(name = "city_id", nullable = false)
    private Long cityId;

    @Column(name = "district_id", nullable = false)
    private Long districtId;

    public Student() {
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Long getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Long districtId) {
        this.districtId = districtId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;


    @Override
    public String toString() {
        return this.getName()+" "+this.getSurname();
    }
}
