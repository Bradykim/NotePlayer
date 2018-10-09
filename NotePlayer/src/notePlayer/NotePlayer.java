package notePlayer;

import java.util.Scanner;

import core.MidiWrapper;

public class NotePlayer
{
    public static void main(String[] args)
    {
    	Scanner console = new Scanner(System.in);
		String notesymbol= console.nextLine();
		//need to add for loop to account for each note
		//for (x=0; x<= notesymbol.length(); x++)
			String s= notesymbol.substring(0,notesymbol.indexOf(" ")+1);
			String note=s.substring(0,1);
			System.out.print("note letter: "+ note +",");
			String duration= s.substring(s.indexOf("_")+1,s.indexOf(" "));
			int durationMs= Integer.parseInt(duration);
			System.out.print(" duration: " + durationMs);
			int noteNumber = 0;
	    	if(note.equals("C"))
			{
				noteNumber=60;
			}
			else if(note.equals("D"))
			{
				noteNumber=62;
			}
			else if(note.equals("E"))
			{
				noteNumber=64;
			}
			else if(note.equals("F"))
			{
				noteNumber=65;
			}
			else if(note.equals("G"))
			{
				noteNumber= 67;
			}
			else if(note.equals("A"))
			{
				noteNumber=69;
			}
			else if(note.equals("B"))
			{
				noteNumber=71;
		
			}
	    	playNote(noteNumber, durationMs);
		}
		


    
    
    // You may choose to add extra helper methods here to break up your code into
    // smaller, reusable chunks
    
    
    
    
    
    

    /**
     * WARNING!!!  DO NOT MODIFY THIS METHOD.
     * 
     * Once you have calculated the MIDI note number and its duration, call this
     * method to play that note.
     * 
     * @param noteNumber The MIDI note number, as described in the spec.
     * @param durationMs The number of milliseconds to play the note.  A larger number will play the note for a longer time.
     */
    public static void playNote(int noteNumber, int durationMs)
    {
    	
    	// WARNING!!!  DO NOT MODIFY THIS METHOD.
        MidiWrapper.playNote(noteNumber, durationMs);
    }
}
