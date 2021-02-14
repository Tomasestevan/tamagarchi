package tamagarchi;

public class Triste implements Estado{

    public void comer(Tamagochi unTamagochi) {
        if (unTamagochi.Estado == this && unTamagochi.Covid == false){unTamagochi.Estado = new Contento();}

    }

    public void jugar(Tamagochi unTamagochi) {
        if (unTamagochi.Estado == this) {unTamagochi.Estado = new Contento();}

    }
}
