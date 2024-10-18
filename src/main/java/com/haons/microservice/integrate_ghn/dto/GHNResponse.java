package com.haons.microservice.integrate_ghn.dto;

import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GHNResponse {
    private int code;
    private String message;
    private Data data;

    // Getters and setters

    public static class Data {
        private int total;
        private int service_fee;
        private int insurance_fee;
        private int pick_station_fee;
        private int coupon_value;
        private int r2s_fee;
        private int document_return;
        private int double_check;
        private int cod_fee;
        private int pick_remote_areas_fee;
        private int deliver_remote_areas_fee;
        private int cod_failed_fee;

        // Getters and setters
    }

}
