package com.vtxlab.project.crypto.cryptochannel.controller;


import com.vtxlab.project.crypto.cryptochannel.exception.ApiException;
import com.vtxlab.project.crypto.cryptochannel.model.dto.ChannelDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/default")
public interface ChannelOperation {

    @GetMapping("/web/ex-rate")
    ChannelDto getWebExchangeRate(List<String> cryptos, List<String> currencies) throws ApiException;

    @GetMapping("/app/ex-rate")
    ChannelDto getAppExchangeRate(List<String> cryptos, List<String> currencies) throws ApiException;

}
