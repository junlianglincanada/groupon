package com.junlianglin.groupon.service;

import com.junlianglin.framework.service.AbstractService;
import com.junlianglin.groupon.domain.Merchant;
import com.junlianglin.groupon.repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service("merchantService")
public class MerchantService extends AbstractService {
    @Autowired
    MerchantRepository merchantRepository;
    public List<Merchant> getAllMerchants() {

        List<Merchant> merchantList = merchantRepository.findAll();
        return merchantList;
    }

    public Merchant addMerchant(Merchant merchant){
        return merchantRepository.save(merchant);
    }

    public Merchant updateMerchant(Merchant merchant){
        return merchantRepository.save(merchant);
    }
}
