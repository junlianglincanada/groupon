package com.junlianglin.framework.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "merchant")
public class Merchant implements Serializable {

    public Merchant(int id,String abbName,String fullName,String address,String createDate,int employees){



        super();

        this.id = id;
        this.abbName = abbName;
        this.fullName = fullName;
        this.address = address;
        this.createDate = createDate;
        this.employees = employees;

    }
    public Merchant(){
        super();
    }

    @Id
    @Column(name = "id")
    private int id;

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
    private String createDate;

    @NotNull
    @Digits(integer = 6, fraction = 0)
    @Column(name = "employees")
    private int employees;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }
}
