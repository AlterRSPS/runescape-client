import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
public class ZoneUpdate {
	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static class387 HitSplatDefinition_cachedSprites;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	public static final ZoneUpdate MAPPROJ_ANIM;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	public static final ZoneUpdate OBJ_COUNT;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	public static final ZoneUpdate LOC_ANIM;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	public static final ZoneUpdate OBJ_ADD;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	public static final ZoneUpdate LOC_DEL;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	public static final ZoneUpdate MAP_ANIM;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	public static final ZoneUpdate PREFETCH_GAMEOBJECTS;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	public static final ZoneUpdate AREA_SOUND;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	public static final ZoneUpdate OBJ_DEL;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	public static final ZoneUpdate LOC_ADD_CHANGE;

	static {
		MAPPROJ_ANIM = new ZoneUpdate(15); // L: 5
		OBJ_COUNT = new ZoneUpdate(7); // L: 6
		LOC_ANIM = new ZoneUpdate(4); // L: 7
		OBJ_ADD = new ZoneUpdate(5); // L: 8
		LOC_DEL = new ZoneUpdate(2); // L: 9
		MAP_ANIM = new ZoneUpdate(6); // L: 10
		PREFETCH_GAMEOBJECTS = new ZoneUpdate(14); // L: 11
		AREA_SOUND = new ZoneUpdate(5); // L: 12
		OBJ_DEL = new ZoneUpdate(3); // L: 13
		LOC_ADD_CHANGE = new ZoneUpdate(4); // L: 14
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "15"
	)
	ZoneUpdate(int var1) {
	} // L: 20

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)[Lim;",
		garbageValue = "1489383005"
	)
	static LoginPacket[] method4711() {
		return new LoginPacket[]{LoginPacket.field2897, LoginPacket.field2901, LoginPacket.field2900, LoginPacket.field2899, LoginPacket.field2896, LoginPacket.field2894}; // L: 22
	}
}
