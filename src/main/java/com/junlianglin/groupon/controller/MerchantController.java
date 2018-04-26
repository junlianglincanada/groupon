package com.junlianglin.groupon.controller;

import com.junlianglin.framework.controller.AbstractController;
import com.junlianglin.groupon.domain.Merchant;
import com.junlianglin.groupon.factory.MerchantFactory;
import com.junlianglin.groupon.model.MerchantModel;
import com.junlianglin.groupon.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "/merchant")
public class MerchantController extends AbstractController {

    @Autowired
    MerchantService merchantService;

    @RequestMapping(value = "/getMerchants", method = RequestMethod.GET)
    public String  getMerchants( Model model) {
        List<Merchant> list = merchantService.getAllMerchants();
        model.addAttribute("listOfMerchants", list);

        return "mechantList";
    }

    @RequestMapping(value = "/addMerchant", method = RequestMethod.GET)
    public String addMerchant(@ModelAttribute("merchant") MerchantModel merchant,Model model) {
        model.addAttribute("merchant", new Merchant());
        return "mechantAdd";
    }

    @RequestMapping(value = "/addMerchant", method = RequestMethod.POST)
    public String addMerchant(@ModelAttribute("merchant") MerchantModel merchant) {

        Merchant entity = MerchantFactory.ModelToDomain(merchant);
        if(merchant.getId()==0)
        {
            merchantService.addMerchant(entity);
        }
        else
        {
            merchantService.updateMerchant(entity);
        }

        return "redirect:/merchant/getMerchants";
    }
}
