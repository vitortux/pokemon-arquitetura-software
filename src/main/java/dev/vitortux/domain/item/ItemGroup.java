package dev.vitortux.domain.item;

import dev.vitortux.domain.pokemon.Pokemon;

/**
 * Implementa o padrão Composite, permitindo tratar um grupo de itens da
 * mesma forma que um único item. Ao chamar {@code use(pokemon)}, a ação
 * é propagada para todos os itens do grupo sem alterar a lógica de uso.
 */
public class ItemGroup implements ItemStrategy {
    private ItemStrategy[] items;

    public ItemGroup(ItemStrategy... items) {
        this.items = items;
    }

    @Override
    public void use(Pokemon pokemon) {
        System.out.println("Usando grupo de itens...");
        for (ItemStrategy item : items) {
            item.use(pokemon);
        }
    }
}
