
package fi.jamk; 

import java.io.BufferedReader;
import java.io.FileReader;

/** 
 * 
 * @author Mythe 
 */ 

public class Tehtava3 {
public static void main(String args[]) {
    {
        try{
            // Esitellään uusi stringi johon tallennetaan merkkijonot tekstitiedostosta
              String s = null;
              BufferedReader out = new BufferedReader(new FileReader("kissa.txt"));
              
              // Stringi s tulostaa merkkijonon bufferoidusta tekstitiedososta niin kauan kunnes arvo ei ole null
              while(( s = out.readLine()) != null) {
                  System.out.println(s); 
              }

              } catch(Exception e){
              System.out.println("Tapahtui poikkeus");
            }
        }
    }
}

