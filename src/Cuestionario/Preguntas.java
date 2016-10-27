
package Cuestionario;


public class Preguntas {
    
    String[] preguntas = {
        "¿Valor de una pulgada?", "¿Un metro a una milla?", "¿Que significa \"ft\"?",
        "¿Cuanto son 12 pies?", "¿Que es mas una libra o 0.45 kg?"
    };
    
   public String getPregunta(int posicion){
        return preguntas[posicion];
    }
    
}