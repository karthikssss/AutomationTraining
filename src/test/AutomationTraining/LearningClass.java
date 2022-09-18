package AutomationTraining;

import org.testng.annotations.Test;

import java.util.*;

public class LearningClass {
    int fibonacciSeries;
    @Test(enabled = false)
    public void ReverseAString()
    {
        String name="Pradap";
       StringBuilder input= new StringBuilder(name);
         System.out.println(input.reverse());


         String myname = "Test of Name";
         char test[]=myname.toCharArray();

         for(int i =test.length-1;i>=0;i--)
         {
             System.out.print(test[i]);
         }
    }

    @Test(enabled = false)
    public void swapNumber()
    {
        int a=20;
        int b=30;

        System.out.println("a :"+a);
        System.out.println("b :"+b);
    }

    public static boolean isVowelsPresent(String name)
    {
        return name.matches(".*[aeiouAEIOU].*");
    }

    public  boolean isPrimeNumber(int number)
    {
        if(number==0 || number==1)
        {
            return false;
        }
        if (number==2)
        {
            return true;
        }

        for(int i=2;i<=number/2;i++)
        {
            System.out.println("i value is "+i);
            System.out.println("actual number : "+number);
            System.out.println("actual number divide by 2 : "+number/2);
            if(number%i==0)
            {
                System.out.println("number remainder equal to - "+number%i);
                return false;
            }
        }
        return true;
     }

    @Test(enabled = false)
    public void checkIfVowelsPresentInString()
    {
        String sentenceName= "Pradap";

        if(isVowelsPresent(sentenceName)==true)
        {
            System.out.println("its a Vowel");
        }
        else {
            System.out.println("Its not a Vowel");
        }

     }

     @Test(enabled = false)
    public void isPrimeNumber()
     {
         System.out.println(isPrimeNumber(11));
     }

     @Test(enabled = false)
    public void generateFibonacciSeries()
     {

          fibonacciSeries = 4;
          int finalValue=fibonacciSeries;
         for (int i=fibonacciSeries;i>=1;i--)
         {
              fibonacciSeries=fibonacciSeries+i;
          }
         System.out.println(fibonacciSeries-finalValue);

     }

     @Test(enabled = false)
    public void removeWhitespace()
     {
         String spaceName=" Indian Army ";
         StringBuilder stringBuilder= new StringBuilder("Indian Army");
         System.out.println(stringBuilder);
         System.out.println(spaceName);
         System.out.println(spaceName.replace(" ",""));
         System.out.println(spaceName.trim());
      }

      @Test
    public void sortArray()
      {
          int [] numbers={4,2,66,78,84,3};
          System.out.println(Arrays.toString(numbers));
          Arrays.sort(numbers);
          System.out.println(Arrays.toString(numbers));
           System.out.println(Arrays.toString(numbers));

          Integer[] arr2 = new Integer[] {54,432,53,21,43};
          Arrays.sort(arr2, Comparator.reverseOrder());
          System.out.println(Arrays.toString(arr2));
      }
}
