package dev.vitortux.domain.move;

import dev.vitortux.domain.pokemon.Pokemon;

public class TailWhip implements MoveStrategy {

    @Override
    public void execute(Pokemon attacker, Pokemon defender) {
        System.out.println(attacker.getName() + " usou Tail Whip!");
    }

}
