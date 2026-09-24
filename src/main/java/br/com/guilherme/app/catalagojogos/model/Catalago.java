package br.com.guilherme.app.catalagojogos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Catalago {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank 
    private String titulo;
    private String plataforma;
    private String ano_lancamento;
    private int nota;
    private String status;
    private String conteudo;

    //getters e setters
    public Long getId() {
        return id;
    }   

    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getAno_lancamento() {
        return ano_lancamento;
    }

    public void setAno_lancamento(String ano_lancamento) {
        this.ano_lancamento = ano_lancamento;
    }
    
    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Catalago(){}

    public Catalago(String titulo,  
        String plataforma, String ano_lancamento,
        int nota,String status){
            this.titulo=titulo;
            this.plataforma=plataforma;
            this.ano_lancamento=ano_lancamento;
            this.nota=nota;
            this.status=status;
        }   
}
