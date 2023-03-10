package Programación.JAVA.Examen2ºTrimestre.Bloque2;

public class BarcoCrucero implements Barco {
    
    //Atributos para los Cruceros
    private int metrosEslora;
    private static int numCamas = 0;

    //Constructor para un barco Crucero
    public BarcoCrucero(int metrosEslora) {
        this.metrosEslora = metrosEslora;
    }

    //toString para un barco Crucero
    @Override
    public String toString() {
        return "BarcoCrucero [metrosEslora=" + metrosEslora + "]";
    }

    //Métodos para los barcos Crucero
    public void alarma() {
        System.out.println("¡Alarma desde el barco crucero!");
    }

    public void mensajeSocorro(String sos) {
        System.out.print("Mensaje de socorro: " + sos + " ");
        alarma();
    }
}
