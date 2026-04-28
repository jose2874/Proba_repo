package pkg42_a03_practica03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Zoologic {
    private List<AnimalBase> animals;

    public Zoologic() {
        animals = new ArrayList();
    }

    public List<AnimalBase> getAnimals() {
        return animals;
    }
    
    
    
    public void afegirAnimal(AnimalBase animal){
        if(!animals.contains(animal)){
            animals.add(animal);
        }
    }
    
    public void alimentarTotsElsAnimals(){
        Random rn = new Random();
        List<String> alimentsValids = List.of("peix", "carn", "pinso", "calamar", "rossegadors");
        
        for (AnimalBase animal : animals) {
            animal.menjar(  alimentsValids.get( rn.nextInt( alimentsValids.size() ) ) );
        }
        
    }
    
    public void mostrarEstatAnimals(){
        for (AnimalBase animal : animals) {
            System.out.println("Nom: " + animal.getNom() + " - " 
                    + " energia: " + animal.getEnergia());
        }
        System.out.println("#############");
    }

    @Override
    public String toString() {
        return "Zoologic{" + "animals=" + animals + '}';
    }
    
    
    
}
