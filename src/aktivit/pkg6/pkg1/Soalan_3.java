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
public class Soalan_3 {
    public static void main(String[] args){
        Scanner taip = new Scanner(System.in);
        
        String nama;
        char kumpdarah;
        String makluman;
        System.out.println("Nama anda");
        nama = taip.nextLine();
        
        System.out.println("kumpulan darah : Taip A/B/O/Z[AB]");
        kumpdarah = taip.next().charAt(0);
        taip.close();
        
        if (kumpdarah=='A'){ 
        } makluman="A dan AB sahaja";
        if (kumpdarah=='B'){ 
        } makluman="B dan AB sahaja";
        if (kumpdarah=='Z'){ 
        } makluman="AB sahaja";
        if (kumpdarah=='O'){ 
          makluman="A, B, AB, dan O";
        }
        
        System.out.println("Nama : " +nama);
        System.out.println("Kumpulan darah : "+kumpdarah);
        System.out.println("Anda boleh menderma kepada " +makluman);
    }
}
