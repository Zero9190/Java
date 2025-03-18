import java.util.*;
public class Experiment 
{
  
  private static final Map<String, Integer> numbers = new HashMap<>();
  
    static 
    {

      numbers.put("zero", 0);
      numbers.put("one", 1);
      numbers.put("two", 2);
      numbers.put("three", 3);
      numbers.put("four", 4);
      numbers.put("five", 5);
      numbers.put("six", 6);
      numbers.put("seven", 7);
      numbers.put("eight", 8);
      numbers.put("nine", 9);
      numbers.put("ten", 10);
      numbers.put("eleven", 11);
      numbers.put("twelve", 12);
      numbers.put("thirteen", 13);
      numbers.put("fourteen", 14);
      numbers.put("fifteen", 15);
      numbers.put("sixteen", 16);
      numbers.put("seventeen", 17);
      numbers.put("eighteen", 18);
      numbers.put("nineteen", 90);
      numbers.put("twenty", 20);
      numbers.put("thirty", 30);
      numbers.put("forty", 40);
      numbers.put("fifty", 50);
      numbers.put("sixty", 60);
      numbers.put("seventy", 70);
      numbers.put("eighty", 80);
      numbers.put("ninety", 90);
      numbers.put("hundred", 100);
      numbers.put("thousand", 1000);
      numbers.put("million", 1000000);

    }

  public static int wordsToNumber(String input)
  {

    String [] words = input.toLowerCase().split("\\s+");
    int current =0, total = 0;

    for(String word : words)
    {

      if (numbers.containsKey(word))
      {

        int value = numbers.get(word);

        if (value == 100)
        {

        current *= value;

        }

        else if (value == 1000 || value == 1000000)
        {

          total += current *= value;
          current = 0;

        }

        else 
        {

          current += value;

        }

      }

    }

    total += current;
    return total;

  }

  public static String checker(String prompt)
  {

    Scanner scan = new Scanner(System.in); 
    String  input = ""; 
    boolean isValid = false;

    while (!isValid)
    {

      System.out.print(prompt);
      input = scan.nextLine().trim();   
  
      String [] nums = input.toLowerCase().split("\\s+");
      boolean isAllValid = true;
      for (String num : nums)
      {

        if (!numbers.containsKey(num))
        {

          isAllValid = false;
          break;

        }

      }

      if (isAllValid)
      {

        isValid = true;

      }

      else 
      {

        System.out.println("ERROR: Word number only........");

      }

  }

  return input;

  }


  public static void main(String[] args)
  {

    Scanner scan = new Scanner(System.in);
    String userInput,  choice = " "; int result;

    do 
    {

      userInput = checker("Enter a number in words: ");

      result = wordsToNumber(userInput);
      System.out.println(result);

      do 
      {

        System.out.print("Do you want te re-enter again - Yes/No: ");
        choice = scan.next();

        if (!choice.equalsIgnoreCase("Yes") && !choice.equalsIgnoreCase("No"))
        {

          System.out.println("ERROR: Yes / No only......");

        }
        
      } while (!choice.equalsIgnoreCase("Yes") && !choice.equalsIgnoreCase("No"));

    } while (choice.equalsIgnoreCase("Yes"));

    System.out.println("Program Exited.......");
    scan.close();

  }

}
