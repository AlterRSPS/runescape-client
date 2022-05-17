import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
@Implements("ServerPacket")
public class ServerPacket {
	@ObfuscatedName("um")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket REBUILD_REGION_NORMAL;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket PROJANIM_SPECIFIC;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket RESET_ANIMS;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket IF_SETANIM;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket TRADING_POST_UPDATE;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket IF_MOVESUB;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket UPDATE_RUNWEIGHT;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket TRADING_POST_RESULTS;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket UPDATE_IGNORELIST;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket HEAT_MAP;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket UPDATE_SITESETTINGS;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket UPDATE_STAT;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket MIDI_JINGLE;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket FRIENDLIST_LOADED;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket RUNCLIENTSCRIPT;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket UPDATE_RUNENERGY;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket NPC_INFO_LARGE;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket UPDATE_FRIENDCHAT_CHANNEL_FULL;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket TRIGGER_ONDIALOGABORT;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket MESSAGE_CLANCHANNEL;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket NPC_INFO_SMALL;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket UPDATE_ZONE_PARTIAL_FOLLOWS;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket UPDATE_FRIENDLIST;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket IF_SETTEXT;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket MESSAGE_FRIENDCHANNEL;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket SET_MAP_FLAG;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket LOGOUT_TRANSFER;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket LOGOUT;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket IF_CLOSESUB;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket LEGACY_NPC_INFO_SMALL;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket CLANCHANNEL_FULL;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket SYNTH_SOUND;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket VARP_LARGE;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket CAM_LOOKAT;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket MESSAGE_GAME;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket IF_SETPOSITION;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket VARCLAN_DISABLE;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket MAP_SPOTANIM_SPECIFIC;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket UPDATE_INV_STOP_TRANSMIT;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket GAMEFRAME_FULL;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket LOC_ANIM_SPECIFIC;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket UPDATE_REBOOT_TIMER;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket PREFETCH_GAMEOBJECTS;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket CAM_MOVETO;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket NPC_ANIM_SPECIFIC;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket TOGGLE_OCULUS_ORB;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket IF_OPENSUB;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket IF_OPENTOP;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket IF_SETNPCHEAD;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket SYNC_CLIENT_VARCACHE;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket UPDATE_INV_FULL;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket IF_SETCOLOUR;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket CHAT_FILTER_SETTINGS_PRIVATECHAT;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket UPDATE_INV_CLEAR;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket UPDATE_UID192;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket VARCLAN_ENABLE;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket LEGACY_NPC_INFO_LARGE;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket OBJ_DEL;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket UPDATE_ZONE_FULL_FOLLOWS;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket IF_SETANGLE;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket MINIMAP_TOGGLE;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket VARCLAN;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket IF_SETMODEL;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket IF_SETSCROLLPOS;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket MAP_ANIM;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket CLANSETTINGS_FULL;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket IF_SETHIDE;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket CAM_RESET;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket OBJ_COUNT;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket ENTER_FREECAM;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket IF_SETPLAYERHEAD;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket IF1_MODELROTATE;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket SPOTANIM_SPECIFIC;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket RESET_CLIENT_VARCACHE;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket HINT_ARROW;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket VARP_SMALL;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket SET_PLAYER_OP;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket MESSAGE_PRIVATE_ECHO;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket PLAYER_INFO;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket MIDI_SONG;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket CHAT_FILTER_SETTINGS;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket LOC_DEL;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket CAM_SHAKE;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket LOC_ADD_CHANGE;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket AREA_SOUND;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket IF_SETEVENTS;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket PLAYER_SPOTANIM_SPECIFIC;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket CLANSETTINGS_DELTA;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket IF_SETOBJECT;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket OBJ_ADD;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket LOGOUT_FULL;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket LOC_ANIM;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket CAM_SMOOTHRESET;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket MESSAGE_PRIVATE;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket UPDATE_INV_PARTIAL;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket CLANCHANNEL_DELTA;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket REFLECTION_CHECK;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket SEND_PING;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket OPEN_URL;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket MESSAGE_CLANCHANNEL_SYSTEM;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket MAPPROJ_ANIM;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final ServerPacket REBUILD_REGION;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -1591353555
	)
	@Export("id")
	public final int id;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 1497414687
	)
	@Export("length")
	public final int length;

	static {
		REBUILD_REGION_NORMAL = new ServerPacket(0, -2); // L: 5
		PROJANIM_SPECIFIC = new ServerPacket(1, 17); // L: 6
		RESET_ANIMS = new ServerPacket(2, 0); // L: 7
		IF_SETANIM = new ServerPacket(3, 6); // L: 8
		TRADING_POST_UPDATE = new ServerPacket(4, 20); // L: 9
		IF_MOVESUB = new ServerPacket(5, 8); // L: 10
		UPDATE_RUNWEIGHT = new ServerPacket(6, 2); // L: 11
		TRADING_POST_RESULTS = new ServerPacket(7, -2); // L: 12
		UPDATE_IGNORELIST = new ServerPacket(8, -2); // L: 13
		HEAT_MAP = new ServerPacket(9, 1); // L: 14
		UPDATE_SITESETTINGS = new ServerPacket(10, -1); // L: 15
		UPDATE_STAT = new ServerPacket(11, 6); // L: 16
		MIDI_JINGLE = new ServerPacket(12, 5); // L: 17
		FRIENDLIST_LOADED = new ServerPacket(13, 0); // L: 18
		RUNCLIENTSCRIPT = new ServerPacket(14, -2); // L: 19
		UPDATE_RUNENERGY = new ServerPacket(15, 1); // L: 20
		NPC_INFO_LARGE = new ServerPacket(16, -2); // L: 21
		UPDATE_FRIENDCHAT_CHANNEL_FULL = new ServerPacket(17, -2); // L: 22
		TRIGGER_ONDIALOGABORT = new ServerPacket(18, 0); // L: 23
		MESSAGE_CLANCHANNEL = new ServerPacket(19, -1); // L: 24
		NPC_INFO_SMALL = new ServerPacket(20, -2); // L: 25
		UPDATE_ZONE_PARTIAL_FOLLOWS = new ServerPacket(21, 2); // L: 26
		UPDATE_FRIENDLIST = new ServerPacket(22, -2); // L: 27
		IF_SETTEXT = new ServerPacket(23, -2); // L: 28
		MESSAGE_FRIENDCHANNEL = new ServerPacket(24, -1); // L: 29
		SET_MAP_FLAG = new ServerPacket(25, 2); // L: 30
		LOGOUT_TRANSFER = new ServerPacket(26, -1); // L: 31
		LOGOUT = new ServerPacket(27, 1); // L: 32
		IF_CLOSESUB = new ServerPacket(28, 4); // L: 33
		UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER = new ServerPacket(29, -1); // L: 34
		LEGACY_NPC_INFO_SMALL = new ServerPacket(30, -2); // L: 35
		CLANCHANNEL_FULL = new ServerPacket(31, -2); // L: 36
		UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerPacket(32, -2); // L: 37
		SYNTH_SOUND = new ServerPacket(33, 5); // L: 38
		VARP_LARGE = new ServerPacket(34, 6); // L: 39
		CAM_LOOKAT = new ServerPacket(35, 6); // L: 40
		MESSAGE_GAME = new ServerPacket(36, -1); // L: 41
		IF_SETPOSITION = new ServerPacket(37, 8); // L: 42
		VARCLAN_DISABLE = new ServerPacket(38, 0); // L: 43
		MAP_SPOTANIM_SPECIFIC = new ServerPacket(39, 8); // L: 44
		UPDATE_INV_STOP_TRANSMIT = new ServerPacket(40, 2); // L: 45
		GAMEFRAME_FULL = new ServerPacket(41, -2); // L: 46
		LOC_ANIM_SPECIFIC = new ServerPacket(42, 6); // L: 47
		UPDATE_REBOOT_TIMER = new ServerPacket(43, 2); // L: 48
		PREFETCH_GAMEOBJECTS = new ServerPacket(44, 14); // L: 49
		CAM_MOVETO = new ServerPacket(45, 6); // L: 50
		NPC_ANIM_SPECIFIC = new ServerPacket(46, 5); // L: 51
		TOGGLE_OCULUS_ORB = new ServerPacket(47, 4); // L: 52
		IF_OPENSUB = new ServerPacket(48, 7); // L: 53
		IF_OPENTOP = new ServerPacket(49, 2); // L: 54
		IF_SETNPCHEAD = new ServerPacket(50, 6); // L: 55
		SYNC_CLIENT_VARCACHE = new ServerPacket(51, 0); // L: 56
		UPDATE_INV_FULL = new ServerPacket(52, -2); // L: 57
		IF_SETCOLOUR = new ServerPacket(53, 6); // L: 58
		CHAT_FILTER_SETTINGS_PRIVATECHAT = new ServerPacket(54, 1); // L: 59
		UPDATE_INV_CLEAR = new ServerPacket(55, 4); // L: 60
		UPDATE_UID192 = new ServerPacket(56, 28); // L: 61
		VARCLAN_ENABLE = new ServerPacket(57, 0); // L: 62
		LEGACY_NPC_INFO_LARGE = new ServerPacket(58, -2); // L: 63
		OBJ_DEL = new ServerPacket(59, 3); // L: 64
		UPDATE_ZONE_FULL_FOLLOWS = new ServerPacket(60, 2); // L: 65
		IF_SETANGLE = new ServerPacket(61, 10); // L: 66
		MINIMAP_TOGGLE = new ServerPacket(62, 1); // L: 67
		VARCLAN = new ServerPacket(63, -1); // L: 68
		IF_SETMODEL = new ServerPacket(64, 6); // L: 69
		IF_SETSCROLLPOS = new ServerPacket(65, 6); // L: 70
		MAP_ANIM = new ServerPacket(66, 6); // L: 71
		CLANSETTINGS_FULL = new ServerPacket(67, -2); // L: 72
		IF_SETHIDE = new ServerPacket(68, 5); // L: 73
		CAM_RESET = new ServerPacket(69, 0); // L: 74
		OBJ_COUNT = new ServerPacket(70, 7); // L: 75
		ENTER_FREECAM = new ServerPacket(71, 1); // L: 76
		IF_SETPLAYERHEAD = new ServerPacket(72, 4); // L: 77
		IF1_MODELROTATE = new ServerPacket(73, 8); // L: 78
		SPOTANIM_SPECIFIC = new ServerPacket(74, 8); // L: 79
		RESET_CLIENT_VARCACHE = new ServerPacket(75, 0); // L: 80
		HINT_ARROW = new ServerPacket(76, 6); // L: 81
		VARP_SMALL = new ServerPacket(77, 3); // L: 82
		SET_PLAYER_OP = new ServerPacket(78, -1); // L: 83
		MESSAGE_PRIVATE_ECHO = new ServerPacket(79, -2); // L: 84
		PLAYER_INFO = new ServerPacket(80, -2); // L: 85
		MIDI_SONG = new ServerPacket(81, 2); // L: 86
		CHAT_FILTER_SETTINGS = new ServerPacket(82, 2); // L: 87
		LOC_DEL = new ServerPacket(83, 4); // L: 88
		CAM_SHAKE = new ServerPacket(84, 4); // L: 89
		LOC_ADD_CHANGE = new ServerPacket(85, 2); // L: 90
		AREA_SOUND = new ServerPacket(86, 5); // L: 91
		IF_SETEVENTS = new ServerPacket(87, 12); // L: 92
		PLAYER_SPOTANIM_SPECIFIC = new ServerPacket(88, 8); // L: 93
		CLANSETTINGS_DELTA = new ServerPacket(89, -2); // L: 94
		IF_SETOBJECT = new ServerPacket(90, 10); // L: 95
		OBJ_ADD = new ServerPacket(91, 5); // L: 96
		LOGOUT_FULL = new ServerPacket(92, 0); // L: 97
		LOC_ANIM = new ServerPacket(93, 4); // L: 98
		CAM_SMOOTHRESET = new ServerPacket(94, 4); // L: 99
		MESSAGE_PRIVATE = new ServerPacket(95, -2); // L: 100
		UPDATE_INV_PARTIAL = new ServerPacket(96, -2); // L: 101
		CLANCHANNEL_DELTA = new ServerPacket(97, -2); // L: 102
		REFLECTION_CHECK = new ServerPacket(98, -2); // L: 103
		SEND_PING = new ServerPacket(99, 8); // L: 104
		OPEN_URL = new ServerPacket(100, -2); // L: 105
		MESSAGE_CLANCHANNEL_SYSTEM = new ServerPacket(101, -1); // L: 106
		MAPPROJ_ANIM = new ServerPacket(102, 15); // L: 107
		REBUILD_REGION = new ServerPacket(103, -2); // L: 108
	}

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
