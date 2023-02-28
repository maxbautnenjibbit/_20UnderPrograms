import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Aufgabe 1
        ausgehen();

        System.out.println();

        //Aufgabe 2
        signumTest();

        System.out.println();

        //Aufgabe 3
        isEvenTest();

        System.out.println();

        //Aufgabe 4
        berechneFakultaetTest();

        System.out.println();

        //Aufgabe 5
        kelvinCelsiusTest();

        System.out.println();

        //Aufgabe 6
        bestimmeQuadrantTest();

        System.out.println();

        //Aufgabe 7
        printRechteckTest();
    }





    //Aufgabe 1
    static void ausgehen() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte gebe eine Zahl ein: ");

        int integer = scanner.nextInt();

        if (integer == 1) {
            System.out.println("Lass uns in den Englischen Garten gehen.");
        } else {
            System.out.println("„Oh, jeh, es regnet, lass uns zu Hause Karten spielen.");
        }
    }





    //Aufgabe 2, zusätzlich um Main leer zu lassen
    static void signumTest() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte gebe eine Zahl ein: ");

        int integer = scanner.nextInt();
        int result = signum(integer);

        switch (result) {
            case -1:
                System.out.println("Die Zahl ist kleiner als 0");
                break;
            case 0:
                System.out.println("Die Zahl ist gleich 0");
                break;
            default:
                System.out.println("Die Zahl ist größer als 0");
                break;
        }
    }

    //Aufgabe 2
    static int signum(int number) {
        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 0;
        }

        return 1;
    }





    //Aufgabe 3, zusätzlich um Main leer zu lassen
    static void isEvenTest() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte gebe eine Zahl ein: ");

        int integer = scanner.nextInt();
        boolean result = isEven(integer);

        if (result) {
            System.out.println("Die Zahl " + integer + " ist gerade");
        } else {
            System.out.println("Die Zahl " + integer + " ist ungerade");
        }
    }

    //Aufgabe 3
    static boolean isEven(int number) {
        boolean even;

        if (number % 2 == 0) {
            even = true;
        } else {
            even = false;
        }

        return even;
    }





    //Aufagbe 4, zusätzlich um Main leer zu lassen
    static void berechneFakultaetTest() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte gebe eine Zahl ein: ");

        int integer = scanner.nextInt();
        int result = berechneFakultaet(integer);

        System.out.println("Die Fakultät von " + integer + " beträgt " + result);
    }

    //Aufgabe 4
    static int berechneFakultaet(int n) {
        int result = n;

        for (int i = n - 1; i > 0; i--) {
            result = result * i;
        }

        return result;
    }





    //Aufgabe 5, zusätzlich um Main leer zu lassen
    static void kelvinCelsiusTest() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte gebe eine Zahl ein: ");

        double aDouble = scanner.nextDouble();
        double celsiusToKelvin = celsiusToKelvin(aDouble);
        double kelvinToCelsius = kelvinToCelsius(aDouble);

        System.out.println(aDouble + " °C entsprechen " + celsiusToKelvin + " K");
        System.out.println(aDouble + " K entsprechen " + kelvinToCelsius + " °C");
    }

    //Aufgabe 5
    static double celsiusToKelvin(double number) {
        return number + 273.15;
    }

    //Aufgabe 5
    static double kelvinToCelsius(double number) {
        return number - 273.15;
    }





    //Aufgabe 6, zusätzlich um Main leer zu lassen
    static void bestimmeQuadrantTest() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte gebe die x Koordinate ein: ");
        double aDouble = scanner.nextDouble();

        System.out.print("Bitte gebe die y Koordinate ein: ");
        double aDouble1 = scanner.nextDouble();

        String result = bestimmeQuadrant(aDouble, aDouble1);

        System.out.println("Punkt (" + aDouble + "|" + aDouble1 + ") => " + result);
    }

    //Aufgabe 6
    static String bestimmeQuadrant(double x, double y) {
        if (x == 0 && y == 0) {
            return "Origo = (0|0)";
        }

        if (x > 0 && y > 0) {
            return "I. Quadrant";
        }

        if (x < 0 && y > 0) {
            return "II. Quadrant";
        }

        if (x < 0 && y < 0) {
            return "III. Quadrant";
        }

        if (x > 0 && y < 0) {
            return "IV. Quadrant";
        }

        if (x != 0 && y == 0) {
            return "x-Achse";
        }

        return "y-Achse";
    }





    //Aufgabe 7, zusätzlich um Main leer zu lassen
    static void printRechteckTest() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte gebe das Zeichen ein mit dem das Rechteck ausgegeben werden soll: ");
        String string = scanner.next();
        char character = string.toCharArray()[0]; // → Hatten wir noch nie, geht aber soweit ich weiß nicht simpler

        System.out.print("Bitte gebe die Länge des Rechtecks ein: ");
        int length = scanner.nextInt();

        System.out.print("Bitte gebe die Breite des Rechtecks ein: ");
        int width = scanner.nextInt();

        printRechteck(character, length, width);

        //Letze Aufrufung von einem Scanner, deswegen closen, nicht UNBEDINGT nötig aber Eclipse meckert manchmal
        scanner.close();
    }

    //Aufgabe 7
    static void printRechteck(char character, int length, int width) {
        for (int i = 0; i < length; i++) {

            for (int j = 0; j < width; j++) {
                System.out.print(character);
            }

            System.out.println();
        }
    }
}