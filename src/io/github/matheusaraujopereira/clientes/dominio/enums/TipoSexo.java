package io.github.matheusaraujopereira.clientes.dominio.enums;

public enum TipoSexo {

  M("Masculino"), F("Feminino"), O("Outros");

  private String descricao;

  TipoSexo(String descricao) {
    this.descricao = descricao;
  }

  public String getDescricao() {
    return descricao;
  }
}
