package tech.kuba.sda.other;

public class Watki {

    private static boolean przełącznik = true;
    public static void  main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Siema jestem drugim watkiem");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        thread.join();
//        for(int i = 0; i < 100; i++) {
//            System.out.println("No halo jestem glownym watkiem");
//        }
        System.out.println("Bob");



        Thread b = new Thread(() -> {
            System.out.println("B: Czekam na przełącznik..");
            while (przełącznik) {
                // nie rób nic
            }
            System.out.println("B: Przełącznik przełączony");
        });
        b.start();
        Thread.sleep(1000);
        System.out.println("A: przełączam przełącznik");
        przełącznik = false;
        System.out.println("A: przełączyłem przełącznik");
    }
}
