package com.vtxlab.project.crypto.cryptochannel.utils;

import com.vtxlab.project.crypto.cryptochannel.exception.ApiException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Map;

@Slf4j
@Component
public class ChannelApi {

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

            log.info("url = {}", urlString);
            // Calling API
            return restTemplate.getForObject(urlString, returnType);

        } catch (Exception e) {
            e.printStackTrace();
            throw new ApiException(80001, "Calling Open-weather service fail");
        }

    }



}
