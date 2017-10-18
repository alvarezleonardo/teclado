package controladores;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;

public class ControladorEspacio implements MouseListener{

    private JTextField texto ;
    
    public ControladorEspacio(JTextField txtTexto){
         this.texto = texto;
        
    }        
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        texto.setText(" ");
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
