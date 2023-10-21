package org.example.utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilidad {

    public Boolean buscarCoindicencia (String expresionRegular, String cadenaTexto){
        Pattern pattern = Pattern.compile((expresionRegular));
        Matcher matcher = pattern.matcher(cadenaTexto);
        if (matcher.matches()){
            return true;
        } else {
            return false;
        }
    }

}
