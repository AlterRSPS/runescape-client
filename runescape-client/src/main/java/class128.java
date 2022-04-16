import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
public class class128 extends class132 {
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("musicTrackArchive")
	public static AbstractArchive musicTrackArchive;
	@ObfuscatedName("i")
	String field1469;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -2112736833
	)
	int field1467;
	@ObfuscatedName("s")
	byte field1468;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	final class133 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leh;)V"
	)
	class128(class133 var1) {
		this.this$0 = var1;
		this.field1469 = null; // L: 55
	} // L: 59

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-1393452113"
	)
	void vmethod2839(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 62
			--var1.offset; // L: 63
			var1.readLong(); // L: 64
		}

		this.field1469 = var1.readStringCp1252NullTerminatedOrNull(); // L: 66
		this.field1467 = var1.readUnsignedShort(); // L: 67
		this.field1468 = var1.readByte(); // L: 68
		var1.readLong(); // L: 69
	} // L: 70

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)V",
		garbageValue = "-1714930149"
	)
	void vmethod2838(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember(); // L: 73
		var2.username = new Username(this.field1469); // L: 74
		var2.world = this.field1467; // L: 75
		var2.rank = this.field1468; // L: 76
		var1.addMember(var2); // L: 77
	} // L: 78

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)[Lia;",
		garbageValue = "0"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.UPDATE_SITESETTINGS, ServerPacket.REBUILD_REGION, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.SET_PLAYER_OP, ServerPacket.TRADING_POST_RESULTS, ServerPacket.LOGOUT, ServerPacket.IF_OPENTOP, ServerPacket.UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER, ServerPacket.REFLECTION_CHECK, ServerPacket.VARCLAN, ServerPacket.VARP_SMALL, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.AREA_SOUND, ServerPacket.UPDATE_RUNWEIGHT, ServerPacket.LOGOUT_FULL, ServerPacket.CLANSETTINGS_DELTA, ServerPacket.IF_CLOSESUB, ServerPacket.IF_OPENSUB, ServerPacket.MIDI_SONG, ServerPacket.LOC_ANIM, ServerPacket.MAPPROJ_ANIM, ServerPacket.UPDATE_UID192, ServerPacket.HEAT_MAP, ServerPacket.UPDATE_STAT, ServerPacket.MESSAGE_CLANCHANNEL, ServerPacket.UPDATE_IGNORELIST, ServerPacket.IF_SETNPCHEAD, ServerPacket.IF_SETMODEL, ServerPacket.RUNCLIENTSCRIPT, ServerPacket.HINT_ARROW, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.OBJ_ADD, ServerPacket.OBJ_DEL, ServerPacket.IF_SETOBJECT, ServerPacket.IF_SETSCROLLPOS, ServerPacket.MESSAGE_FRIENDCHANNEL, ServerPacket.IF_MOVESUB, ServerPacket.MESSAGE_PRIVATE, ServerPacket.PLAYER_INFO, ServerPacket.SET_MAP_FLAG, ServerPacket.VARP_LARGE, ServerPacket.CAM_MOVETO, ServerPacket.SEND_PING, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.CLANCHANNEL_FULL, ServerPacket.MESSAGE_PRIVATE_, ServerPacket.REBUILD_REGION_NORMAL, ServerPacket.UPDATE_ZONE_PARTIAL_FOLLOWS, ServerPacket.UPDATE_RUNENERGY, ServerPacket.IF1_MODELROTATE, ServerPacket.IF_SETCOLOUR, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.IF_SETTEXT, ServerPacket.UPDATE_INV_FULL, ServerPacket.CLANSETTINGS_FULL, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.OBJ_COUNT, ServerPacket.IF_SETANIM, ServerPacket.NPC_INFO_SMALL, ServerPacket.CAM_RESET, ServerPacket.LOC_ADD_CHANGE, ServerPacket.IF_SETANGLE, ServerPacket.URL_OPEN, ServerPacket.FRIENDLIST_LOADED, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.CAM_SHAKE, ServerPacket.CAM_LOOKAT, ServerPacket.MESSAGE_GAME, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.TOGGLE_OCULUS_ORB, ServerPacket.IF_SETEVENTS, ServerPacket.TRIGGER_ONDIALOGABORT, ServerPacket.GAMEFRAME_FULL, ServerPacket.MINIMAP_TOGGLE, ServerPacket.ENTER_FREECAM, ServerPacket.RESET_ANIMS, ServerPacket.LOC_DEL, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.SYNTH_SOUND, ServerPacket.NPC_INFO_LARGE, ServerPacket.PREFETCH_GAMEOBJECTS, ServerPacket.TRADING_POST_UPDATE, ServerPacket.MIDI_JINGLE, ServerPacket.MAP_ANIM, ServerPacket.CHAT_FILTER_SETTINGS_PRIVATECHAT, ServerPacket.LOGOUT_TRANSFER, ServerPacket.VARCLAN_ENABLE, ServerPacket.VARCLAN_DISABLE, ServerPacket.UPDATE_FRIENDCHAT_CHANNEL_FULL, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.UPDATE_INV_STOP_TRANSMIT, ServerPacket.CLANCHANNEL_DELTA, ServerPacket.IF_SETPOSITION, ServerPacket.IF_SETHIDE, ServerPacket.UNKNOWN_NPC_UPDATE2, ServerPacket.UNKNOWN_NPC_UPDATE}; // L: 106
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lko;Lko;Lko;Lko;B)V",
		garbageValue = "-43"
	)
	public static void method2720(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, AbstractArchive var3) {
		class283.Widget_archive = var0; // L: 190
		Widget.Widget_modelsArchive = var1; // L: 191
		WorldMapScaleHandler.Widget_spritesArchive = var2; // L: 192
		class134.Widget_fontsArchive = var3; // L: 193
		WorldMapSection1.Widget_interfaceComponents = new Widget[class283.Widget_archive.getGroupCount()][]; // L: 194
		class132.Widget_loadedInterfaces = new boolean[class283.Widget_archive.getGroupCount()]; // L: 195
	} // L: 196

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-63"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (class408.clientPreferences.soundEffectsVolume != 0 && var1 != 0 && Client.soundEffectCount < 50) { // L: 4067
			Client.soundEffectIds[Client.soundEffectCount] = var0; // L: 4068
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1; // L: 4069
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 4070
			Client.soundEffects[Client.soundEffectCount] = null; // L: 4071
			Client.soundLocations[Client.soundEffectCount] = 0; // L: 4072
			++Client.soundEffectCount; // L: 4073
		}

	} // L: 4075

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ljf;I)Z",
		garbageValue = "-636935524"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) { // L: 10349
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) { // L: 10350
				int var2 = class113.method2532(var0, var1); // L: 10351
				int var3 = var0.cs1ComparisonValues[var1]; // L: 10352
				if (var0.cs1Comparisons[var1] == 2) { // L: 10353
					if (var2 >= var3) { // L: 10354
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) { // L: 10356
					if (var2 <= var3) { // L: 10357
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) { // L: 10359
					if (var3 == var2) { // L: 10360
						return false;
					}
				} else if (var3 != var2) { // L: 10362
					return false;
				}
			}

			return true; // L: 10364
		}
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1742538155"
	)
	static void method2728(String var0) {
		UserComparator3.field1316 = var0; // L: 11938

		try {
			String var1 = ArchiveLoader.client.getParameter(Integer.toString(18)); // L: 11940
			String var2 = ArchiveLoader.client.getParameter(Integer.toString(13)); // L: 11941
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2; // L: 11942
			if (var0.length() == 0) { // L: 11943
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var3 = var3 + "; Expires=" + HorizontalAlignment.method3113(class111.method2516() + 94608000000L) + "; Max-Age=" + 94608000L; // L: 11944
			}

			class27.method393(ArchiveLoader.client, "document.cookie=\"" + var3 + "\""); // L: 11945
		} catch (Throwable var4) { // L: 11947
		}

	} // L: 11948
}
