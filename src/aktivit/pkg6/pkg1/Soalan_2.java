/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktivit.pkg6.pkg1;

/**
 *
 * @author Dell
 */
import java.util.Scanner;
public class Soalan_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char sains;
        char math;
        
        System.out.println("Apakah Gred bagi Math:[A/B/C/D/E/G]");
             sains = input.next().charAt(0);
        System.out.println("Apakah gred bagi Sains:[A/B/C/D/E/G]");
              math = input.next().charAt(0);
              
        if (sains==math)
            System.out.println("Gred yang diperolehi sama");
        if (sains!=math) //also CORRECT>
            System.out.println("Gred yang diperolehi tidak sama");
            
    }
}
