
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
        schueler0 = null;
        schueler1 = null;
        schueler2 = null;
    }
    public Schulklasse(String bezeichnung){
        this();
        this.bezeichnung = bezeichnung;
    }
    public Schulklasse(String bezeichnung, Schueler schueler0, Schueler schueler1, Schueler schueler2){
        this(bezeichnung);
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
        public Schueler getSchueler0(){
        return schueler0;
    }
    public Schueler getSchueler1(){
        return schueler1;
    }
    public Schueler getSchueler2(){
        return schueler2;
    }
    
    public void setSchueler0(Schueler schueler0){
        this.schueler0 = schueler0;
    }
    public void setSchueler1(Schueler schueler1){
        this.schueler1 = schueler1;
    }
    public void setSchueler2(Schueler schueler2){
        this.schueler2 = schueler2;
    }
    
        public void druckeInfo(){
           
    System.out.println("Klasse: " + bezeichnung);
    System.out.println("Name S1: " + schueler0 + ", Mitschüler: " + schueler0.getMitSchueler());
    System.out.println("Name S2: " + schueler1 + ", Mitschüler: " + schueler1.getMitSchueler()); 
    System.out.println("Name S2: " + schueler2 + ", Mitschüler: " + schueler2.getMitSchueler()); 
    }
    
   }
