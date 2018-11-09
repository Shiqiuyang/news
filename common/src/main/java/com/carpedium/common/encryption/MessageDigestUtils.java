package com.carpedium.common.encryption;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigestUtils {

    public static String encrypt(String password, String algorithm){
        try {
            MessageDigest md = MessageDigest.getInstance(algorithm);
            md.digest(password.getBytes("UTF-8"));

        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
