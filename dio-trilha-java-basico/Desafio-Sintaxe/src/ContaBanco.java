import java.text.DecimalFormat;
public class ContaBanco {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private DecimalFormat df;
    private double saldo;

    public ContaBanco(int numero,String agencia,String nomeCliente,double saldo){
        this.numero=numero;
        this.agencia=agencia;
        this.nomeCliente=nomeCliente;
        this.df=new DecimalFormat();
        df.applyPattern("R$ #,##0.00");
        this.saldo=saldo;

    }




    public void imprimirConta(){
        System.out.println("Olá "+this.nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+this.agencia+", conta "+this.numero+" e seu saldo "+this.df.format(this.saldo) +" já está disponível para saque");
    }
}
