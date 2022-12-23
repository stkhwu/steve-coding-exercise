package com.vtxlab.project.crypto.cryptoadmin.repository;

import com.vtxlab.project.crypto.cryptoadmin.entity.Channel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelRepository extends JpaRepository<Channel, Long> {
    Channel findByChannelTransactionsTranTypeAndChannelTransactionsSourceApp(String tranType, String sourceApp);

    Boolean existsByChannelCode(String channelCode);
}
