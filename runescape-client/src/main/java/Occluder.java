import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1667496443
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1607339701
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1327290645
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1032573123
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1960990691
	)
	@Export("type")
	int type;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1746160959
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1167261617
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1218503837
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1421337339
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 2056353609
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 621909479
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 880103251
	)
	int field2510;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1489264085
	)
	int field2507;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -2075749697
	)
	int field2508;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1502323289
	)
	int field2509;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1403810903
	)
	int field2495;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -340736711
	)
	int field2506;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1370877385
	)
	int field2511;

	Occluder() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIIB)V",
		garbageValue = "0"
	)
	@Export("sortItemsByName")
	public static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 9
			int var4 = (var3 + var2) / 2; // L: 10
			int var5 = var2; // L: 11
			String var6 = var0[var4]; // L: 12
			var0[var4] = var0[var3]; // L: 13
			var0[var3] = var6; // L: 14
			short var7 = var1[var4]; // L: 15
			var1[var4] = var1[var3]; // L: 16
			var1[var3] = var7; // L: 17

			for (int var8 = var2; var8 < var3; ++var8) { // L: 18
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) { // L: 19
					String var9 = var0[var8]; // L: 20
					var0[var8] = var0[var5]; // L: 21
					var0[var5] = var9; // L: 22
					short var10 = var1[var8]; // L: 23
					var1[var8] = var1[var5]; // L: 24
					var1[var5++] = var10; // L: 25
				}
			}

			var0[var3] = var0[var5]; // L: 29
			var0[var5] = var6; // L: 30
			var1[var3] = var1[var5]; // L: 31
			var1[var5] = var7; // L: 32
			sortItemsByName(var0, var1, var2, var5 - 1); // L: 33
			sortItemsByName(var0, var1, var5 + 1, var3); // L: 34
		}

	} // L: 36

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2100168808"
	)
	public static void method4221() {
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 107
			if (ArchiveDiskActionHandler.field3998 != 0) { // L: 108
				ArchiveDiskActionHandler.field3998 = 1; // L: 109

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait(); // L: 111
				} catch (InterruptedException var3) { // L: 113
				}
			}

		}
	} // L: 116

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1785001872"
	)
	public static int method4220(int var0) {
		return class402.field4445[var0 & 16383]; // L: 37
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(Lja;I)V",
		garbageValue = "791986228"
	)
	static final void processZoneUpdate(ZoneUpdate var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 7547
		int thi9;
		int thi1;
		int thi12;
		int var5;
		int thi2;
		int thi3;
		int thi5;
		int thi6;
		int thi10;
		if (ZoneUpdate.AREA_SOUND == var0) {
			thi9 = var1.readUnsignedShort(); // SOUND
			thi1 = var1.readUnsignedByte(); // TILE
			thi12 = (thi1 >> 4 & 7) + class145.Zone_Y;
			var5 = (thi1 & 7) + class321.ZONE_X;
			thi2 = var1.readUByteNeg(); // SETTINGS
			thi3 = thi2 >> 4 & 15;
			thi5 = thi2 & 7;
			thi6 = var1.readUnsignedByteAdd(); // DELAY
			if (thi12 >= 0 && var5 >= 0 && thi12 < 104 && var5 < 104) {
				thi10 = thi3 + 1;
				if (ModelData0.localPlayer.pathX[0] >= thi12 - thi10 && ModelData0.localPlayer.pathX[0] <= thi10 + thi12 && ModelData0.localPlayer.pathY[0] >= var5 - thi10 && ModelData0.localPlayer.pathY[0] <= thi10 + var5 && class12.clientPreferences.method2239() != 0 && thi5 > 0 && Client.soundEffectCount < 50) { // L: 7559 7560
					Client.soundEffectIds[Client.soundEffectCount] = thi9; // L: 7561
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = thi5; // L: 7562
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = thi6; // L: 7563
					Client.soundEffects[Client.soundEffectCount] = null; // L: 7564
					Client.soundLocations[Client.soundEffectCount] = thi3 + (var5 << 8) + (thi12 << 16); // L: 7565
					++Client.soundEffectCount; // L: 7566
				}
			}
		}

		TileItem var35;
		if (ZoneUpdate.OBJ_ADD == var0) { // L: 7571
			thi9 = var1.readUnsignedByteAdd(); // L: 7572
			thi1 = (thi9 >> 4 & 7) + class145.Zone_Y; // L: 7573
			thi12 = (thi9 & 7) + class321.ZONE_X; // L: 7574

			System.out.println("obj_add: y: " + thi1);
			System.out.println("obj_add: x: " + thi12);
			var5 = var1.readUShortAdd(); // amount
			thi2 = var1.readUShortLE(); // Item
			if (thi1 >= 0 && thi12 >= 0 && thi1 < 104 && thi12 < 104) { // L: 7577
				var35 = new TileItem(); // L: 7578
				var35.id = thi2; // L: 7579
				var35.quantity = var5; // L: 7580
				if (Client.groundItems[class128.Client_plane][thi1][thi12] == null) { // L: 7581
					Client.groundItems[class128.Client_plane][thi1][thi12] = new NodeDeque();
				}

				Client.groundItems[class128.Client_plane][thi1][thi12].addFirst(var35); // L: 7582
				Frames.updateItemPile(thi1, thi12); // L: 7583
			}

		} else if (ZoneUpdate.LOC_ADD_CHANGE == var0) {
			thi9 = var1.readUnsignedShort(); // ID
			thi1 = var1.readUnsignedByteAdd(); // SETTINGS
			thi12 = thi1 >> 2;
			var5 = thi1 & 3;
			thi2 = Client.field553[thi12];
			thi3 = var1.readUnsignedByte(); // TILE
			thi5 = (thi3 >> 4 & 7) + class145.Zone_Y;
			thi6 = (thi3 & 7) + class321.ZONE_X;
			if (thi5 >= 0 && thi6 >= 0 && thi5 < 104 && thi6 < 104) {
				class221.updatePendingSpawn(class128.Client_plane, thi5, thi6, thi2, thi9, thi12, var5, 0, -1); // L: 7597
			}

		} else if (ZoneUpdate.OBJ_COUNT == var0) {
			thi9 = var1.readUByteNeg(); // Tile
			thi1 = (thi9 >> 4 & 7) + class145.Zone_Y;
			thi12 = (thi9 & 7) + class321.ZONE_X;
			var5 = var1.readUnsignedShort(); // NEW_Amount
			thi2 = var1.readUShortAddLE(); // OLD_AMOUNT
			thi3 = var1.readUShortAddLE(); // item
			if (thi1 >= 0 && thi12 >= 0 && thi1 < 104 && thi12 < 104) { // L: 7608
				NodeDeque var43 = Client.groundItems[class128.Client_plane][thi1][thi12]; // L: 7609
				if (var43 != null) { // L: 7610
					for (TileItem var36 = (TileItem)var43.last(); var36 != null; var36 = (TileItem)var43.previous()) { // L: 7611 7612 7617
						if ((thi3 & 32767) == var36.id && thi2 == var36.quantity) { // L: 7613
							var36.quantity = var5; // L: 7614
							break;
						}
					}

					Frames.updateItemPile(thi1, thi12); // L: 7619
				}
			}

		} else if (ZoneUpdate.OBJ_DEL == var0) { // L: 7624
			thi9 = var1.readUShortLE(); // Item
			thi1 = var1.readUByteNeg(); // Tile
			thi12 = (thi1 >> 4 & 7) + class145.Zone_Y; // L: 7627
			var5 = (thi1 & 7) + class321.ZONE_X; // L: 7628
			if (thi12 >= 0 && var5 >= 0 && thi12 < 104 && var5 < 104) { // L: 7629
				NodeDeque var34 = Client.groundItems[class128.Client_plane][thi12][var5]; // L: 7630
				if (var34 != null) { // L: 7631
					for (var35 = (TileItem)var34.last(); var35 != null; var35 = (TileItem)var34.previous()) { // L: 7632 7633 7638
						if ((thi9 & 32767) == var35.id) { // L: 7634
							var35.remove(); // L: 7635
							break;
						}
					}

					if (var34.last() == null) { // L: 7640
						Client.groundItems[class128.Client_plane][thi12][var5] = null;
					}

					Frames.updateItemPile(thi12, var5); // L: 7641
				}
			}

		} else if (ZoneUpdate.LOC_DEL == var0) {
			thi9 = var1.readUByteNeg();
			thi1 = (thi9 >> 4 & 7) + class145.Zone_Y;
			thi12 = (thi9 & 7) + class321.ZONE_X;
			var5 = var1.readUnsignedByteAdd();
			thi2 = var5 >> 2;
			thi3 = var5 & 3;
			thi5 = Client.field553[thi2];
			if (thi1 >= 0 && thi12 >= 0 && thi1 < 104 && thi12 < 104) {
				class221.updatePendingSpawn(class128.Client_plane, thi1, thi12, thi5, -1, thi2, thi3, 0, -1);
			}

		} else if (ZoneUpdate.MAP_ANIM == var0) {
			thi9 = var1.readUByteSub(); // Tile
			thi1 = (thi9 >> 4 & 7) + class145.Zone_Y;
			thi12 = (thi9 & 7) + class321.ZONE_X;
			var5 = var1.readUByteNeg(); // Height
			thi2 = var1.readUShortLE(); // Delay
			thi3 = var1.readUShortLE(); // Id
			if (thi1 >= 0 && thi12 >= 0 && thi1 < 104 && thi12 < 104) { // L: 7666
				thi1 = thi1 * 128 + 64; // L: 7667
				thi12 = thi12 * 128 + 64; // L: 7668
				GraphicsObject var33 = new GraphicsObject(thi3, class128.Client_plane, thi1, thi12, class202.getTileHeight(thi1, thi12, class128.Client_plane) - var5, thi2, Client.cycle); // L: 7669
				Client.graphicsObjects.addFirst(var33); // L: 7670
			}

		} else {
			int thi8;
			int thi4;
			int thi7;
			int thi11;
			byte var37;
			if (ZoneUpdate.MAPPROJ_ANIM == var0) {
				thi9 = var1.readShortLE(); // TARGET_INDEX
				thi1 = var1.readUShortLE(); // gfx
				var37 = var1.readByteSub(); // offset_x
				var5 = var1.readUByteNeg(); // tile
				thi2 = (var5 >> 4 & 7) + class145.Zone_Y;
				thi3 = (var5 & 7) + class321.ZONE_X;
				thi5 = var1.readUShortAddLE(); // delay
				thi6 = var1.readUnsignedShort(); // lifespan
				thi10 = var1.readUnsignedByte() * 4; // end_height
				thi8 = var1.readUByteSub(); // steepness
				thi4 = var1.readUByteNeg() * 4; // start_height
				thi7 = var1.readUByteSub(); // angle
				byte var39 = var1.readByteSub(); // offset_y
				thi11 = var39 + thi2;
				thi12 = var37 + thi3;

				System.out.println("TARGET_INDEX:" + thi9);
				System.out.println("gfx:" + thi1);
				System.out.println("offset_x:" + var37);
				System.out.println("tile_y:" + thi2);
				System.out.println("tile_x:" + thi3);
				System.out.println("delay:" + thi5);
				System.out.println("lifespan:" + thi6);
				System.out.println("end_height:" + thi10);
				System.out.println("steepness:" + thi8);
				System.out.println("start_height:" + thi4);
				System.out.println("angle:" + thi7);
				System.out.println("offset_y:" + var39);

				if (thi2 >= 0 && thi3 >= 0 && thi2 < 104 && thi3 < 104 && thi11 >= 0 && thi12 >= 0 && thi11 < 104 && thi12 < 104 && thi1 != 65535) { // L: 7690
					thi2 = thi2 * 128 + 64; // L: 7691
					thi3 = thi3 * 128 + 64; // L: 7692
					thi11 = thi11 * 128 + 64; // L: 7693
					thi12 = thi12 * 128 + 64; // L: 7694
					Projectile var32 = new Projectile(thi1, class128.Client_plane, thi2, thi3, class202.getTileHeight(thi2, thi3, class128.Client_plane) - thi4, thi5 + Client.cycle, thi6 + Client.cycle, thi7, thi8, thi9, thi10); // L: 7695
					var32.setDestination(thi11, thi12, class202.getTileHeight(thi11, thi12, class128.Client_plane) - thi10, thi5 + Client.cycle); // L: 7696
					Client.projectiles.addFirst(var32); // L: 7697
				}

			} else {
				if (ZoneUpdate.PREFETCH_GAMEOBJECTS == var0) { // L: 7701
					thi9 = var1.readUShortAdd(); // L: 7702
					thi1 = var1.readUShortLE(); // L: 7703
					var37 = var1.readByteAdd(); // L: 7704
					var5 = var1.readUByteSub(); // L: 7705
					thi2 = (var5 >> 4 & 7) + class145.Zone_Y; // L: 7706
					thi3 = (var5 & 7) + class321.ZONE_X; // L: 7707
					thi5 = var1.readUShortAdd(); // L: 7708
					thi6 = var1.readUnsignedShort(); // L: 7709
					byte var38 = var1.readByteAdd(); // L: 7710
					thi8 = var1.readUnsignedByte(); // L: 7711
					thi4 = thi8 >> 2; // L: 7712
					thi7 = thi8 & 3; // L: 7713
					thi11 = Client.field553[thi4]; // L: 7714
					byte var15 = var1.readByteAdd(); // L: 7715
					byte var16 = var1.readByteAdd(); // L: 7716
					Player var17;
					if (thi9 == Client.localPlayerIndex) { // L: 7718
						var17 = ModelData0.localPlayer;
					} else {
						var17 = Client.players[thi9]; // L: 7719
					}

					if (var17 != null) { // L: 7720
						ObjectComposition var18 = class82.getObjectDefinition(thi1); // L: 7721
						int var19;
						int var20;
						if (thi7 != 1 && thi7 != 3) { // L: 7724
							var19 = var18.sizeX; // L: 7729
							var20 = var18.sizeY; // L: 7730
						} else {
							var19 = var18.sizeY; // L: 7725
							var20 = var18.sizeX; // L: 7726
						}

						int var21 = thi2 + (var19 >> 1); // L: 7732
						int var22 = thi2 + (var19 + 1 >> 1); // L: 7733
						int var23 = thi3 + (var20 >> 1); // L: 7734
						int var24 = thi3 + (var20 + 1 >> 1); // L: 7735
						int[][] var25 = Tiles.Tiles_heights[class128.Client_plane]; // L: 7736
						int var26 = var25[var22][var24] + var25[var21][var23] + var25[var22][var23] + var25[var21][var24] >> 2; // L: 7737
						int var27 = (thi2 << 7) + (var19 << 6); // L: 7738
						int var28 = (thi3 << 7) + (var20 << 6); // L: 7739
						Model var29 = var18.getModel(thi4, thi7, var25, var27, var26, var28); // L: 7740
						if (var29 != null) { // L: 7741
							class221.updatePendingSpawn(class128.Client_plane, thi2, thi3, thi11, -1, 0, 0, thi6 + 1, thi5 + 1); // L: 7742
							var17.animationCycleStart = thi6 + Client.cycle; // L: 7743
							var17.animationCycleEnd = thi5 + Client.cycle; // L: 7744
							var17.model0 = var29; // L: 7745
							var17.field1104 = var19 * 64 + thi2 * 128; // L: 7746
							var17.field1106 = var20 * 64 + thi3 * 128; // L: 7747
							var17.tileHeight2 = var26; // L: 7748
							byte var30;
							if (var38 > var16) { // L: 7749
								var30 = var38; // L: 7750
								var38 = var16; // L: 7751
								var16 = var30; // L: 7752
							}

							if (var37 > var15) { // L: 7754
								var30 = var37; // L: 7755
								var37 = var15; // L: 7756
								var15 = var30; // L: 7757
							}

							var17.minX = thi2 + var38; // L: 7759
							var17.maxX = var16 + thi2; // L: 7760
							var17.minY = var37 + thi3; // L: 7761
							var17.maxY = thi3 + var15; // L: 7762
						}
					}
				}

				if (ZoneUpdate.LOC_ANIM == var0) { // L: 7766
					thi9 = var1.readUnsignedByteAdd(); // L: 7767
					thi1 = thi9 >> 2; // L: 7768
					thi12 = thi9 & 3; // L: 7769
					var5 = Client.field553[thi1]; // L: 7770
					thi2 = var1.readUByteSub(); // L: 7771
					thi3 = (thi2 >> 4 & 7) + class145.Zone_Y; // L: 7772
					thi5 = (thi2 & 7) + class321.ZONE_X; // L: 7773
					thi6 = var1.readUShortAdd(); // L: 7774
					if (thi3 >= 0 && thi5 >= 0 && thi3 < 103 && thi5 < 103) { // L: 7775
						if (var5 == 0) { // L: 7776
							BoundaryObject var31 = class175.scene.method4147(class128.Client_plane, thi3, thi5); // L: 7777
							if (var31 != null) { // L: 7778
								thi8 = NetSocket.Entity_unpackID(var31.tag); // L: 7779
								if (thi1 == 2) { // L: 7780
									var31.renderable1 = new DynamicObject(thi8, 2, thi12 + 4, class128.Client_plane, thi3, thi5, thi6, false, var31.renderable1); // L: 7781
									var31.renderable2 = new DynamicObject(thi8, 2, thi12 + 1 & 3, class128.Client_plane, thi3, thi5, thi6, false, var31.renderable2); // L: 7782
								} else {
									var31.renderable1 = new DynamicObject(thi8, thi1, thi12, class128.Client_plane, thi3, thi5, thi6, false, var31.renderable1); // L: 7784
								}
							}
						}

						if (var5 == 1) { // L: 7787
							WallDecoration var40 = class175.scene.method4049(class128.Client_plane, thi3, thi5); // L: 7788
							if (var40 != null) { // L: 7789
								thi8 = NetSocket.Entity_unpackID(var40.tag); // L: 7790
								if (thi1 != 4 && thi1 != 5) { // L: 7791
									if (thi1 == 6) { // L: 7792
										var40.renderable1 = new DynamicObject(thi8, 4, thi12 + 4, class128.Client_plane, thi3, thi5, thi6, false, var40.renderable1);
									} else if (thi1 == 7) { // L: 7793
										var40.renderable1 = new DynamicObject(thi8, 4, (thi12 + 2 & 3) + 4, class128.Client_plane, thi3, thi5, thi6, false, var40.renderable1);
									} else if (thi1 == 8) { // L: 7794
										var40.renderable1 = new DynamicObject(thi8, 4, thi12 + 4, class128.Client_plane, thi3, thi5, thi6, false, var40.renderable1); // L: 7795
										var40.renderable2 = new DynamicObject(thi8, 4, (thi12 + 2 & 3) + 4, class128.Client_plane, thi3, thi5, thi6, false, var40.renderable2); // L: 7796
									}
								} else {
									var40.renderable1 = new DynamicObject(thi8, 4, thi12, class128.Client_plane, thi3, thi5, thi6, false, var40.renderable1);
								}
							}
						}

						if (var5 == 2) { // L: 7800
							GameObject var41 = class175.scene.getGameObject(class128.Client_plane, thi3, thi5); // L: 7801
							if (thi1 == 11) { // L: 7802
								thi1 = 10;
							}

							if (var41 != null) { // L: 7803
								var41.renderable = new DynamicObject(NetSocket.Entity_unpackID(var41.tag), thi1, thi12, class128.Client_plane, thi3, thi5, thi6, false, var41.renderable);
							}
						}

						if (var5 == 3) { // L: 7805
							FloorDecoration var42 = class175.scene.getFloorDecoration(class128.Client_plane, thi3, thi5); // L: 7806
							if (var42 != null) { // L: 7807
								var42.renderable = new DynamicObject(NetSocket.Entity_unpackID(var42.tag), 22, thi12, class128.Client_plane, thi3, thi5, thi6, false, var42.renderable);
							}
						}
					}

				}
			}
		}
	} // L: 7585 7599 7622 7644 7657 7672 7699 7810 7812
}
