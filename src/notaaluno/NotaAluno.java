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
public class NotaAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        Aluno aluno = new Aluno();
    System.out.println("O aluno: ");
    aluno.nome = sc.nextLine();
    System.out.println("Obteve as seguintes três notas durante o ano letivo, digite a primeira nota: ");
    aluno.nota1 = sc.nextInt();
    System.out.println("A segunda nota: ");
    aluno.nota2 = sc.nextInt();
    System.out.println("A terceira nota: ");
    aluno.nota3 = sc.nextInt();
    System.out.println();
    System.out.println("O aluno " + aluno.nome + " teve a nota média de: " + aluno.calculoNota(0));
    
    if(aluno.calculoNota(0) >= 5){
        System.out.println("Parabéns sua nota média foi superior a 5, VOCÊ PASSOU!!!");
    }
    else{
        System.out.println("Infelizmente voçê não passou!");
    }
    
    
        
    }
    
}
