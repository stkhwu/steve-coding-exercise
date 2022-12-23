package com.vtxlab.project.crypto.cryptoadmin.controller;

import com.vtxlab.project.crypto.cryptoadmin.entity.ChannelTransaction;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/default")
public interface TransactionOperation {

    @PostMapping(value = "/channel/{id}/tran")
    ChannelTransaction save(@PathVariable Long id, @RequestBody ChannelTransaction channelTransaction);
}
