package com.junlianglin.framework.service;

import com.junlianglin.framework.domain.Merchant;
import com.junlianglin.framework.repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("merchantService")
@Transactional
public class MerchantService {
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
