package dev.vitortux.domain.pokemon;

import dev.vitortux.domain.move.Growl;
import dev.vitortux.domain.move.Scratch;

public class PokemonFactory {

    private PokemonFactory() {
    }

    /**
     * Este método segue o {@code Padrão Factory}, centralizando a criação de
     * objetos Pokémon e abstraindo a lógica de instância para reduzir o acoplamento
     * e facilitar a manutenção.
     */
    public static Pokemon create(PokemonType type) {
        switch (type) {
            case CHARMANDER:
                return new Pokemon("Charmander", 5, 39, 52, 43, 0, new Growl(), new Scratch());
            case BULBASAUR, SQUIRTLE:
                //
            default:
                throw new IllegalArgumentException("Unknown Pokémon type: " + type);
        }
    }
}
