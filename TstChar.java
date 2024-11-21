//Nome: Victor dos Santos Araujo -  RA: 2475553;

public class TstChar {

    public void isLetter(char valChar) {
        boolean result = Character.isLetter(valChar); 
        System.out.println("O caractere " + valChar + " é uma letra? " + result);
    }

    
    public void toUpperCase(char valChar) {
        char result = Character.toUpperCase(valChar); 
        System.out.println("Caractere convertido para maiúsculo: " + result);
    }
}
