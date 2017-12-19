/**
 * @author (Marco Kiefer)
 */
import java.util.ArrayList;

public class Notizbuch{
    private ArrayList<String> notizen;

    public Notizbuch(){
        notizen = new ArrayList<>();
    }

    public void hinzufuegen(String notiz){
        notizen.add(notiz);
    }

    public int anzahlNotizen(){
        return notizen.size();
    }

    public void zeigeNotiz(int index){
        if (index < 0){
            System.out.println("Falscher Index");
        } else if (index < anzahlNotizen()) {
            System.out.println(notizen.get(index));
        } else {
            System.out.println("Index zu groß");
        }
    }
    public String loescheNotiz(int index){
        if(checkIndex(index)){
            String zuLoeschendeNotiz = notizen.get(index);
            notizen.remove(index);
            return zuLoeschendeNotiz; 
        } 
        return null;    
    }
    private boolean checkIndex(int index){
        return index >= 0 && index < anzahlNotizen();
       
    }
    public void alleNotizenAusgeben(){
         for(String notiz:notizen){
             System.out.println(notiz);
         }
    }
}
