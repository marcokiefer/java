
/**
 * Beschreiben Sie hier die Klasse Ball.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
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
        double aufgepumt = aktuelleFuellmenge + fuellmenge;
        if(aufgepumt >= maxFuellmenge){
            System.out.println("Zu viel druck, der Ball hält maximal "+maxFuellmenge+" Bar aus");
            aktuelleFuellmenge = maxFuellmenge;
            } else {
            aktuelleFuellmenge = aufgepumt;
        }
    }
    public void luftRausLassen(double menge){
        double luftraus = aktuelleFuellmenge - menge;
        if(luftraus < 0){
            aktuelleFuellmenge = 0.0;
        } else {
            aktuelleFuellmenge = luftraus;
        }
    }
    public double getLuftdruckInProzent(){
        double druck = maxFuellmenge / 100 * aktuelleFuellmenge;
        druck = druck * 100;
        System.out.println(druck +" %");
        return druck;
    }
}
