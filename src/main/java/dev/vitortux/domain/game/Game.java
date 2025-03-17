package dev.vitortux.domain.game;

/**
 * A classe {@code Game} implementa o padrão de projeto Singleton para garantir
 * que apenas uma instância exista e forneça acesso global a ela.
 */
public class Game {
    private static Game instance;

    private Game() {
    }

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }
}
