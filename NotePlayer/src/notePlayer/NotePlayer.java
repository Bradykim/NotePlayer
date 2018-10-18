package notePlayer;

import java.util.Scanner;

import core.MidiWrapper;

public class NotePlayer
{
    public static void main(String[] args)
    {
    		Scanner console = new Scanner(System.in);
			String notesymbol= console.nextLine()+" ";
			while(notesymbol.length()>=1)
			{
				if(notesymbol.substring(notesymbol.length()-1,notesymbol.length()).equals(" "));
				{
					String note=notesymbol.substring(0,notesymbol.indexOf("_"));
					String note2=" ";
					if(note.length()==1)
					{
						note2= note;
					}
					else if(note.length()==2)
					{
						note2=note.substring(0,1);
					}
					String duration= notesymbol.substring(notesymbol.indexOf("_")+1,notesymbol.indexOf(" "));
					int durationMs= Integer.parseInt(duration);
					int noteNumber = 0;
			    	if(note2.equals("C"))
					{
						noteNumber=60;
					}
					else if(note2.equals("D"))
					{
						noteNumber=62;
					}
					else if(note2.equals("E"))
					{
						noteNumber=64;
					}
					else if(note2.equals("F"))
					{
						noteNumber=65;
					}
					else if(note2.equals("G"))
					{
						noteNumber= 67;
					}
					else if(note2.equals("A"))
					{
						noteNumber=69;
					}
					else if(note2.equals("B"))
					{
						noteNumber=71;
				
					}
			    	playNote(noteNumber, durationMs);
			    	notesymbol = notesymbol.substring(notesymbol.indexOf(" ")+1);
			    	
				}
				
				
			}
			
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
