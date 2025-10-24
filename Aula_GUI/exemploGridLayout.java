import java.awt.*;

import javax.swing.*;

public class exemploGridLayout {

 

    public static void main(String[] args){

       

        //Criaremos alguns botões

        JButton bt1 = new JButton("Botão 1");

        JButton bt2 = new JButton("Botão 2");

        JButton bt3 = new JButton("Botão 3");

        JButton bt4 = new JButton("Botão 4");

       

        JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame minhaJanela = new JFrame("Exemplo de GridLayout");

       

        minhaJanela.setSize(400,400);

        minhaJanela.setLocation(100,100);

       

        minhaJanela.getContentPane().setLayout(new GridLayout(2,2));

        minhaJanela.getContentPane().add(bt1);

        minhaJanela.getContentPane().add(bt2);

        minhaJanela.getContentPane().add(bt3);

        minhaJanela.getContentPane().add(bt4);

       

        minhaJanela.setVisible(true);      

       

    }

}