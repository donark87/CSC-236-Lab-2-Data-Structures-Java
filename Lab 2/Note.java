//Donark Patel
//CSC-236
//Lab 2B
//Application: Note
//Date: 09/29/2018
Public class Note implements NoteADT
{

   private double value = 0;
   private String length = "--";
   private String letter;
   private String sharp;
   private String keyColor;
   private double frequency;


   public Note(double value, String length)
   {
      this.value = value;
      this.length = length;
   }


   public void setValue(double value)
   {
      this.value = value;
   }


   public void setLength(String x)
   {
      this.length = length;
   }

   public double getValue()
   {
      return value;
   }


   public String getLength()
   {
      return length;
   }


   public String getLetter()
   {
      if(value == 0 || value == 12 || value == 24 || value == 36 ||
         value == -12 || value == -24 || value == -36 || value == -48)
      {
         letter = "A";
      }
      else if(value == 1 || value == 13 || value == 25 || value == 37 ||
              value == -11 || value == -23 || value == -35 || value == -47)
      {
         letter = "A#";
      }
      else if(value == 2 || value == 14 || value == 26 || value == 38 ||
              value == -10 || value == -22 || value == -34 || value == -46)
      {
         letter = "B";
      }
      else if(value == 3 || value == 15 || value == 27 || value == 39 ||
              value == -9 || value == -21 || value == -33 || value == -45)
      {
         letter = "C";
      }
      else if(value == 4 || value == 16 || value == 28 || value == -8 ||
              value == -20 || value == -32 || value == -44)
      {
         letter = "C#";
      }
      else if(value == 5 || value == 17 || value == 29 || value == -7 ||
              value == -19 || value == -31 || value == -43)
      {
         letter = "D";
      }
      else if(value == 6 || value == 18 || value == 30 || value == -6 ||
              value == -18 || value == -30 || value == -42)
      {
         letter = "D#";
      }
      else if(value == 7 || value == 19 || value == 31 || value == -5 ||
              value == -17 || value == -29 || value == -41)
      {
         letter = "E";
      }
      else if(value == 8 || value == 20 || value == 32 || value == -4 ||
              value == -16 || value == -28 || value == -40)
      {
         letter = "F";
      }
      else if(value == 9 || value == 21 || value == 33 || value == -3 ||
              value == -15 || value == -27 || value == - 39)
      {
         letter = "F#";
      }
      else if(value == 10 || value == 22 || value == 34 || value == -2 ||
              value == -14 || value == -26 || value == -38)
      {
         letter = "G";
      }
      else if(value == 11 || value == 23 || value == 35 || value == -1 ||
              value == -13 || value == -25 || value == -36)
      {
         letter = "G#";
      }

      else
      {
         letter = "invalid";
      }
      return letter;
   }


   public String getSharp()
   {
      if(value == 1 || value == 13 || value == 25 || value == 37 ||
         value == -11 || value == -23 || value == -35 || value == -47 ||
         value == 4 || value == 16 || value == 28 || value == -8 ||
         value == -20 || value == -32 || value == -44 ||
         value == 6 || value == 18 || value == 30 || value == -6 ||
         value == -18 || value == -30 || value == -42 ||
         value == 9 || value == 21 || value == 33 || value == -3 ||
         value == -15 || value == -27 || value == - 39 ||
         value == 11 || value == 23 || value == 35 || value == -1 ||
         value == -13 || value == -25 || value == -36)
      {
         sharp = "Sharp";
      }
      else
      {
         sharp = "Natural";
      }
      return sharp;
   }

   public String getKeyColor()
   {
	    if(value == 1 || value == 13 || value == 25 || value == 37 ||
	            value == -11 || value == -23 || value == -35 || value == -47 ||
	            value == 4 || value == 16 || value == 28 || value == -8 ||
	            value == -20 || value == -32 || value == -44 ||
	            value == 6 || value == 18 || value == 30 || value == -6 ||
	            value == -18 || value == -30 || value == -42 ||
	            value == 9 || value == 21 || value == 33 || value == -3 ||
	            value == -15 || value == -27 || value == - 39 ||
	            value == 11 || value == 23 || value == 35 || value == -1 ||
	            value == -13 || value == -25 || value == -36)
	         {
	            keyColor = "Black";
	         }
	         else
	         {
	            keyColor = "White";
	         }
	         return keyColor;
   }



   public double getFrequency()
   {
      frequency = ((440) * Math.pow(2, value / 12));
      return frequency;
   }
}

