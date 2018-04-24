package com.junlianglin.framework.model;



import com.junlianglin.framework.domain.Merchant;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


@XmlRootElement(name = "person")
public class MerchantModel {

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

    public static Merchant ModelToDomain(MerchantModel model){
        Merchant merchant = new Merchant();
        if (model == null)
            return merchant;
        merchant.setId(model.getId());
        merchant.setAbbName(model.getAbbName());
        merchant.setFullName(model.getFullName());
        merchant.setAddress(model.getAddress());
        merchant.setEmployees(model.getEmployees());
        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        if (!model.getCreateDate().isEmpty()){
            try{
                merchant.setCreateDate(format1.parse(model.getCreateDate()));
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }
        return merchant;
    }

    public static MerchantModel DomainToModel(Merchant merchant){
        MerchantModel model = new MerchantModel();
        if (merchant == null)
            return model;

        model.setId(merchant.getId());
        model.setAbbName(merchant.getAbbName());
        model.setAddress(merchant.getAddress());
        if (merchant.getCreateDate() != null){
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            model.setCreateDate(formatter.format(merchant.getCreateDate()));
        }

        model.setFullName(merchant.getFullName());
        model.setEmployees(merchant.getEmployees());

        return model;
    }
}
