package demoflowlayout.segundo.proyecto;


import java.awt.Container;
import javax.swing.JFrame;


public class MarcoPrincipal extends JFrame{

    public MarcoPrincipal() {
        initComponents();
    }
    
    private void initComponents(){ //Este método sirve para inicializar los componentes para ventanas
        this.setTitle("Demo FlowLayout");//Para poner el título
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Para cerrar la ventana 
        this.setSize(300, 300); //El ancho y largo de la ventana, tamaño
        this.setLocation(100, 200); //El ancho y largo que queremos que este desde el tamaño de la ventana al centro
        this.setResizable(false);//PAra que no se pueda modificar el tamaño de la ventana
        
        PanelPrincipal panel = new PanelPrincipal();
        
        Container panelDeContenido = this.getContentPane();
        panelDeContenido.add(panel);
        
    }      
}
