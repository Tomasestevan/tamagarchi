package tamagarchi;

public class AntiSocial extends Tamagochi{
    public AntiSocial(String nombre, int felicidad, boolean covid, int cuantasvecesjugo,Estado estado){
        super(nombre,felicidad,covid,cuantasvecesjugo,estado);
    }
    public void jugarenconjunto(Tamagochi wach1,Tamagochi wach2){
        this.Estado = new Triste();

    }
}
