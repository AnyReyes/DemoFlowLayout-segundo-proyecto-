
package demoflowlayout.segundo.proyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
//El JPanel es un contenedor 
//En él se pueden añadir botones
//Despues de crear los botones se usa el método "add"
import javax.swing.JButton;

public class PanelPrincipal extends JPanel

    implements ActionListener{ //Creando el JPanel
    
    private JButton boton;
    private JButton boton2;
    private JButton boton3;
    //El boton es una fuente de eventos
    
    public PanelPrincipal() { //Creando el constructor
        OyenteDelBoton oyente = new OyenteDelBoton();
        boton = new JButton("Haz clic");
        boton.addActionListener(oyente);
        
        boton2 = new JButton("Tócame");
        boton2.addActionListener(this);
        
        boton3 = new JButton("Salir");
        boton3.addActionListener(new ActionListener() {
            //Sirve para crear el objeto directamente, teniendo cuidado con los "()" y el ";"
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);//Método para salir
            }
        });
        
        
        this.add(boton);
        this.add(boton2);
        this.add(boton3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Gracias por tocarme"); 
    }
    
class OyenteDelBoton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Se hizo clic");
        }
    
}
}
