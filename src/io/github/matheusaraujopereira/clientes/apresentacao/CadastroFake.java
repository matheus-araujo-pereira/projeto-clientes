package io.github.matheusaraujopereira.clientes.apresentacao;

import java.util.UUID;

import io.github.matheusaraujopereira.clientes.logica.Cadastro;

public class CadastroFake implements Cadastro {

  @Override
  public void criar(Object objeto) {
    // Implementação fake para criar um objeto
    System.out.println("Criando objeto: " + objeto);
  }

  @Override
  public void ler(UUID codigo) {
    // Implementação fake para ler um objeto
    System.out.println("Lendo objeto com código: " + codigo);
  }

  @Override
  public void atualizar(Object objeto) {
    // Implementação fake para atualizar um objeto
    System.out.println("Atualizando objeto: " + objeto);
  }

  @Override
  public void excluir(UUID codigo) {
    // Implementação fake para excluir um objeto
    System.out.println("Excluindo objeto com código: " + codigo);
  }
}
