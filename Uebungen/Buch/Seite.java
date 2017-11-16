
/**
 * Write a description of class Seite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Seite
{
    // instance variables - replace the example below with your own
    private String text;

    public Seite(){
        this.text = "- kein Text";
    }
    public Seite(String text){
        this.text = text;
    }
   
    public void setText(String text){
       this.text = text;
    }
    
    public String getText(){
      return text;  
    }
    
    public void drucken(){
        System.out.println(text);
    }

}