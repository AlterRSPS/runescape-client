import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
@Implements("ServerPacket")
public class ServerPacket {

	static WorldMap worldMap;

	public final int id;
	public final int length;

	public static final ServerPacket REBUILD_REGION_NORMAL = new ServerPacket(0, -2); // L: 5
	public static final ServerPacket PROJANIM_SPECIFIC = new ServerPacket(1, 17); // L: 6
	public static final ServerPacket RESET_ANIMS = new ServerPacket(2, 0); // L: 7
	public static final ServerPacket IF_SETANIM = new ServerPacket(3, 6); // L: 8
	public static final ServerPacket TRADING_POST_UPDATE = new ServerPacket(4, 20); // L: 9
	public static final ServerPacket IF_MOVESUB = new ServerPacket(5, 8); // L: 10
	public static final ServerPacket UPDATE_RUNWEIGHT = new ServerPacket(6, 2); // L: 11
	public static final ServerPacket TRADING_POST_RESULTS = new ServerPacket(7, -2); // L: 12
	public static final ServerPacket UPDATE_IGNORELIST = new ServerPacket(8, -2); // L: 13
	public static final ServerPacket HEAT_MAP = new ServerPacket(9, 1); // L: 14
	public static final ServerPacket UPDATE_SITESETTINGS = new ServerPacket(10, -1); // L: 15
	public static final ServerPacket UPDATE_STAT = new ServerPacket(11, 6); // L: 16
	public static final ServerPacket MIDI_JINGLE = new ServerPacket(12, 5); // L: 17
	public static final ServerPacket FRIENDLIST_LOADED = new ServerPacket(13, 0); // L: 18
	public static final ServerPacket RUNCLIENTSCRIPT = new ServerPacket(14, -2); // L: 19
	public static final ServerPacket UPDATE_RUNENERGY = new ServerPacket(15, 1); // L: 20
	public static final ServerPacket NPC_INFO_LARGE = new ServerPacket(16, -2); // L: 21
	public static final ServerPacket UPDATE_FRIENDCHAT_CHANNEL_FULL = new ServerPacket(17, -2); // L: 22
	public static final ServerPacket TRIGGER_ONDIALOGABORT = new ServerPacket(18, 0); // L: 23
	public static final ServerPacket MESSAGE_CLANCHANNEL = new ServerPacket(19, -1); // L: 24
	public static final ServerPacket NPC_INFO_SMALL = new ServerPacket(20, -2); // L: 25
	public static final ServerPacket UPDATE_ZONE_PARTIAL_FOLLOWS = new ServerPacket(21, 2); // L: 26
	public static final ServerPacket UPDATE_FRIENDLIST = new ServerPacket(22, -2); // L: 27
	public static final ServerPacket IF_SETTEXT = new ServerPacket(23, -2); // L: 28
	public static final ServerPacket MESSAGE_FRIENDCHANNEL = new ServerPacket(24, -1); // L: 29
	public static final ServerPacket SET_MAP_FLAG = new ServerPacket(25, 2); // L: 30
	public static final ServerPacket LOGOUT_TRANSFER = new ServerPacket(26, -1); // L: 31
	public static final ServerPacket LOGOUT = new ServerPacket(27, 1); // L: 32
	public static final ServerPacket IF_CLOSESUB = new ServerPacket(28, 4); // L: 33
	public static final ServerPacket UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER = new ServerPacket(29, -1); // L: 34
	public static final ServerPacket LEGACY_NPC_INFO_SMALL = new ServerPacket(30, -2); // L: 35
	public static final ServerPacket CLANCHANNEL_FULL = new ServerPacket(31, -2); // L: 36
	public static final ServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerPacket(32, -2); // L: 37
	public static final ServerPacket SYNTH_SOUND = new ServerPacket(33, 5); // L: 38
	public static final ServerPacket VARP_LARGE = new ServerPacket(34, 6); // L: 39
	public static final ServerPacket CAM_LOOKAT = new ServerPacket(35, 6); // L: 40
	public static final ServerPacket MESSAGE_GAME = new ServerPacket(36, -1); // L: 41
	public static final ServerPacket IF_SETPOSITION = new ServerPacket(37, 8); // L: 42
	public static final ServerPacket VARCLAN_DISABLE = new ServerPacket(38, 0); // L: 43
	public static final ServerPacket MAP_SPOTANIM_SPECIFIC = new ServerPacket(39, 8); // L: 44
	public static final ServerPacket UPDATE_INV_STOP_TRANSMIT = new ServerPacket(40, 2); // L: 45
	public static final ServerPacket GAMEFRAME_FULL = new ServerPacket(41, -2); // L: 46
	public static final ServerPacket LOC_ANIM_SPECIFIC = new ServerPacket(42, 6); // L: 47
	public static final ServerPacket UPDATE_REBOOT_TIMER = new ServerPacket(43, 2); // L: 48
	public static final ServerPacket PREFETCH_GAMEOBJECTS = new ServerPacket(44, 14); // L: 49
	public static final ServerPacket CAM_MOVETO = new ServerPacket(45, 6); // L: 50
	public static final ServerPacket NPC_ANIM_SPECIFIC = new ServerPacket(46, 5); // L: 51
	public static final ServerPacket TOGGLE_OCULUS_ORB = new ServerPacket(47, 4); // L: 52
	public static final ServerPacket IF_OPENSUB = new ServerPacket(48, 7); // L: 53
	public static final ServerPacket IF_OPENTOP = new ServerPacket(49, 2); // L: 54
	public static final ServerPacket IF_SETNPCHEAD = new ServerPacket(50, 6); // L: 55
	public static final ServerPacket SYNC_CLIENT_VARCACHE = new ServerPacket(51, 0); // L: 56
	public static final ServerPacket UPDATE_INV_FULL = new ServerPacket(52, -2); // L: 57
	public static final ServerPacket IF_SETCOLOUR = new ServerPacket(53, 6); // L: 58
	public static final ServerPacket CHAT_FILTER_SETTINGS_PRIVATECHAT = new ServerPacket(54, 1); // L: 59
	public static final ServerPacket UPDATE_INV_CLEAR = new ServerPacket(55, 4); // L: 60
	public static final ServerPacket UPDATE_UID192 = new ServerPacket(56, 28); // L: 61
	public static final ServerPacket VARCLAN_ENABLE = new ServerPacket(57, 0); // L: 62
	public static final ServerPacket LEGACY_NPC_INFO_LARGE = new ServerPacket(58, -2); // L: 63
	public static final ServerPacket OBJ_DEL = new ServerPacket(59, 3); // L: 64
	public static final ServerPacket UPDATE_ZONE_FULL_FOLLOWS = new ServerPacket(60, 2); // L: 65
	public static final ServerPacket IF_SETANGLE = new ServerPacket(61, 10); // L: 66
	public static final ServerPacket MINIMAP_TOGGLE = new ServerPacket(62, 1); // L: 67
	public static final ServerPacket VARCLAN = new ServerPacket(63, -1); // L: 68
	public static final ServerPacket IF_SETMODEL = new ServerPacket(64, 6); // L: 69
	public static final ServerPacket IF_SETSCROLLPOS = new ServerPacket(65, 6); // L: 70
	public static final ServerPacket MAP_ANIM = new ServerPacket(66, 6); // L: 71
	public static final ServerPacket CLANSETTINGS_FULL = new ServerPacket(67, -2); // L: 72
	public static final ServerPacket IF_SETHIDE = new ServerPacket(68, 5); // L: 73
	public static final ServerPacket CAM_RESET = new ServerPacket(69, 0); // L: 74
	public static final ServerPacket OBJ_COUNT = new ServerPacket(70, 7); // L: 75
	public static final ServerPacket ENTER_FREECAM = new ServerPacket(71, 1); // L: 76
	public static final ServerPacket IF_SETPLAYERHEAD = new ServerPacket(72, 4); // L: 77
	public static final ServerPacket IF1_MODELROTATE = new ServerPacket(73, 8); // L: 78
	public static final ServerPacket SPOTANIM_SPECIFIC = new ServerPacket(74, 8); // L: 79
	public static final ServerPacket RESET_CLIENT_VARCACHE = new ServerPacket(75, 0); // L: 80
	public static final ServerPacket HINT_ARROW = new ServerPacket(76, 6); // L: 81
	public static final ServerPacket VARP_SMALL = new ServerPacket(77, 3); // L: 82
	public static final ServerPacket SET_PLAYER_OP = new ServerPacket(78, -1); // L: 83
	public static final ServerPacket MESSAGE_PRIVATE_ECHO = new ServerPacket(79, -2); // L: 84
	public static final ServerPacket PLAYER_INFO = new ServerPacket(80, -2); // L: 85
	public static final ServerPacket MIDI_SONG = new ServerPacket(81, 2); // L: 86
	public static final ServerPacket CHAT_FILTER_SETTINGS = new ServerPacket(82, 2); // L: 87
	public static final ServerPacket LOC_ADD_CHANGE = new ServerPacket(83, 4); // L: 88
	public static final ServerPacket CAM_SHAKE = new ServerPacket(84, 4); // L: 89
	public static final ServerPacket LOC_DEL = new ServerPacket(85, 2); // L: 90
	public static final ServerPacket AREA_SOUND = new ServerPacket(86, 5); // L: 91
	public static final ServerPacket IF_SETEVENTS = new ServerPacket(87, 12); // L: 92
	public static final ServerPacket PLAYER_SPOTANIM_SPECIFIC = new ServerPacket(88, 8); // L: 93
	public static final ServerPacket CLANSETTINGS_DELTA = new ServerPacket(89, -2); // L: 94
	public static final ServerPacket IF_SETOBJECT = new ServerPacket(90, 10); // L: 95
	public static final ServerPacket OBJ_ADD = new ServerPacket(91, 5); // L: 96
	public static final ServerPacket LOGOUT_FULL = new ServerPacket(92, 0); // L: 97
	public static final ServerPacket LOC_ANIM = new ServerPacket(93, 4); // L: 98
	public static final ServerPacket CAM_SMOOTHRESET = new ServerPacket(94, 4); // L: 99
	public static final ServerPacket MESSAGE_PRIVATE = new ServerPacket(95, -2); // L: 100
	public static final ServerPacket UPDATE_INV_PARTIAL = new ServerPacket(96, -2); // L: 101
	public static final ServerPacket CLANCHANNEL_DELTA = new ServerPacket(97, -2); // L: 102
	public static final ServerPacket REFLECTION_CHECK = new ServerPacket(98, -2); // L: 103
	public static final ServerPacket SEND_PING = new ServerPacket(99, 8); // L: 104
	public static final ServerPacket OPEN_URL = new ServerPacket(100, -2); // L: 105
	public static final ServerPacket MESSAGE_CLANCHANNEL_SYSTEM = new ServerPacket(101, -1); // L: 106
	public static final ServerPacket MAPPROJ_ANIM = new ServerPacket(102, 15); // L: 107
	public static final ServerPacket REBUILD_REGION = new ServerPacket(103, -2); // L: 108

	ServerPacket(int var1, int var2) {
		this.id = var1; // L: 117
		this.length = var2; // L: 118
	} // L: 119

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "238481455"
	)
	public static int[] method5020() {
		int[] var0 = new int[KeyHandler.field134]; // L: 250

		for (int var1 = 0; var1 < KeyHandler.field134; ++var1) { // L: 251
			var0[var1] = KeyHandler.field140[var1]; // L: 252
		}

		return var0; // L: 254
	}
}
