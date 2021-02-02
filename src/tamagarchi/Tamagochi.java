package tamagarchi;

public class Tamagochi {
    public String Nombre;
    public int Felicidad;
    public boolean Covid;

    public Tamagochi (String nombre, int felicidad, boolean covid){
        Nombre = nombre;
        Felicidad = felicidad;
        Covid = covid;

    }
    public void come(){
        Felicidad++;
    }
    public void juega(){
        Felicidad = Felicidad + 2;
    }
    public void jugarenconjunto(){
        Felicidad = Felicidad + 5;
    }
    public void leagarracovid(){
        Covid = true;
    }


}
