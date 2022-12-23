package com.vtxlab.project.crypto.cryptoadmin.service.impl;

import com.vtxlab.project.crypto.cryptoadmin.entity.ChannelTransaction;
import com.vtxlab.project.crypto.cryptoadmin.repository.ChannelRepository;
import com.vtxlab.project.crypto.cryptoadmin.repository.TransactionRepository;
import com.vtxlab.project.crypto.cryptoadmin.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class TransactionServiceHolder implements TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    @Autowired
    ChannelRepository channelRepository;

    @Override
    public ChannelTransaction save(Long id, ChannelTransaction channelTransaction) {
        return channelRepository.findById(id).map(e -> {
            channelTransaction.setChannel(e);
            transactionRepository.save(channelTransaction);
            return channelTransaction;
        }).orElse(null);
    }
}
