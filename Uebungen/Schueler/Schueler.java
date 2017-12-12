
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
        this.name = "-Kein Alter";
        this.alter = -1;
        this.mitSchueler = null;
    }

    public Schueler(String name, int alter){
        this.name = name;
        this.alter = alter;
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
        this.alter = alter;
    }

    public void setMitSchueler(Schueler verweisSchueler){
        this.mitSchueler = verweisSchueler;
    }
    
    public void druckeInfo(){
        System.out.println("Name: "+ name + ", Alter: " + alter + ", Name des Mitschülers: "+ mitSchueler.getName());
    }
}
