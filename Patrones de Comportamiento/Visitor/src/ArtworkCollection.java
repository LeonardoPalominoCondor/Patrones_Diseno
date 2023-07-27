import java.util.ArrayList;
import java.util.List;

class ArtworkCollection {
    private List<Artwork> artworks = new ArrayList<>();

    public void addArtwork(Artwork artwork) {
        artworks.add(artwork);
    }

    public void removeArtwork(Artwork artwork) {
        artworks.remove(artwork);
    }

    // Método que acepta un visitante y llama al método "accept" de cada obra de arte
    public void accept(ArtworkVisitor visitor) {
        for (Artwork artwork : artworks) {
            artwork.accept(visitor);
        }
    }
}