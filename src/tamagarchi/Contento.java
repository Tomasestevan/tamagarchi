package tamagarchi;

public class Contento implements Estado {

    public void comer(Tamagochi unTamagochi) {
        if (unTamagochi.Estado == this) {unTamagochi.Felicidad++;}

    }


    public void jugar(Tamagochi unTamagochi) {
        if (unTamagochi.Estado == this) {unTamagochi.Felicidad = unTamagochi.Felicidad + 2;unTamagochi.CuantasVecesJugo++;}
        if (unTamagochi.CuantasVecesJugo == 2){unTamagochi.CuantasVecesJugo = 0;unTamagochi.Estado = new Hambriento();}}
    }

