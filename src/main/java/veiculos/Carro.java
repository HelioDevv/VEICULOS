package veiculos;
public class Carro {
    String corPrim;
    String corSec;
    String modelo;
    double velocAtual;
    double velocMax;
    
    void ligar(){
        System.out.println("O carro está ligado!");
    }
    
    void desligar(){
        System.out.println("O carro está desligado!");
    }
    
    void acelera(double quant){
        double velocNova = this.velocAtual + quant;
            this.velocAtual = velocNova;
    }
    
    void reduz(double quant){
        double velocNova = this.velocAtual - quant;
            this.velocAtual = velocNova;
    }
    
    void marcha(){
        if(this.velocAtual < 0){
            System.out.println("Ponto Zero;");
        }
        if(this.velocAtual >= 0 && this.velocAtual < 40){
            System.out.println("1° Marcha;");
        }
        if(this.velocAtual >= 40 && this.velocAtual < 80){
            System.out.println("2° Marcha;");
        }
        if(this.velocAtual >= 80 && this.velocAtual < 120){
            System.out.println("3° Marcha;");
        }
    }
    
    void status(){
        System.out.println("Carro:");
        System.out.println("Modelo: " + this.modelo + ";");
        System.out.println("");
        System.out.println("Cor Primária: " + this.corPrim + ";");
        System.out.println("");
        System.out.println("Cor Secundária: " + this.corSec + ";");
        System.out.println("");
        System.out.println("Velocidade atual de: " + this.velocAtual + "Km/h;");
        System.out.println("");
        System.out.println("Está operando em: ");
    }
}
