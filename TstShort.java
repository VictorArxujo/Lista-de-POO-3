// Nome: Victor dos Santos Araujo - RA: 2475553
public class TstShort {

    public void convertStrToShort(String valStr) {
        short value = Short.parseShort(valStr); 
        System.out.println("String convertida para Short: " + value);
    }

    public void hashCode(short valShort) {
        int hash = Short.hashCode(valShort); 
        System.out.println("Valor hash do short " + valShort + " é: " + hash);
    }
}
