public class cerchio {

    double raggio;
    double diametro;
    double perimetro;
    double area;

    public cerchio(double raggio,double diametro, double perimetro, double area){
        this.raggio = raggio;
        this.diametro=diametro;
        this.perimetro=perimetro;
        this.area=area;

    }

    public void calcraggio(double r){
        raggio = r;
        
    }

    public void calcDiametro(double r){
        diametro=r*2;
        
    }
    public void  calperimetro(double r){
        perimetro=(2*r)*3.14;
    }
    public void  calArea(double r){
        area=(r*r)*3.14;
    }
    
    public void stampa(){
        System.out.println("il raggio Ã¨ " + raggio );
        System.out.println("il diametro Ã¨ " + diametro );
        System.out.println("il perimetro Ã¨ " + perimetro );
        System.out.println("l'area Ã¨ " + area );
   //b

    }



}