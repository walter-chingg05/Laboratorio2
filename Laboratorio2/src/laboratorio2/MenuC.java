
package laboratorio2;

import java.util.concurrent.ThreadLocalRandom;

public class MenuC {
    
    public static void main(String[] args)
    {
        
      Menu window= new Menu ();    
      window.setTitle("ventana de menú");
       window.setVisible(true);
    }
   
    public void RESISTENCIAS() {
     Resistencias mostrar = new Resistencias();
     Menu ocultar = new Menu();
      mostrar.setVisible(true);
      ocultar.setVisible(false);
    }
    
    public void CALCULADORA(){
    
     CalculadoraMatricial mostrar = new CalculadoraMatricial();
        mostrar.setVisible(true);
        mostrar.setVisible(false);
    
    }
    
    public void YANKENPO(){
    
    yankenpo mostrar = new yankenpo();
        mostrar.setVisible(true);
        mostrar.setVisible(false);
    
    }
    
     public void SALIR(){
    
           System.exit(0);

    
    }
    
    
       
     
          
    
}
