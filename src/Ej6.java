public class Ej6 extends Thread {
    private String nombreMascota;

    public Ej6(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 30; i++) {
            if (i<30) {
                System.out.println("El " + nombreMascota + " lleva recorridos:" + i + "m");
                System.out.println("----------------------------------------------------");
            } else {
                System.out.println("====================================================");
                System.out.println("El " + nombreMascota + " ha alcanzado los:" + i + "m en la meta");
                System.out.println("====================================================");
                System.out.println("----------------------------------------------------");

            }
            try {
                Thread.sleep(12);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
