//Nome: Victor dos Santos Araujo -  RA: 2475553;
import java.util.Scanner;

public class TstWrap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TstInt tstInt = new TstInt();
        TstBool tstBool = new TstBool();
        TstChar tstChar = new TstChar();
        TstDoub tstDoub = new TstDoub();
        TstByte tstByte = new TstByte();
        TstShort tstShort = new TstShort();
        TstFloat tstFloat = new TstFloat();
        TstLong tstLong = new TstLong();

        int option;
        do {
            System.out.println("USO DE CLASSES WRAPPERS");
            System.out.println("1) INTEGER");
            System.out.println("2) BOOLEAN");
            System.out.println("3) CHARACTER");
            System.out.println("4) DOUBLE");
            System.out.println("5) BYTE");
            System.out.println("6) SHORT");
            System.out.println("7) FLOAT");
            System.out.println("8) LONG");
            System.out.println("0) SAIR");
            System.out.print("ESCOLHA UMA OPCAO: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Teste da classe Integer:");
                    tstInt.convertStrToInt("123");
                    tstInt.intToString(456);
                    break;
                    case 2:
                    System.out.println("Teste da classe Boolean:");
                    tstBool.convertStrToBool("true");
                    tstBool.compareBooleans(true, false);
                    break;
                case 3:
                    System.out.println("Teste da classe Character:");
                    tstChar.isLetter('A');
                    tstChar.toUpperCase('b');
                    break;
                case 4:
                    System.out.println("Teste da classe Double:");
                    tstDoub.convertStrToDouble("3.14");
                    tstDoub.isInfinite(1.0 / 0.0);
                    break;
                case 5:
                    System.out.println("Teste da classe Byte:");
                    tstByte.convertStrToByte("127");
                    tstByte.compareBytes((byte) 10, (byte) 20);
                    break;
                case 6:
                    System.out.println("Teste da classe Short:");
                    tstShort.convertStrToShort("10");
                    tstShort.hashCode((short) 100);
                    break;
                    case 7:
                    System.out.println("Teste da classe Float:");
                    tstFloat.convertStrToFloat("3.14");
                    tstFloat.isNaN(Float.NaN);
                    break;
                case 8:
                    System.out.println("Teste da classe Long:");
                    tstLong.convertStrToLong("1000000000");
                    tstLong.bitCount(1234567890L);
                    break;
                    
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (option != 0);

        scanner.close();
    }
}