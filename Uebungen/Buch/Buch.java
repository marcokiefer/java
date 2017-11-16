
/**
 * Write a description of class Buch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buch
{
    private String titel;
    //private String isbn;
    //private String Verlag;
    private Seite seite0;
    private Seite seite1;
    private Seite seite2;
    private Seite seite3;

    public Buch(){
        this. titel = " -kein Titel-";
        this.seite0 = new Seite();
        this.seite1 = new Seite();
        this.seite2 = new Seite();
        this.seite3 = new Seite();
    }

    public Buch(String titel){
        this.titel = titel;
        this.seite0 = new Seite();
        this.seite1 = new Seite();
        this.seite2 = new Seite();
        this.seite3 = new Seite();
    }

    public Buch(String titel, Seite seite0, Seite seite1, Seite seite2, Seite seite3){
        this.titel = titel;
        this.seite0 = seite0;
        this.seite1 = seite1;
        this.seite2 = seite2;
        this.seite3 = seite3;
    }

    //Setter für titel
    public void setText(String titel){
        this.titel = titel;
    }

    public void setSeite0(){
        this.seite0 = seite0;
    }

    public void setSeite1(){
        this.seite1 = seite1;
    }

    public void setSeite2(){
        this.seite2 = seite2;
    }

    public void setSeite3(){
        this.seite3 = seite3;
    }
    //Getter für tite
    public String getTitel(){
        return titel;
    }

    public Seite getSeite0(){
        return seite0;
    }

    public Seite getSeite1(){
        return seite1;
    }

    public Seite getSeite2(){
        return seite2;
    }

    public Seite getSeite3(){
        return seite3;
    }

    public void drucken(){
        System.out.println(titel);
        System.out.println();
    }
}
