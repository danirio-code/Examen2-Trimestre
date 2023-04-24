package Programación.JAVA.Examen2ºTrimestre.Bloque1;

import java.util.*;

public class Ejercicio1y2 {
    
    public static void main(String[] args) {

        //Prueba para ver que el código funciona
        char[] DocID = {'4','3','4','9','1','3','8','3','K'};
        System.out.println(esNIFCorrecto(DocID));
    }


    //EJERCICIO 1

        //Método letraNIF que devuelve la letra recibiendo como parámetro un número
        public static char letraNIF(int num) {

        //Creamos un HashMap para almacenar los valores de cada letra del NIF
        Map<Integer,Character> valorLetras = new HashMap<>();
        //En el examen a papel no añadí todas las combinaciones pero sería así
        valorLetras.put(0,'T');
        valorLetras.put(1,'R');
        valorLetras.put(2,'W');
        valorLetras.put(3,'A');
        valorLetras.put(4,'G');
        valorLetras.put(5,'M');
        valorLetras.put(6,'Y');
        valorLetras.put(7,'F');
        valorLetras.put(8,'P');
        valorLetras.put(9,'D');
        valorLetras.put(10,'X');
        valorLetras.put(11,'B');
        valorLetras.put(12,'N');
        valorLetras.put(13,'J');
        valorLetras.put(14,'Z');
        valorLetras.put(15,'S');
        valorLetras.put(16,'Q');
        valorLetras.put(17,'V');
        valorLetras.put(18,'H');
        valorLetras.put(19,'L');
        valorLetras.put(20,'C');
        valorLetras.put(21,'K');
        valorLetras.put(22,'E');
        
        //Hacemos que el método devuelva la letra cuya clave es el numero introducido
        return valorLetras.get(num);
        }

        //Método esNIFCorrecto que devuelve true o false dependiendo de si el NIF es válido o no
        public static boolean esNIFCorrecto(char[] NIF) {
            //El método tieneFormatoNIF() es el resultado del ejercicio 2, así que está resuelto más adelante
            if (!tieneFormatoNIF(NIF)) {
                return false;
            } else {
                String CadenaNumNIF = "";

                //Bucle que añade los ocho primeros elementos del array a un string
                for (int i = 0; i < NIF.length -1; i++) {
                    CadenaNumNIF+=NIF[i];
                }
                //Se convierte el string a un entero para poder operar con él
                int numsNIF = Integer.parseInt(CadenaNumNIF);
                int resto = numsNIF % 23;
                char letra = NIF[8];
                //Comprueba sí el último elemento del array(la letra) coincide con el valor que devuelve la función letraNIF()
                if (letra == letraNIF(resto)) {
                    return true;
                } else {
                    return false;
                }
            }
        }

    //EJERCICIO 2

        //Método tieneFormatoNIF que comprueba si el NIF del array tiene 8 números y una letra mayúscula. Devuelve true o false
        public static boolean tieneFormatoNIF(char[] NIF) {
            if (NIF.length != 9) {
                return false;
            } else {
                String letrasMayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                String nums = "0123456789";
                int totalNums = 0;
                //Bucle anidado para comparar los ocho primeros elementos del array para ver si se encuentran en el String "nums"
                for (int i = 0; i < NIF.length -1; i++) {
                    for (int j = 0; j < nums.length(); j++) {
                        if (NIF[i] == nums.charAt(j)) {
                            totalNums+=1;
                        }
                    }
                }
                int totalLetras = 0;
                //Bucle que compara el último elemento del array para ver si se encuentran en el String "letrasMayus"
                for (int i = 0; i < letrasMayus.length(); i++) {
                    if (NIF[8] == letrasMayus.charAt(i)) {
                        totalLetras+=1;
                    }
                }
                //Si hay 8 números y una letra se cumple el formato NIF
                if (totalNums == 8 && totalLetras == 1) {
                    return true;
                } else {
                    return false;
                }
            }
        }
}
