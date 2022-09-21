package Main;

import Interface.INadar;
import Model.*;

public class Main {
    public static void main(String[] args) {

        Ambiente ambiente = new Ambiente(3);



        Tubarao tubarao1 = new Tubarao("Tanque","Fizz","Tubarao Branco","Macho",3,"ok",false,5,"Salgada",60);
        Gaviao gaviao1 = new Gaviao("Aviario","Quinn","Gaviao","Femea",2,"OK",2,true,true,"Otima");
        LoboGuara lobo1 = new LoboGuara("Toca do lobo","Warwick","Lobo Guara","Macho",12,"Mediano",4,true,"Mediana");

        ambiente.setListaAnimais(0,"Toca do lobo",lobo1);
        ambiente.setListaAnimais(1,"Tanque",tubarao1);
        ambiente.setListaAnimais(2,"Aviario",gaviao1);

        Zoologico meuZoologico = new Zoologico("Zoologico de Zaun",ambiente);

        System.out.println("\n" + meuZoologico.getAmbiente());

        tubarao1.Nadar();
        lobo1.Caminhar();
        gaviao1.Voar();
    }


}
