package JAVA_ORIENTED_PROGRAMMING.EXERCICE_5_Classe_Abstraite;

public abstract class Affichable {

    public abstract void affiche();
}

class Entier extends Affichable {

    private int valeur;

    public Entier(int valeur) {

        this.valeur = valeur;
    }

    @Override
    public void affiche() {

        System.out.println("Je suis un entier de valeur " + valeur);
    }
}

class Flottant extends Affichable {

    private float valeur;

    public Flottant(float valeur) {

        this.valeur = valeur;
    }

    @Override
    public void affiche() {

        System.out.println("Je suis un flottant de valeur " + valeur);
    }



 public static void main(String[] args) {

        Affichable entier = new Entier(42);

        entier.affiche(); // Affiche "Je suis un entier de valeur 42"

        Affichable flottant = new Flottant(3.14f);

        flottant.affiche(); // Affiche "Je suis un flottant de valeur 3.14"

        Affichable[] tab = new Affichable[2];

        tab[0] = new Entier(3);
        tab[1] = new Flottant(3.14f);

        for(Affichable a: tab){
            a.affiche();
        }

    }

}