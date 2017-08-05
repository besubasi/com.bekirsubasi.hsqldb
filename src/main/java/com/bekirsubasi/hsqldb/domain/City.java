package com.bekirsubasi.hsqldb.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class City implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name="seq_gen_city", sequenceName="seq_city", initialValue = 6)
    @GeneratedValue(generator = "seq_gen_city")
    @Column(name = "city_id")
    private Long cityId;

    @Column(nullable = false)
    private String name;

    protected City() {
    }

    public City(String name) {
        super();
        this.name = name;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getName() {
        return this.name;

    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName() ;
    }
}
