import java.util.ArrayList;
import java.util.List;

public class TilesProjectOOP {
    public static void main() {
        Tile[] tiles = new Tile[4];
        tiles[0] = new Tile(2, 2, 9, 10);
        tiles[1] = new Tile(2, 3, 8, 12);
        tiles[2] = new Tile(2, 4, 7, 14);
        tiles[3] = new Tile(1.5f, 1.5f, 10, 12);

        float roomArea = 1200;
        for (int i=0; i<tiles.length; i++) {
            System.out.println("Price for "+tiles[i].tileLength + " x " + tiles[i].tileWidth + " is " + tiles[i].priceFor(roomArea));
        }

    }
}

