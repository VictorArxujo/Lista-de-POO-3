//Nome: Victor dos Santos Araujo -  RA: 2475553;


public class TstFloat {


    public void convertStrToFloat(String valStr) {
        float value = Float.parseFloat(valStr);
        System.out.println("String convertida para Float: " + value);
    }

    public void isNaN(float val) {
        boolean result = Float.isNaN(val); // Usa o método isNaN() da classe Float
        System.out.println("O valor " + val + " é NaN? " + result);
    }
}