import java.util.Random;

public class Computador extends Jogador {

    public Computador(int jogador) {
        super(jogador);
        System.out.println("Jogador 'Computador' criado!");
    }

    @Override
    public void jogar(Tabuleiro tabuleiro) {
        Tentativa(tabuleiro);
        tabuleiro.setPosicao(tentativa, jogador);
    }

    @Override
    public void Tentativa(Tabuleiro tabuleiro) {
        Random numeroRandomico = new Random();
        do {
            do {
                numeroRandomico.setSeed(numeroRandomico.nextInt(9999999));
                tentativa[0] = numeroRandomico.nextInt(3) + 1;

            } while (tentativa[0] > 3 || tentativa[0] < 1);

            do {
                numeroRandomico.setSeed(numeroRandomico.nextInt(9999999));
                tentativa[1] = numeroRandomico.nextInt(3) + 1;

            } while (tentativa[1] > 3 || tentativa[1] < 1);

            tentativa[0]--;
            tentativa[1]--;

        } while (!checaTentativa(tentativa, tabuleiro));
    }
}