import java.io.*;
import java.util.Scanner;

/****
 public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            FileWriter writer = new FileWriter("output.txt");
            String line;
            int x = 0;
            int sum = 0;
            while ((line = reader.readLine()) != null) {
                x += 1;
                sum += Integer.parseInt(line);
            }
            double avg = sum/x;

            String finalAvg = "" + avg;

            File outputFile = new File("output.txt");

            writer.write(finalAvg);

            reader.close();
            writer.close();
            }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
 }
******/
/******
public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            FileWriter writer = new FileWriter("output.txt");
            String line;
            int x = 0;
            int max = 0;
            int min = Integer.MAX_VALUE;
            while ((line = reader.readLine()) != null) {
                if(Integer.parseInt(line) % 2 == 0 && Integer.parseInt(line) >= 0) {
                    if(Integer.parseInt(line) > max){max = Integer.parseInt(line);}
                    if(Integer.parseInt(line) < min){min = Integer.parseInt(line);}
                    x++;
                }
            }
            if(x != 0){
            File outputFile = new File("output.txt");
            writer.write("Max: " + max + "\n");
            writer.write("Min: " + min);
            }
            else{
                System.out.println("Чётных положительных чисел нет в файле");
            }

            reader.close();
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
 *****/