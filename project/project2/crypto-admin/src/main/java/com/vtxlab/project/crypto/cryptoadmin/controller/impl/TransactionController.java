package com.vtxlab.project.crypto.cryptoadmin.controller.impl;

import com.vtxlab.project.crypto.cryptoadmin.controller.TransactionOperation;
import com.vtxlab.project.crypto.cryptoadmin.entity.ChannelTransaction;
import com.vtxlab.project.crypto.cryptoadmin.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/crypto/admin/api/v1")
public class TransactionController implements TransactionOperation {

    @Autowired
    TransactionService transactionService;

    @Override
    public ChannelTransaction save(Long id, ChannelTransaction channelTransaction) {
        return transactionService.save(id, channelTransaction);
    }
}
