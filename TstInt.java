//Nome: Victor dos Santos Araujo -  RA: 2475553;

public class TstInt {

    
    public void convertStrToInt(String valStr) {
        int value = Integer.parseInt(valStr); 
        System.out.println("String convertida para int: " + value);
    }

    public void intToString(int valInt) {
        String strValue = Integer.toString(valInt); 
        System.out.println("Int convertido para String: " + strValue);
    }
}