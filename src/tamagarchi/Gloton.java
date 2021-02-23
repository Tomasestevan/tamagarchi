package tamagarchi;

public class Gloton extends Tamagochi{

    public Gloton(String nombre, int felicidad, boolean covid, int cuantasvecesjugo,Estado estado){
        super(nombre,felicidad,covid, cuantasvecesjugo, estado);

    }
    public void comer(){
        this.Felicidad = this.Felicidad + 5;
        this.Estado.comer(this);
    };
}
