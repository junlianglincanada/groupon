package com.junlianglin.framework.controller;

import com.junlianglin.framework.domain.Merchant;
import com.junlianglin.framework.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "/merchant")
public class MerchantController {

    @Autowired
    MerchantService merchantService;

    @RequestMapping(value = "/getMerchants", method = RequestMethod.GET, headers = "Accept=application/json")
    public String  getMerchants(@ModelAttribute("merchant")Merchant merchant, Model model) {
        List<Merchant> list = merchantService.getAllMerchants();

        model.addAttribute("merchant", new Merchant());
        model.addAttribute("listOfMerchants", list);

        return "mechantDetail";
    }

    @RequestMapping(value = "/addMerchant", method = RequestMethod.POST, headers = "Accept=application/json")
    public String addMerchant(@ModelAttribute("merchant") Merchant merchant) {
        if(merchant.getId()==0)
        {
            merchantService.addMerchant(merchant);
        }
        else
        {
            merchantService.updateMerchant(merchant);
        }

        return "redirect:/merchant/getMerchants";
    }
}
