import org.example.validaciones.ValidacionSeguro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidacionSeguroTest {

    private ValidacionSeguro validacionSeguro;

    @BeforeEach
    public void prepararPruebas(){
        this.validacionSeguro = new ValidacionSeguro();
    }

    @Test
    public void validarNombreCorrecto() throws Exception{
        String nombrePrueba = "Miguel Soto";
        Boolean resultado = Assertions.assertDoesNotThrow(()->this.validacionSeguro.validarNombreAsegurado(nombrePrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void validarNombreIncorrectoLongitud(){
        String nombrePrueba = "MiguelAngelRodriguezSotoCarvajalCorreaAristizabalMejia";
        Exception resultado = Assertions.assertThrows(Exception.class, ()-> this.validacionSeguro.validarNombreAsegurado(nombrePrueba));
        Assertions.assertEquals("El nombre debe tener  maximo 20 caracteres", resultado.getMessage());
    }

    @Test
    public void validarNombreIncorrectoFormato(){
        String nombrePrueba = "Miguel12345";
        Exception resultado = Assertions.assertThrows(Exception.class, ()-> this.validacionSeguro.validarNombreAsegurado(nombrePrueba));
        Assertions.assertEquals("El nombre no cumple con el formato requerido", resultado.getMessage());
    }

    @Test
    public void validarEdadCorrecto() throws Exception{
        Integer edadPrueba = 48;
        Boolean resultado = Assertions.assertDoesNotThrow(()->this.validacionSeguro.validarEdadAsegurado(edadPrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void validarEdadIncorrecto(){
        Integer edadPrueba = 95;
        Exception resultado = Assertions.assertThrows(Exception.class, ()->this.validacionSeguro.validarEdadAsegurado(edadPrueba));
        Assertions.assertEquals("Contactese a este numero para estar afiliado: +89 45231 231 23", resultado.getMessage());
    }

    @Test
    public void validarMontoCorrecto() throws Exception{
        Long montoPrueba = 1000000L;
        Boolean resultado = Assertions.assertDoesNotThrow(()->this.validacionSeguro.validarMontoAsegurado(montoPrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void validarMontoIncorrecto(){
        Long montoPrueba = 1600000000L;
        Exception resultado = Assertions.assertThrows(Exception.class, ()->this.validacionSeguro.validarMontoAsegurado(montoPrueba));
        Assertions.assertEquals("El numero de cobertura debe ser un numero valido", resultado.getMessage());
    }

    @Test
    public void validarFechaInicioCorrecto() throws Exception{
        String fechaPrueba = "20/10/23";
        Assertions.assertDoesNotThrow(()->this.validacionSeguro.validarFechaInicio(fechaPrueba));
    }

    @Test
    public void validarFechaInicioIncorrecto(){
        String fechaPrueba = "99/99/99";
        Exception resultado = Assertions.assertThrows(Exception.class, ()-> this.validacionSeguro.validarFechaInicio(fechaPrueba));
        Assertions.assertEquals("La fecha de inicio debe tener el formato de dd/MM/yy", resultado.getMessage());
    }

    @Test
    public void validarBeneficiarioCorrecto() throws Exception{
        String beneficiarioPrueba = "Miguel Soto";
        Boolean resultado = Assertions.assertDoesNotThrow(()-> this.validacionSeguro.validarBeneficiario(beneficiarioPrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void validarBeneficiarioIncorrecto(){
        String beneficiarioPrueba = "NombreDeBeneficiarioEsDemasiadoLargoYNoPuedeSerBeneficiario";
        Exception resultado = Assertions.assertThrows(Exception.class, ()-> this.validacionSeguro.validarBeneficiario(beneficiarioPrueba));
        Assertions.assertEquals("El beneficiario debe tener hasta 50 caracteres y solo tener letras", resultado.getMessage());
    }

    @Test
    public void validarBeneficiarioIncorrectoFormato(){
        String beneficiarioPrueba = "12345";
        Exception resultado = Assertions.assertThrows(Exception.class, ()->this.validacionSeguro.validarBeneficiario(beneficiarioPrueba));
        Assertions.assertEquals("El beneficiario debe tener hasta 50 caracteres y solo tener letras", resultado.getMessage());
    }
}
