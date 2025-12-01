package net.go1nd.tutorailmod.item;

import net.go1nd.tutorailmod.TutorialMod;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TutorialMod.MOD_ID);

    public static final DeferredItem<Item> BLUEAPPLE = ITEMS.register(
            "blueapple", () -> new Item(new Item.Properties().rarity(Rarity.RARE).food(Foods.GOLDEN_APPLE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
