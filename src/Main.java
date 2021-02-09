import java.util.Scanner;

public class Main {

        public static void main(String args[]) {

            //input to print Fibonacci series upto how many numbers
            System.out.println("Welcome To The Fibonacci Calculator!");
            System.out.println("Enter The Number Of Sequences You Want To Calculate: ");
            //Take user input as n
            int n = new Scanner(System.in).nextInt();

            System.out.println("These are the Fibonacci Sequences Of " + n + " Terms: ");

            for(int i=1; i<=n; i++){
                System.out.print(fiboSeriesRec(i) +" , ");
            }


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
// [Citation: https://www.programiz.com/java-programming/examples/fibonacci-series ]
        public static int fiboSeriesIte(int n){
            if(n == 1 || n == 2){
                return 1;
            }
            int t1 = 0;
            int t2 = 1;
            int sum=1;

            for (int i = 1; i <= n; ++i)
            {
                sum = t1 + t2;
                t1 = t2;
                t2 = sum;
            }
            return sum;

        }

    }
