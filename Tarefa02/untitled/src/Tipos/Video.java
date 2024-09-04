package Tipos;

public class Video{

    private int duracaosegundos;
    private String titulo;
    private String responsavel;

    public Video(String titulo, String autor, int duracaosegundos) {
        setTitulo(titulo);
        setResponsavel(autor);
        this.duracaosegundos = duracaosegundos;
    }


    public int getDuracaosegundos() {
        return duracaosegundos;
    }

    public void setDuracaosegundos(int duracaosegundos) {
        this.duracaosegundos = duracaosegundos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
}
