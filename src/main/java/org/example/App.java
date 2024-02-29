package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        for (int i = 1; i <= 100; i++) {
            System.out.println(fb(i));
        }
//        System.out.println( "Hello World!" );
    }
    public static String fb(int i){
        if (i% 3==0&& i%5==0) {
            return "FizzBuzz";
        }
        else if (i % 3 == 0) {
                return "Fizz";
            }

        else if (i % 5 == 0){
            return "Buzz";
        }
        else return Integer.toString(i);
    }
}
