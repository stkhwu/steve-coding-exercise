package com.vtxlab.project.crypto.cryptochannel.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Channel implements Serializable {

    private Long id;

    private String channelCode;

    private String channelUrl;

    private LocalDateTime lastUpdDate;

    private List<ChannelCoinMapping> CoinMaps = new ArrayList<>();

    private List<ChannelTransaction> channelTrans = new ArrayList<>();
}
