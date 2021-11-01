import java.util.Scanner;

public class Ej4 extends Thread {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce tu nombre");
        String nombre = scanner.nextLine();
        System.out.println("Hora de llegada al trabajo");
        int hora = scanner.nextInt();

        if (hora > 8) {
            System.out.println(nombre + " llegas Tarde");
        } else if (hora == 8) {
            System.out.println(nombre + " llegas a tiempo");
        } else if (hora < 8) {
            System.out.println(nombre + " llegas temprano");
        }

    }

}
