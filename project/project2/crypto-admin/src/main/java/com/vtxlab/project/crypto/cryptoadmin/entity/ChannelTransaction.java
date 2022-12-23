package com.vtxlab.project.crypto.cryptoadmin.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "CHANNEL_TRANS")
public class ChannelTransaction implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Nonnull
//    @Column(name = "channel_id")
//    private Long channelId;

    @Nonnull
    @Column(name = "domain_version")
    private String domainVersion;

    @Nonnull
    @Column(name = "domain_url")
    private String domainUrl;

    @Nonnull
    @Column(name = "source_app")
    private String sourceApp;

    @Nonnull
    @Column(name = "tran_type")
    private String tranType;

    @Nonnull
    @Column(name = "last_upd_date")
    private LocalDateTime lastUpdDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "channel_id", referencedColumnName = "id")
    @JsonIgnoreProperties("channelTransactions")
    private Channel channel;
}
