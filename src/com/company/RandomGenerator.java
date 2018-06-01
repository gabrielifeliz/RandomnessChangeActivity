package com.company;

/* RandomGenerator.java
    The following code, our program from last time, generates a random number between 1 and 6, inclusive.
     Change the code to generate a random integer between 5 and 95.
 */

import java.util.Random;

public class RandomGenerator{
    public static void main(String[] args)
    {
        // Change "1 and 6"" to "5 to 95"
        output("Generate 10 random integers between 5 and 95");

        Random rnd = new Random();

        for (int i = 1; i <= 10; ++i)
        {
            // "5" represents the initial integer in the interval
            /* "90" inside the nextInt method from the Random object represents
                the length of the interval.
                  For instance, the interval length is 90 from 5 to 95,
                   which is the interval asked.
            */
            int randomInt = 5 + rnd.nextInt(90);
          output("Generated number: " + randomInt);
        }

        output("Done.");
    }

    private static void output(String aMessage)
    {
        System.out.println(aMessage);
    }
}
