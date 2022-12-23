package com.vtxlab.project.crypto.cryptochannel.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.annotation.Nonnull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
public class ChannelCoinMapping {

    private Long id;

    private String coinCode;

    private String coinId;

    private LocalDateTime lastUpdDate;

    private Channel channel;

}
