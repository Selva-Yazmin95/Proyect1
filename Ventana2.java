import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ventana2 extends JFrame{

//las cosas se declaran afuera

JButton b1= new JButton ("Clic al Botoncito");

 public Ventana2(){

super ("Esta es la historia del comienzo");
//hacer el contenedor
GridBagConstraints gbc= new GridBagConstraints();
Container cont = getContentPane();
//elejir el layout
cont.setLayout (new GridBagLayout());
setBounds(200,100,300,300);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


gbc.gridx=1;
gbc.gridy=1;

cont.add(b1, gbc);
//b1.addActionListener(this);
setVisible(true);

 }// constructor
/*
public void actionPerformed(ActionEvent event){

JOptionPane.showMessageDialog(null, "El comando es \""+ event.getActionCommand()+"\"");


}*/
public static void main(String []Sakura){

Ventana2 v1= new Ventana2();


}
}
