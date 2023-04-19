package br.com.questao2;

public class AchadoPerdido implements Publicacao{

    public String titulo;
    public String descricao;
    public String foto;
    public String tipo;
    public String local_achado;
    public String data_hora;
    public String status;

    public AchadoPerdido() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLocal_achado() {
        return local_achado;
    }

    public void setLocal_achado(String local_achado) {
        this.local_achado = local_achado;
    }

    public String getData_hora() {
        return data_hora;
    }

    public void setData_hora(String data_hora) {
        this.data_hora = data_hora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String achadoPerdido(){
        return "Título: " + getTitulo() + "\nDescrição:" + getDescricao() + "\nTipo:" + getTipo() + "\nStatus:" + getStatus();
    }

    public String completaDados(){
        return "Foto: " + getFoto() + "\nLocal achado:" + getLocal_achado() + "Data e Hora: " + getData_hora();
    }

    public String buscarTitulo() {
        String newTitulo = getTitulo();
        if (newTitulo == this.titulo) {
            System.out.println(getTitulo() + ", " + getDescricao() + ", " + getLocal_achado());
        } else {
            System.out.println("Não encontrado");
        }
        return newTitulo;
        }

    @Override
    public void visualizarDetalhes() {
        System.out.println(getTitulo() + ", " + getFoto() + ", " + getLocal_achado() + ", " + getTipo() + ", " + getStatus());
    }
}
