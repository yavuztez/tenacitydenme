package xyz.metalix.soclient.packets;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import com.mojang.authlib.GameProfile;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.INetHandlerPlayClient;

public class S82DiscordRPC implements Packet<INetHandlerPlayClient>
{

    public S82DiscordRPC()
    {
    }


    /**
     * Reads the raw packet data from the data stream.
     */
    public void readPacketData(PacketBuffer buf) throws IOException
    {
    	byte[] asd = new byte[buf.readableBytes()];
        buf.readBytes(asd);
    }

    /**
     * Writes the raw packet data to the data stream.
     */
    public void writePacketData(PacketBuffer buf) throws IOException
    {
    }

    /**
     * Passes this Packet on to the NetHandler for processing.
     */




	@Override
	public void processPacket(INetHandlerPlayClient handler) {
		//handler.handleDiscordRPC(this);
	}
}
