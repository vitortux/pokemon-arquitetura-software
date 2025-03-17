package dev.vitortux.domain.move;

import dev.vitortux.domain.pokemon.Pokemon;

/**
 * Interface que define um movimento no padrão {@code Strategy}.
 * Cada movimento é implementado separadamente e executado através do método
 * `execute()`.
 */
public interface MoveStrategy {
    void execute(Pokemon attacker, Pokemon defender);
}
