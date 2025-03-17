package dev.vitortux.domain.pokemon;

import dev.vitortux.domain.move.Growl;
import dev.vitortux.domain.move.Scratch;

public class PokemonFactory {

    private PokemonFactory() {
    }

    public static Pokemon create(PokemonType type) {
        switch (type) {
            case CHARMANDER:
                return new Pokemon("Charmander", 5, 39, 52, 43, 0, new Growl(), new Scratch());
            case BULBASAUR:
                // return new Pokemon("Bulbasaur", 5, 45, 49, 49, 0);
            case SQUIRTLE:
                // return new Pokemon("Squirtle", 5, 44, 48, 65, 0);
            default:
                throw new IllegalArgumentException("Unknown Pokémon type: " + type);
        }
    }
}
