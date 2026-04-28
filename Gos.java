package pkg42_a03_practica03;

public class Gos extends AnimalBase implements AnimalTerrestre {

    public Gos(String nom) {
        super(nom, 15);
        alimentsAcceptats();
    }

    public Gos(String nom, int energia) {
        super(nom, energia, 15);
        alimentsAcceptats();
    }
    
    private void alimentsAcceptats(){
        afegirAliment("pinso");
        afegirAliment("carn");
        afegirAliment("carn");
    }

    @Override
    public void emetreSo() {
//        if (teEnergia(10)) {
//            System.out.println("Guau guau!");
//        } else {
//            System.out.println(getNom()+" està massa cansat per bordar.");
//        }
        // OPERADOR TERNARI
        //(COMPARACION) ? (SI TRUE) : ( SI FALSE)

        System.out.println(
                teEnergia(10)
                ? "Guau guau!"
                : getNom() + " està massa cansat per bordar."
        );
    }

    @Override
    public void caminar(int distància) {
        int energiaConsumiada = distància / 2;

        if (teEnergia(energiaConsumiada)) {
            System.out.println("Caminant!!!");
            setEnergia(getEnergia() - energiaConsumiada);
        } else {
            System.out.println(getNom() + " està massa cansat per caminar.");
        }
    }

    @Override
    public String toString() {
        return getClass() + super.toString();
    }
    
}
