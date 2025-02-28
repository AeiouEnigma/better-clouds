package com.qendolin.betterclouds.mixin;

import net.minecraft.client.render.Shader;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(Shader.class)
public interface ShaderAccessor {
    @Accessor("activeShaderId")
    public static void setActiveShader(int id) {
        throw new AssertionError();
    }
    @Accessor("activeShaderId")
    public static int getActiveShader() {
        throw new AssertionError();
    }
}
