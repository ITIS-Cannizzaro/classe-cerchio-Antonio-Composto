import java.util.Scanner;

public class Cognome {
    
    public static void main(String[] args){
        

        Scanner sca=new Scanner(System.in);

        System.out.println("inserire raggio 1 " );
        double r=sca.nextDouble();
        
        cerchio dati=new cerchio(1,1, 1, 1);
        dati.calcraggio(r);
        dati.calcDiametro(r);
        dati.calArea(r);
        dati.calperimetro(r);
        System.out.println("caratteristiche cerchio 1" );
        dati.stampa();
        System.out.println("" );
        System.out.println("inserire raggio 2 " );
        r=sca.nextDouble();
        
        cerchio dati2=new cerchio(1,1, 1, 1);
        dati2.calcDiametro(r);
        dati2.calcraggio(r);
        dati2.calArea(r);
        dati2.calperimetro(r);
        System.out.println("caratteristiche cerchio 2" );
        dati2.stampa();


        System.out.println("" ); System.out.println("" );
        cerchio dati3=new cerchio(1,1, 1, 1);
        dati3.calcDiametro(dati.raggio+dati2.raggio);
        dati3.calcraggio(dati.raggio+dati2.raggio);
        dati3.calArea(dati.raggio+dati2.raggio);
        dati3.calperimetro(dati.raggio+dati2.raggio);
        System.out.println("caratteristiche cerchio 3" );
        dati3.stampa();


        
    }


}
