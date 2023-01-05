public class Usuario {
    public static void main(String[] args) throws Exception {
      
        SmartTv smartTv = new SmartTv();


      
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        System.out.println("Canal Atual :" +smartTv.canal);
        smartTv.mudarCanal(35);
        System.out.println("Canal Atual :" + smartTv.canal);





        smartTv.ligar();
        System.out.println("Novo Status -> Tv Ligada ? " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Novo Status -> Tv Ligada ? " +smartTv.ligada);




    }
}
