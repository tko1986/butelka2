package butelka2;

public class Butelka2 {

    private double ileLitrow;
    private double pojemnosc;
    
    public Butelka2() {
    }
   
    public Butelka2(double ileLitrow, double pojemnosc) {
        this.ileLitrow = ileLitrow;
    }
    
    double getIleLitrow(){
        return ileLitrow; 
    }
    
    boolean wlej(double ilosc){
        
        if (ileLitrow > pojemnosc){
            return false;
        }
        else{
        this.ileLitrow += ilosc;
        }
        return true;
    }
    
    boolean wylej(double ilosc){
        if(ilosc < ileLitrow){
            this.ileLitrow -= ilosc;
        }else{
//            System.out.println("Nie można przelać. Zbyt mało litrów." + this);
            return false;
        }
        return true;
        
    }
    
    void przelej(double ilosc, Butelka2 gdziePrzelac){
        if(this.wylej(ilosc)){
            gdziePrzelac.wlej(ilosc);
        }else{
            System.out.println("Za mało wody.");
        }
        
        if (this.wlej(ilosc)){
            gdziePrzelac.wylej(ilosc);
        }else{
            System.out.println("Za dużo wody");
        }
        
        
    }
    
    public static void main(String[] args) {
        
        Butelka2[] butelka = new Butelka2[20];
    
        butelka[0] = new Butelka2(11, 20);
        butelka[1] = new Butelka2(8, 20);
        butelka[2] = new Butelka2(10, 19);
//        int i = 0;
//        do {  
//
//            butelka[i] = new Butelka2((int)(Math.random() * 20));
//            System.out.println(butelka[i].ileLitrow);
//            i++;
//        } while (i < 20);
//test
        
//        butelka[0].wlej(4);
        butelka[0].przelej(10, butelka[2]);
        
        System.out.println(butelka[0].getIleLitrow());
        System.out.println(butelka[1].getIleLitrow());
        System.out.println(butelka[2].getIleLitrow());

        
    }
    
}


/*
        Butelka2[] butelka = new Butelka2[50];
        
        for (int x = 0; x < butelka.length; x++){
            butelka[x] = new Butelka2(x);
            System.out.println(x);
                    
        }
*/