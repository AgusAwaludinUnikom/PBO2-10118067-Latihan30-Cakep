/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan30.cakep;

import java.util.Scanner;
/**
 *
 *  Agus Awaludin
 *  IF2
 *  10118067
 *  Latihan ini besisi tentang pertanyaan apakah kita mengerjakan latihan
 *  sendiri atau dibantu teman hehe
 */
public class PBO210118067Latihan30Cakep {

    /**
     * @param args the command line arguments
     */
    
    public static final String  RESET                = "\u001B[0m";
    public static final String  BLACK               = "\u001B[30m";
    public static final String  RED                 = "\u001B[31m";
    public static final String  GREEN               = "\u001B[32m";
    public static final String  YELLOW              = "\u001B[33m";
    public static final String  BLUE                = "\u001B[34m";
    public static final String  MAGENTA             = "\u001B[35m";
    public static final String  CYAN                = "\u001B[36m";
    public static final String  WHITE               = "\u001B[37m";
 

    
    public static void main(String[] args) {
    
        System.out.println(RED + "Kamu " + GREEN +"ngerjain sendiri "
            + YELLOW +"latihan 17 sampe " + BLUE +"latihan 30 ini? ");
        System.out.print(BLUE +"Jawab" + RED + "(Yoi/Enggak) : ");
        Scanner scanner = new Scanner(System.in);
        
        String jawab = scanner.next();
        
        if(jawab.toLowerCase().equals("yoi")){
            System.out.println(RED + "Cakep Bener. "+ MAGENTA + "Good Job");
        }
            else {
                System.out.println(RED +"Tetep cakep sih.");
                System.out.println(CYAN +"Sing penting paham konsep nya yee.");
                System.out.println(BLACK +"Keep the code works dude");
                    }
            
        
    }
    
}
