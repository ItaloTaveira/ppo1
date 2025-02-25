//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package exe0;
public class Carro {
    public int ano;
    public float velocidade;
    public String marca;
    public String modelo;

    public Carro() {
        this.marca = "Marca inválida";
        this.modelo = "Modelo inválido";
    }

    public Carro(int ano, float velocidade, String marca, String modelo) {
        this.ano = ano;
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + this.marca + " \nModelo: " + this.modelo + " \nAno: " + this.ano + " \nVelocidade: " + this.velocidade);
    }

    public void acelerar(float x) {
        this.velocidade += x;
    }
}
