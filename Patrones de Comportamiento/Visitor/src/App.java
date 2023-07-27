public class App {

    public static void main(String[] args) {
        Artwork painting = new Painting();
        Artwork sculpture = new Sculpture();

        ArtworkCollection artworkCollection = new ArtworkCollection();
        artworkCollection.addArtwork(painting);
        artworkCollection.addArtwork(sculpture);

        ArtworkVisitor priceCalculator = new VisitorPriceCalculator();
        ArtworkVisitor styleAnalyzer = new VisitorStyleAnalyzer();

        // Se pasa el visitante "priceCalculator" a la colección para calcular precios
        artworkCollection.accept(priceCalculator);

        System.out.println();

        // Se pasa el visitante "styleAnalyzer" a la colección para analizar estilos
        artworkCollection.accept(styleAnalyzer);
    }
}
