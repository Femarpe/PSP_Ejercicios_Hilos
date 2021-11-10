public class Main {
    public static void main(String[] args) {
        //new Ej1();

        //new Ej2(1, 20).start();

        //new Ej3(1, 1000).start();
        //new Ej3(2, 1500).start();

        //new Ej4().start();

        //new Ej5("Femarpe").start();

        Ej6 ej61 = new Ej6("Inu");
        Ej6 ej62 = new Ej6("Tori");
        Ej6 ej63 = new Ej6("Uma");
        ej61.setPriority(Thread.MIN_PRIORITY);
        ej62.setPriority(Thread.MAX_PRIORITY);
        ej63.setPriority(Thread.NORM_PRIORITY);
        ej61.start();
        ej63.start();
        ej62.start();
    }
}
