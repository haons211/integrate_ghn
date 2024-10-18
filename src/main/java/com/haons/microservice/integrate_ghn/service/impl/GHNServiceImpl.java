package com.haons.microservice.integrate_ghn.service.impl;

import com.haons.microservice.integrate_ghn.dto.GHNRequest;
import com.haons.microservice.integrate_ghn.dto.GHNResponse;
import com.haons.microservice.integrate_ghn.service.GHNService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static com.haons.microservice.integrate_ghn.utils.BaseConst.*;

@Service
public class GHNServiceImpl implements GHNService {

   private  RestTemplate restTemplate;

    @Override
    public GHNResponse getFees(GHNRequest ghnRequest) {

        //Convert your product in cast to ghnRequest

        HttpHeaders headers = new HttpHeaders();
        headers.set(TOKEN_HEADER,ACCESS_TOKEN);
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set(SHOP_ID_HEADER,SHOP_ID);
        HttpEntity<GHNRequest> entity = new HttpEntity<>(ghnRequest, headers);
        ResponseEntity<GHNResponse> responseEntity = restTemplate.exchange(
                URL,
                HttpMethod.POST,
                entity,
                GHNResponse.class
        );
        return responseEntity.getBody();
    }

}
