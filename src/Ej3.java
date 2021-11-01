public class Ej3 extends Thread {
    private int id, n = 10, espera;

    public Ej3(int id, int espera) {
        this.id = id;
        this.espera = espera;
    }

    @Override
    public void run() {
        for (int i = 1; i <= n; i++) {
            System.out.println("Proceso " + id + ": " + i);
            //Thread.yield();
            try {
                Thread.sleep(espera);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
