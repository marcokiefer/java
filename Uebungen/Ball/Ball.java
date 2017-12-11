
/** 
 * Klasse Ball
 * @author (Marco Kiefer) 
 * @version (05.12.2017)
 */
public class Ball{
    private double maxFuellmenge;
    private double aktuelleFuellmenge;

    public Ball(double maxFuellmenge){
        this.maxFuellmenge = maxFuellmenge;
        this.aktuelleFuellmenge = 0.0;

    }

    public double getMaxFuellmenge(){
        return maxFuellmenge;
    }

    public double getAktuelleFuellmenge(){
        return aktuelleFuellmenge;
    }

    public void aufpumpen(double fuellmenge){
        if(fuellmenge < 0){
            System.out.println("Werte unter Null nicht erlaubt");
            return;
        } 
        double aufgepumt = aktuelleFuellmenge + fuellmenge;
        if(aufgepumt >= maxFuellmenge){
            System.out.println("Zu viel druck, der Ball hält maximal "+maxFuellmenge+" Bar aus");
            aktuelleFuellmenge = maxFuellmenge;
        } else  {
            aktuelleFuellmenge = aufgepumt;
        }
    }

    public void luftRausLassen(double menge){
        if(menge > 0){
            System.out.println("Werte unter Null nicht erlaubt");
            return;
        } 
        double luftraus = aktuelleFuellmenge - menge;
        if(luftraus < 0){
            aktuelleFuellmenge = 0.0;
        } else  {
            aktuelleFuellmenge = luftraus;
        }
    }

    public double getLuftdruckInProzent(){
        double prozent = maxFuellmenge / 100 * aktuelleFuellmenge;
        prozent = prozent * 100;
        //System.out.println(prozent +" %");
        return prozent;
    }

    public void druckeInfo(){
        System.out.println("Aktuelle Füllmenge: "+ aktuelleFuellmenge +", Maximale Füllmenge: "+ maxFuellmenge);
        System.out.println("Luftdruck in Prozent: "+ (maxFuellmenge / 100 * aktuelleFuellmenge)*100);
        System.out.println("----------------------------------------------------------------");
    }
}
