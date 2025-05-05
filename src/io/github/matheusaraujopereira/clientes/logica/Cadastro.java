package io.github.matheusaraujopereira.clientes.logica;

import java.util.UUID;

public interface Cadastro<TIPO> {

  void criar(TIPO objeto);

  void ler(UUID codigo);

  void atualizar(TIPO objeto);

  void excluir(UUID codigo);

}
