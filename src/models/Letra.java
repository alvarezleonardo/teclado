

package models;

import controladores.ControladorLetraClick;
import javax.swing.JButton;
import javax.swing.JTextField;

    

public class Letra extends JButton {
    
     private String letra;
     private JTextField texto;
     
     private ControladorLetraClick controladorClick;
     

    public Letra(String letra, JTextField texto) {
        super(letra);
        this.letra = letra;
        this.texto = texto;
        
        controladorClick = new ControladorLetraClick(texto,letra);
        this.addMouseListener(controladorClick);
    }

   
    

}

    
        
    
    
    
  
