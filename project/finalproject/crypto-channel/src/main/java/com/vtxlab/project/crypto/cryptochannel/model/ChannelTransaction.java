package com.vtxlab.project.crypto.cryptochannel.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ChannelTransaction {

    private Long id;


    private String domainVersion;

    private String domainUrl;

    private String sourceApp;

    private String tranType;

    private LocalDateTime lastUpdDate;

    private Channel channel;
}
