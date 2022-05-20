import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("jj")
@Implements("ClientPacket")
public class ClientPacket implements class261 {

	final int id;

	final int length;

	static final ClientPacket CLANCHANNEL_KICKUSER = new ClientPacket(0, -1); // L: 5
	static final ClientPacket EVENT_KEYBOARD = new ClientPacket(1, -2); // L: 6
	static final ClientPacket OPLOC6 = new ClientPacket(2, 2); // L: 7
	static final ClientPacket UNUSED1 = new ClientPacket(3, -1); // L: 8
	static final ClientPacket EVENT_MOUSE_MOVE = new ClientPacket(4, -1); // L: 9
	static final ClientPacket LOGIN_STATISTICS = new ClientPacket(5, -1); // L: 10
	static final ClientPacket UNKNOWN1 = new ClientPacket(6, 22); // L: 11
	static final ClientPacket EVENT_APPLET_FOCUS = new ClientPacket(7, 1); // L: 12
	static final ClientPacket IF_BUTTON4 = new ClientPacket(8, 8); // L: 13
	static final ClientPacket MOVE_GAMECLICK = new ClientPacket(9, -1); // L: 14
	static final ClientPacket AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL = new ClientPacket(10, -1); // L: 15
	static final ClientPacket IGNORELIST_ADD = new ClientPacket(11, -1); // L: 16
	static final ClientPacket IF_BUTTON5 = new ClientPacket(12, 8); // L: 17
	static final ClientPacket IF1_BUTTON4 = new ClientPacket(13, 8); // L: 18
	static final ClientPacket OPPLAYER4 = new ClientPacket(14, 3); // L: 19
	static final ClientPacket IF_BUTTONT = new ClientPacket(15, 16); // L: 20
	static final ClientPacket RESUME_P_NAMEDIALOG = new ClientPacket(16, -1); // L: 21
	static final ClientPacket IF_BUTTON2 = new ClientPacket(17, 8); // L: 22
	static final ClientPacket TELEPORT = new ClientPacket(18, 9); // L: 23
	static final ClientPacket UNUSED2 = new ClientPacket(19, 7); // L: 24
	static final ClientPacket IF_BUTTON6 = new ClientPacket(20, 8); // L: 25
	static final ClientPacket UNUSED3 = new ClientPacket(21, 2); // L: 26
	static final ClientPacket CLAN_KICKUSER = new ClientPacket(22, -1); // L: 27
	static final ClientPacket OPHELD1 = new ClientPacket(23, 8); // L: 28
	static final ClientPacket RESUME_P_COUNTDIALOG = new ClientPacket(24, 4); // L: 29
	static final ClientPacket MESSAGE_PUBLIC = new ClientPacket(25, -1); // L: 30
	static final ClientPacket BUG_REPORT = new ClientPacket(26, -2); // L: 31
	static final ClientPacket OPPLAYER2 = new ClientPacket(27, 3); // L: 32
	static final ClientPacket OPPLAYER6 = new ClientPacket(28, 3); // L: 33
	static final ClientPacket OPNPC4 = new ClientPacket(29, 3); // L: 34
	static final ClientPacket OPOBJ5 = new ClientPacket(30, 7); // L: 35
	static final ClientPacket OPHELD5 = new ClientPacket(31, 8); // L: 36
	static final ClientPacket OPPLAYER7 = new ClientPacket(32, 3); // L: 37
	static final ClientPacket OPLOCU = new ClientPacket(33, 15); // L: 38
	static final ClientPacket NO_TIMEOUT = new ClientPacket(34, 0); // L: 39
	static final ClientPacket OPPLAYER8 = new ClientPacket(35, 3); // L: 40
	static final ClientPacket OPHELD3 = new ClientPacket(36, 8); // L: 41
	static final ClientPacket OPNPCU = new ClientPacket(37, 11); // L: 42
	static final ClientPacket OPLOC1 = new ClientPacket(38, 7); // L: 43
	static final ClientPacket OPNPCT = new ClientPacket(39, 11); // L: 44
	static final ClientPacket CLIENT_CHEAT = new ClientPacket(40, -1); // L: 45
	static final ClientPacket IF_BUTTON8 = new ClientPacket(41, 8); // L: 46
	static final ClientPacket EXIT_FREECAM = new ClientPacket(42, 0); // L: 47
	static final ClientPacket FRIENDLIST_DEL = new ClientPacket(43, -1); // L: 48
	static final ClientPacket RESUME_PAUSEBUTTON = new ClientPacket(44, 6); // L: 49
	static final ClientPacket AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL = new ClientPacket(45, -1); // L: 50
	static final ClientPacket OPLOC5 = new ClientPacket(46, 7); // L: 51
	static final ClientPacket OPPLAYER5 = new ClientPacket(47, 3); // L: 52
	static final ClientPacket IF1_BUTTON3 = new ClientPacket(48, 8); // L: 53
	static final ClientPacket OPOBJ3 = new ClientPacket(49, 7); // L: 54
	static final ClientPacket FRIENDLIST_ADD = new ClientPacket(50, -1); // L: 55
	static final ClientPacket OPLOC4 = new ClientPacket(51, 7); // L: 56
	static final ClientPacket OPPLAYERU = new ClientPacket(52, 11); // L: 57
	static final ClientPacket CLOSE_MODAL = new ClientPacket(53, 0); // L: 58
	static final ClientPacket IF_BUTTON7 = new ClientPacket(54, 8); // L: 59
	static final ClientPacket DETECT_MODIFIED_CLIENT = new ClientPacket(55, 4); // L: 60
	static final ClientPacket OPNPC1 = new ClientPacket(56, 3); // L: 61
	static final ClientPacket UNUSED5 = new ClientPacket(57, -1); // L: 62
	static final ClientPacket IF_BUTTON1 = new ClientPacket(58, 8); // L: 63
	static final ClientPacket IF1_BUTTON1 = new ClientPacket(59, 8); // L: 64
	static final ClientPacket IF1_BUTTON2 = new ClientPacket(60, 8); // L: 65
	static final ClientPacket OPOBJT = new ClientPacket(61, 15); // L: 66
	static final ClientPacket OPOBJU = new ClientPacket(62, 15); // L: 67
	static final ClientPacket IF_BUTTON3 = new ClientPacket(63, 8); // L: 68
	static final ClientPacket UPDATE_APPEARANCE = new ClientPacket(64, 13); // L: 69
	static final ClientPacket OPOBJ1 = new ClientPacket(65, 7); // L: 70
	static final ClientPacket BUTTON_CLICK = new ClientPacket(66, 4); // L: 71
	static final ClientPacket IF_BUTTON9 = new ClientPacket(67, 8); // L: 72
	static final ClientPacket CLAN_JOINCHAT_LEAVECHAT = new ClientPacket(68, -1); // L: 73
	static final ClientPacket OPNPC6 = new ClientPacket(69, 2); // L: 74
	static final ClientPacket OPOBJ4 = new ClientPacket(70, 7); // L: 75
	static final ClientPacket OPHELDT = new ClientPacket(71, 14); // L: 76
	static final ClientPacket RESUME_P_OBJDIALOG = new ClientPacket(72, 2); // L: 77
	static final ClientPacket OPOBJ2 = new ClientPacket(73, 7); // L: 78
	static final ClientPacket OPPLAYERT = new ClientPacket(74, 11); // L: 79
	static final ClientPacket MOVE_MINIMAPCLICK = new ClientPacket(75, -1); // L: 80
	static final ClientPacket OPLOCT = new ClientPacket(76, 15); // L: 81
	static final ClientPacket IF1_BUTTON5 = new ClientPacket(77, 8); // L: 82
	static final ClientPacket FRIEND_SETRANK = new ClientPacket(78, -1); // L: 83
	static final ClientPacket IDLE_LOGOUT = new ClientPacket(79, 0); // L: 84
	static final ClientPacket OPHELD4 = new ClientPacket(80, 8); // L: 85
	static final ClientPacket IF_BUTTOND = new ClientPacket(81, 16); // L: 86
	static final ClientPacket OPNPC2 = new ClientPacket(82, 3); // L: 87
	static final ClientPacket MAP_BUILD_COMPLETE = new ClientPacket(83, 0); // L: 88
	static final ClientPacket MESSAGE_PRIVATE = new ClientPacket(84, -2); // L: 89
	static final ClientPacket RESUME_P_STRINGDIALOG = new ClientPacket(85, -1); // L: 90
	static final ClientPacket IGNORELIST_DEL = new ClientPacket(86, -1); // L: 91
	static final ClientPacket EVENT_CAMERA_POSITION = new ClientPacket(87, 4); // L: 92
	static final ClientPacket OPNPC3 = new ClientPacket(88, 3); // L: 93
	static final ClientPacket UNUSED6 = new ClientPacket(89, -1); // L: 94
	static final ClientPacket OPLOC3 = new ClientPacket(90, 7); // L: 95
	static final ClientPacket SEND_SNAPSHOT = new ClientPacket(91, -1); // L: 96
	static final ClientPacket WINDOW_STATUS = new ClientPacket(92, 5); // L: 97
	static final ClientPacket CLICKWORLDMAP = new ClientPacket(93, 4); // L: 98
	static final ClientPacket OPHELD_D = new ClientPacket(94, 9); // L: 99
	static final ClientPacket IF_BUTTON10 = new ClientPacket(95, 8); // L: 100
	static final ClientPacket OPOBJ6 = new ClientPacket(96, 2); // L: 101
	static final ClientPacket OPPLAYER3 = new ClientPacket(97, 3); // L: 102
	static final ClientPacket OPNPC5 = new ClientPacket(98, 3); // L: 103
	static final ClientPacket REFLECTION_CHECK_REPLY = new ClientPacket(99, -1); // L: 104
	static final ClientPacket OPPLAYER1 = new ClientPacket(100, 3); // L: 105
	static final ClientPacket OPLOC2 = new ClientPacket(101, 7); // L: 106
	static final ClientPacket OPHELDU = new ClientPacket(102, 16); // L: 107
	static final ClientPacket EVENT_MOUSE_CLICK = new ClientPacket(103, 6); // L: 108
	static final ClientPacket SET_CHATFILTERSETTINGS = new ClientPacket(104, 3); // L: 109
	static final ClientPacket SEND_PING_REPLY = new ClientPacket(105, 10); // L: 110
	static final ClientPacket OPHELD2 = new ClientPacket(106, 8); // L: 111
	static final ClientPacket UNUSED4 = new ClientPacket(107, 6); // L: 112

	ClientPacket(int var1, int var2) {
		this.id = var1; // L: 117
		this.length = var2; // L: 118
	} // L: 119
}
