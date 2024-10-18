import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Consulta consulta = new Consulta();

        while (true) {
            System.out.println("***********************************************************\n" +
                    "Bienvenido/a al conversor de monedas\n\n" +
                    "1) Dólar ==> Peso argentino\n" +
                    "2) Peso argentino ==> Dólar\n" +
                    "3) Dólar ==> Real brasileño\n" +
                    "4) Real brasileño ==> Dólar\n" +
                    "5) Dólar a Peso colombiano\n" +
                    "6) Peso colombiano a Dólar\n" +
                    "Elija una opción válida: \n" +
                    "***********************************************************"
            );
            var opcion = lectura.nextInt();
            double resultado;
            if (opcion == 7) {
                break;
            }
            System.out.println("Ingresa el valor que deseas convertir: ");
            var valor = lectura.nextDouble();

            switch (opcion) {
                case 1:
                    Moneda moneda = consulta.consultaMoneda("USD", "ARS");
                    resultado = Double.parseDouble(moneda.conversion_rate()) * valor;
                    System.out.println("El valor " + valor + "[USD] corresponde al valor final de " + resultado + "[ARS]");
                    break;
                case 2:
                    Moneda moneda2 = consulta.consultaMoneda("ARS", "USD");
                    resultado = Double.parseDouble(moneda2.conversion_rate()) * valor;
                    System.out.println("El valor " + valor + "[ARS] corresponde al valor final de " + resultado + "[USD]");
                    break;
                case 3:
                    Moneda moneda3 = consulta.consultaMoneda("USD", "BRL");
                    resultado = Double.parseDouble(moneda3.conversion_rate()) * valor;
                    System.out.println("El valor " + valor + "[USD] corresponde al valor final de " + resultado + "BRL");
                    break;
                case 4:
                    Moneda moneda4 = consulta.consultaMoneda("BRL", "USD");
                    resultado = Double.parseDouble(moneda4.conversion_rate()) * valor;
                    System.out.println("El valor " + valor + "[BRL] corresponde al valor final de " + resultado + "[USD]");
                    break;
                case 5:
                    Moneda moneda5 = consulta.consultaMoneda("USD", "COP");
                    resultado = Double.parseDouble(moneda5.conversion_rate()) * valor;
                    System.out.println("El valor " + valor + "[USD] corresponde al valor final de " + resultado + "[COP]");
                    break;
                case 6:
                    Moneda moneda6 = consulta.consultaMoneda("COP", "USD");
                    resultado = Double.parseDouble(moneda6.conversion_rate()) * valor;
                    System.out.println("El valor " + valor + "[COP] corresponde al valor final de " + resultado + "[USD]");
                    break;
                default:
                    System.out.println("Opción equivocada");
                    break;
            }
        }
    }
}
