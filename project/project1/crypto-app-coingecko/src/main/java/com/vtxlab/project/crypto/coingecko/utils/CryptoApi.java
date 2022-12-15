package com.vtxlab.project.crypto.coingecko.utils;

import com.vtxlab.project.crypto.coingecko.exception.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Map;

@Component
public class CryptoApi {

    @Autowired
    RestTemplate restTemplate;

    public <T> T invoke(String baseUrl, String serviceVers, String serviceUrl, Map<String, String> queryParams, Class<T> returnType) throws ApiException {
        try {
            UriComponentsBuilder url = UriComponentsBuilder.fromUriString(baseUrl) //
                    .pathSegment(serviceVers) //
                    .path(serviceUrl); //

            for (Map.Entry<String, String> entry : queryParams.entrySet()) {
                url = url.queryParam(entry.getKey(), entry.getValue());
            }

            String urlString = url.build().toString();

            return restTemplate.getForObject(urlString, returnType);

        } catch (Exception e) {
            e.printStackTrace();
            throw new ApiException(80003, "Calling Crypto service fail");
        }
    }

}
