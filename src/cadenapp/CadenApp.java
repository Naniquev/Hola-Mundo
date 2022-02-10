
package cadenapp;

import Entidades.CadenaEnt;
import Servicios.CadenaServ;
import java.awt.BorderLayout;
import java.util.Scanner;

public class CadenApp {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        CadenaEnt cad = new CadenaEnt();
        CadenaServ c = new CadenaServ();
        
        System.out.println("Ingrese una palabra o una frase");
        cad.setFrase(leer.nextLine());
        System.out.println("-El cantidad de vocales son:" + " " + c.MostrarVocales(cad.getFrase()) );
        System.out.println(" ");
        System.out.println("-La frase inverida es :" + c.F_invertida(cad.getFrase()));
        System.out.println(" ");
        System.out.println("-Ingrese una letra dentro de la frase");
        String letra = leer.next();
        System.out.println("-La letra se repite"+" "+ c.vecesRepetido(cad.getFrase(), letra) + " " + "veces");
        System.out.println(" ");
        System.out.println("-Ingrese una nueva frase");
        String frase2 = leer.next();
        c.compararLongitud(cad.getFrase(), frase2);
        System.out.println(" ");
        System.out.println( c.unirFrase(cad.getFrase(), frase2));
        System.out.println(" ");
        System.out.println("-Ingrese una letra por la cual se reemplazara la letra a");
        String l = leer.next();
        System.out.println( c.reemplazar(cad.getFrase(), l));
        System.out.println(" ");
        System.out.println("-Ingrese una letra");
        String l2 = leer.next();
        System.out.println(c.contiene(cad.getFrase(), l2));
    }
    
    
            
}
