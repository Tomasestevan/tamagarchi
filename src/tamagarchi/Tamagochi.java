package tamagarchi;

public class Tamagochi {
    public String Nombre;
    public int Felicidad;
    public boolean Covid;
    public String Estado;
    public int CuantasVecesJugo;

    public Tamagochi (String nombre, int felicidad, boolean covid, String estado, int cuantasvecesjugo){
        Nombre = nombre;
        Felicidad = felicidad;
        Covid = covid;
        Estado = estado;
        CuantasVecesJugo = cuantasvecesjugo;

    }
    public void come() {
        if (Estado == "hambriento") {Estado = "contento"; }

        if (Estado == "contento"){ Felicidad++;}

        if (Estado == "triste" && Covid == false){Estado = "contento";}
    }

    public void juega() {
        if (Estado == "contento") {Felicidad = Felicidad + 2;CuantasVecesJugo++;
        if (CuantasVecesJugo == 2){CuantasVecesJugo = 0;Estado = "hambriento";}}

        if (Estado == "triste") {Estado = "contento";}

        if (Estado == "hambriento") {Felicidad = Felicidad - 4;Estado = "triste";}
    }
        public void jugarenconjunto(Tamagochi wach){
            if (Estado == "hambriento") {return;}

            if (Estado == "triste") {Estado = "contento";wach.Estado = "contento";}

            if (Estado == "contento"){this.juega();wach.juega();wach.Felicidad = wach.Felicidad + 4;}

        }

    }
    //public void leagarracovid(){
          //  Covid = true;
    // }


//public void leagarracovid(){
//  Covid = true;
//}