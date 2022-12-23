package com.vtxlab.project.crypto.cryptoadmin.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CHANNELS")
@Getter
@Setter
public class Channel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Nonnull
    @Column(name = "channel_code")
    private String channelCode;

    @Nonnull
    @Column(name = "channel_url")
    private String channelUrl;

    @Nonnull
    @Column(name = "last_upd_date")
    @LastModifiedDate
    private LocalDateTime lastUpdDate;

    @OneToMany(mappedBy = "channel",cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "channel")
    private List<ChannelCoinMapping> channelCoinMappings = new ArrayList<>();

    @OneToMany(mappedBy = "channel",cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "channel")
    private List<ChannelTransaction> channelTransactions = new ArrayList<>();
}
