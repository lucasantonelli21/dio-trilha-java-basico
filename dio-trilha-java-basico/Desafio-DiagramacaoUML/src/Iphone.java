public class Iphone implements AparelhoTelefonico {
    private String numero;
    private String modelo;
    private NavegadorInternet navegador;
    private ReprodutorMusical reprodutorMusical;
    public Iphone(String numero,String modelo){
        this.numero=numero;
        this.modelo=modelo;
        this.navegador=new NavegadorInternet();
        this.reprodutorMusical=new ReprodutorMusical();
    }





    public void ligar(String numero){
        System.out.println("Aparelho esta ligando para"+numero);
    }
    public void atender(){
        System.out.println("Atendendo chamada.");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }

}
