
/**
 * Write a description of class Schulklasse2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Schulklasse2
{
    private String bezeichnung;
    private ArrayList<Schueler> schuelers;

    public Schulklasse2(){
        schuelers = new ArrayList<>();
    }

    public Schulklasse2(String bezeichnung){
        this();
        this.bezeichnung = bezeichnung;
    }
    // Setter & Getter für Bezeichnung
    public void setBezeichnung(String bezeichnung){
        this.bezeichnung = bezeichnung;
    }

    public boolean hinzufuegen(Schueler schueler){
        return this.schuelers.add(schueler);
    }
    // Prüfung Index == 0 & kleiner als die Größe der ArrayList
    private boolean istIndexGueltig(int index){
        return index >= 0 && index < schuelers.size();
    }

    public void zeigeSchueler(int index){
        if (istIndexGueltig(index)){
            //Schueler schueler = schuelers.get(index);
            //schueler.druckeInfo();
            schuelers.get(index).druckeInfo();
        } else {
            System.out.println("Falscher Index");
        }
    }

    public String loescheSchueler(int index){

    }

    public void alleNamenAusgeben(){
    }
    
    
}
