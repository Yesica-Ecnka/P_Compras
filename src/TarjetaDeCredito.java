import java.util.ArrayList;
import java.util.List;

public class TarjetaDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> listaDeCompras; //un atributo

    public TarjetaDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaDeCompras = new ArrayList<>(); //acá llame a mi atributo y lo instancie a una ArrayLidt
    } //se creó un constructor.

    public boolean lanzarCompra(Compra compra){
        if(this.saldo >= compra.getValor()){
            this.saldo -= compra.getValor();
            this.listaDeCompras.add(compra);
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getListaDeCompras() {
        return listaDeCompras;
    }
}
