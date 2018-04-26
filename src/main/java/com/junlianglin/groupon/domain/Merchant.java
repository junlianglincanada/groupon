package com.junlianglin.groupon.domain;

import com.junlianglin.framework.domain.AbstractEntity;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "merchant")
public class Merchant extends AbstractEntity {

    @NotNull
    @Size(min = 2, max = 16)
    @Column(name = "abbname")
    private String abbName;

    @NotNull
    @Size(min = 5, max = 16)
    @Column(name = "fullname")
    private String fullName;

    @NotNull
    @Size(min = 2, max = 30)
    @Column(name = "address")
    private String address;

    @NotNull
    @Past
    @Column(name = "createdate")
    private Date createDate;

    @NotNull
    @Digits(integer = 6, fraction = 0)
    @Column(name = "employees")
    private int employees;

    public String getAbbName() {
        return abbName;
    }

    public void setAbbName(String abbName) {
        this.abbName = abbName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }
}
