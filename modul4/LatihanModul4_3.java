package modul4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Lenovo
 */
public class LatihanModul4_3 {
    public static void main (String[] args ){
        int number1 = 10;
        int number2 = 23;
        int number3 = 5;
        int score = 0;
        
        score = (number2 > number3)?(number2>number1)?number2:number1:number3;
        
        System.out.println("number 1 = "+number1);
        System.out.println("number 2 = "+number2);
        System.out.println("number 3 = "+number3);
        System.out.println("nilai tertingginya = "+score);
    }
}
