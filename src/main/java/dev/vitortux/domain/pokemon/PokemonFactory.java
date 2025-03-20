package dev.vitortux.domain.pokemon;

import dev.vitortux.domain.move.Growl;
import dev.vitortux.domain.move.MoveStrategy;
import dev.vitortux.domain.move.Scratch;
import dev.vitortux.domain.move.Tackle;
import dev.vitortux.domain.move.TailWhip;

/**
 * Este método segue o {@code Padrão Factory}, centralizando a criação de
 * objetos Pokémon e abstraindo a lógica de instância para reduzir o acoplamento
 * e facilitar a manutenção.
 */
public enum PokemonFactory {
    CHARMANDER("Charmander", 5, 39, 52, 43, 0, new Growl(), new Scratch()),
    BULBASAUR("Bulbasaur", 5, 45, 49, 49, 0, new Growl(), new Tackle()),
    SQUIRTLE("Squirtle", 5, 44, 48, 65, 0, new TailWhip(), new Tackle());

    private String name;
    private int level;
    private int hp;
    private int attack;
    private int defense;
    private int xp;
    private final MoveStrategy[] moves;

    PokemonFactory(String name, int level, int hp, int attack, int defense, int xp, MoveStrategy... moves) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.xp = xp;
        this.moves = moves;
    }

    public Pokemon create() {
        return new Pokemon(name, level, hp, attack, defense, xp, moves);
    }
}
