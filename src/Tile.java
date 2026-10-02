public class Tile {
    public float tileLength;
    public float tileWidth;
    public int numberOfTilesInABox;
    public float price;

    public Tile(float tileLength, float tileWidth, int numberOfTilesInABox, float price) {
        this.tileLength = tileLength;
        this.tileWidth = tileWidth;
        this.numberOfTilesInABox = numberOfTilesInABox;
        this.price = price;
    }

    public float priceFor(float roomArea) {
        int numberOfBoxesRequired = (int) Math.ceil(roomArea / sqftInABox());
        return numberOfBoxesRequired * sqftInABox() * price;
    }

    private float sqftInABox() {
        return numberOfTilesInABox * tileLength * tileWidth;
    }
}
