import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ja")
public class ZoneUpdate {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	public static final ZoneUpdate MAP_ANIM;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	public static final ZoneUpdate OBJ_COUNT;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	public static final ZoneUpdate MAPPROJ_ANIM;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	public static final ZoneUpdate PREFETCH_GAMEOBJECTS;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	public static final ZoneUpdate LOC_DEL;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	public static final ZoneUpdate OBJ_DEL;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	public static final ZoneUpdate LOC_ADD_CHANGE;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	public static final ZoneUpdate AREA_SOUND;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	public static final ZoneUpdate OBJ_ADD;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	public static final ZoneUpdate LOC_ANIM;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("fq")
	@ObfuscatedGetter(
		intValue = 1922609665
	)
	static int field3070;

	static {
		MAP_ANIM = new ZoneUpdate(6); // L: 5
		OBJ_COUNT = new ZoneUpdate(7); // L: 6
		MAPPROJ_ANIM = new ZoneUpdate(15); // L: 7
		PREFETCH_GAMEOBJECTS = new ZoneUpdate(14); // L: 8
		LOC_DEL = new ZoneUpdate(4); // L: 9
		OBJ_DEL = new ZoneUpdate(3); // L: 10
		LOC_ADD_CHANGE = new ZoneUpdate(2); // L: 11
		AREA_SOUND = new ZoneUpdate(5); // L: 12
		OBJ_ADD = new ZoneUpdate(5); // L: 13
		LOC_ANIM = new ZoneUpdate(4); // L: 14
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "6"
	)
    ZoneUpdate(int var1) {
	} // L: 20

	@ObfuscatedName("l")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 49
			if (var0 % 37L == 0L) { // L: 50
				return null;
			} else {
				int var2 = 0; // L: 51

				for (long var3 = var0; var3 != 0L; var3 /= 37L) { // L: 52 53 55
					++var2; // L: 54
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) { // L: 57 58 67
					long var6 = var0; // L: 59
					var0 /= 37L; // L: 60
					var8 = class345.base37Table[(int)(var6 - var0 * 37L)]; // L: 61
					if (var8 == '_') { // L: 62
						int var9 = var5.length() - 1; // L: 63
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9))); // L: 64
						var8 = 160; // L: 65
					}
				}

				var5.reverse(); // L: 69
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0))); // L: 70
				return var5.toString(); // L: 71
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(Lca;ZB)V",
		garbageValue = "-125"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) { // L: 4953
			var0.isUnanimated = false; // L: 4954
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.idleSequence == var0.movementSequence) { // L: 4955 4956
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7; // L: 4958
			int var3 = var0.y >> 7; // L: 4959
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 4960
				long var4 = VarbitComposition.calculateTag(0, 0, 0, false, var0.index); // L: 4961
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) { // L: 4962
					var0.isUnanimated = false; // L: 4963
					var0.tileHeight = class202.getTileHeight(var0.x, var0.y, class128.Client_plane); // L: 4964
					var0.playerCycle = Client.cycle; // L: 4965
					class175.scene.addNullableObject(class128.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY); // L: 4966
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) { // L: 4969
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) { // L: 4970
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount; // L: 4971
					}

					var0.tileHeight = class202.getTileHeight(var0.x, var0.y, class128.Client_plane); // L: 4973
					var0.playerCycle = Client.cycle; // L: 4974
					class175.scene.drawEntity(class128.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking); // L: 4975
				}
			}
		}

	} // L: 4979
}
