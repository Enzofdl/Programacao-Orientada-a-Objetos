import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class teste {



    public static void inicio(){
        JFrame telainicial = new JFrame("Inicio");

        telainicial.setLayout(null);
        telainicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telainicial.setSize(500, 300);
        telainicial.setResizable(false);
        telainicial.setVisible(true);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Calcular posição central
        int centerX = (int) ((screenSize.getWidth() - telainicial.getWidth()) / 2);
        int centerY = (int) ((screenSize.getHeight() - telainicial.getHeight()) / 2);

        // Definir a posição da janela como central
        telainicial.setLocation(centerX, centerY);


        JButton livros = new JButton();
        JButton revistas = new JButton();
        JButton listagem = new JButton();

        livros.setBounds(96, 80, 100, 25);
        livros.setText("Livros");
        livros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        revistas.setBounds(206, 80, 100, 25);
        revistas.setText("revistas");
        revistas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        listagem.setBounds(316, 80, 100, 25);
        listagem.setText("Listagem");
        listagem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        telainicial.add(livros);
        telainicial.add(revistas);
        telainicial.add(listagem);



    }

    public static void livros(){

        JLabel textoa = new JLabel();



        textoa.setText("Titulo");
        textoa.setBounds(10, 0, 50, 20);

    }



}
