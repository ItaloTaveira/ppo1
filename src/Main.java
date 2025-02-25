//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
import exe0.Carro;

public class MainCarro {
    public static void main(String[] args) {
        Carro obj1 = new Carro(2020, 0.0F, "Ferrari", "Spider");
        obj1.exibirDetalhes();
        obj1.acelerar(100.0F);
        obj1.exibirDetalhes();
        Carro obj2 = new Carro();
        obj2.ano = 1979;
        obj2.velocidade = 0.0F;
        obj2.marca = "Dogde Charger";
        obj2.modelo = "1979";
        obj2.exibirDetalhes();
        Carro obj3 = new Carro();
        obj3.exibirDetalhes();
    }
}
