 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Paso 1 - Importar librerias graficas
package gui;
import graficas.*;
import javax.swing.*;//Libreria grafica estandar multiplataforma
import java.awt.*;//Libreria grafica del sistema operativo
/**
 *
 * @author LAB10
 */
//paso2-Heredar Mi Clase Desde JFRAME
public class MiVentana extends JFrame {
//paso 3-DECLARAR LOS ELEMENTOS QUE VAMOS A UTILIZAR
   JPanel mipanel;//creacion de objeto JPanel
   JLabel milabel;
   JTextField mitexto;
   JButton miboton;
   //paso 4 - definicion del constructor de la clase
   public MiVentana()//tiene el mismo nombre de la clase
   {
    //paso 5- crear e inicializar los objetos que utilizaremos
    mipanel = new JPanel();//creamos el objeto
    milabel = new JLabel();
    mitexto = new JTextField(10);//10 son los caracteres
    miboton = new JButton();
    //paso 6 - agregar los elementos al JFRAME
    this.add(mipanel);//agrego el JPanel al JFrame
    mipanel.add(milabel);//agrego los elementos al JPanel
    mipanel.add(mitexto);
    mipanel.add(miboton);
    //paso 7 - propiedades de los elementos
    milabel.setText("campo");
    miboton.setText("presioname");
    
    
            
   }
     
   /* public static void main(String[] args) 
    {
      JFrame miventana = new JFrame();//Creamos un objeto tipo JFrame
      miventana.setVisible(true);//Esta sentencia muestra la ventana
      miventana.setBounds(0,0,400,400);//Le asignamos tamaño a la ventana
      miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Esta sentencia cierra esta ventana
    }*/
    
}
