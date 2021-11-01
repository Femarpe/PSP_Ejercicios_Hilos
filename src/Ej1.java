public class Ej1 extends Thread {
    @Override
    public void run() {
        //no lo he conseguido
        int numero = 33;
        boolean salir = false;
        int numero1 = 1;
        int numero2 = 1;
        int numerosalida = 1;
        for (int i = 0; i < numero; i++) {
            System.out.println(numerosalida);
            numero1 = numerosalida;
            numerosalida = numero1 + numero2;
            numero2 = numerosalida;
        }
    }
}
