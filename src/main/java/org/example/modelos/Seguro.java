package org.example.modelos;

public class Seguro {

    // Atributos
     String nombreAsegurado
     int edadAsegurado;
     String beneficiario
     double montoCobertura
     string tipoPoliza
     int duracionPoliza;
     boolean fumador;
     boolean enfermedadesPreexistentes;
     string compañiaSeguros;
     string numeroPoliza

    public Double Seguro(String nombreAsegurado, int edadAsegurado, String beneficiario,
                  double montoCobertura, String tipoPoliza, int duracionPoliza, boolean fumador,
                  boolean enfermedadesPreexistentes, String compañiaSeguros, String numeroPoliza) {
        this.nombreAsegurado = nombreAsegurado;
        this.edadAsegurado = edadAsegurado;
        this.beneficiario = beneficiario;
        this.montoCobertura = montoCobertura;
        this.tipoPoliza = tipoPoliza;
        this.duracionPoliza = duracionPoliza;
        this.fumador = fumador;
        this.enfermedadesPreexistentes = enfermedadesPreexistentes;
        this.compañiaSeguros = compañiaSeguros;
        this.numeroPoliza = numeroPoliza;
    }

    public void calcularPrima() {
        double primaBase = 500;
        double primaFinal = primaBase;


        if (edadAsegurado < 30) {
            primaFinal -= 100
        } else if (edadAsegurado > 60) {
            primaFinal += 200;
        }

        // Aplicar ajustes basados en el monto de cobertura
        if (montoCobertura > 1000000 {
            primaFinal += 300;
        }

        System.out.println("La prima del seguro de vida es: $" + primaFinal);
    }
}
