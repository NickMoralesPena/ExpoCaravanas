package ej.expocaravanas;

import java.util.Scanner;

/**
 *
 * @author Nick Morales
 */
public class EjExpoCaravanas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;
        int zona = 0;
        int nentradas = 0;
        int salaPrincipal = 1000;
        int compraVenta = 200;
        int vip = 20;
        String opcionST;
        String nentradasst;
        String zonast;

        Scanner sc = new Scanner(System.in);

        while (opcion != 3) {    //para salir del programa pulsamos el botón 3.
            System.out.println("1. \tMostrar número de entradas libres");
            System.out.println("2. \tVender entradas");
            System.out.println("3. \tSalir");
            try {
                // opcion = sc.nextInt();
                opcionST = sc.nextLine();
                opcion = Integer.parseInt(opcionST);

            } catch (NumberFormatException e) {
                System.out.println("Error, pon un número del 1 al 3");
            }
            switch (opcion) {
                case 1:

                    int total = salaPrincipal + compraVenta + vip;
                    System.out.println("Quedan" + total + " entradas");

                    break;
                case 2:
                    System.out.println("Elige la zona para comprar tu entrada");
                    System.out.println("1. \tPrincipal");
                    System.out.println("2. \tCompra-Venta");
                    System.out.println("3. \tZona VIP");
                    try {
                        zonast = sc.nextLine();
                        zona = Integer.parseInt(zonast);
                    } catch (NumberFormatException h) {
                        System.out.println("Error, pon un número del 1 al 3");
                        break;
                    }

                    switch (zona) {
                        case 1:
                            System.out.println("¿Cuántas entradas quieres comparar?");
                            try {
                                nentradasst = sc.nextLine();
                                nentradas = Integer.parseInt(nentradasst);
                            } catch (NumberFormatException h) {
                                System.out.println("Introduce un valor");
                            }
                            
                    }

            }

        }
    }
}
