/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioproject;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;

/**
 *
 * @author lucas.franca
 */
public class ExercicioProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Data e Hora do Sistema
        Date data = new Date();
       System.out.println("A hora do sistema é: "+ data);
        //Linguagem do sistema
       System.getProperties(); //debuguei esta linha, há várias propriedades que não estão na documentação!
       System.out.println("O idioma do sistema é "+System.getProperty("user.language"));
       //Resolução da tela 
       Toolkit tk = Toolkit.getDefaultToolkit();
       Dimension d = tk.getScreenSize();
        System.out.println("Screen width = " + d.width);
        System.out.println("Screen height = " + d.height);
    }
    
}
