import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
public enum class123 implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	field1550(0, 0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	field1545(1, 1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	field1540(2, 2),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	field1542(3, 3),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	field1543(4, 4),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	field1539(5, 5),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	field1541(6, 6),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	field1546(7, 7),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	field1547(8, 8);

	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1024399329
	)
	final int field1548;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -44674933
	)
	final int field1549;

	class123(int var3, int var4) {
		this.field1548 = var3; // L: 107
		this.field1549 = var4; // L: 108
	} // L: 109

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1549; // L: 112
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "16"
	)
	public static void perfomTeleport(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = WallDecoration.getPacketBufferNode(ClientPacket.TELEPORT, Client.packetWriter.isaacCipher); // L: 12656
		var4.packetBuffer.writeShortAdd(var1); // Y
		var4.packetBuffer.writeShortLE(var0); // X
		var4.packetBuffer.writeByteSub(var2); // Height
		var4.packetBuffer.writeIntIME(var3 ? Client.field482 * -1673751255 * 1079039769 : 0); // unknown
		Client.packetWriter.addNode(var4); // L: 12661
	} // L: 12662
}
