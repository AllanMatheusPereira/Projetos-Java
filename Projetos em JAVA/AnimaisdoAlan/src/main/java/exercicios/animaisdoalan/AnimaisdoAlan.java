/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exercicios.animaisdoalan;

/**
 *
 * @author allan
 */
public class AnimaisdoAlan {

    public static void main(String[] args) {
     Animais animal1= new Animais();
     animal1.animal="Gato";
     animal1.tipo="Doméstico";
     animal1.porte="Pequeno";
     animal1.cor="Branco";
     animal1.habitat="Terrestre";
     
     Animais animal2= new Animais();
     animal2.animal="Leão";
     animal2.tipo="Selvagem";
     animal2.porte="Médio";
     animal2.cor="Marrom/Amarelo";
     animal2.habitat="Terrestre";
     
     Animais animal3= new Animais();
     animal3.animal="Baleia";
     animal3.tipo="Selvagem";
     animal3.porte="Grande";
     animal3.cor="Cinza";
     animal3.habitat="Marinho";
     
     Animais animal4= new Animais();
     animal4.animal="Elefante";
     animal4.tipo="Selvagem ";
     animal4.porte="Grande";
     animal4.cor="Cinza";
     animal4.habitat="Terrestre";
     
     Animais animal5= new Animais();
     animal5.animal="Águia";
     animal5.tipo="Selvagem";
     animal5.porte="Pequeno";
     animal5.cor="Preto/Branco";
     animal5.habitat="Onde há temperaturas a menas";
     
public class Construtor {
    public static void main(String[] args){
        ConstrutorProg cao = new ConstrutorCachorro("Pluto");
        System.out.println(cao.getNome());
    }
}
    }
}
