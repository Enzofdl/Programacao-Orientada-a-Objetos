package Tipos;

public class Revistas extends textual{

    private String vol;
    private String nro;

    public Revistas(String titulo, String org, String ano, String nro, String vol) {
        setTitulo(titulo);
        setResponsavel(org);
        setAno(ano);
        this.nro = nro;
        this.vol = vol;
    }

    public String getVol() {
        return vol;
    }

    public void setVol(String vol) {
        this.vol = vol;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }
}
