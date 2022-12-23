package com.vtxlab.project.crypto.cryptoadmin.service;

import com.vtxlab.project.crypto.cryptoadmin.entity.ChannelTransaction;

public interface TransactionService {

    ChannelTransaction save(Long id, ChannelTransaction channelTransaction);
}
