package pkg42_a03_practica03;

public class Aguila extends AnimalBase implements AnimalVolador{
    
    //creo el constructor solo son el nombre y invoco el alimentsAcceptats
    public Aguila(String nom) {
        super(nom, 25);
        alimentsAcceptats();
    }
    //creo el segundo constructor con energia y nombre los dosh
    
    public Aguila(String nom, int energia) {
        super(nom, energia, 25);
        alimentsAcceptats();
    }
    
    private void alimentsAcceptats() {
        afegirAliment("peix");
        afegirAliment("rosegadors");
        afegirAliment("rosegadors");
    }

    @Override
    public void emetreSo() {
        System.out.println(
                teEnergia(30)
                ? "Pio Pio!"
                : getNom() + " està massa cansat per piar."
        );}

    @Override
    public void volar(int altura, int distància) {
        if (altura <= 500) {
            if (teEnergia( (altura / 10) + (distància / 5))) {
                setEnergia(getEnergia() -  ((altura / 10) + (distància / 5)));
            } else {
                System.out.println(getNom() + " està massa cansat per volar!");
            }
        } else {
            System.out.println(getNom() + " no pot volar tan alt.");
        }
    
    }
    
    @Override
    public String toString() {
        return getClass() + super.toString();
    }
}
