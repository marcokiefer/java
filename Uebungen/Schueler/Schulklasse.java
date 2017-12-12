
/**
 * Write a description of class Schulklasse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Schulklasse
{
    private String bezeichnung;
    private Schueler schueler0;
    private Schueler schueler1;
    private Schueler schueler2;
        
    public Schulklasse(){
        this.bezeichnung = "Keine Bezeichnung angegeben";
        this.schueler0 = null;
        this.schueler1 = null;
        this.schueler2 = null;
    }
    public Schulklasse(String bezeichnung){
        this.bezeichnung = bezeichnung;
    }
    public Schulklasse(String bezeichnung, Schueler schueler0, Schueler schueler1, Schueler schueler2){
        this.bezeichnung = bezeichnung;
        this.schueler0 = schueler0;
        this.schueler1 = schueler1;
        this.schueler2 = schueler2;
    }
    
    public void setBezeichnung(String bezeichnung){
        this.bezeichnung = bezeichnung;
    }
    
    public String getBezeichnung(){
        return bezeichnung;
    }
    
    public void druckeInfo(){
    System.out.println("Klasse: " + bezeichnung);
    System.out.println("Name S1: " + schueler0 + ", Mitschüler: " + schueler0.getMitSchueler());
    System.out.println("Name S2: " + schueler1 + ", Mitschüler: " + schueler1.getMitSchueler()); 
    System.out.println("Name S2: " + schueler2 + ", Mitschüler: " + schueler2.getMitSchueler()); 
    }
    
   }
