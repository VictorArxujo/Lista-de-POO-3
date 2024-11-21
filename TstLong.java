// Nome: Victor dos Santos Araujo - RA: 2475553
public class TstLong {

    public void convertStrToLong(String valStr) {
        long value = Long.parseLong(valStr); 
        System.out.println("String convertida para Long: " + value);
    }

    public void bitCount(long val) {
        int count = Long.bitCount(val); 
        System.out.println("Número de bits 1 no valor " + val + " é: " + count);
    }
}
