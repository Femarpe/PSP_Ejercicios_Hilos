import java.util.Scanner;

public class Ej5 extends Thread {
    String nombreAcleta;

    public Ej5(String nombreAcleta) {
        this.nombreAcleta = nombreAcleta;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 30; i++) {
            System.out.println("El atleta " + nombreAcleta + " lleva recorridos:" + i + "km");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
