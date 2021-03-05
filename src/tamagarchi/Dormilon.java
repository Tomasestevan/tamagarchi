package tamagarchi;

public class Dormilon extends Tamagochi{
    public Dormilon(String nombre, int felicidad, boolean covid, int cuantasvecesjugo,Estado estado){
        super(nombre,felicidad,covid, cuantasvecesjugo, estado);
    }
    public void juega(){
        Estado.jugar(this);
        if (this.Felicidad < 10){ this.Estado = new Cansado();}

    }
    public void dormir(){
        this.Estado = new Contento();
    }

    public void come(){
        System.out.println("no quiero coger quiero dormir");
        super.come();
    }


}
