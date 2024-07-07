import java.util.Collections;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner telclado = new Scanner(System.in);
        System.out.println("Ingrese el límite de la tarjeta, por favor: ");
        double limite = telclado.nextDouble();
        TarjetaDeCredito tarjeta = new TarjetaDeCredito(limite);


        int salir = 1;
        while(salir != 0){
            System.out.println("Escriba la descripción de la compra: ");
            String descripcion = telclado.next();

            System.out.println("Escriba el valor de la comprar: ");
            double valor = Double.valueOf(telclado.next());

            Compra compra = new Compra(valor, descripcion);
            boolean compraRealizada = tarjeta.lanzarCompra(compra);

            if(compraRealizada){
                System.out.println("Compra relizada!");
                Collections.sort(tarjeta.getListaDeCompras());
                System.out.println("Escriba 0 para salir o 1 para continuar: ");
                salir = telclado.nextInt();
            }else{
                System.out.println("Saldo insuficiente :/");
                salir = 0;
            }

            System.out.println("**********************************************");
            System.out.println("Compras realizadas!: \n" );
            for (Compra compra1 : tarjeta.getListaDeCompras()){
                System.out.println(compra.getDescripcion() + "--" + compra.getValor() );
            }

            System.out.println("***********************************************");
            System.out.println("\n Saldo de la tarjeta: " + tarjeta.getSaldo());
        }
    }
}
