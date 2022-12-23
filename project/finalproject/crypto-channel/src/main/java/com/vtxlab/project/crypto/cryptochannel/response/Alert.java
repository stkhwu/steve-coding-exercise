package com.vtxlab.project.crypto.cryptochannel.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Alert {

    Integer code;

    String message;

}