public class Categorias {
    private long idCat;
    private String nomeCat;

    public Categorias() {
    }

    public Categorias(long idCat, String nomeCat) {
        this.idCat = idCat;
        this.nomeCat = nomeCat;
    }

    public long getIdCat() {
        return idCat;
    }

    public void setIdCat(long idCat) {
        this.idCat = idCat;
    }

    public String getNomeCat() {
        return nomeCat;
    }

    public void setNomeCat(String nomeCat) {
        this.nomeCat = nomeCat;
    }

    @Override
    public String toString() {
        return "Categorias{" +
                "idCat=" + idCat +
                ", nomeCat='" + nomeCat + '\'' +
                '}';
    }
}
