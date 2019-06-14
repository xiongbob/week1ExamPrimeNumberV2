/*
 Write an application that will generate a random number between 1 and 250 and
 she the prime number with the range between 1 and the random number for Option 2.
 */

import java.util.Random;

public class PrimeNumberV2 {

    public static void main(String[] args) {

        int i;
        int num = 0;
        boolean isPrime = true;

            Random r = new Random();
            int maxCheck = 1 + r.nextInt(250);
            System.out.println("The random number = " + maxCheck);

            //Empty String
            String primeNumbersFound = "";

            //Start loop 1 to maxCheck
            for (i = 1; i <= maxCheck; i++) {
                isPrime = CheckPrime(i);
                if (isPrime) {
                    primeNumbersFound = primeNumbersFound + i + " ";
                }
            }
            System.out.println("Prime numbers from 1 to " + maxCheck + " are:");
            // Print prime numbers from 1 to maxCheck
            System.out.println(primeNumbersFound);
        }
        public static boolean CheckPrime ( int numberToCheck){
            int remainder;
            for (int i = 2; i <= numberToCheck / 2; i++) {
                remainder = numberToCheck % i;
                //if remainder is 0 than numberToCheckber is not prime and break loop. Elese continue loop
                if (remainder == 0) {
                    return false;
                }
            }
            return true;
    }
}