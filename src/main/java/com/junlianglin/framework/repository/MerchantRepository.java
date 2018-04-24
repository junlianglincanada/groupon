package com.junlianglin.framework.repository;

import com.junlianglin.framework.domain.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantRepository extends JpaRepository<Merchant,Long> {
}
