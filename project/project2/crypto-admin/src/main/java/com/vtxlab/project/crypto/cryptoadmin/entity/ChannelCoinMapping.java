package com.vtxlab.project.crypto.cryptoadmin.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "CHANNEL_COIN_MAPPINGS")
@Getter
@Setter
public class ChannelCoinMapping implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Nonnull
//    @Column(name = "channel_id")
//    private Long channelId;

    @Nonnull
    @Column(name = "coin_code")
    private String coinCode;

    @Nonnull
    @Column(name = "coin_id")
    private String coinId;

    @Nonnull
    @Column(name = "last_upd_date")
    private LocalDateTime lastUpdDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "channel_id", referencedColumnName = "id")
    @JsonIgnoreProperties("channelCoinMappings")
    private Channel channel;

}
