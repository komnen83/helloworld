package tech.kuba.sda;

public class Tablice {


    public static void main(String[] args) {
//        String[] slowa = new String[3];
//        System.out.println(slowa[0]);
//
//        int[] tablica = new int[6];
//        System.out.println(tablica[4]);
//        tablica[0] = 2;
//        tablica[1] = 4;
//        tablica[2] = 8;
//        tablica[3] = 16;
//        tablica[4] = 32;
//        tablica[5] = 64;
//
//        System.out.println(tablica[3]);
//        int i = tablica[2];

//        population(1000);

        String[] dayNames = new String[] {
                "PONIEDZIALEK",
                "WTOREK",
                "SRODA",
                "CZWARTEK",
                "PIATEK",
                "SOBOTA",
                "NIEDZIELA"
        };

        for(String dayN : dayNames) {
            System.out.println(dayN);
        }
//
//        int count = 0;
//        while (count < dayNames.length) {
//            System.out.println(dayNames[count]);
//            count++;
//        }
//        System.out.println("Petla zakonczona\n");
//
//        for(int c = 0; c <dayNames.length; c++) {
//            System.out.println(dayNames[c]);
//        }
//        System.out.println("Petla zakonczona\n");
//
//        for(int c = dayNames.length - 1; c >= 0; c--) {
//            System.out.println(dayNames[c]);
//        }
//        System.out.println("Petla zakonczona");

        int[] potega = new int[20];
        potega[0] = 2;
        for(int x = 1; x < 20; x++) {
            potega[x] = 2 * potega[x -1];
        }

        for(int i = 0; i < 20; i++) {
            System.out.println(potega[i]);
        }


//        int count2 = 0;
//        while(true) {
//            System.out.println("jablko");
//            count2++;
//            if (count2)
//        }

//        String[] bands = {"AC/DC", "Metallica", "U2"};
//        int index = 0;
//        while(index < bands.length) {
//            boolean condition = bands[index].equals("U2");
//            if (condition) {
//                break;
//            }
//            index++;
//        }
        int years = calculateYears(1000, 2000, 0.02, 70);
        System.out.println(years +" years");


    }


    public static int calculateYears(int startingPopulation, int targetPopulation, double birthRate, int immigrants) {
        int currentPopulation = startingPopulation;
        int years = 0;
        while (currentPopulation < targetPopulation) {
            currentPopulation = populationNextYear(currentPopulation, birthRate, immigrants);
            years++;
        }
        return years;
    }

    public static int populationNextYear(int populationThisYear, double rate, int immigrants) {
        int fromRate = (int) (rate * populationThisYear);
        return populationThisYear + fromRate + immigrants;
    }

//    public static int population(int x) {
//        int y = 0;
//        do {
//            y = (int) (x + (x * 0.02) + 70);
//            System.out.println(y + "lat");
//            y++;
//        } while (y == 2000);
//        System.out.println("Koniec petli");
//        return y;
//    }


}
