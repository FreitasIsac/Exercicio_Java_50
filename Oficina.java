package flamingo.aprendendo.intermediario.dominio;

public class Oficina {

    public void trocarVelocidades(Carro carro1, Carro carro2) {
        double velocidadeTemporaria = carro1.velocidadeAtual;

        carro1.velocidadeAtual = carro2.velocidadeAtual;
        carro2.velocidadeAtual = velocidadeTemporaria;
    }
}
