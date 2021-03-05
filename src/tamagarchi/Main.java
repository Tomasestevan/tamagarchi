package tamagarchi;

public class Main {

    public static void main(String[] args) {
//	Tamagochi wachin1;
//	wachin1 = new Tamagochi ("chito",5,false, "contento",5);

//	Tamagochi wachin2;
//	wachin2 = new Tamagochi ("cores",3, true, "triste",4);

//	Tamagochi wachin3;
//	wachin3 = new Tamagochi ("semplo",6, false, "hambriento",2);
        Gloton wachon1;
        wachon1 = new Gloton("PELOTUDODEMIERDA",1,true,0,new Triste());
      Dormilon wachon2;
      wachon2 = new Dormilon("culoroto",5,false,3, new Contento());

      try {
          wachon1.leagarracovid();
      }
      catch (yaEstaContagiadoException e){
          throw e;
      }

   //public void jugeandos {
      // wachin1.jugarenconjunto();
       //wachin2.jugarenconjunto();
        //}






    }







}
