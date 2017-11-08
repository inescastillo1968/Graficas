/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Paso 1 - Importar librerias graficas
package graficas;
import javax.swing.*;//Libreria grafica estandar multiplataforma
import java.awt.*;//Libreria grafica del sistema operativo
//paso 8 - importar la clase que contiene la Gui
import gui.MiVentana;//paquete.clase
/**
 *
 * @author LAB10
 */
public class Graficas {

    /**
     * @param args the command line arguments
     */
    //paso 9 - llamado a la clase
    public static void main(String[] args) 
    {
       MiVentana miventana = new MiVentana();//Creamos un objeto tipo JFrame
      miventana.setVisible(true);//Esta sentencia muestra la ventana
      miventana.setBounds(0,0,400,400);//Le asignamos tamaño a la ventana
      miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Esta sentencia cierra esta ventana
    }
    
}
