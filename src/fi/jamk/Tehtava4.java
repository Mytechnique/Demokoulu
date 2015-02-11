package fi.jamk; 

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/** 
 * 
 * @author Mythe 
 */ 

public class Tehtava4 {
    public static void main(String args[]) throws FileNotFoundException, IOException {
    {   
        float f;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        try {
           
            System.out.println("Anna merkkijonoja, kun haluat lopettaa syötä tyhjä merkkijono \n");
            try ( 
                DataOutputStream out = new DataOutputStream(new FileOutputStream("integerit.txt") ); DataOutputStream out2 = new DataOutputStream(new FileOutputStream("floatit.txt") )) {
                
                // Niin kauan kunnes syöttö on joko Int tyyppinen luku tai Float tyyppinen luku
                while(sc.hasNextInt() || sc.hasNextFloat()) {
                if(! sc.hasNextInt()) {
                  f = sc.nextFloat();
                  out2.writeFloat(f);
                } else
                    i = sc.nextInt();
                    out.writeInt(i);
               
                }
                out.close();
                out2.close();
            }
        }
    
        catch (IOException e)
        {
            System.out.println("Exception ");       
        }
            
        }
    }
}
   

    


