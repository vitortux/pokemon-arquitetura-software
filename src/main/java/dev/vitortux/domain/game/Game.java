package dev.vitortux.domain.game;

import dev.vitortux.domain.item.ItemGroup;
import dev.vitortux.domain.item.Potion;
import dev.vitortux.domain.player.Player;
import dev.vitortux.domain.pokemon.PokemonFactory;
import dev.vitortux.domain.pokemon.PokemonType;

/**
 * A classe {@code Game} implementa o padrão de projeto Singleton para garantir
 * que apenas uma instância exista e forneça acesso global a ela.
 */
public class Game {
    private static Game instance;
    private Player player;

    private Game() {
    }

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    /**
     * Inicia o jogo, cria o jogador e demonstra a aplicação dos padrões de projeto:
     * <ul>
     * <li><b>Factory:</b> Utiliza o método {@code PokemonFactory.create()} para
     * criar o Pokémon "Charmander".</li>
     * <li><b>Facade:</b> O jogador interage com o inventário de forma simplificada,
     * chamando o método {@code useItem()} sem se preocupar com a implementação
     * interna do inventário ou dos itens, que são delegados por trás das
     * cenas.</li>
     * <li><b>Composite:</b> O inventário do jogador lida tanto com itens
     * individuais como {@code Potion}, quanto com grupos de itens, como
     * {@code ItemGroup}, de forma uniforme e sem distinção no código cliente.</li>
     * <li><b>Strategy:</b> Define e aplica diferentes comportamentos para os itens
     * e movimentos dos Pokémon, permitindo flexibilidade e modificações sem afetar
     * o restante do sistema.</li>
     * <li><b>Singleton:</b> A classe {@code Game} é um Singleton, garantindo que
     * haja apenas uma instância global do jogo em execução e fornecendo um ponto
     * central para o gerenciamento do estado do jogo e do jogador.</li>
     * </ul>
     */
    public void start() {
        // Factory:
        this.player = new Player("Red", PokemonFactory.create(PokemonType.CHARMANDER));

        this.player.addItem(new Potion(), 1); // Poção simples
        this.player.addItem(new ItemGroup(new Potion(), new Potion()), 1); // Grupo de poções

        // Composite:
        this.player.useItem(0, 0); // Usando item individual
        this.player.useItem(1, 0); // Usando grupo de itens

        this.player.usePokemonMove(0, player); // Chama o movimento do Pokémon usando a estratégia de movimento
    }
}
