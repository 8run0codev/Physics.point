
package Cuestionario;

import java.util.StringTokenizer;

public class Respuestas {

    String[] respuestas = {
      "2.54 cm","0.000621371 millas","Pies","4 Yardas","Son iguales"
    };
    
    String[] radioR = {
        "3 pies,7 pulgadas,2.54 cm,2 yardas",
        "3 centimetros, 1 pulgada,0.000621371 millas,2 metros",
        "Codos,Rodillas,Manos,Pies",
        "2 metros,4 Yardas,1 pulgada,3 pies",
        "Casi iguales,Son iguales,Mas,Menos",
    };
    
    public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[4];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); // obtenido el token
            i++;
        }
        
        return a;
    }
    
    public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
}
