import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
@Implements("ServerPacket")
public class ServerPacket {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket UPDATE_SITESETTINGS;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket REBUILD_REGION;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket MESSAGE_PRIVATE_ECHO;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket SET_PLAYER_OP;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket TRADING_POST_RESULTS;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket LOGOUT;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket IF_OPENTOP;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket REFLECTION_CHECK;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket VARCLAN;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket VARP_SMALL;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket UPDATE_INV_PARTIAL;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket AREA_SOUND;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket UPDATE_RUNWEIGHT;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket LOGOUT_FULL;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket CLANSETTINGS_DELTA;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket IF_CLOSESUB;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket IF_OPENSUB;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket MIDI_SONG;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket LOC_ANIM;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket MAPPROJ_ANIM;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket UPDATE_UID192;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket HEAT_MAP;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket UPDATE_STAT;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket MESSAGE_CLANCHANNEL;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket UPDATE_IGNORELIST;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket IF_SETNPCHEAD;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket IF_SETMODEL;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket RUNCLIENTSCRIPT;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket HINT_ARROW;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket CHAT_FILTER_SETTINGS;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket OBJ_ADD;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket OBJ_DEL;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket IF_SETOBJECT;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket IF_SETSCROLLPOS;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket MESSAGE_FRIENDCHANNEL;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket IF_MOVESUB;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket MESSAGE_PRIVATE;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket PLAYER_INFO;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket SET_MAP_FLAG;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket VARP_LARGE;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket CAM_MOVETO;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket SEND_PING;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket UPDATE_INV_CLEAR;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket UPDATE_ZONE_FULL_FOLLOWS;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket CLANCHANNEL_FULL;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket MESSAGE_PRIVATE_;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket REBUILD_REGION_NORMAL;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket UPDATE_ZONE_PARTIAL_FOLLOWS;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket UPDATE_RUNENERGY;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket IF1_MODELROTATE;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket IF_SETCOLOUR;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket RESET_CLIENT_VARCACHE;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket IF_SETTEXT;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket UPDATE_INV_FULL;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket CLANSETTINGS_FULL;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket OBJ_COUNT;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket IF_SETANIM;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket NPC_INFO_SMALL;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket CAM_RESET;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket LOC_ADD_CHANGE;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket IF_SETANGLE;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket URL_OPEN;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket FRIENDLIST_LOADED;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket UPDATE_FRIENDLIST;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket CAM_SHAKE;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket CAM_LOOKAT;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket MESSAGE_GAME;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket UPDATE_REBOOT_TIMER;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket TOGGLE_OCULUS_ORB;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket IF_SETEVENTS;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket TRIGGER_ONDIALOGABORT;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket GAMEFRAME_FULL;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket MINIMAP_TOGGLE;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket ENTER_FREECAM;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket RESET_ANIMS;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket LOC_DEL;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket SYNC_CLIENT_VARCACHE;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket SYNTH_SOUND;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket NPC_INFO_LARGE;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket PREFETCH_GAMEOBJECTS;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket TRADING_POST_UPDATE;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket MIDI_JINGLE;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket MAP_ANIM;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket CHAT_FILTER_SETTINGS_PRIVATECHAT;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket LOGOUT_TRANSFER;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket VARCLAN_ENABLE;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket VARCLAN_DISABLE;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket UPDATE_FRIENDCHAT_CHANNEL_FULL;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket IF_SETPLAYERHEAD;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket UPDATE_INV_STOP_TRANSMIT;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket CLANCHANNEL_DELTA;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket IF_SETPOSITION;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket IF_SETHIDE;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket UNKNOWN_NPC_UPDATE2;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final ServerPacket UNKNOWN_NPC_UPDATE;
	@ObfuscatedName("fz")
	static int[] field2893;
	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "[Low;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1996281945
	)
	@Export("id")
	public final int id;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1899080967
	)
	@Export("length")
	public final int length;

	static {
		UPDATE_SITESETTINGS = new ServerPacket(0, -1); // L: 5
		REBUILD_REGION = new ServerPacket(1, -2); // L: 6
		MESSAGE_PRIVATE_ECHO = new ServerPacket(2, -2); // L: 7
		SET_PLAYER_OP = new ServerPacket(3, -1); // L: 8
		TRADING_POST_RESULTS = new ServerPacket(4, -2); // L: 9
		LOGOUT = new ServerPacket(5, 1); // L: 10
		IF_OPENTOP = new ServerPacket(6, 2); // L: 11
		UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER = new ServerPacket(7, -1); // L: 12
		REFLECTION_CHECK = new ServerPacket(8, -2); // L: 13
		VARCLAN = new ServerPacket(9, -1); // L: 14
		VARP_SMALL = new ServerPacket(10, 3); // L: 15
		UPDATE_INV_PARTIAL = new ServerPacket(11, -2); // L: 16
		AREA_SOUND = new ServerPacket(12, 5); // L: 17
		UPDATE_RUNWEIGHT = new ServerPacket(13, 2); // L: 18
		LOGOUT_FULL = new ServerPacket(14, 0); // L: 19
		CLANSETTINGS_DELTA = new ServerPacket(15, -2); // L: 20
		IF_CLOSESUB = new ServerPacket(16, 4); // L: 21
		IF_OPENSUB = new ServerPacket(17, 7); // L: 22
		MIDI_SONG = new ServerPacket(18, 2); // L: 23
		LOC_ANIM = new ServerPacket(19, 4); // L: 24
		MAPPROJ_ANIM = new ServerPacket(20, 15); // L: 25
		UPDATE_UID192 = new ServerPacket(21, 28); // L: 26
		HEAT_MAP = new ServerPacket(22, 1); // L: 27
		UPDATE_STAT = new ServerPacket(23, 6); // L: 28
		MESSAGE_CLANCHANNEL = new ServerPacket(24, -1); // L: 29
		UPDATE_IGNORELIST = new ServerPacket(25, -2); // L: 30
		IF_SETNPCHEAD = new ServerPacket(26, 6); // L: 31
		IF_SETMODEL = new ServerPacket(27, 6); // L: 32
		RUNCLIENTSCRIPT = new ServerPacket(28, -2); // L: 33
		HINT_ARROW = new ServerPacket(29, 6); // L: 34
		CHAT_FILTER_SETTINGS = new ServerPacket(30, 2); // L: 35
		OBJ_ADD = new ServerPacket(31, 5); // L: 36
		OBJ_DEL = new ServerPacket(32, 3); // L: 37
		IF_SETOBJECT = new ServerPacket(33, 10); // L: 38
		IF_SETSCROLLPOS = new ServerPacket(34, 6); // L: 39
		MESSAGE_FRIENDCHANNEL = new ServerPacket(35, -1); // L: 40
		IF_MOVESUB = new ServerPacket(36, 8); // L: 41
		MESSAGE_PRIVATE = new ServerPacket(37, -1); // L: 42
		PLAYER_INFO = new ServerPacket(38, -2); // L: 43
		SET_MAP_FLAG = new ServerPacket(39, 2); // L: 44
		VARP_LARGE = new ServerPacket(40, 6); // L: 45
		CAM_MOVETO = new ServerPacket(41, 6); // L: 46
		SEND_PING = new ServerPacket(42, 8); // L: 47
		UPDATE_INV_CLEAR = new ServerPacket(43, 4); // L: 48
		UPDATE_ZONE_FULL_FOLLOWS = new ServerPacket(44, 2); // L: 49
		CLANCHANNEL_FULL = new ServerPacket(45, -2); // L: 50
		MESSAGE_PRIVATE_ = new ServerPacket(46, -2); // L: 51
		REBUILD_REGION_NORMAL = new ServerPacket(47, -2); // L: 52
		UPDATE_ZONE_PARTIAL_FOLLOWS = new ServerPacket(48, 2); // L: 53
		UPDATE_RUNENERGY = new ServerPacket(49, 1); // L: 54
		IF1_MODELROTATE = new ServerPacket(50, 8); // L: 55
		IF_SETCOLOUR = new ServerPacket(51, 6); // L: 56
		RESET_CLIENT_VARCACHE = new ServerPacket(52, 0); // L: 57
		IF_SETTEXT = new ServerPacket(53, -2); // L: 58
		UPDATE_INV_FULL = new ServerPacket(54, -2); // L: 59
		CLANSETTINGS_FULL = new ServerPacket(55, -2); // L: 60
		UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerPacket(56, -2); // L: 61
		OBJ_COUNT = new ServerPacket(57, 7); // L: 62
		IF_SETANIM = new ServerPacket(58, 6); // L: 63
		NPC_INFO_SMALL = new ServerPacket(59, -2); // L: 64
		CAM_RESET = new ServerPacket(60, 0); // L: 65
		LOC_ADD_CHANGE = new ServerPacket(61, 4); // L: 66
		IF_SETANGLE = new ServerPacket(62, 10); // L: 67
		URL_OPEN = new ServerPacket(63, -2); // L: 68
		FRIENDLIST_LOADED = new ServerPacket(64, 0); // L: 69
		UPDATE_FRIENDLIST = new ServerPacket(65, -2); // L: 70
		CAM_SHAKE = new ServerPacket(66, 4); // L: 71
		CAM_LOOKAT = new ServerPacket(67, 6); // L: 72
		MESSAGE_GAME = new ServerPacket(68, -1); // L: 73
		UPDATE_REBOOT_TIMER = new ServerPacket(69, 2); // L: 74
		TOGGLE_OCULUS_ORB = new ServerPacket(70, 4); // L: 75
		IF_SETEVENTS = new ServerPacket(71, 12); // L: 76
		TRIGGER_ONDIALOGABORT = new ServerPacket(72, 0); // L: 77
		GAMEFRAME_FULL = new ServerPacket(73, -2); // L: 78
		MINIMAP_TOGGLE = new ServerPacket(74, 1); // L: 79
		ENTER_FREECAM = new ServerPacket(75, 1); // L: 80
		RESET_ANIMS = new ServerPacket(76, 0); // L: 81
		LOC_DEL = new ServerPacket(77, 2); // L: 82
		SYNC_CLIENT_VARCACHE = new ServerPacket(78, 0); // L: 83
		SYNTH_SOUND = new ServerPacket(79, 5); // L: 84
		NPC_INFO_LARGE = new ServerPacket(80, -2); // L: 85
		PREFETCH_GAMEOBJECTS = new ServerPacket(81, 14); // L: 86
		TRADING_POST_UPDATE = new ServerPacket(82, 20); // L: 87
		MIDI_JINGLE = new ServerPacket(83, 5); // L: 88
		MAP_ANIM = new ServerPacket(84, 6); // L: 89
		CHAT_FILTER_SETTINGS_PRIVATECHAT = new ServerPacket(85, 1); // L: 90
		LOGOUT_TRANSFER = new ServerPacket(86, -1); // L: 91
		VARCLAN_ENABLE = new ServerPacket(87, 0); // L: 92
		VARCLAN_DISABLE = new ServerPacket(88, 0); // L: 93
		UPDATE_FRIENDCHAT_CHANNEL_FULL = new ServerPacket(89, -2); // L: 94
		IF_SETPLAYERHEAD = new ServerPacket(90, 4); // L: 95
		UPDATE_INV_STOP_TRANSMIT = new ServerPacket(91, 2); // L: 96
		CLANCHANNEL_DELTA = new ServerPacket(92, -2); // L: 97
		IF_SETPOSITION = new ServerPacket(93, 8); // L: 98
		IF_SETHIDE = new ServerPacket(94, 5); // L: 99
		UNKNOWN_NPC_UPDATE2 = new ServerPacket(95, -2); // L: 100
		UNKNOWN_NPC_UPDATE = new ServerPacket(96, -2); // L: 101
	}

	ServerPacket(int var1, int var2) {
		this.id = var1; // L: 110
		this.length = var2; // L: 111
	} // L: 112
}
