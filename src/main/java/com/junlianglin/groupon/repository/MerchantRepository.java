package com.junlianglin.groupon.repository;

import com.junlianglin.groupon.domain.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantRepository extends JpaRepository<Merchant,Long> {
}
