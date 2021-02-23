package tamagarchi;

public class Cansado implements Estado{
    public void comer(Tamagochi unTamagochi) {
        unTamagochi.Felicidad = unTamagochi.Felicidad - 5;

    }
    public void jugar(Tamagochi unTamagochi) {
        System.out.println("LA PUTA MADRE QUE ME RE MIL PARIO, POR QUE NO ME QUEDE EN CASA METIENDOME UN PEPINO EN EL ORTO");

    }
}
