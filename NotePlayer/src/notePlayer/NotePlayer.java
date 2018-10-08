package notePlayer;

import java.util.Scanner;

import core.MidiWrapper;

public class NotePlayer
{
    public static void main(String[] args)
    {
    	Scanner console = new Scanner(System.in);
		String notesymbol= console.nextLine();
		System.out.print("Note letter: "+ notesymbol.substring(0,1)+",");
		System.out.print(" duration: " + notesymbol.substring(2,notesymbol.indexOf(" ")));
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
