import java.io.File;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class TilesProject {
    public static void main(String[] args) throws IOException {

//        Scanner inputArea = new Scanner(System.in);
//        System.out.print("Enter room area: ");
//        int roomArea = inputArea.nextInt();

        class Tile {

            int width;
            int length;
            int area;
            int price;

            public Tile(int width, int length, int area, int price) {
                this.width = width;
                this.length = length;
                this.area = area;
                this.price = price;
            }

        }

        Tile tile1 = new Tile(2, 2, 36, 100);
        Tile tile2 = new Tile(3, 3, 48, 150);
        Tile tile3 = new Tile(4, 4, 56, 180);



        Scanner sc = new Scanner(System.in);

        System.out.println("Enter room width:");
        int roomWidth = sc.nextInt();

        System.out.println("Enter room length:");
        int roomLength = sc.nextInt();

        int roomArea = roomWidth * roomLength;

        System.out.println("Room area: " + roomArea);

        System.out.println("\nChoose a tile:");
        System.out.println("1. 2x2 - ₹100");
        System.out.println("2. 3x3 - ₹150");
        System.out.println("3. 4x4 - ₹180");

        int tileChoice = sc.nextInt();

        int tilePrice = 0;

        switch (tileChoice) {
            case 1:
                tilePrice = tile1.price;
                break;

            case 2:
                tilePrice = tile2.price;
                break;

            case 3:
                tilePrice = tile3.price;
                break;

            default:
                System.out.println("Invalid tile choice");
        }

        int tileArea = 0;

        switch (tileChoice) {
            case 1:
                tileArea = tile1.area;
                break;

            case 2:
                tileArea = tile2.area;
                break;

            case 3:
                tileArea = tile3.area;
                break;
        }

        int numberOfTiles = (int) Math.ceil((double) roomArea / tileArea);

        int roomCost = numberOfTiles * tilePrice;

        System.out.println("Number of tiles required: " + numberOfTiles);
        System.out.println("Cost for this room: ₹" + roomCost);







//        BufferedWriter  br1 = new BufferedWriter(new FileWriter("abc.csv"));
//        String firstLine = "Tile size, Tile length, Tile width, Tile price";
//        br1.write(firstLine);
//        br1.newLine();
//        String secondLine = "30,40,50,60";
//        br1.write(secondLine);
//        br1.newLine();
//        String thirdLine = "20,30,40,50";
//        br1.write(thirdLine);
//        br1.newLine();



//        String[] firstLineArray = firstLine.split(", ");
//        System.out.println((firstLineArray));
//        System.out.println(firstLineArray[0]);
//        System.out.println(firstLineArray[1]);
//        System.out.println(firstLineArray[2]);
//        System.out.println(firstLineArray[3]);

        //String[] secondLineArray =
//        br1.newLine();
//        br1.write("20, 30, 23, 20");
//        br1.newLine();
//        br1.write("30, 50, 33, 30");

        //br1.close();




        FileReader fileReader = new FileReader("abc.csv");
        BufferedReader buffReader = new BufferedReader(fileReader);

//
//        while(true){
//            int letter = buffReader.read();
//            if (letter == -1){
//                break;
//            }
//            else {
//                System.out.println(letter);
//                System.out.println((char) letter);
//            }
//        }
//
//
//        String line;
//        while ((line = buffReader.readLine()) != null) {
//            System.out.println(line);
//        }
//        buffReader.close();






//        for(int i=0; i<tileArea.length; i++) {
//            int numberOfBoxes = roomArea / tileArea[i];
//            if (roomArea % tileArea[i] != 0) {
//                numberOfBoxes = numberOfBoxes + 1;
//            }
//            int amount = numberOfBoxes * tilePrice[i];
//            System.out.println("Tile box Size: " + tileLength[i] + "x" + tileWidth[i]);
//            System.out.println("Number of boxes required "  + numberOfBoxes);
//            System.out.println("Total amount: " +amount);
//
//        }

    }
}
