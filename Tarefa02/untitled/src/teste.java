import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class teste {



    public static void inicio(){
        JFrame telainicial = new JFrame("Inicio");
        JPanel contentpanel = new JPanel();
        contentpanel.setLayout(null);
        contentpanel.setBounds(0, 0, 500, 300);

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
        revistas.setText("Revistas");
        revistas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        listagem.setBounds(316, 80, 100, 25);
        listagem.setText("Vídeos");
        listagem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        contentpanel.add(livros);
        contentpanel.add(revistas);
        contentpanel.add(listagem);
        telainicial.add(contentpanel);



    }

    public static void livros(){
        JFrame telalivros = new JFrame("Livros");
        JPanel contentlivros = new JPanel();
        // contentlivros.setBackground(new Color(0, 0, 0));
        contentlivros.setLayout(null);
        contentlivros.setBounds(0, 0, 500, 300);

        telalivros.setLayout(null);
        telalivros.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telalivros.setSize(500, 300);
        telalivros.setResizable(false);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Calcular posição central
        int centerX = (int) ((screenSize.getWidth() - telalivros.getWidth()) / 2);
        int centerY = (int) ((screenSize.getHeight() - telalivros.getHeight()) / 2);

        // Definir a posição da janela como central
        telalivros.setLocation(centerX, centerY);

        JLabel livroslabel = new JLabel("Livros");
        JLabel titulolabel = new JLabel("Titulo");
        JLabel autorlabel = new JLabel("Autor");
        JLabel anolabel = new JLabel("Ano");
        livroslabel.setBounds(200, 10, 200, 50);
        livroslabel.setFont(new Font("Arial", Font.BOLD, 40));
        titulolabel.setBounds(75, 60, 100, 25);
        autorlabel.setBounds(75, 95, 100, 25);
        anolabel.setBounds(75, 130, 100, 25);

        JTextField titulo = new JTextField();
        JTextField autor = new JTextField();
        JTextField ano = new JTextField();

        titulo.setBounds(185, 60, 180, 25);
        autor.setBounds(185, 95, 180, 25);
        ano.setBounds(185, 130, 40, 25);




        JButton addlivros = new JButton();
        JButton voltarinicial = new JButton();
        JButton listagem = new JButton();

        addlivros.setBounds(96, 170, 100, 25);
        addlivros.setText("Listagem");
        addlivros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        voltarinicial.setBounds(206, 170, 100, 25);
        voltarinicial.setText("Voltar");
        voltarinicial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        listagem.setBounds(316, 170, 100, 25);
        listagem.setText("Adicionar");
        listagem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        contentlivros.add(addlivros);
        contentlivros.add(voltarinicial);
        contentlivros.add(listagem);
        contentlivros.add(livroslabel);
        contentlivros.add(titulolabel);
        contentlivros.add(autorlabel);
        contentlivros.add(anolabel);
        contentlivros.add(titulo);
        contentlivros.add(autor);
        contentlivros.add(ano);
        telalivros.add(contentlivros);
        contentlivros.setVisible(true);
        telalivros.setVisible(true);




    }

    public static void revistas(){
        JFrame telarevistas = new JFrame("Livros");
        JPanel contentlivros = new JPanel();
        // contentlivros.setBackground(new Color(0, 0, 0));
        contentlivros.setLayout(null);
        contentlivros.setBounds(0, 0, 500, 300);

        telarevistas.setLayout(null);
        telarevistas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telarevistas.setSize(500, 300);
        telarevistas.setResizable(false);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Calcular posição central
        int centerX = (int) ((screenSize.getWidth() - telarevistas.getWidth()) / 2);
        int centerY = (int) ((screenSize.getHeight() - telarevistas.getHeight()) / 2);

        // Definir a posição da janela como central
        telarevistas.setLocation(centerX, centerY);

        JLabel livroslabel = new JLabel("Revistas");
        JLabel titulolabel = new JLabel("Titulo");
        JLabel autorlabel = new JLabel("Autor");
        JLabel anolabel = new JLabel("Ano");
        JLabel vollabel = new JLabel("Vol");
        JLabel nrolabel = new JLabel("Nro");

        livroslabel.setBounds(200, 10, 250, 50);
        livroslabel.setFont(new Font("Arial", Font.BOLD, 40));
        titulolabel.setBounds(75, 60, 100, 25);
        autorlabel.setBounds(75, 95, 100, 25);
        anolabel.setBounds(75, 130, 100, 25);
        vollabel.setBounds(240, 130, 100, 25);
        nrolabel.setBounds(325, 130, 100, 25);

        JTextField titulo = new JTextField();
        JTextField autor = new JTextField();
        JTextField ano = new JTextField();
        JTextField vol = new JTextField();
        JTextField nro = new JTextField();


        titulo.setBounds(185, 60, 180, 25);
        autor.setBounds(185, 95, 180, 25);
        ano.setBounds(185, 130, 40, 25);
        vol.setBounds(270, 130, 40, 25);
        nro.setBounds(365, 130, 40, 25);




        JButton addlivros = new JButton();
        JButton voltarinicial = new JButton();
        JButton listagem = new JButton();

        addlivros.setBounds(96, 170, 100, 25);
        addlivros.setText("Listagem");
        addlivros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        voltarinicial.setBounds(206, 170, 100, 25);
        voltarinicial.setText("Voltar");
        voltarinicial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        listagem.setBounds(316, 170, 100, 25);
        listagem.setText("Adicionar");
        listagem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        contentlivros.add(addlivros);
        contentlivros.add(voltarinicial);
        contentlivros.add(listagem);
        contentlivros.add(livroslabel);
        contentlivros.add(titulolabel);
        contentlivros.add(autorlabel);
        contentlivros.add(anolabel);
        contentlivros.add(titulo);
        contentlivros.add(autor);
        contentlivros.add(ano);
        contentlivros.add(vol);
        contentlivros.add(nrolabel);
        contentlivros.add(nro);
        contentlivros.add(vollabel);
        telarevistas.add(contentlivros);
        contentlivros.setVisible(true);
        telarevistas.setVisible(true);





    }



}