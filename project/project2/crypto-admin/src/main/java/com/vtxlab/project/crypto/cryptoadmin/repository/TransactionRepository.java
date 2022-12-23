package com.vtxlab.project.crypto.cryptoadmin.repository;

import com.vtxlab.project.crypto.cryptoadmin.entity.ChannelCoinMapping;
import com.vtxlab.project.crypto.cryptoadmin.entity.ChannelTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<ChannelTransaction, Long> {
}
