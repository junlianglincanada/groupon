package com.junlianglin.groupon.model;



import com.junlianglin.framework.model.AbstractModel;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "person")
public class MerchantModel extends AbstractModel {

    public MerchantModel(int id, String abbName, String fullName, String address, String createDate, int employees){
        super();
        this.id = id;
        this.abbName = abbName;
        this.fullName = fullName;
        this.address = address;
        this.createDate = createDate;
        this.employees = employees;
    }
    public MerchantModel(){
        super();
    }


    private int id;


    private String abbName;


    private String fullName;


    private String address;


    private String createDate;


    private int employees;

    public int getId() {
        return id;
    }

    @XmlElement
    public void setId(int id) {
        this.id = id;
    }

    public String getAbbName() {
        return abbName;
    }

    @XmlElement
    public void setAbbName(String abbName) {
        this.abbName = abbName;
    }

    public String getFullName() {
        return fullName;
    }

    @XmlElement
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    @XmlElement
    public void setAddress(String address) {
        this.address = address;
    }

    public String getCreateDate() {
        return createDate;
    }

    @XmlElement
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public int getEmployees() {
        return employees;
    }

    @XmlElement
    public void setEmployees(int employees) {
        this.employees = employees;
    }




}
