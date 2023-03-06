
import java.util.HashMap;
import java.util.Scanner;

/*
 -Importe la clase Scanner
 -Importe la clase Hashmap
 -Agregue System.in al scanner
 -Cambie el tipo de datos de Hashmap a String
 -Cambie a double el tipo de dato de c
 -Corregi tipos de datos
 -Corregi nombres de metodos
 */

public class Codigo7 {

    Scanner scanner = new Scanner(System.in);

    HashMap<String, String> capitales = new HashMap<String, String>();



    capitales.put("Canadá","Otawwa");
    capitales.put("Estados Unidos","Washington DC");
    capitales.put("México","México DF");
    capitales.put("Belice","Belmopán");
    capitales.put("Costa rica","San José");
    capitales.put("El Salvador");
    capitales.put("Guatemala","Ciudad de Guatemala");
    capitales.put("Honduras","Tegucigalpa");
    capitales.put("Nicaragua","Managua");
    capitales.put("Panamá","Panamá");

    String c = "";
    
    do

    {
        //something
    }

    while(!c.equals("salir"))

    {
        System.out.println("Escribe el nombre de un país y te diré su capital: ");
        c = scanner.nextLine();

        if (!c.equals("salir")) {
            if (capitales.containsValue(c)) {
                System.out.println("La capital de " + c);
                System.out.println(" es " + capitales.put(c, "alguna capital"));
            } else {
                System.out.print("No conozco la respuesta ");
                System.out.print("¿cuál es la capital de " + c + "?: ");
                String ca = scanner.nextLine();
                capitales.put(c, ca);
                System.out.println("Gracias por enseñarme nuevas capitales");
            }
        }
    }


}
