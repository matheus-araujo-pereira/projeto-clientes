package io.github.matheusaraujopereira.clientes.apresentacao;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class TelaCadastro extends JFrame {

  private JLabel labelNome;
  private JLabel labelCpf;
  private JLabel labelSexo;

  private JTextField campoNome;
  private JTextField campoCpf;
  private JComboBox<String> campoSexo;

  public TelaCadastro() {
    construirTela();
  }

  private void construirTela() {
    setSize(600, 500);
    setTitle("Cadastro de Clientes");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setLayout(null);

    this.adicionarCampos();
    this.adicionarBotoes();
    this.adicionarComponentesFoto();
  }

  private void adicionarCampos() {
    labelNome = new JLabel("Nome:");
    labelNome.setBounds(20, 20, 100, 30);
    getContentPane().add(labelNome);

    labelCpf = new JLabel("CPF:");
    labelCpf.setBounds(20, 60, 100, 30);
    getContentPane().add(labelCpf);

    labelSexo = new JLabel("Sexo:");
    labelSexo.setBounds(20, 100, 100, 30);
    getContentPane().add(labelSexo);

    campoNome = new JTextField();
    campoNome.setBounds(120, 20, 200, 30);
    getContentPane().add(campoNome);

    campoCpf = new JTextField();
    campoCpf.setBounds(120, 60, 200, 30);
    getContentPane().add(campoCpf);

    campoSexo = new JComboBox<>(new String[] { "Masculino", "Feminino", "Outro" });
    campoSexo.setBounds(120, 100, 200, 30);
    getContentPane().add(campoSexo);
  }

  private void adicionarBotoes() {

  }

  private void adicionarComponentesFoto() {

  }
}
