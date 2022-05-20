import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		intValue = 1073207223
	)
	@Export("menuX")
	static int menuX;
	@ObfuscatedName("pi")
	@ObfuscatedSignature(
		descriptor = "[Lki;"
	)
	static Widget[] field1408;
	@ObfuscatedName("o")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lns;Lns;I)I",
		garbageValue = "84512734"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) { // L: 14
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljg;",
		garbageValue = "-369068324"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.REBUILD_REGION_NORMAL, ServerPacket.PROJANIM_SPECIFIC, ServerPacket.RESET_ANIMS, ServerPacket.IF_SETANIM, ServerPacket.TRADING_POST_UPDATE, ServerPacket.IF_MOVESUB, ServerPacket.UPDATE_RUNWEIGHT, ServerPacket.TRADING_POST_RESULTS, ServerPacket.UPDATE_IGNORELIST, ServerPacket.HEAT_MAP, ServerPacket.UPDATE_SITESETTINGS, ServerPacket.UPDATE_STAT, ServerPacket.MIDI_JINGLE, ServerPacket.FRIENDLIST_LOADED, ServerPacket.RUNCLIENTSCRIPT, ServerPacket.UPDATE_RUNENERGY, ServerPacket.NPC_INFO_LARGE, ServerPacket.UPDATE_FRIENDCHAT_CHANNEL_FULL, ServerPacket.TRIGGER_ONDIALOGABORT, ServerPacket.MESSAGE_CLANCHANNEL, ServerPacket.NPC_INFO_SMALL, ServerPacket.UPDATE_ZONE_PARTIAL_FOLLOWS, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.IF_SETTEXT, ServerPacket.MESSAGE_FRIENDCHANNEL, ServerPacket.SET_MAP_FLAG, ServerPacket.LOGOUT_TRANSFER, ServerPacket.LOGOUT, ServerPacket.IF_CLOSESUB, ServerPacket.UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER, ServerPacket.LEGACY_NPC_INFO_SMALL, ServerPacket.CLANCHANNEL_FULL, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.SYNTH_SOUND, ServerPacket.VARP_LARGE, ServerPacket.CAM_LOOKAT, ServerPacket.MESSAGE_GAME, ServerPacket.IF_SETPOSITION, ServerPacket.VARCLAN_DISABLE, ServerPacket.MAP_SPOTANIM_SPECIFIC, ServerPacket.UPDATE_INV_STOP_TRANSMIT, ServerPacket.GAMEFRAME_FULL, ServerPacket.LOC_ANIM_SPECIFIC, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.PREFETCH_GAMEOBJECTS, ServerPacket.CAM_MOVETO, ServerPacket.NPC_ANIM_SPECIFIC, ServerPacket.TOGGLE_OCULUS_ORB, ServerPacket.IF_OPENSUB, ServerPacket.IF_OPENTOP, ServerPacket.IF_SETNPCHEAD, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.UPDATE_INV_FULL, ServerPacket.IF_SETCOLOUR, ServerPacket.CHAT_FILTER_SETTINGS_PRIVATECHAT, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.UPDATE_UID192, ServerPacket.VARCLAN_ENABLE, ServerPacket.LEGACY_NPC_INFO_LARGE, ServerPacket.OBJ_DEL, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.IF_SETANGLE, ServerPacket.MINIMAP_TOGGLE, ServerPacket.VARCLAN, ServerPacket.IF_SETMODEL, ServerPacket.IF_SETSCROLLPOS, ServerPacket.MAP_ANIM, ServerPacket.CLANSETTINGS_FULL, ServerPacket.IF_SETHIDE, ServerPacket.CAM_RESET, ServerPacket.OBJ_COUNT, ServerPacket.ENTER_FREECAM, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.IF1_MODELROTATE, ServerPacket.SPOTANIM_SPECIFIC, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.HINT_ARROW, ServerPacket.VARP_SMALL, ServerPacket.SET_PLAYER_OP, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.PLAYER_INFO, ServerPacket.MIDI_SONG, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.LOC_ADD_CHANGE, ServerPacket.CAM_SHAKE, ServerPacket.LOC_DEL, ServerPacket.AREA_SOUND, ServerPacket.IF_SETEVENTS, ServerPacket.PLAYER_SPOTANIM_SPECIFIC, ServerPacket.CLANSETTINGS_DELTA, ServerPacket.IF_SETOBJECT, ServerPacket.OBJ_ADD, ServerPacket.LOGOUT_FULL, ServerPacket.LOC_ANIM, ServerPacket.CAM_SMOOTHRESET, ServerPacket.MESSAGE_PRIVATE, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.CLANCHANNEL_DELTA, ServerPacket.REFLECTION_CHECK, ServerPacket.SEND_PING, ServerPacket.OPEN_URL, ServerPacket.MESSAGE_CLANCHANNEL_SYSTEM, ServerPacket.MAPPROJ_ANIM, ServerPacket.REBUILD_REGION}; // L: 113
	}
}
