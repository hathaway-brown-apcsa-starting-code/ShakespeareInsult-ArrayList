/**
 *  Creates a whole mess of Shakespearean insults,
 *  two adjectives followed by a noun.
 *  
 *  Precondition:
 *      Three files exist, each holding NUM_WORDS words.  
 *      File Names: 
 *        shakespeare-1.txt  (adjectives)
 *        shakespeare-2.txt  (adjectives)
 *        shakespeare-3.txt  (nouns)
 */

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class ShakespeareInsult
{
  // Declare three ArrayLists of Strings to hold the words
  
  
  /** Constructor gets insulting words from files  */
  public ShakespeareInsult()
  {
    // Initialize the ArrayLists for words and read the words from the files
    
  }
  
  // Reads words from a file (one word per line).
  // Stores the words in the String ArrayList wordList.
  // If the file doesn't exist, exits the program with an error message.
  private ArrayList<String> readFile (String fileName)
  {
    // open the file
    File file = new File(fileName);
    ArrayList wordList = new ArrayList<String>();
    Scanner input = null;
    try
    {
        input = new Scanner(file);
    }
    catch (FileNotFoundException ex)
    {
        System.out.println("*** Cannot open " + fileName + " ***");
        System.exit(1);        // quit the program
    } 

    // read the words from the file, one per line
    while (input.hasNext())
    {
      wordList.add(input.nextLine());
    }
    
    input.close();
    return wordList;
  }
  
  /**
   * Creates a Shakespearean insult based on three lists of 
   * insulting words.
   * @return a Shakespearean insult  
   */
  public String getInsult()
  {
     return "This is for you to implement ...";
  }
  
  /**  Main program.
    *  Loads the word lists; asks the user how many insults to generate.
    */
  public static void main (String[] args)
  {
    Scanner keyboard = new Scanner (System.in);
    ShakespeareInsult insultList = new ShakespeareInsult();
    
    System.out.print("How many insults? ");
    int numInsults = keyboard.nextInt();
    
    for (int i = 0; i < numInsults; i++) 
    {
      System.out.println (insultList.getInsult());
    }
    
    keyboard.close();
  }
}
