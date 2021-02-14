package tamagarchi;

public class Enojado implements Estado{

    public void comer(Tamagochi unTamagochi) {
        if (unTamagochi.Estado == this){unTamagochi.Estado = new Hambriento();}
    }


    public void jugar(Tamagochi unTamagochi) {
        if (unTamagochi.Estado == this) {unTamagochi.Felicidad = unTamagochi.Felicidad - 15;unTamagochi.Estado = new Triste();}

    }
}
