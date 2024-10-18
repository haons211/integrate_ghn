package com.haons.microservice.integrate_ghn.service;

import com.haons.microservice.integrate_ghn.dto.GHNRequest;
import com.haons.microservice.integrate_ghn.dto.GHNResponse;

public interface GHNService {

    GHNResponse getFees(GHNRequest ghnRequest);
}
