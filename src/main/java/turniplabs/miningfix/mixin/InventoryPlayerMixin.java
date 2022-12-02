package turniplabs.miningfix.mixin;

import net.minecraft.src.Block;
import net.minecraft.src.InventoryPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = InventoryPlayer.class, remap = false)
public class InventoryPlayerMixin {

    @Inject(method = "canHarvestBlock", at = @At(value = "HEAD"), cancellable = true)
    public void canHarvestBlock(Block block, CallbackInfoReturnable<Boolean> cir) {
        if (block == null) {
            cir.setReturnValue(false);
        }
    }
}
