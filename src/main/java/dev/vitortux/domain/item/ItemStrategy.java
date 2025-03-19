package dev.vitortux.domain.item;

import dev.vitortux.domain.pokemon.Pokemon;

public interface ItemStrategy {
    void use(Pokemon pokemon);
}
