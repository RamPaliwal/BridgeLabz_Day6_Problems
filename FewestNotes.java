package Day6;

public class FewestNotes {
    int find_notes(int change){
        int notes[] = {1,2,5,10,50,100,500,1000};String s="";int min_notes=0;
        for(int i=notes.length-1;i>=0;i--){
            while(notes[i]<=change){
                change=change-notes[i];
                s+=String.valueOf(notes[i])+" ";
                min_notes+=1;
            }
        }
        System.out.println("Notes required are: "+s);
        return min_notes;
    }
    public static void main(String[] args) {
        FewestNotes fn = new FewestNotes();
        System.out.println("Minimum number of notes are: "+fn.find_notes(6));
    }
}
