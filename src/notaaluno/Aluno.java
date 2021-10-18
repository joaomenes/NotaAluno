/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notaaluno;

import java.util.Scanner;

/**
 *
 * @author gabriel villela
 */
public class Aluno {
 
   
    public String nome;
    public int  nota1, nota2, nota3;
    public int media;
    
   
    
    public int calculoNota( int nota){
        int somaNota = nota1 + nota2 + nota3;
        return media = somaNota/3; 
       
    }
    public String Nome(){
        
        return this.nome;
    }
    
    
    
    
}
