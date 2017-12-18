
/**
 * Write a description of class Schueler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Schueler
{
    private String name;
    private int alter;
    private Schueler mitSchueler; 

    public Schueler(){
        this.name = "-Kein Name";
        this.alter = -1;
        this.mitSchueler = null;
    }

    public Schueler(String name, int alter){
        this();
        this.setName(name);
        this.setAlter(alter);
        this.mitSchueler = null;
    }

    public String getName(){
        return name;
    }

    public int getAlter(){
        return alter;
    }

    public Schueler getMitSchueler(){
        return mitSchueler;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAlter(int alter){
        if (alter < 0){
            System.out.println("Alter darf nicht negativ sein");
            return;
        } 
        this.alter = alter;
    }

    public void setMitSchueler(Schueler mitschueler){
        this.mitSchueler = mitschueler;
    }

    public void druckeInfo(){
        System.out.println("Name: "+ this.name + ", Alter: " + this.alter );
        String nameMitschueler = "-kein Mitschüler vorhanden";
        if(mitSchueler != null){
           nameMitschueler = mitSchueler.getName();
        }
        System.out.println("Mitschüler: " +nameMitschueler);
    }

}
