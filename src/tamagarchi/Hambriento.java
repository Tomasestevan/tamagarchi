package tamagarchi;

public class Hambriento implements Estado{

    public void comer(Tamagochi unTamagochi) {
       unTamagochi.Estado = new Contento();

    }


    public void jugar(Tamagochi unTamagochi) {
        if (unTamagochi.Estado == this) {unTamagochi.Felicidad = unTamagochi.Felicidad - 4;unTamagochi.Estado = new Triste();}

    }
}
