/*
* Author @Mythe
* Date 10.2.2015
*/

package fi.jamk;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Tehtava2 {
    public static void main(String args[]) {
    {   
        try {
            
            // Luodaan tyhjä merkkijono nimeltä text ja scanneri
            String text = null;
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Anna merkkijonoja, kun haluat lopettaa syötä tyhjä merkkijono \n");
            BufferedWriter out = new BufferedWriter(new FileWriter("kissa.txt"));
            
            while(!"".equals(text)) {
            text = sc.nextLine();
            out.write(text);
            out.newLine();
            }
            
            out.close();
        }
        catch (IOException e)
        {
            System.out.println("Exception ");       
        }
            }

    }
}
