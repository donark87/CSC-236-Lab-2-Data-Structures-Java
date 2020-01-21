//Donark Patel
//CSC-236
//Lab 2B
//Application: Note
//Date: 09/29/2018

import java.util.*;
import java.math.*;
public class NoteMain
{
    public static void main(String[] args)
    {

      int value;
      String length;
      int tempLength;


       Scanner userInput = new Scanner(System.in);


       System.out.println("Please enter a value for your note\n"+
                         "between -48 and 39:");
      value = userInput.nextInt();


      while(value < -48 || value > 39)
      {
         System.out.println("Please enter a valid value for your note between -48 and 39:");

         value = userInput.nextInt();
      }
      System.out.println("Please enter the number between 1-5\n" +
                         "1 - Whole\n" +
                         "2 - Half\n" +
                         "3 - Quarter\n" +
                         "4 - Eighth\n" +
                         "5 - Sixteenth");
      tempLength = userInput.nextInt();
      while(tempLength > 5 || tempLength < 1)
      {
         System.out.println("Please enter the number between 1-5\n" +
                         "you would like to represent\n" +
                         "the length of your note.\n"+
                         "1. Whole\n" +
                         "2. Half\n" +
                         "3. Quarter\n" +
                         "4. Eighth\n" +
                         "5. Sixteenth");
         tempLength = userInput.nextInt();
      }


      if(tempLength == 1)
      {
         length = "whole";
      }
      else if(tempLength == 2)
      {
         length = "half";
      }
      else if(tempLength == 3)
      {
         length = "quarter";
      }
      else if(tempLength == 4)
      {
         length = "eighth";
      }
      else if(tempLength == 5)
      {
         length = "sixteenth";
      }
      else
      {
         length = "Invalid";
      }
      Note demoNote = new Note(value, length);


      System.out.println("Value: " + demoNote.getValue());
      System.out.println("Length: " + demoNote.getLength()+"\n\n");
      System.out.println("Letter: " + demoNote.getLetter());
      System.out.println("Note Type: " + demoNote.getSharp() + " note");
      System.out.println("Key Color: " + demoNote.getKeyColor());
      System.out.println("Frequency: " + demoNote.getFrequency()+ " Hz." );




    }
}