package dev.vitortux.domain.pokemon;

import dev.vitortux.domain.move.MoveStrategy;

public class Pokemon {
    private String name;
    private int level;
    private int hp;
    private int attack;
    private int defense;
    private int xp;
    private MoveStrategy[] moves = new MoveStrategy[4];

    public Pokemon(String name, int level, int hp, int attack, int defense, int xp, MoveStrategy... moves) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.xp = xp;
        System.arraycopy(moves, 0, this.moves, 0, moves.length);
    }

    /**
     * Centraliza a lógica de execução e o tratamento de erros, oferecendo uma
     * interface simples
     * para o usuário sem expor detalhes internos, aplicando o padrão
     * {@code Facade}.
     */
    public void move(int index, Pokemon defender) {
        try {
            moves[index].execute(this, defender);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid move index: " + index);
        } catch (NullPointerException e) {
            System.out.println("No move at index: " + index);
        }
    }
}
