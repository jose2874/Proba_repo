package pkg42_a03_practica03;

public class Main {

    public static void main(String[] args) {
        Zoologic z = new Zoologic();
        Gos g1 = new Gos("Pepe");
        Gos g2 = new Gos("Maria", -200);
        Dofi d1 = new Dofi("Luis");
        Dofi d2 = new Dofi("Anna", 75);
        
        z.afegirAnimal(g1);
        z.afegirAnimal(g2);
        z.afegirAnimal(d1);
        z.afegirAnimal(d2);
        
        z.mostrarEstatAnimals();
        
        for (AnimalBase animal : z.getAnimals()) {
            if(animal instanceof Gos){
                Gos g = (Gos) animal;
                g.caminar(40);
            } else if (animal instanceof Dofi) {
                Dofi d = (Dofi) animal;
                d.nedar(40);
            } else if (animal instanceof Aguila) {
                Aguila a = (Aguila) animal;
                a.volar(40, 30);
            }
        }
        
        z.alimentarTotsElsAnimals();
        
        z.mostrarEstatAnimals();
        
    }
    
}
