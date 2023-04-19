/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testestiposprimitivos;
    import java.util.Scanner;
/**
 *
 * @author lucas.franca
 */
public class TestesTiposPrimitivos {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o nome do aluno: ");
        String aluno = teclado.nextLine();
        System.out.println("Insira a nota do aluno: ");
        
        float nota = teclado.nextFloat();
        
        if(nota >= 6){
           System.out.printf("A nota do %s é %.2f ",aluno, nota); 
            System.out.println("Aluno Aprovado");
        }else{
            System.out.printf("A nota do %s é %.2f ",aluno, nota);  
            System.out.println("Aluno Reprovado");
        }
        //System.out.println("A nota é : "+ nota);
        //System.out.print("A nota é -> "+ nota);                
    }
    
}
