package dev.vitortux.domain.player;

import dev.vitortux.domain.inventory.Inventory;
import dev.vitortux.domain.item.ItemStrategy;
import dev.vitortux.domain.pokemon.Pokemon;

public class Player {
    private String name;
    private Inventory inventory;
    private Pokemon[] pokemons = new Pokemon[6];
    private int activePokemonIndex = 0;

    public Player(String name, Pokemon... pokemons) {
        this.name = name;
        this.inventory = new Inventory();
        System.arraycopy(pokemons, 0, this.pokemons, 0, pokemons.length);
    }

    /**
     * Método de fachada para usar um item do inventário.
     * O Player expõe uma interface mais simples, delegando a lógica ao Inventory.
     */
    public void useItem(int itemIndex, int pokemonIndex) {
        this.inventory.useItem(itemIndex, this.pokemons[pokemonIndex]);
    }

    public void addItem(ItemStrategy item, int quantity) {
        this.inventory.addItem(item, quantity);
    }

    public void usePokemonMove(int moveIndex, Player target) {
        this.pokemons[this.activePokemonIndex].move(moveIndex, target.pokemons[target.activePokemonIndex]);
    }
}
