package cmdrnorthpaw.scissor_race;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class TickEventHandler {
    @SubscribeEvent
    public static void serverTickEvent(TickEvent.PlayerTickEvent event) {
        PlayerEntity player = event.player;
        if (player.isSprinting()) {
            Item heldItem = player.getHeldItemMainhand().getItem();
            Item shears = Item.getItemById(359);
            if (heldItem == shears) {
                player.attackEntityFrom(DamageSource.CACTUS, 1.0F);

            }
        }
    }
}

