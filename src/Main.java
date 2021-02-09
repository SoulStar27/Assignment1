import java.util.Scanner;

public class Main {




        public static void main(String args[]) {

            //input to print Fibonacci series upto how many numbers
            System.out.println("Welcome To The Fibonacci Calculator!");
            System.out.println("Enter The Number Of Sequences You Want To Calculate: ");

            int n = new Scanner(System.in).nextInt();

            System.out.println("Fibonacci series upto " + n +" numbers : ");
            //printing Fibonacci series up to number
            for(int i=1; i<=n; i++){
                System.out.print(fiboSeriesIte(i) +" ");
            }


        }


                                // Recursion Function
        public static int fiboSeriesRec(int n){
            if(n == 1 || n == 2){
                return 1;
            }

            return fiboSeriesRec(n-1) + fiboSeriesRec(n -2);
        }
dsd

        //Iteration Function
        public static int fiboSeriesIte(int n){
            if(n == 1 || n == 2){
                return 1;
            }

            int t1 = 0;
            int t2 = 1;
            int sum=1;

            for (int i = 1; i <= n; ++i)
            {
                System.out.print(t1 + " , ");

                sum = t1 + t2;
                t1 = t2;
                t2 = sum;

            }
            return sum;

        }

    }
