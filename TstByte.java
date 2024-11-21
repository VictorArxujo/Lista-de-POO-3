// Nome: Victor dos Santos Araujo - RA: 2475553
public class TstByte {

    
    public void convertStrToByte(String valStr) {
        byte value = Byte.parseByte(valStr); 
        System.out.println("String convertida para Byte: " + value);
    }

    
    public void compareBytes(byte val1, byte val2) {
        int result = Byte.compare(val1, val2); 
        if (result == 0) {
            System.out.println("Os valores são iguais.");
        } else if (result < 0) {
            System.out.println("O valor " + val1 + " é menor que " + val2);
        } else {
            System.out.println("O valor " + val1 + " é maior que " + val2);
        }
    }
}
