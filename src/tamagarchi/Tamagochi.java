package tamagarchi;

public abstract class Tamagochi {
    public String Nombre;
    public int Felicidad;
    public boolean Covid;
    public int CuantasVecesJugo;
    public Estado Estado ;

    public Tamagochi (String nombre, int felicidad, boolean covid, int cuantasvecesjugo,Estado estado ){
        Nombre = nombre;
        Felicidad = felicidad;
        Covid = covid;
        CuantasVecesJugo = cuantasvecesjugo;
        Estado = estado;

    }
    public void jugarenconjunto(Tamagochi wach1,Tamagochi wach2){
        if (wach1.Estado == new Hambriento()) {return;}
        if (wach1.Estado == new Triste()) {wach1.Estado = new Contento();wach2.Estado = new Contento();}
        if (wach1.Estado == new Contento()){wach1.juega();wach2.juega();wach2.Felicidad = wach2.Felicidad + 4;}
        if (wach1.Estado == new Enojado()){wach2.Felicidad = wach2.Felicidad -10; wach1.Estado = new Triste(); wach2.Estado = new Triste();}
    }
    public void juega() {Estado.jugar(this);}

    //

    //}
   // public void come() {
     //   if (Estado == "hambriento") {Estado = "contento"; }

       // if (Estado == "contento"){ Felicidad++;}

        //if (Estado == "triste" && Covid == false){Estado = "contento";}

        //if (Estado == "enojado"){Estado = "hambriento";}
    //}

    //public void juega() {
      //  if (Estado == "contento") {Felicidad = Felicidad + 2;CuantasVecesJugo++;

        //if (CuantasVecesJugo == 2){CuantasVecesJugo = 0;Estado = "hambriento";}}

       // if (Estado == "triste") {Estado = "contento";}

       // if (Estado == "hambriento") {Felicidad = Felicidad - 4;Estado = "triste";}

       // if (Estado == "enojado") {Felicidad = Felicidad - 15;Estado = "triste";}
    //}


    public void leagarracovid(){
           Covid = true;
    }
}
