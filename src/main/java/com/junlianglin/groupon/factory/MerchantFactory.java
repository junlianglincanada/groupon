package com.junlianglin.groupon.factory;

import com.junlianglin.groupon.domain.Merchant;
import com.junlianglin.framework.factory.AbstractFactory;
import com.junlianglin.groupon.model.MerchantModel;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Service("merchantFactory")
public class MerchantFactory extends AbstractFactory
{
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
