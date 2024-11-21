// Nome: Victor dos Santos Araujo - RA: 2475553
public class TstDoub {


    public void convertStrToDouble(String valStr) {
        double value = Double.parseDouble(valStr); 
        System.out.println("String convertida para Double: " + value);
    }


    public void isInfinite(double val) {
        boolean result = Double.isInfinite(val); // Usa o método isInfinite() da classe Double
        System.out.println("O valor " + val + " é infinito? " + result);
    }
}
