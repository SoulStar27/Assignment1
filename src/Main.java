/*
      Author: Davonte Bertrand-Murrell -  0657468
      Date: Feb, 09, 2021
      Purpose: For Assignment 1: To Calculate Fibonacci Numbers using recursion and iteration & Test the speeds of each method
 */

import java.util.Scanner;

public class Main {

        public static void main(String args[]) {


                                //Prompt user and Get Input for the nth term
            System.out.println("Welcome To The Fibonacci Calculator!");
            System.out.println("Enter The Number Of Sequences You Want To Calculate: ");
            //Take user input as n
            int n = new Scanner(System.in).nextInt();
            System.out.println("These are the Fibonacci Sequences Of " + n + " Terms: ");


                                //Recursion Method - Calculation and speed
            long startTimeRec=  System.nanoTime(); //initialize and start time

            // Execute Fibonacci Calculator for the Recursion Method
            for(int i=1; i<=n; i++){
                System.out.print(fiboSeriesRec(i) +"  ");
            }

            long endTimeRec = System.nanoTime(); // End time for Recursion
            long timeElapsedRec= endTimeRec-startTimeRec; //end time - start time is the duration.
            //Print duration in Milliseconds by dividing nanoseconds by 1000000
            System.out.println("\nElapsed time in Milliseconds for the Recursion Method is: " + timeElapsedRec/1000000);



                                //Iteration Method - Calculation and speed
            long startTimeIte=  System.nanoTime(); //initialize and start time

            //Execute Fibonacci Calculator for the Iteration Method
            for(int i=1; i<=n; i++){
                System.out.print(fiboSeriesIte(i) +"  ");
            }
            long endTimeIte = System.nanoTime(); // End time for Iteration

            long timeElapsedIte= endTimeIte-startTimeIte; // end time - start time is the duration.
            //Print duration in Milliseconds by dividing nanoseconds by 1000000
            System.out.println("\nElapsed time in Milliseconds for the Iteration Method is:  " + timeElapsedIte/1000000);


        }


                                // Recursion Function
// [Citation: https://www.java67.com/2016/05/fibonacci-series-in-java-using-recursion.html]
        public static int fiboSeriesRec(int n) {
            if(n == 1 || n == 2){
                return 1;
            }
            return fiboSeriesRec(n-1) + fiboSeriesRec(n -2);
        }


                                //Iteration Function
// [Citation: https://www.java67.com/2016/05/fibonacci-series-in-java-using-recursion.html]
        public static int fiboSeriesIte(int n){
            if(n == 1 || n == 2){
                return 1;
            }
            int t1 = 1;
            int t2 = 1;
            int sum=1;

            for (int i = 3; i <= n; ++i)
            {
                sum = t1 + t2;
                t1 = t2;
                t2 = sum;
            }
            return sum;

        }

    }
