package io.github.matheusaraujopereira.clientes.dominio;

import java.util.Arrays;
import java.util.UUID;

import io.github.matheusaraujopereira.clientes.dominio.enums.TipoSexo;

public class Cliente {

  private UUID codigo;
  private String nome;
  private String cpf;
  private TipoSexo sexo;
  private byte[] foto;

  public Cliente() {
    this.codigo = UUID.randomUUID();
  }

  public UUID getCodigo() {
    return codigo;
  }

  public void setCodigo(UUID codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public TipoSexo getSexo() {
    return sexo;
  }

  public void setSexo(TipoSexo sexo) {
    this.sexo = sexo;
  }

  public byte[] getFoto() {
    return foto;
  }

  public void setFoto(byte[] foto) {
    this.foto = foto;
  }

  @Override
  public String toString() {
    return "Cliente [codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
    result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
    result = prime * result + Arrays.hashCode(foto);
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Cliente other = (Cliente) obj;
    if (codigo == null) {
      if (other.codigo != null)
        return false;
    } else if (!codigo.equals(other.codigo))
      return false;
    if (nome == null) {
      if (other.nome != null)
        return false;
    } else if (!nome.equals(other.nome))
      return false;
    if (cpf == null) {
      if (other.cpf != null)
        return false;
    } else if (!cpf.equals(other.cpf))
      return false;
    if (sexo != other.sexo)
      return false;
    if (!Arrays.equals(foto, other.foto))
      return false;
    return true;
  }

}
