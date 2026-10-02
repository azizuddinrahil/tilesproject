import java.io.File;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class TilesProject {
    public static void main(String[] args) throws IOException {

//        Scanner inputArea = new Scanner(System.in);
//        System.out.print("Enter room area: ");
//        int roomArea = inputArea.nextInt();

        int[] tileWidth = new int[9];
        tileWidth[0]=2;
        tileWidth[1]=3;
        tileWidth[2]=4;
        tileWidth[3]=5;
        tileWidth[4]=6;
        tileWidth[5]=7;
        tileWidth[6]=8;
        tileWidth[7]=9;
        tileWidth[8]=10;


        int[] tileLength= new int [9];
        tileLength[0]=2;
        tileLength[1]=3;
        tileLength[2]=4;
        tileLength[3]=5;
        tileLength[4]=6;
        tileLength[5]=7;
        tileLength[6]=8;
        tileLength[7]=9;
        tileLength[8]=10;

        int[] tileArea = new int[9];
        tileArea[0]=36;
        tileArea[1]=48;
        tileArea[2]=56;
        tileArea[3]=60;
        tileArea[4]=72;
        tileArea[5]=70;
        tileArea[6]=64;
        tileArea[7]=54;
        tileArea[8]=40;

        int[] tilePrice = new int[9];
        tilePrice[0]=100;
        tilePrice[1]=150;
        tilePrice[2]=180;
        tilePrice[3]=200;
        tilePrice[4]=250;
        tilePrice[5]=300;
        tilePrice[6]=350;
        tilePrice[7]=400;
        tilePrice[8]=450;

        Scanner sc = new Scanner(System.in);


        for (int i = 1; i <= 5; i++) {
            System.out.println((i + ". " + (i + 1) + "x" + (i + 1)));
        }

        System.out.println("Enter your option:");
        int option = sc.nextInt();

        if (option >= 1 && option <= 5) {
            int size = option + 1;
            System.out.println("You selected " + size + "x" + size);
        } else {
            System.out.println("Invalid option");
        }
        sc.close();



        BufferedWriter  br1 = new BufferedWriter(new FileWriter("abc.csv"));
        String firstLine = "Tile size, Tile length, Tile width, Tile price";
        br1.write(firstLine);
        br1.newLine();
        String secondLine = "30,40,50,60";
        br1.write(secondLine);
        br1.newLine();
        String thirdLine = "20,30,40,50";
        br1.write(thirdLine);
        br1.newLine();



        String[] firstLineArray = firstLine.split(", ");
        System.out.println((firstLineArray));
        System.out.println(firstLineArray[0]);
        System.out.println(firstLineArray[1]);
        System.out.println(firstLineArray[2]);
        System.out.println(firstLineArray[3]);

        //String[] secondLineArray =
//        br1.newLine();
//        br1.write("20, 30, 23, 20");
//        br1.newLine();
//        br1.write("30, 50, 33, 30");

        br1.close();




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
