package com.vtxlab.project.crypto.cryptoadmin.repository;

import com.vtxlab.project.crypto.cryptoadmin.entity.ChannelCoinMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoinMappingRepository extends JpaRepository<ChannelCoinMapping, Long> {

    List<ChannelCoinMapping> findByChannelId(Long id);

}
