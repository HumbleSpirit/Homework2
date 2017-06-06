/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sergey
 */
public class Homework2 {

    public static void drawStars() {
        // Cool ending of task with running asterisks
        char charDraw = '*';
        for (int i = 0; i < 40; i++) {
         System.out.print(charDraw);
            try {
                Thread.sleep(250);
            } catch (InterruptedException ex) {
                Logger.getLogger(Homework2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println(charDraw);
        };
    public static void main(String[] args) {
        
        float firstValue = 0;  
        float secondValue = 0;  
        float thirdValue = 0;  
        double result = 0;
        
        String myString = "";
        
        
        Scanner in = new Scanner(System.in);  
        System.out.println("Task 1");  
        System.out.println("Let's count mean value of two numbers");  
        System.out.println("Please input first value");  
        firstValue = in.nextFloat();  
        //System.out.println("You entered first value "+firstValue);  
        System.out.println("Please input second value");  
        secondValue = in.nextFloat();  
        //System.out.println("You entered second value "+secondValue);  
        result = (firstValue+secondValue)/2.0;
        DecimalFormat df = new DecimalFormat("#.####");
        System.out.println("Mean value of two numbers is " + df.format(result));  
        drawStars();

        
        String notEqualSign = "\u2260";
        System.out.println("Task 2");  
        System.out.println("Let's find a root of linear equation \"ax + b = 0\" ");  
        System.out.println("Please input first value -  (a " + notEqualSign  + " 0)"); 
        firstValue = in.nextFloat();  
        System.out.println("Please input second value");  
        secondValue = in.nextFloat();  
        result = (-secondValue/firstValue);
        System.out.println("Root value of linear equation is " + result);
        drawStars();
        
        System.out.println("Task 3");  
        System.out.println("Let's find a third power of entered number");  
        System.out.println("Please input value "); 
        firstValue = in.nextFloat();  
        //result = (firstValue * firstValue * firstValue);
        result = Math.pow(firstValue, 3);
        System.out.println("Third power of entered number is " + result);
        drawStars(); 
                
        System.out.println("Task 4");  
        System.out.println("Let's find - do you have a lucky ticket");  
        System.out.println("Please input line of 6 digits from your ticket ");
        Scanner inp = new Scanner(System.in);  
        myString = inp.nextLine();
        //Парсинг строки в числа по позициям - '0' - код символа, равный 48
        int a = myString.charAt(0)- '0';
        int b = myString.charAt(1)- '0';
        int c = myString.charAt(2)- '0';
        int d = myString.charAt(3)- '0';
        int e = myString.charAt(4)- '0';
        int f = myString.charAt(5)- '0';
        //int summLeft = 0;
        //int summRight = 0;
        //summLeft = (a + b + c);
        //summRight = (d + e + f);
        if (( a + b + c )==( d + e + f )) {
            System.out.println("You've got a lucky ticket");
        }
            else {
                System.out.println("Your ticket is not lucky");
        }
        drawStars();
            
        System.out.println("Task 5");  
        System.out.println("International statute Mile to kilometer converter");  
        System.out.println("Please input distance in miles ");
        firstValue = in.nextFloat();
        //Строгая типизация. Необходимо приведение аргумента к типу double 
        //для получения нужного типа данных в результате
        result = firstValue * (25146 / (float)15625);
        System.out.println(firstValue + " miles is exact equal to "+ result +" kilometers");
        drawStars();
        
        System.out.println("Task 6");  
        System.out.println("Let's find an age of user");  
        System.out.println("Please input user's year of birth ");
        firstValue = in.nextFloat();
        System.out.println("Please input needed (current) year");
        secondValue = in.nextFloat();
        result = secondValue - firstValue;
        System.out.println("User age is " + result + " years");
        drawStars();
        
        System.out.println("Task 7");  
        System.out.println("Let's find a percent from summ");  
        System.out.println("Please input sum total ");
        firstValue = in.nextFloat();
        System.out.println("Please input needed percent");
        secondValue = in.nextFloat();
        result = (firstValue * secondValue)/100;
        System.out.println("Value of percent is " + result);
        drawStars();
        
        System.out.println("Task 8");  
        System.out.println("Let's find a diameter of circle from known circle perimeter");  
        System.out.println("Please input length in centimeteres");
        firstValue = in.nextFloat();
        result = firstValue / Math.PI;
        System.out.println("Value of diameter is " + result + " cm");
        drawStars();
        
        System.out.println("Task 9");  
        System.out.println("Let's count amount of entered number of banknotes and their values");  
        System.out.println("Please input number of banknotes of first value");
        firstValue = in.nextInt();
        System.out.println("Please input value of banknote denomination for first value");
        a = in.nextInt();
        System.out.println("Please input number of banknotes of second value");
        secondValue = in.nextInt();
        System.out.println("Please input value of banknote denomination for second value");
        b = in.nextInt();
        System.out.println("Please input number of banknotes of third value");
        thirdValue = in.nextInt();
        System.out.println("Please input value of banknote denomination for third value");
        c = in.nextInt();
        result = ((firstValue * a) + (secondValue * b) + (thirdValue * c));
        System.out.println("Total amount of money in your hand is: " + (int)result);
        drawStars();
        
                
    }
    
}
