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
public class Soalan_1 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("ATURCARA MENCARI ISIPADU SEBUAH SFERA");
        
        System.out.print("Jejari sfera adalah: ");
        double jejari = input.nextDouble();
        
        double isipadu;
        if (jejari >= 0){
            isipadu = 4/3*3.142*jejari*jejari*jejari;
                System.out.println("Isipadu bagi sfera yang mempunyai jejari " +jejari+ " adalah " +isipadu);
        }
    }
}
