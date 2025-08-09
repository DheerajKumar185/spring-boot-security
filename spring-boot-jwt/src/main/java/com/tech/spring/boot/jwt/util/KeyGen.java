package com.tech.spring.boot.jwt.util;

import lombok.extern.slf4j.Slf4j;

import java.util.Base64;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

@Slf4j
public class KeyGen {
    public static void main(String[] args) throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("HmacSHA256");
        keyGen.init(256);
        SecretKey secretKey = keyGen.generateKey();
        String base64Key = Base64.getEncoder().encodeToString(secretKey.getEncoded());
        log.info("base64Key: {}", base64Key);
    }
}