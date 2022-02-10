package Servicios;

import Entidades.CadenaEnt;

public class CadenaServ {

    CadenaEnt cad = new CadenaEnt();

    public int MostrarVocales(String cad) {
        int a = 0;
        int b = 1;
        int cont = 0;

        for (int i = 0; i < cad.length(); i++) {
            if (cad.substring(a, b).equals("a") || cad.substring(a, b).equals("e") || cad.substring(a, b).equals("i") || cad.substring(a, b).equals("o") || cad.substring(a, b).equals("u")) {

                cont++;
            }
            a++;
            b++;

        }
        return cont;
    }

    public String F_invertida(String cad) {

        String invertir = "";

        for (int i = cad.length() - 1; i >= 0; i--) {

            invertir = invertir + cad.charAt(i);

        }
        return invertir;

    }

    public int vecesRepetido(String cad, String letra) {

        int pos;
        int cont = 0;

        pos = cad.indexOf(letra);

        while (pos != -1) {
            cont++;
            pos = cad.indexOf(letra, pos + 1);
        }

        return cont;

    }

    public String compararLongitud(String cad, String frase2) {

        if (cad.compareTo(frase2) == 0) {
            System.out.println("Las dos frases son iguales");

        } else {
            if (cad.compareTo(frase2) < 0) {
                System.out.println("La primer frase es mayor");
            } else {
                if (cad.compareTo(frase2) > 0) {
                    System.out.println("La segunda frase es mayor");
                }
            }
        }
        return cad;

    }

    public String unirFrase(String cad, String frase2) {
        String frase3;
        frase3 = cad.concat(frase2);
        return frase3;
    }

    public String reemplazar(String cad, String l) {

        String reemp = "";
        for (int i = 0; i < cad.length(); i++) {
            reemp = cad.replace("a", l);

        }
        return reemp;
    }

    public boolean contiene(String cad, String l2) {

        boolean cont = true;

        if (cad.contains(l2) == cont) {
            cont = true;
        } else {
            if (cad.contains(l2) != cont) {
                cont = false;
            }
        }
        return cont;
    }

}
