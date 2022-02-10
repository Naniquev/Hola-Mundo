package Entidades;

public class CadenaEnt {

    private String frase;
    
    

    public CadenaEnt() {
    }

    public CadenaEnt(String frase) {
        this.frase = frase;

    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    @Override
    public String toString() {
        return "CadenaEnt{" + "frase=" + frase + '}';
    }

   

}
