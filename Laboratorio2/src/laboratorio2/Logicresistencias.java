/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package laboratorio2;

/**
 *
 * @author walle
 */

public class Logicresistencias{
  
   
   public static void main (String []args ){
   
   Resistencias window= new Resistencias ();    
      window.setTitle("Codigo de Resistencias");
       window.setVisible(true);
    
   }
   
   public void Menu (){
   Menu mostrar = new Menu();
   Resistencias ocultar = new Resistencias();
   mostrar.setVisible(true);  
   ocultar.setVisible(false);
   }
   public void SALIR(){
    
    System.exit(0);

    
    }
}

      
     

 


