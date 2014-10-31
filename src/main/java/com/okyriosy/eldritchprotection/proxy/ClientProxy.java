package com.okyriosy.eldritchprotection.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import org.lwjgl.input.Keyboard;


public class ClientProxy extends CommonProxy{



    @Override
    public boolean isShiftdown() {
        return Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT);
    }


    @Override
    public void printMessageToPlayer(String msg) {
        Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(msg));
    }













}
