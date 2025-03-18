import java.util.*;

public class Testing 
{

    private static final Map<String, Integer> numberMap = new HashMap<>();

    static 
    {

        numberMap.put("zero",0);
        numberMap.put("one",1);
        numberMap.put("two",2);
        numberMap.put("three",3);
        numberMap.put("four",4);
        numberMap.put("five",5);
        numberMap.put("six", 6);
        numberMap.put("seven",7);
        numberMap.put("eight",8);
        numberMap.put("nine",9);
        numberMap.put("ten",10);
        numberMap.put("eleven",11);
        numberMap.put("twelve",12);
        numberMap.put("thirteen",13);
        numberMap.put("fourteen",14);
        numberMap.put("fifteen",15);
        numberMap.put("sixteen",16);
        numberMap.put("seventeen",17);
        numberMap.put("eighteen",18);
        numberMap.put("nineteen",19);
        numberMap.put("twenty",20);
        numberMap.put("thirty",30);
        numberMap.put("forty",40);
        numberMap.put("fifty",50);
        numberMap.put("sixty",60);
        numberMap.put("seventy",70);
        numberMap.put("eighty",80);
        numberMap.put("ninety",90);
        numberMap.put("hundred",100);
        numberMap.put("thousand",1000);
        numberMap.put("million", 1000000);

    }


    public static int translator(String input)
    {
        
        String [] words = input.toLowerCase().split("\\s+");
        int current = 0, total = 0;

        for (String word : words)
        {

            if (numberMap.containsKey(word))
            {

                int value = numberMap.get(word);

                if (value == 100 || value == 1000 || value == 1000000)
                {

                    if (current == 0)
                    {
                        
                        current = value;

                    }

                    

                    else if (current > 1000) 
                    {

                        total += current;
                        current = 0;

                    }
                    
                    else
                    {

                        current *= value;

                    }

                }

                else
                {

                    current += value;

                }

            }

            else 
            {

                System.out.println("ERROR: Number words only.......");
                
            }
        }

        total += current;
        return total;

    }

    public static String validation(String prompt)
    {

        Scanner scan = new Scanner(System.in);
        String input = " "; boolean isValid = false;

        while (!isValid)
        {

           
            System.out.print(prompt);
            input = scan.nextLine().trim();
            String [] numbers = input.toLowerCase().split("\\s+");
            boolean isAllValid = true;
            for (String number : numbers)
            {

                if (!numberMap.containsKey(number))
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

                System.out.println("ERROR: Word numbers only");

            }

        }
        
        return input; 
  
    }

    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        String userInput, choice;

        do 
        {

            userInput = validation("Enter a number to words: ");

            int result = translator(userInput);
            System.out.println(result);

            do
            {

                System.out.println("Do you want to re-enter again Yes/NO: ");
                choice = scan.next();

                if (!choice.equalsIgnoreCase("Yes") && !choice.equalsIgnoreCase("No"))
                {

                    System.out.println("ERROR: Yes and No only......");

                }

            } while(!choice.equalsIgnoreCase("Yes") && !choice.equalsIgnoreCase("No"));

        } while(choice.equalsIgnoreCase("Yes"));

        System.out.println("Program Exited........");
        scan.close();
    }
    
}