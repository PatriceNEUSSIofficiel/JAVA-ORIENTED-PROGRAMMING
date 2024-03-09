package JAVA_ORIENTED_PROGRAMMING.EXERCICE_1_Classe_simple_et_objet_en_Java ;


public class pt {
    
    protected int x;
    protected int y;


    public pt(int x, int y){
        this.x = x;
        this.y = y ;
    }

    public pt(){

    }

    public void initialiser(int x, int y ){
        this.x =x ;
        this.y=y;
    }


    public void deplacer(int deltax , int deltay){
        x = x + deltax;

        y = y + deltay;
    }


    public void afficher(){
        System.out.println("je suis le point de coordonne" + x + "," + y);
    }

    public static void main(String[] args){
       pt point = new pt();
       point.initialiser(3,7);
       point.deplacer(2 , -1);
       point.afficher();

    }
    
}
