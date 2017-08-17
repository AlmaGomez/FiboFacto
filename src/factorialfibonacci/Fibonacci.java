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
public class Fibonacci extends JFrame implements ActionListener {
    
    JTextField ReciboNumero, EntregoNumero;
    JButton CalculoNumero;
    JLabel IntroduceNumero;
    
    int Factorial;
    int NumeroRecibido; 
    
    public Fibonacci(){
        InicializarVentana();
        InicializarComponentes();
        Factorial = 0;
        NumeroRecibido = 0; 
    }
    
    public void InicializarVentana(){
        setTitle("FIBONACCI");
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
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == CalculoNumero){
            int resultado = Integer.parseInt(ReciboNumero.getText());
            int nums = 0;
            int nums2=1;
        
            String fibo="";
            for(int i=0; i<=resultado-3; i++){
                switch(i){
                    case 0:
                       fibo="0 1 "; 
                    break;    
                }
                int nums3;
                fibo+=(nums2+nums)+" ";
                nums3=nums;
                nums=nums2;
                nums2=nums3+nums2;                    
            }
            EntregoNumero.setText(String.valueOf(fibo));
        }
    }
}