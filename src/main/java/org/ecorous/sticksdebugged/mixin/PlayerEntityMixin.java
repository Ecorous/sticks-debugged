package org.ecorous.sticksdebugged.mixin;

import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin
{
	@Inject(at = @At("HEAD"), method = "isCreativeLevelTwoOp", cancellable = true)
	private void allowStickUsage(CallbackInfoReturnable<Boolean> cir) {cir.setReturnValue(true);}
}
