import java.awt.*;

import javax.swing.*;

 

public class exampleFlow {

 

    public static void main(String[] args){

   

        //Declaramos o visual do nosso frame

        JFrame.setDefaultLookAndFeelDecorated(true);

       

        //Criamos nosso Frame

        JFrame minhaJanela = new JFrame("Exemplo de Flow Layout");

       

        //Criaremos alguns botões

        JButton bt1 = new JButton("Menu 1");

        JButton bt2 = new JButton("Menu 2");

        JButton bt3 = new JButton("Menu 3");

        JButton bt4 = new JButton("Menu 4");

        JButton bt5 = new JButton("Menu 5");

        JButton bt6 = new JButton("Menu 6");       

       

        //Configuramos nosso JFrame

        minhaJanela.setSize(600,400);

        minhaJanela.setLocation(200,200);

       

        //Declaramos será utilizado o gerenciador FlowLayout

        minhaJanela.getContentPane().setLayout(new FlowLayout());

       

        //Adicionamos os componentes em nossa janela

        minhaJanela.getContentPane().add(bt1);

        minhaJanela.getContentPane().add(bt2);

        minhaJanela.getContentPane().add(bt3);

        minhaJanela.getContentPane().add(bt4);

        minhaJanela.getContentPane().add(bt5);

        minhaJanela.getContentPane().add(bt6);

        

        minhaJanela.setVisible(true);

    }       

}