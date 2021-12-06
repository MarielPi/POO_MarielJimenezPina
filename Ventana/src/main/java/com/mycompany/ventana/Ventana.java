/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ventana;
/**
 *
 * @author MARIEL
 * 
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; 

public class Ventana implements ActionListener {
    
    private static JLabel userLabel;
    private static JTextField usertext;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;
    private static JLabel nombreLabel;
    private static JTextField nombreText;
    private static JLabel appLabel;
    private static JTextField appText;
    private static JLabel apmLabel;
    private static JTextField apmText;
    private static JLabel fechaLabel;
    private static JTextField fechaText;
    private static JLabel escuelaLabel;
    private static JTextField escuelaText;
 

    public static void main(String[] args){

        JFrame ventana = new JFrame("Hola mundo");
        ventana.setSize(350, 350);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocation(840, 400);

        JPanel panel = new JPanel();
        ventana.add(panel);
        agregarComponente(panel);

        ventana.setVisible(true);
        
        
    }

    private static void agregarComponente(JPanel panel) {
        
        panel.setLayout(null); 
        
        nombreLabel = new JLabel("Nombre");
        nombreLabel.setBounds(10, 1, 80, 50);
        panel.add(nombreLabel);
        
        nombreText = new JTextField();
        nombreText.setBounds(160, 12, 160, 25);
        panel.add(nombreText);
        
        appLabel = new JLabel("Apellido paterno");
        appLabel.setBounds(10, 30, 100, 50);
        panel.add(appLabel);
        
        appText = new JTextField();
        appText.setBounds(160, 42, 160, 25);
        panel.add(appText);
        
        apmLabel = new JLabel("Apellido materno");
        apmLabel.setBounds(10, 59, 100, 50);
        panel.add(apmLabel);
        
        apmText = new JTextField();
        apmText.setBounds(160, 72, 160, 25);
        panel.add(apmText);
       
        fechaLabel = new JLabel("Fecha de nacimiento");
        fechaLabel.setBounds(10, 88, 120, 50);
        panel.add(fechaLabel);
  
        fechaText = new JTextField(20);
        fechaText.setBounds(160, 102, 160, 25);
        panel.add(fechaText);
        
        escuelaLabel = new JLabel("Universidad");
        escuelaLabel.setBounds(10, 117, 120, 50);
        panel.add(escuelaLabel);
  
        escuelaText = new JTextField(20);
        escuelaText.setBounds(160, 132, 160, 25);
        panel.add(escuelaText);
        
        userLabel = new JLabel("Nombre de usuario");
        userLabel.setBounds(10, 146, 120, 50);
        panel.add(userLabel);
  
        usertext = new JTextField(20);
        usertext.setBounds(160, 162, 160, 25);
        panel.add(usertext);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 175, 80, 50);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(160, 192, 160, 25);
        panel.add(passwordText);
        
        button = new JButton("Iniciar Sesion");
        button.setBounds(100, 240, 120, 25);
        button.addActionListener(new Ventana());
        panel.add(button);
        
        success = new JLabel("");
        success.setBounds(10, 285, 300, 25);
        panel.add(success);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = usertext.getText();
        String password = passwordText.getText(); 
        String nombre = nombreText.getText();
        String app = appText.getText();
        String apm = apmText.getText();
        String escuela = escuelaText.getText();
        
        
        if (user.equals("Gatito")&& password.equals("Michis")&& nombre.equals("Mariel")&& app.equals("Jimenez")&& apm.equals("Pina")&& escuela.equals("UTC")){
            success.setText("BIENVENIDO");
            
        }else{
            success.setText("USUARIO INVALIDO");
        }
        
    }

}

