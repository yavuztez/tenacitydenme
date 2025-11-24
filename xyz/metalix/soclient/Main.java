package xyz.metalix.soclient;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

import com.google.gson.JsonObject;
import io.netty.buffer.Unpooled;
import net.minecraft.client.Minecraft;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.client.C17PacketCustomPayload;
import xyz.metalix.soclient.events.Event;
import xyz.metalix.soclient.events.impl.ChatEvent;
import xyz.metalix.soclient.packets.C80Info;

public class Main {
	
	public static boolean isSonOyuncu = true;
	public static final EventBus bus = new EventBus();
	
	public void init() {
		bus.register(this);
	}
	
	public static void callEvent(Event event) {
		bus.post(event);
	}
	
	@Subscribe
	public void chat(ChatEvent event) {
	}


	
	public static void quitServer() {
		Minecraft.getMinecraft().logger.info("Quit!");
		isSonOyuncu = true;
	}
}
