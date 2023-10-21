package org.example.validaciones;

import org.example.utilidades.Utilidad;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionSeguro {

    Utilidad utilidad = new Utilidad();
    public ValidacionSeguro(){
    }
    public Boolean validarNombreAsegurado(String nombre) throws Exception{
        if (nombre.length() > 20){
            throw new Exception("El nombre debe tener  maximo 20 caracteres");
        }

        String expresionRegular = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+$";
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(nombre);

        if (!coincidencia.matches()){
            throw new Exception("El nombre no cumple con el formato requerido");
        }
        return true;
    }

    public Boolean validarEdadAsegurado(Integer edad) throws Exception{
        if (edad > 0 && edad < 90){
            return true;
        } else {
            throw new Exception("Contactese a este numero para estar afiliado: +89 45231 231 23");
        }
    }

    public Boolean validarMontoAsegurado(Long monto) throws Exception{
        if (monto >= 0 && monto <= 1500000000){
            return true;
        } else {
            throw new Exception("El numero de cobertura debe ser un numero valido");
        }
    }

    public LocalDate validarFechaInicio(String fecha) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        try {
            LocalDate fechaInicio = LocalDate.parse(fecha, formatter);
            return fechaInicio;
        } catch (Exception e){
            throw new Exception("La fecha de inicio debe tener el formato de dd/MM/yy");
        }
    }

    public Boolean validarBeneficiario(String beneficiario) throws Exception{
        if (beneficiario.length() > 50 || !beneficiario.matches("^[A-Za-z ]+$")){
            throw new Exception("El beneficiario debe tener hasta 50 caracteres y solo tener letras");
        }
        return true;
    }

}
