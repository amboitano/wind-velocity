/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author amandamoreno
 */
public class Main {
    
    public static void main(String[] args) {
       ArrayList<Integer> velocity = new ArrayList(Arrays.asList(5,10,15,20,25,30));
       ArrayList<Integer> temp = new ArrayList(Arrays.asList(-20,-15,-10,-5,0,5,10,15));
       int velocityIndex = -1;
       int tempIndex = -1;
       int[][] table = {
           {-26,-46,-58,-67,-74,-79},
           {-21,-40,-51,-60,-66,-71},
           {-15,-34,-45,-53,-59,-64},
           {-10,-27,-38,-46,-51,-56},
           {-5,-22,-31,-39,-44,-49},
           {0,-15,-25,-31,-36,-41},
           {7,-9,-18,-24,-29,-33},
           {12,-3,-11,-17,-22,-25}
       };
       
       while (tempIndex == -1) {
           System.out.println("Enter Temp");
           Scanner scanner = new Scanner(System.in);
           Integer tempInput = scanner.nextInt();
           tempIndex = temp.indexOf(tempInput);
           if (tempIndex == -1) {
               System.out.println(String.format("Please enter one of the following values %s", Arrays.toString(temp.toArray())));
           }
       }
       
       while (velocityIndex == -1) {
           System.out.println("Enter Velocity");
           Scanner scanner = new Scanner(System.in);
           Integer velocityInput = scanner.nextInt();
           velocityIndex = velocity.indexOf(velocityInput);
           if (velocityIndex == -1) {
               System.out.println(String.format("Please enter one of the following values %s", Arrays.toString(velocity.toArray())));
           }
       }
       
       int windchill = table[tempIndex][velocityIndex];
       System.out.println(String.format("The windchill is %s", windchill));
    }
    
}
