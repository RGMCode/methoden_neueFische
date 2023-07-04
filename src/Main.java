import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello world!");

        int value = 17;
        String curr = "€";
        int aEur = 23;

        int result = dupli(value, curr);
        //System.out.println("Hier: " + result);

        //Main.duplicate();
        //duplicate(value, curr);
        //einezahl(aEur);
        //zweiZahlen(value, aEur);
        //bonusEins(value,aEur);
        scannerTest();

        String tString = "Dies ist ein fancy Test-String";
        zweiteMethodenAufruf(tString);

    }

    public static boolean proofString(String tString) {
        if (tString.length() > 20 && tString.contains("fancy")) {
            return true;
        } else {
            return false;
        }
    }

    public static void zweiteMethodenAufruf(String string) {
        boolean res = proofString(string);
        System.out.println("Ergebnis der Methode: " + res);
    }






    public static int dupli(int value, String curr){
        return value * 3;
    }

    public static void duplicate(int value, String curr){
        System.out.println("duplicate " + value * 2);
        System.out.println("duplicate " + value * 2 + curr);
        System.out.println("#############");
    }


    public static void einezahl(int aEur){
        System.out.println(aEur);
    }

    public static void zweiZahlen(int value, int aEur){
        String sum = "Summe: ";
        System.out.println(sum + (value + aEur));
    }

    //Bonus
    public static void bonusEins(int value, int aEur){
        int numSum = value + aEur;

        if (numSum > 100){
            System.out.println("Alles ist okay der wert ist kleiner gleich 40");
        } else {
            System.out.println("Alarm Alarm Alarm");
        }
    }

    public static void scannerTest(){

        String sumTxt = "Summe: ";

        Scanner scanner = new Scanner(System.in);

        System.out.println("gaben Sie die erste variable ein");
        int varA = scanner.nextInt();

        System.out.println("geben Sie die zweite variable ein");
        int varB = scanner.nextInt();

        System.out.println("varA: " + varA + " <=> " + "varB: " + varB);

        int numSum = varA + varB;
        System.out.println(sumTxt + numSum);

    }


}