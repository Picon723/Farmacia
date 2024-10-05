package Main;

import Objetos.Acetaminophen;
import Objetos.Acetaminophen.Posología;

public class ejecutar {
    public static void main(String[] args) {
        Acetaminophen medicamento = new Acetaminophen(
                "Acetaminophen",
                "Tylenol",
                "Oral");
        System.out.println(medicamento.toString());
        
        Acetaminophen.Posología info = medicamento.new Posología(
                "Adultos, jóvenes y niños",
                "500 mg", "cada 4 a 6 horas",
                "Evitar exceder la dosis máxima diaria, ya que puede causar"
                        + " daño hepático");
        System.out.println(info.toString());
    }
}
