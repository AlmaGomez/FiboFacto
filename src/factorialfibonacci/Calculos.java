/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialfibonacci;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Alumno
 */
public class Calculos extends JFrame implements ActionListener {
    
    JTextField ReciboNumero, EntregoNumero;
    JButton CalculoNumero;
    JLabel IntroduceNumero;
    
    int Factorial;
    int NumeroRecibido; 
    
    public Calculos(){
        InicializarVentana();
        InicializarComponentes();
        Factorial = 0;
        NumeroRecibido = 0; 
    }
    
    public void InicializarVentana(){
        setTitle("FACTORIAL");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setBackground(new Color(0,0,0));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }
    
    public void InicializarComponentes(){
        IntroduceNumero = new JLabel("Introduce un numero: ");
        CalculoNumero = new JButton("CALCULAR");
        ReciboNumero = new JTextField ();
        EntregoNumero = new JTextField();
        
        setLayout(new BorderLayout());
        
        add(IntroduceNumero, BorderLayout.NORTH);        
        add(UbicacionCentro(), BorderLayout.CENTER);
        add(CalculoNumero, BorderLayout.SOUTH);
        
        CalculoNumero.addActionListener(this);
        
        IntroduceNumero.setVisible(true);
        CalculoNumero.setVisible(true);
        ReciboNumero.setVisible(true);
        EntregoNumero.setVisible(true);
    }
    private JPanel UbicacionCentro(){
        JPanel centro = new JPanel();
        centro.setLayout(new BoxLayout(centro, BoxLayout.Y_AXIS));
        centro.add(ReciboNumero);
        centro.add(EntregoNumero);
        return centro;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == CalculoNumero){
            NumeroRecibido = Integer.parseInt(ReciboNumero.getText());
            Factorial = NumeroRecibido;
            for(int i = NumeroRecibido - 1; i >= 1; i--){
                Factorial = Factorial *  i; 
            }
            EntregoNumero.setText(String.valueOf(Factorial));
        }
    }
}
