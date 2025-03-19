package dev.vitortux.domain.inventory;

import java.util.ArrayList;
import java.util.List;

import dev.vitortux.domain.item.ItemStrategy;
import dev.vitortux.domain.pokemon.Pokemon;

/**
 * Classe que representa o inventário do jogador no jogo.
 * <p>
 * Esta classe utiliza o padrão Composite ao armazenar objetos que implementam
 * a interface {@link ItemStrategy}, permitindo tratar tanto itens individuais
 * quanto grupos de itens ({@link dev.vitortux.domain.item.ItemGroup}) de
 * maneira uniforme.
 * </p>
 */
public class Inventory {
    private List<ItemStrategy> items = new ArrayList<>();

    public void addItem(ItemStrategy item, int quantity) {
        for (int i = 0; i < quantity; i++) {
            this.items.add(item);
        }
    }

    public void useItem(int index, Pokemon pokemon) {
        try {
            this.items.get(index).use(pokemon);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid item index: " + index);
        }
    }

    public void removeItem(int index) {
        try {
            this.items.remove(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid item index: " + index);
        }
    }

    public void listItems() {
        for (int i = 0; i < this.items.size(); i++) {
            System.out.println(i + " - " + this.items.get(i).getClass().getSimpleName());
        }
    }
}
