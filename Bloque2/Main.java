package Programación.JAVA.Examen2ºTrimestre.Bloque2;

public class Main {
    
    public static void main(String[] args) {

        //Usamos el Barco Crucero
        System.out.println("BARCO CRUCERO:"); //esto no lo pedía el examen, solo es para que quede más claro
        BarcoCrucero MSI = new BarcoCrucero(300);
        MSI.toString();
        MSI.alarma();
        MSI.mensajeSocorro("Un niño se ha caído por la borda.");

        System.out.println("");

        //Usamos el Barco Portaaviones
        System.out.println("BARCO PORTAAVIONES:");
        BarcoPortaaviones Dédalo = new BarcoPortaaviones(20,158);
        Dédalo.toString();
        Dédalo.alarma();
        Dédalo.mensajeSocorro("Nos ha impactado un torpedo.");

        System.out.println("");

        //Usamos el Barco Pesquero
        System.out.println("BARCO PESQUERO:");
        BarcoPesquero Jenny = new BarcoPesquero(20,5000,2);
        Jenny.toString();
        Jenny.alarma();
        Jenny.mensajeSocorro("Hay fuego en la bodega.");
    }
}
