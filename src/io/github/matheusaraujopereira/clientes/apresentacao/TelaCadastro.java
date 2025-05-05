package io.github.matheusaraujopereira.clientes.apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import io.github.matheusaraujopereira.clientes.dominio.Cliente;
import io.github.matheusaraujopereira.clientes.dominio.enums.TipoSexo;
import io.github.matheusaraujopereira.clientes.logica.Cadastro;

public class TelaCadastro extends JFrame {

  private JLabel labelNome;
  private JLabel labelCpf;
  private JLabel labelSexo;

  private JTextField campoNome;
  private JTextField campoCpf;
  private JComboBox<TipoSexo> campoSexo;

  private JButton botaoSalvar;

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

    TipoSexo[] tipoSexo = { null, TipoSexo.M, TipoSexo.F, TipoSexo.O };
    campoSexo = new JComboBox<>(tipoSexo);
    campoSexo.setBounds(120, 100, 200, 30);
    getContentPane().add(campoSexo);
  }

  private void adicionarBotoes() {
    botaoSalvar = new JButton("Salvar");
    botaoSalvar.setBounds(120, 140, 100, 30);
    botaoSalvar.addActionListener(botaoSalvar());
    getContentPane().add(botaoSalvar);
  }

  private void adicionarComponentesFoto() {

  }

  private ActionListener botaoSalvar() {
    return new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {

        Cliente cliente = new Cliente();
        cliente.setNome(campoNome.getText());
        cliente.setCpf(campoCpf.getText());
        cliente.setSexo((TipoSexo) campoSexo.getSelectedItem());

        Cadastro<Cliente> logica = new CadastroFake();
        logica.criar(cliente);

        JOptionPane.showMessageDialog(null, cliente);
      }
    };
  }
}
