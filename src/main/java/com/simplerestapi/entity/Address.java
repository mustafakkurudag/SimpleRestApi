package com.simplerestapi.entity;

import javax.persistence.*;

@Entity
@Table(name = "ADDRESS")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "plate_code", length = 3, nullable = false)
    private int plateCode;
    @Column(name = "city", length = 50, nullable = false)
    private String city;
    @Column(name = "district", length = 50, nullable = false)
    private String district;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPlateCode() {
        return this.plateCode;
    }

    public void setPlateCode(int plateCode) {
        this.plateCode = plateCode;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

}
