package pkg42_a03_practica03;

public class Dofi extends AnimalBase implements AnimalAquatic {
    
    public Dofi(String nom) {
        super(nom, 20);
        alimentsAcceptats();
    }
    
    public Dofi(String nom, int energia) {
        super(nom, energia, 20);
        alimentsAcceptats();
    }
    
    private void alimentsAcceptats() {
        afegirAliment("peix");
        afegirAliment("calamar");
        afegirAliment("peix");
    }
    
    @Override
    public void emetreSo() {
        System.out.println(
                teEnergia(20)
                ? "Clic Clic!"
                : getNom() + " està massa cansat per cliclar."
        );
        
    }
    
    @Override
    public void nedar(int profunditat) {
        if (profunditat <= 50) {
            if (teEnergia(profunditat / 3)) {
                setEnergia(getEnergia() - (profunditat / 3));
            } else {
                System.out.println(getNom() + " està massa cansat per nadar!");
            }
        } else {
            System.out.println(getNom() + " no pot nedar tan profund.");
        }
    }
    
    @Override
    public String toString() {
        return getClass() + super.toString();
    }
}
