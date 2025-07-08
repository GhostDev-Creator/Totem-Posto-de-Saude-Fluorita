import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("ALL")
public class totem {
    public static void main(String[] args) {
        // Tela principal inicia
        JFrame inicio = new JFrame();

        JLabel posto = new JLabel("Bem-Vindo(a) ao Posto de Saúde Fluorita");
        posto.setBounds(80,50,250,30);

        JLabel name = new JLabel("Nome: ");
        name.setBounds(80, 100,180,30);
        JTextField camponame = new JTextField();
        camponame.setBounds(80, 130,180,30);

        JButton sairi = new JButton("Sair");
        sairi.setBounds(120, 500, 150, 30);
        sairi.addActionListener(e -> inicio.dispose());

        JButton escolher = new JButton("Proximo");
        escolher.setBounds(120, 200, 150, 30);

        // Botão "Próximo" clicado, tela de escolhas inicia
        escolher.addActionListener(e -> {
            // Tela de escolhas inicia
            JFrame escolhas = new JFrame();
            String nome = camponame.getText();

            JLabel textescolhas = new JLabel("Do que você precisa hoje, "+nome+"!");
            textescolhas.setBounds(100, 50, 280, 30);

            JButton dentista = new JButton("Dentista");
            dentista.setBounds(65, 100, 250, 30);
            dentista.addActionListener(ev -> {
                String situacao = dentista.getText();
                abrirTelaSenhas(escolhas, situacao, nome);
                escolhas.dispose();
            });

            JButton medico = new JButton("Médico");
            medico.setBounds(65, 160, 250, 30);
            medico.addActionListener(ev -> {
                String situacao = medico.getText();
                abrirTelaSenhas(escolhas, situacao, nome);
                escolhas.dispose();
            });

            JButton vacina = new JButton("Vacina");
            vacina.setBounds(65, 220, 250, 30);
            vacina.addActionListener(ev -> {
                String situacao = vacina.getText();
                abrirTelaSenhas(escolhas, situacao, nome);
                escolhas.dispose();
            });

            JButton encaixe = new JButton("Encaixe");
            encaixe.setBounds(65, 280, 250, 30);
            encaixe.addActionListener(ev -> {
                String situacao = encaixe.getText();
                abrirTelaSenhas(escolhas, situacao, nome);
                escolhas.dispose();
            });

            JButton sair = new JButton("Sair");
            sair.setBounds(120, 500, 150, 30);
            sair.addActionListener(ev -> escolhas.dispose());

            escolhas.add(textescolhas);
            escolhas.add(dentista);
            escolhas.add(medico);
            escolhas.add(vacina);
            escolhas.add(encaixe);
            escolhas.add(sair);

            escolhas.setLayout(null);
            escolhas.setBounds(500,130,400,600);
            escolhas.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            escolhas.setVisible(true);
            // Tela de escolhas finaliza

            inicio.dispose();
        });

        inicio.add(posto);
        inicio.add(name);
        inicio.add(camponame);
        inicio.add(escolher);
        inicio.add(sairi);

        inicio.setLayout(null);
        inicio.setBounds(500,130,400,600);
        inicio.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        inicio.setVisible(true);
        // Tela principal finaliza
    }

    // Tela de senha inicia
    private static void abrirTelaSenhas(JFrame escolhas, String situacao, String nome) {
        JFrame senhas = new JFrame();

        JLabel aguarde = new JLabel("É só aguardar, " + nome + "!");
        aguarde.setBounds(80,50,250,30);

        JLabel senha = new JLabel("<html>Sua senha é A001, aguarde você ser<br>chamado para a sala do " + situacao + ".</html>");
        senha.setBounds(50,80,250,50);

        senhas.add(aguarde);
        senhas.add(senha);

        senhas.setLayout(null);
        senhas.setBounds(300,130,300,200);
        senhas.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        senhas.setVisible(true);

        // Timer inicia (analogia: "Daqui 3 segundos, execute abrirAguarde")
        Timer timer = new Timer(3000, e -> abrirAguarde(senhas, situacao, nome));
        timer.setRepeats(false); // Só executa 1 vez
        timer.start(); // Timer começa agora
        // Timer finaliza
    }
    // Tela de senha finaliza

    // Tela de chamada inicia
    private static void abrirAguarde(JFrame abrirTelaSenhas, String situacao, String nome) {
        JFrame chamado = new JFrame();

        JLabel chamada = new JLabel("<html>Senha: A001<br>Paciente: " + nome + "<br>Comparecer à sala do(e) " + situacao + ".</html>");
        chamada.setBounds(50,30,250,60);

        JButton indo = new JButton("Indo");
        indo.setBounds(100, 100, 100, 30);
        indo.addActionListener(e -> {
            chamado.dispose();
            abrirTelaSenhas.dispose();
        });

        chamado.add(chamada);
        chamado.add(indo);

        chamado.setLayout(null);
        chamado.setBounds(650,130,300,200);
        chamado.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        chamado.setVisible(true);
    }
    // Tela de chamada finaliza
}
