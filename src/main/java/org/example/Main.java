package org.example;

import com.isi.security.GNUCrypt;

import java.security.InvalidKeyException;

public class Main {
    public static void main(String[] args) {

//        String str_to_encrypt = "password";
//        String str_to_decrypt = "Dz8rUw5pJngH3PO8ra3BPw==";
        String str_to_encrypt = "0Q1&4#MvE(8r+it%V";
        String str_to_decrypt = "CJhGu2KPNz6UO9NTNnXwLIvi4k8hMoWmH8IBkL5ixeA=";

        try {
            if (!str_to_encrypt.isEmpty()) {
                System.out.println(str_to_encrypt+" -> "+GNUCrypt.encrypt("@1B2c3D4e5F6g7H8", str_to_encrypt));
            }

            if (!str_to_decrypt.isEmpty()) {
                System.out.println(str_to_decrypt+" -> "+GNUCrypt.decrypt("@1B2c3D4e5F6g7H8", str_to_decrypt));
            }
        } catch (InvalidKeyException ex) {
            System.out.println("ERROR: "+ex.getMessage());
        }
    }
}