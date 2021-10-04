public class Filmes {
    private long idFilme;
    private String nomeFilme;
    private Categorias nomeCat;

    public Filmes() {
    }

    public Filmes(long idFilme, String nomeFilme, Categorias nomeCat) {
        this.idFilme = idFilme;
        this.nomeFilme = nomeFilme;
        this.nomeCat = nomeCat;
    }

    public long getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(long idFilme) {
        this.idFilme = idFilme;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public Categorias getNomeCat() {
        return nomeCat;
    }

    public void setNomeCat(Categorias nomeCat) {
        this.nomeCat = nomeCat;
    }

    @Override
    public String toString() {
        return "Filmes{" +
                "idFilme=" + idFilme +
                ", nomeFilme='" + nomeFilme + '\'' +
                ", nomeCat=" + nomeCat +
                '}';
    }
}
