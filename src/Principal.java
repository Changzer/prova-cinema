public class Principal {
    public static void main(String[] args) {
        System.out.println("Filmes e Categorias");

        Categorias cat1 = new Categorias(1,"Sci-Fi");
        Categorias cat2 = new Categorias(2,"Romance");
        Categorias cat3 = new Categorias(3,"Comedia");

        Filmes fil1 = new Filmes(1,"Star Wars",cat1);
        Filmes fil2 = new Filmes(2,"Loucademia de Policia", cat3);

        System.out.println(fil1.getNomeFilme() + " - " + fil1.getNomeCat());
    }
}
