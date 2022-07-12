import java.io.*;

public class Read_And_Write_File {

    public static void main(String[] args) {
        try {
            int num;
            String text;
            File F = new File("File.txt");
            FileWriter OFile = new FileWriter("Odd.txt");
            FileWriter EFile = new FileWriter("Even.txt");
            BufferedReader BR = new BufferedReader(new FileReader(F));
            BufferedWriter Odd = new BufferedWriter(OFile);
            BufferedWriter Even = new BufferedWriter(EFile);
            while ((text = BR.readLine()) != null) {
                num = Integer.parseInt(text);
                if (num % 2 == 0) {
                    Even.write(text + "\n");
                } else {
                    Odd.write(text + "\n");
                }
            }
            BR.close();
            Odd.close();
            Even.close();
            System.out.println("Operation Completed");
        } catch (IOException | NumberFormatException e) {
            System.out.println(e.toString());
        }
    }
}
