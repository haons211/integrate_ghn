package com.haons.microservice.integrate_ghn.dto;

import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GHNRequest {
    private int from_district_id;
    private String from_ward_code;
    private int service_id;
    private Integer service_type_id;  // Nullable field
    private int to_district_id;
    private String to_ward_code;
    private int height;
    private int length;
    private int weight;
    private int width;
    private int insurance_value;
    private int cod_failed_amount;
    private String coupon;  // Nullable field
}
