
package controladores;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;

public class ControladorBorrar implements MouseListener{

    private JTextField texto ;
    
    public ControladorBorrar(JTextField txtTexto){
         this.texto = texto;
        
    }        

    public ControladorBorrar() {
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        texto.setText("");
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
    
}
