package com.haons.microservice.integrate_ghn.utils;

import org.springframework.beans.factory.annotation.Value;

public final class BaseConst {
    public static final String MIME_TYPE_XML = "application/xml";
    public static final String MIME_TYPE_TXT = "text/plain";
    public static final String TOKEN_HEADER = "Token";
    public static final String SHOP_ID_HEADER = "ShopId";
    @Value("${ghn.token}")
    public static String ACCESS_TOKEN;
    @Value("${ghn.ShopId}")
    public static String SHOP_ID;
    @Value("${ghn.url}")
    public static String URL;

}
