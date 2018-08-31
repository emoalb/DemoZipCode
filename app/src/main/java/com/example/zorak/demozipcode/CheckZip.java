package com.example.zorak.demozipcode;



public class CheckZip {

boolean CheckCode(String Code) {

   if (Code.matches("^\\d{5}(-\\d{4})?$")) {
        return true;
    } else {
        return false;
    }
}
        }


