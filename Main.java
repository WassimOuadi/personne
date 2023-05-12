import outils.Personne;
import outils.modules.Fonctions; 

public class Main {
    public static void main(String[] args) {
        Fonctions.ecrire("Ce texte est affiché avec la fonction écrire");
        
        
        /** Lorsqu'on déclare une variable de type objet, on dit
         * que l'on fait une INSTANCIATION.
         * Un objet est une INSTANCE d'une classe. */
        Personne p = new Personne("Onyme", "Anne", 50);
       
        System.out.println("Nom : " + p.nom);
        System.out.println("Prénom : " + p.prenom);
        System.out.println("Age : " + p.getAge());
        
        System.out.println(p.identite());
        Personne p1 = new Personne("Jean", "Cérien");
        //p1.prenom = "Jean";
        //p1.nom = "Cérien";
        p1.setAge(25);
        System.out.println("Identité de p1 : " + p1.identite());

        /*
         * EXERCICES :
         * 1. Déclarer un tableau d'objets Personne.
         * 2. Remplir le tableau avec les données utilisées 
         *    dans exempleArray.java 
         * 3. Afficher toutes les identités des personnes (en utilisant la méthode identite())
         * 4. Ajouter un constructeur qui permet d'instancier
         *      une personne en définissant directement son prénom,
         *      son nom et son âge.  
         */
        Personne[] tableauPersonnes = new Personne[10];
        for (int i = 0; i < tableauPersonnes.length; i++) {
            //tableauPersonnes[i] = new Personne();   
        }

        tableauPersonnes[0].prenom = "Gérard";
        tableauPersonnes[0].nom = "Menfin";
        tableauPersonnes[0].setAge(35);
        //tableauPersonnes[1] = new Personne();
        tableauPersonnes[1].prenom = "Nordine";
        tableauPersonnes[1].nom = "Ateur";
        tableauPersonnes[1].setAge(20);

        for (Personne personne : tableauPersonnes) {
            System.out.println(personne.identite() + " " + personne.getAge());
        }
        System.out.println(tableauPersonnes[1].identite());
        /* NULL est un type de donnée particulier (qu'on peut considérer 
            comme une valeur particulière).
            Une variable qui n'a pas été initialisée est considéré comme
            étant NULL.
         */
    }


}
