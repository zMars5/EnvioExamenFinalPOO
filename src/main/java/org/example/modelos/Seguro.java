package org.example.modelos;

import java.time.LocalDate;

public class Seguro {

    // Atributos
     private String nombreAsegurado;
     private Integer edadAsegurado;
     private String beneficiario;
     private Long montoCobertura;
     private String tipoPoliza;
     private Integer duracionPoliza;
     private Boolean fumador;
     private String enfermedadesPreexistentes;
     private String compañiaSeguros;
     private LocalDate fechaInicioCobertura;

     private Integer numeroPoliza;

    public Seguro() {
    }

    public Seguro(String nombreAsegurado, Integer edadAsegurado, String beneficiario, Long montoCobertura, String tipoPoliza, Integer duracionPoliza, Boolean fumador, String enfermedadesPreexistentes, String compañiaSeguros, LocalDate fechaInicioCobertura, Integer numeroPoliza) {
        this.nombreAsegurado = nombreAsegurado;
        this.edadAsegurado = edadAsegurado;
        this.beneficiario = beneficiario;
        this.montoCobertura = montoCobertura;
        this.tipoPoliza = tipoPoliza;
        this.duracionPoliza = duracionPoliza;
        this.fumador = fumador;
        this.enfermedadesPreexistentes = enfermedadesPreexistentes;
        this.compañiaSeguros = compañiaSeguros;
        this.fechaInicioCobertura = fechaInicioCobertura;
        this.numeroPoliza = numeroPoliza;
    }

    public String getNombreAsegurado() {
        return nombreAsegurado;
    }

    public Integer getEdadAsegurado() {
        return edadAsegurado;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public Long getMontoCobertura() {
        return montoCobertura;
    }

    public String getTipoPoliza() {
        return tipoPoliza;
    }

    public Integer getDuracionPoliza() {
        return duracionPoliza;
    }

    public Boolean getFumador() {
        return fumador;
    }

    public String getEnfermedadesPreexistentes() {
        return enfermedadesPreexistentes;
    }

    public String getCompañiaSeguros() {
        return compañiaSeguros;
    }

    public LocalDate getFechaInicioCobertura() {
        return fechaInicioCobertura;
    }

    public Integer getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNombreAsegurado(String nombreAsegurado) {
        this.nombreAsegurado = nombreAsegurado;
    }

    public void setEdadAsegurado(Integer edadAsegurado) {
        this.edadAsegurado = edadAsegurado;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public void setMontoCobertura(Long montoCobertura) {
        this.montoCobertura = montoCobertura;
    }

    public void setTipoPoliza(String tipoPoliza) {
        this.tipoPoliza = tipoPoliza;
    }

    public void setDuracionPoliza(Integer duracionPoliza) {
        this.duracionPoliza = duracionPoliza;
    }

    public void setFumador(Boolean fumador) {
        this.fumador = fumador;
    }

    public void setEnfermedadesPreexistentes(String enfermedadesPreexistentes) {
        this.enfermedadesPreexistentes = enfermedadesPreexistentes;
    }

    public void setCompañiaSeguros(String compañiaSeguros) {
        this.compañiaSeguros = compañiaSeguros;
    }

    public void setFechaInicioCobertura(LocalDate fechaInicioCobertura) {
        this.fechaInicioCobertura = fechaInicioCobertura;
    }

    public void setNumeroPoliza(Integer numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }
}

