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
            
            // Annetaan käyttäjälle ohjeet ohjelman käyttämiseen ja esitellään BW ja FW
            System.out.println("Anna merkkijonoja, kun haluat lopettaa syötä tyhjä merkkijono \n");
            BufferedWriter out = new BufferedWriter(new FileWriter("kissa.txt"));
            
            // Syötetty uusi rivi luetaan stringiin text, ja kirjoitetaan tekstitiedostoon
            // Niin kauan kunnes arvo ei ole "" eli tyhjä rivi.
            while(!"".equals(text)) {
            text = sc.nextLine();
            out.write(text);
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