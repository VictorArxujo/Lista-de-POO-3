//Nome: Victor dos Santos Araujo -  RA: 2475553;

public class TstBool {

    public void convertStrToBool(String valStr) {
        boolean value = Boolean.parseBoolean(valStr); 
        System.out.println("String convertida para boolean: " + value);
    }
 
    public void compareBooleans(boolean val1, boolean val2) {
        boolean result = Boolean.compare(val1, val2) == 0; 
        System.out.println("Os valores são iguais? " + result);
    }
}