package pkg42_a03_practica03;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class AnimalBase implements Animal {

    private final int MAX_ENERGIA = 100;
    private String nom;
    private int energia;
    private int aumentEnergia;
    private List<String> alimentsAcceptats;

    public AnimalBase(String nom, int aumentEnergia) {
//        this.nom = nom;
//        this.aumentEnergia = aumentEnergia;
//        this.energia = 100;
        this(nom, 100, aumentEnergia);
    }

    public AnimalBase(String nom, int energia, int aumentEnergia) {
        this.nom = nom;
        setEnergia(energia);
        this.aumentEnergia = aumentEnergia;
        alimentsAcceptats = new ArrayList();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        if (energia < 0) {
            this.energia = 0;
        } else if (energia <= MAX_ENERGIA) {
            this.energia = energia;
        } else {
            this.energia = MAX_ENERGIA;
        }
    }

    public int getAumentEnergia() {
        return aumentEnergia;
    }

    @Override
    public void descansar() {
        if (energia + 20 <= MAX_ENERGIA) {
            this.energia += 20;
        }
    }

    public void menjar(String aliment) {

        if (alimentsAcceptats.contains(aliment)) {
            if (energia + aumentEnergia <= MAX_ENERGIA) {
                energia += aumentEnergia;
            } else {
                energia = MAX_ENERGIA;
            }
        }
    }

    public boolean teEnergia(int quantitat) {
        return energia >= quantitat;
    }

    public void afegirAliment(String aliment) {
        if (!alimentsAcceptats.contains(aliment)) {
            alimentsAcceptats.add(aliment);
        }
    }

    @Override
    public abstract void emetreSo();

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.nom);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof AnimalBase)) {
            return false;
        }
        final AnimalBase other = (AnimalBase) obj;
        return Objects.equals(this.nom, other.nom);
    }

    @Override
    public String toString() {
        return "{" + "nom=" + nom + ", energia=" + energia + ", aumentEnergia=" + aumentEnergia + ", alimentsAcceptats=" + alimentsAcceptats + '}';
    }

}
