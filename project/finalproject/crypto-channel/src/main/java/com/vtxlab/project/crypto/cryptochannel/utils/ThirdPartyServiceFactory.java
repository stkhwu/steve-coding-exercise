package com.vtxlab.project.crypto.cryptochannel.utils;

import com.vtxlab.project.crypto.cryptochannel.service.ThirdPartyService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // For Approach 2
public class ThirdPartyServiceFactory {

    @Autowired
    @Qualifier(value = "coingeckoService")
    ThirdPartyService2 coingeckoService;

    @Autowired
    @Qualifier(value = "polygonService")
    ThirdPartyService2 polygonService;

    public ThirdPartyService2 produceThirdPartyService(String sourceApp) {
        return switch (sourceApp) {
            case "crypto-web" -> coingeckoService;
            case "crypto-app" -> polygonService;
            default -> null;
        };
    }
}
