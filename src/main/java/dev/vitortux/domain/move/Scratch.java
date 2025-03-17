package dev.vitortux.domain.move;

import dev.vitortux.domain.pokemon.Pokemon;

public class Scratch implements MoveStrategy {

    @Override
    public void execute(Pokemon attacker, Pokemon defender) {
        System.out.println("Scratch");
    }
}
