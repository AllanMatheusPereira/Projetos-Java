/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exercicios.testacaes;

/**
 *
 * @author allan
 */
public class TestaCaes {   
    
    public String nome;
    public int peso;
    public String corOlhos;
    public int quantPatas;
    public int tamanho;
   
    public void latir(String[] args){
     if( tamanho >60) 
         System.out.println("Wooof!, Wooof!");
     else if( tamanho > 14) 
         System.out.println("Ruff!, Ruff!");
     else 
         System.out.println("Yip!, Yip!");
       
   }  
}

