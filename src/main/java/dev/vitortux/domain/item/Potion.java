package dev.vitortux.domain.item;

import dev.vitortux.domain.pokemon.Pokemon;

public class Potion implements ItemStrategy {

    @Override
    public void use(Pokemon pokemon) {
        System.out.println(pokemon.getName() + " recebeu uma poção!");
    }
}
