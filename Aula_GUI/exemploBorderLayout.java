import java.awt.*;

import javax.swing.*;

public class exemploBorderLayout {

 

    public static void main(String[] args){

       

        JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame minhaJanela = new JFrame("Exemplo de BorderLayout");

       

        JButton bt1 = new JButton("Botão direito");

        JButton bt2 = new JButton("Botão esquerdo");

        JButton bt3 = new JButton("Botão área superior");

        JButton bt4 = new JButton("Botão área inferior");

        JButton bt5 = new JButton("Botão área central");

       

        minhaJanela.setSize(500,500);

        minhaJanela.setLocation(150,150);

       

        minhaJanela.getContentPane().setLayout(new BorderLayout());

       

        minhaJanela.getContentPane().add(bt1, BorderLayout.EAST);

        minhaJanela.getContentPane().add(bt2, BorderLayout.WEST);

        minhaJanela.getContentPane().add(bt3, BorderLayout.NORTH);

        minhaJanela.getContentPane().add(bt4, BorderLayout.SOUTH);

        minhaJanela.getContentPane().add(bt5, BorderLayout.CENTER);

       

        minhaJanela.setVisible(true);

    }

}