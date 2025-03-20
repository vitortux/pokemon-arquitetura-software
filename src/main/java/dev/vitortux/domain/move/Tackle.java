package dev.vitortux.domain.move;

import dev.vitortux.domain.pokemon.Pokemon;

public class Tackle implements MoveStrategy {

    @Override
    public void execute(Pokemon attacker, Pokemon defender) {
        System.out.println(attacker.getName() + " usou Tackle!");
    }
}
