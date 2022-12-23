package com.vtxlab.project.crypto.cryptochannel.model.dto;


import com.vtxlab.project.crypto.cryptochannel.model.exchangerate.ExchangeRate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChannelDto implements Serializable {

    List<ExchangeRate> exchangeRates;

}


