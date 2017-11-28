
/**
 * Write a description of class Seite here.
 * 
 * @author (Marco Kiefer) 
 * @version (a version number or a date)
 */
public class Seite
{
    // instance variables - replace the example below with your own
    private String text;

    public Seite(){
        this.text = "- kein Text vorhanden -";
    }

    public Seite(String text){
        this.text = text;
    }

    public void setText(String text){
        if (text != null){
            this.text = text;
        }
    }

    public String getText(){
        return text;  
    }

    public void drucken(){
        System.out.println(text);
    }

}