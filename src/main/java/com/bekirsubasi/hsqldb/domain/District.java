package com.bekirsubasi.hsqldb.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class District implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name="seq_gen_district", sequenceName="seq_district", initialValue = 14)
    @GeneratedValue(generator = "seq_gen_district")
    @Column(name = "district_id")
    private Long districtId;


    @Column(name = "city_id", nullable = false)
    private Long cityId;

    @Column(nullable = false)
    private String name;

    protected District() {
    }

    public District(String name, Long cityId) {
        super();
        this.name = name;
        this.cityId=cityId;
    }

    public Long getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Long districtId) {
        this.districtId = districtId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName() ;
    }
}
