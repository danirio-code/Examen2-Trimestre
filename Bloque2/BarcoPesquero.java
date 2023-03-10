package Programación.JAVA.Examen2ºTrimestre.Bloque2;

public class BarcoPesquero implements Barco {
    
    //Atributos para los Pesqueros
    private int metrosEslora;
    private int potencia;
    private int numPescadores;

    //Constructor para un barco Pesquero
    public BarcoPesquero(int metrosEslora, int potencia, int numPescadores) {
        this.metrosEslora = metrosEslora;
        this.potencia = potencia;
        this.numPescadores = numPescadores;
    }

    //toString para un barco Pesquero
    @Override
    public String toString() {
        return "BarcoPesquero [metrosEslora=" + metrosEslora + ", potencia(en caballos)=" + potencia + ", numPescadores="
                + numPescadores + "]";
    }

    //Métodos para los barcos Portaaviones
    public void alarma() {
        System.out.println("¡Alarma desde el barco pesquero!");
    }

    public void mensajeSocorro(String sos) {
        System.out.print("Mensaje de socorro: " + sos + " ");
        alarma();
    }
}
