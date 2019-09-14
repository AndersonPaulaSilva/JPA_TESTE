package com.anderson.model;

import java.util.Date;

/**
 * Created by Anderson on 14/09/2019.
 */
public class Emprego {

    private Integer id;
    private String nome;
    private String descricao;
    private Date data;
    private Double salario;
    private Integer destacado;
    private String imagem = "no-image.png";
    private String estatus;
    private String datalhes;

    private Categoria categoria;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getDestacado() {
        return destacado;
    }

    public void setDestacado(Integer destacado) {
        this.destacado = destacado;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getDatalhes() {
        return datalhes;
    }

    public void setDatalhes(String datalhes) {
        this.datalhes = datalhes;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Emprego{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                ", salario=" + salario +
                ", destacado=" + destacado +
                ", imagem='" + imagem + '\'' +
                ", estatus='" + estatus + '\'' +
                ", datalhes='" + datalhes + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
