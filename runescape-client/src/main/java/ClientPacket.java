import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
@Implements("ClientPacket")
public class ClientPacket implements class238 {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket IF_BUTTON5 = new ClientPacket(0, 8);
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket FRIENDLIST_DEL = new ClientPacket(1, -1);
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPNPC6 = new ClientPacket(2, 2);
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket IF1_BUTTON4 = new ClientPacket(3, 8);
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket SEND_SNAPSHOT = new ClientPacket(4, -1);
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPHELD_D = new ClientPacket(5, 9);
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPLOC5 = new ClientPacket(6, 7);
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPOBJ6 = new ClientPacket(7, 2);
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPNPC5 = new ClientPacket(8, 3);
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPPLAYER7 = new ClientPacket(9, 3);
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket WINDOW_STATUS = new ClientPacket(10, 5);
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket MESSAGE_PRIVATE = new ClientPacket(11, -2);
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket REFLECTION_CHECK_REPLY = new ClientPacket(12, -1);
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPHELD3 = new ClientPacket(13, 8);
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket MAP_BUILD_COMPLETE = new ClientPacket(14, 0);
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPNPC2 = new ClientPacket(15, 3);
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket SEND_PING_REPLY = new ClientPacket(16, 10);
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket IF_BUTTON2 = new ClientPacket(17, 8);
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket IF_BUTTON3 = new ClientPacket(18, 8);
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket IF_BUTTON4 = new ClientPacket(19, 8);
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket EVENT_CAMERA_POSITION = new ClientPacket(20, 4);
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket RESUME_P_OBJDIALOG = new ClientPacket(21, 2);
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket IF_BUTTON1 = new ClientPacket(22, 8);
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPPLAYER2 = new ClientPacket(23, 3);
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket UPDATE_APPEARANCE = new ClientPacket(24, 13);
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket IF_BUTTON10 = new ClientPacket(25, 8);
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket IF_BUTTON7 = new ClientPacket(26, 8);
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket RESUME_P_COUNTDIALOG = new ClientPacket(27, 4);
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket CLANCHANNEL_KICKUSER = new ClientPacket(28, -1);
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket CLAN_JOINCHAT_LEAVECHAT = new ClientPacket(29, -1);
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPPLAYER5 = new ClientPacket(30, 3);
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPPLAYER1 = new ClientPacket(31, 3);
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket SET_CHATFILTERSETTINGS = new ClientPacket(32, 3);
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPLOC6 = new ClientPacket(33, 2);
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	static final ClientPacket UNKNOWN3 = new ClientPacket(34, -1);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket LOGIN_STATISTICS = new ClientPacket(35, -1);
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket IGNORELIST_DEL = new ClientPacket(36, -1);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPNPCU = new ClientPacket(37, 11);
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket BUTTON_CLICK = new ClientPacket(38, 4);
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket IF_BUTTON6 = new ClientPacket(39, 8);
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket EVENT_MOUSE_MOVE = new ClientPacket(40, -1);
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPLOC4 = new ClientPacket(41, 7);
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket IF1_BUTTON5 = new ClientPacket(42, 8);
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPHELDU = new ClientPacket(43, 16);
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	static final ClientPacket UNKNOWN2 = new ClientPacket(44, -1);
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPOBJ3 = new ClientPacket(45, 7);
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPPLAYER3 = new ClientPacket(46, 3);
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket IF_BUTTON9 = new ClientPacket(47, 8);
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket CLOSE_MODAL = new ClientPacket(48, 0);
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPPLAYER6 = new ClientPacket(49, 3);
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket DETECT_MODIFIED_CLIENT = new ClientPacket(50, 4);
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPOBJ4 = new ClientPacket(51, 7);
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket EVENT_KEYBOARD = new ClientPacket(52, -2);
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPNPC1 = new ClientPacket(53, 3);
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket IF1_BUTTON3 = new ClientPacket(54, 8);
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket IDLE_LOGOUT = new ClientPacket(55, 0);
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket CLICKWORLDMAP = new ClientPacket(56, 4);
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket CLIENT_CHEAT = new ClientPacket(57, -1);
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPHELDT = new ClientPacket(58, 14);
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPNPC3 = new ClientPacket(59, 3);
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket BUG_REPORT = new ClientPacket(60, -2);
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket EVENT_MOUSE_CLICK = new ClientPacket(61, 6); // @TODO
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket NO_TIMEOUT = new ClientPacket(62, 0);
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket IF_BUTTOND = new ClientPacket(63, 16);
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket RESUME_PAUSEBUTTON = new ClientPacket(64, 6);
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPLOCU = new ClientPacket(65, 15);
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPNPC4 = new ClientPacket(66, 3);
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPHELD5 = new ClientPacket(67, 8);
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	static final ClientPacket UNKNOWN1 = new ClientPacket(68, 7);
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket IF1_BUTTON1 = new ClientPacket(69, 8);
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket RESUME_P_STRINGDIALOG = new ClientPacket(70, -1);
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPOBJT = new ClientPacket(71, 15);
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket TELEPORT = new ClientPacket(72, 9);
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL = new ClientPacket(73, -1);
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPLOCT = new ClientPacket(74, 15);
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	static final ClientPacket UNKNOWN7 = new ClientPacket(75, -1);
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPHELD4 = new ClientPacket(76, 8);
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPNPCT = new ClientPacket(77, 11);
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket EXIT_FREECAM = new ClientPacket(78, 0);
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket EVENT_APPLET_FOCUS = new ClientPacket(79, 1);
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPLOC1 = new ClientPacket(80, 7);
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPPLAYER8 = new ClientPacket(81, 3);
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket IF1_BUTTON2 = new ClientPacket(82, 8);
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket FRIENDLIST_ADD = new ClientPacket(83, -1);
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPLOC3 = new ClientPacket(84, 7);
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket MOVE_MINIMAPCLICK = new ClientPacket(85, -1);
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPOBJ5 = new ClientPacket(86, 7);
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket FRIEND_SETRANK = new ClientPacket(87, -1);
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket IGNORELIST_ADD = new ClientPacket(88, -1);
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket IF_BUTTONT = new ClientPacket(89, 16);
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPLOC2 = new ClientPacket(90, 7);
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket IF_BUTTON8 = new ClientPacket(91, 8);
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPOBJU = new ClientPacket(92, 15);
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPHELD1 = new ClientPacket(93, 8);
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPHELD2 = new ClientPacket(94, 8);
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket MESSAGE_PUBLIC = new ClientPacket(95, -1);
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket MOVE_GAMECLICK = new ClientPacket(96, -1);
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPOBJ1 = new ClientPacket(97, 7);
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	static final ClientPacket UNKNOWN8 = new ClientPacket(98, 2);
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPPLAYER4 = new ClientPacket(99, 3);
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket RESUME_P_NAMEDIALOG = new ClientPacket(100, -1);
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL = new ClientPacket(101, -1);
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket CLAN_KICKUSER = new ClientPacket(102, -1);
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPPLAYERU = new ClientPacket(103, 11);
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPOBJ2 = new ClientPacket(104, 7);
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final ClientPacket OPPLAYERT = new ClientPacket(105, 11);
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = 1306190951
	)
	@Export("id")
	final int id;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = -2069383305
	)
	@Export("length")
	final int length;

	ClientPacket(int var1, int var2) {
		this.id = var1; // L: 115
		this.length = var2; // L: 116
	} // L: 117

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "34"
	)
	public static boolean method4710(int var0) {
		return (var0 & 1) != 0; // L: 9
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(Lct;B)V",
		garbageValue = "-54"
	)
	static final void method4709(Actor var0) {
		var0.isWalking = false; // L: 4458
		SequenceDefinition var1;
		if (var0.movementSequence != -1) { // L: 4459
			var1 = MouseHandler.SequenceDefinition_get(var0.movementSequence); // L: 4460
			if (var1 != null && var1.frameIds != null) { // L: 4461
				++var0.movementFrameCycle; // L: 4462
				if (var0.movementFrame < var1.frameIds.length && var0.movementFrameCycle > var1.frameLengths[var0.movementFrame]) { // L: 4463
					var0.movementFrameCycle = 1; // L: 4464
					++var0.movementFrame; // L: 4465
					Interpreter.method1872(var1, var0.movementFrame, var0.x, var0.y); // L: 4466
				}

				if (var0.movementFrame >= var1.frameIds.length) { // L: 4468
					var0.movementFrameCycle = 0; // L: 4469
					var0.movementFrame = 0; // L: 4470
					Interpreter.method1872(var1, var0.movementFrame, var0.x, var0.y); // L: 4471
				}
			} else {
				var0.movementSequence = -1; // L: 4474
			}
		}

		if (var0.spotAnimation != -1 && Client.cycle >= var0.field1125) { // L: 4476
			if (var0.spotAnimationFrame < 0) { // L: 4477
				var0.spotAnimationFrame = 0;
			}

			int var3 = BZip2State.SpotAnimationDefinition_get(var0.spotAnimation).sequence; // L: 4478
			if (var3 != -1) { // L: 4479
				SequenceDefinition var2 = MouseHandler.SequenceDefinition_get(var3); // L: 4480
				if (var2 != null && var2.frameIds != null) { // L: 4481
					++var0.spotAnimationFrameCycle; // L: 4482
					if (var0.spotAnimationFrame < var2.frameIds.length && var0.spotAnimationFrameCycle > var2.frameLengths[var0.spotAnimationFrame]) { // L: 4483
						var0.spotAnimationFrameCycle = 1; // L: 4484
						++var0.spotAnimationFrame; // L: 4485
						Interpreter.method1872(var2, var0.spotAnimationFrame, var0.x, var0.y); // L: 4486
					}

					if (var0.spotAnimationFrame >= var2.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var2.frameIds.length)) { // L: 4488 4489
						var0.spotAnimation = -1;
					}
				} else {
					var0.spotAnimation = -1; // L: 4492
				}
			} else {
				var0.spotAnimation = -1; // L: 4494
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay <= 1) { // L: 4496
			var1 = MouseHandler.SequenceDefinition_get(var0.sequence); // L: 4497
			if (var1.field1963 == 1 && var0.field1144 > 0 && var0.field1131 <= Client.cycle && var0.field1132 < Client.cycle) { // L: 4498 4499
				var0.sequenceDelay = 1; // L: 4500
				return; // L: 4501
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4505
			var1 = MouseHandler.SequenceDefinition_get(var0.sequence); // L: 4506
			if (var1 != null && var1.frameIds != null) { // L: 4507
				++var0.sequenceFrameCycle; // L: 4508
				if (var0.sequenceFrame < var1.frameIds.length && var0.sequenceFrameCycle > var1.frameLengths[var0.sequenceFrame]) { // L: 4509
					var0.sequenceFrameCycle = 1; // L: 4510
					++var0.sequenceFrame; // L: 4511
					Interpreter.method1872(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4512
				}

				if (var0.sequenceFrame >= var1.frameIds.length) { // L: 4514
					var0.sequenceFrame -= var1.frameCount; // L: 4515
					++var0.field1116; // L: 4516
					if (var0.field1116 >= var1.field1962) { // L: 4517
						var0.sequence = -1;
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var1.frameIds.length) { // L: 4518
						Interpreter.method1872(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4519
					} else {
						var0.sequence = -1;
					}
				}

				var0.isWalking = var1.field1958; // L: 4521
			} else {
				var0.sequence = -1; // L: 4523
			}
		}

		if (var0.sequenceDelay > 0) { // L: 4525
			--var0.sequenceDelay;
		}

	} // L: 4526
}
