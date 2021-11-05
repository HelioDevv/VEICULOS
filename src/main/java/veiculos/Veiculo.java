package veiculos;
public class Veiculo {
    public static void main(String[] args){
        Carro c1 = new Carro();
            c1.modelo = "Camaro";
            c1.corPrim = "Amarelo";
            c1.corSec = "Preta";
            c1.velocAtual = 0;
            
            c1.ligar();
            c1.acelera(110);
            c1.reduz(10);
            
            c1.status();
            c1.marcha();
    }
}
