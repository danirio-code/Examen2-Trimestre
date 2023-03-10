package Programación.JAVA.Examen2ºTrimestre.Bloque2;

public class BarcoPortaaviones implements Barco {
    
    //Atributos para los Portaaviones
    private int numAviones;
    private int numMarinos;

    //Constructor para un barco Portaaviones
    public BarcoPortaaviones(int numAviones, int numMarinos) {
        this.numAviones = numAviones;
        this.numMarinos = numMarinos;
    }

    //toString para un barco Portaaviones
    @Override
    public String toString() {
        return "BarcoPortaaviones [numAviones=" + numAviones + ", numMarinos=" + numMarinos + "]";
    }

    //Métodos para los barcos Portaaviones
    public void alarma() {
        System.out.println("¡Alarma desde el barco portaaviones!");
    }

    public void mensajeSocorro(String sos) {
        System.out.print("Mensaje de socorro: " + sos + " ");
        alarma();
    }

    //Getters y Setters (no hacen falta porque no se llegan a usar)
    public int getNumAviones() {
        return numAviones;
    }

    public void setNumAviones(int numAviones) {
        this.numAviones = numAviones;
    }

    public int getNumMarinos() {
        return numMarinos;
    }

    public void setNumMarinos(int numMarinos) {
        this.numMarinos = numMarinos;
    }
}
