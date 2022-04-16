import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("m")
public class class21 {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("hw")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1952099167
	)
	final int field102;
	@ObfuscatedName("w")
	final String field104;

	class21(String var1) {
		this.field102 = 400; // L: 32
		this.field104 = ""; // L: 33
	} // L: 34

	class21(HttpURLConnection var1) throws IOException {
		this.field102 = var1.getResponseCode(); // L: 14
		var1.getResponseMessage(); // L: 15
		var1.getHeaderFields(); // L: 16
		StringBuilder var2 = new StringBuilder(); // L: 17
		InputStream var3 = this.field102 >= 300 ? var1.getErrorStream() : var1.getInputStream(); // L: 18
		if (var3 != null) { // L: 19
			InputStreamReader var4 = new InputStreamReader(var3); // L: 20
			BufferedReader var5 = new BufferedReader(var4); // L: 21

			String var6;
			while ((var6 = var5.readLine()) != null) { // L: 23
				var2.append(var6); // L: 24
			}

			var3.close(); // L: 26
		}

		this.field104 = var2.toString(); // L: 28
	} // L: 29

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-701476326"
	)
	public int method310() {
		return this.field102; // L: 37
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "932621711"
	)
	public String method303() {
		return this.field104;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lko;III)[Low;",
		garbageValue = "-1741368742"
	)
	public static SpritePixels[] method312(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 40
		boolean var3;
		if (var4 == null) { // L: 41
			var3 = false; // L: 42
		} else {
			Script.SpriteBuffer_decode(var4); // L: 45
			var3 = true; // L: 46
		}

		return !var3 ? null : class283.method5221(); // L: 48 49
	}

	@ObfuscatedName("e")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L); // L: 81
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(Lii;I)V",
		garbageValue = "1398139213"
	)
	static final void processZoneUpdate(ZoneUpdate var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 7205
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		if (ZoneUpdate.LOC_ADD_CHANGE == var0) {
			var2 = var1.readUByteAdd(); // TILE
			var3 = (var2 >> 4 & 7) + ItemComposition.Zone_Y;
			var4 = (var2 & 7) + Actor.ZONE_X;
			var5 = var1.readUnsignedByte(); // SETTINGS
			var6 = var5 >> 2;
			var7 = var5 & 3;
			var8 = Client.field530[var6];
			var9 = var1.readUShortLE(); // ID
			if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
				WorldMapLabelSize.updatePendingSpawn(GrandExchangeOfferTotalQuantityComparator.Client_plane, var3, var4, var8, var9, var6, var7, 0, -1);
			}

		} else if (ZoneUpdate.LOC_DEL == var0) {
			var2 = var1.readUByteSub(); // SETTINGS
			var3 = var2 >> 2;
			var4 = var2 & 3;
			var5 = Client.field530[var3];
			var6 = var1.readUnsignedByte(); // TILE
			var7 = (var6 >> 4 & 7) + ItemComposition.Zone_Y;
			var8 = (var6 & 7) + Actor.ZONE_X;
			if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
				WorldMapLabelSize.updatePendingSpawn(GrandExchangeOfferTotalQuantityComparator.Client_plane, var7, var8, var5, -1, var3, var4, 0, -1);
			}

		} else if (ZoneUpdate.OBJ_COUNT == var0) { // L: 7233
			var2 = var1.readUnsignedByte(); // TILE
			var3 = (var2 >> 4 & 7) + ItemComposition.Zone_Y;
			var4 = (var2 & 7) + Actor.ZONE_X;
			var5 = var1.readUShortAdd(); // NEW AMOUNT
			var6 = var1.readUShortAdd(); // ITEM
			var7 = var1.readShortAddLE(); // OLD_AMOUNT
			if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 7240
				NodeDeque var46 = Client.groundItems[GrandExchangeOfferTotalQuantityComparator.Client_plane][var3][var4]; // L: 7241
				if (var46 != null) { // L: 7242
					for (TileItem var36 = (TileItem)var46.last(); var36 != null; var36 = (TileItem)var46.previous()) { // L: 7243 7244 7249
						if ((var6 & 32767) == var36.itemID && var7 == var36.quantity) { // L: 7245
							var36.quantity = var5; // L: 7246
							break;
						}
					}

					WallDecoration.updateItemPile(var3, var4); // L: 7251
				}
			}

		} else {
			int var10;
			int var11;
			int var12;
			int var14;
			if (ZoneUpdate.MAPPROJ_ANIM == var0) {
				byte var37 = var1.readByte(); // offset_x
				var3 = var1.readShortAddLE(); // lifespan
				var4 = var1.readUShortLE(); // delay
				var5 = var1.readUByteNeg() * 4; // start_height
				var6 = var1.readShortAdd(); // TARGET_INDEX
				byte var39 = var1.readByteAdd(); // offset_y
				var8 = var1.readUByteAdd(); // tile
				var9 = (var8 >> 4 & 7) + ItemComposition.Zone_Y;
				var10 = (var8 & 7) + Actor.ZONE_X;
				var11 = var1.readUnsignedByte() * 4; // end_height
				var12 = var1.readUByteSub(); // steepness
				int var42 = var1.readShortAddLE(); // gfx
				var14 = var1.readUByteSub(); // angle
				var7 = var39 + var9; // L: 7270
				var2 = var37 + var10; // L: 7271
				if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var7 >= 0 && var2 >= 0 && var7 < 104 && var2 < 104 && var42 != 65535) { // L: 7272
					var9 = var9 * 128 + 64; // L: 7273
					var10 = var10 * 128 + 64; // L: 7274
					var7 = var7 * 128 + 64; // L: 7275
					var2 = var2 * 128 + 64; // L: 7276
					Projectile var35 = new Projectile(var42, GrandExchangeOfferTotalQuantityComparator.Client_plane, var9, var10, class392.getTileHeight(var9, var10, GrandExchangeOfferTotalQuantityComparator.Client_plane) - var5, var4 + Client.cycle, var3 + Client.cycle, var14, var12, var6, var11); // L: 7277
					var35.setDestination(var7, var2, class392.getTileHeight(var7, var2, GrandExchangeOfferTotalQuantityComparator.Client_plane) - var11, var4 + Client.cycle); // L: 7278
					Client.projectiles.addFirst(var35); // L: 7279
				}

			} else {
				TileItem var33;
				if (ZoneUpdate.OBJ_DEL == var0) {
					var2 = var1.readUByteAdd(); // TILE
					var3 = (var2 >> 4 & 7) + ItemComposition.Zone_Y;
					var4 = (var2 & 7) + Actor.ZONE_X;
					var5 = var1.readUShortLE(); // Item
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
						NodeDeque var34 = Client.groundItems[GrandExchangeOfferTotalQuantityComparator.Client_plane][var3][var4];
						if (var34 != null) {
							for (var33 = (TileItem)var34.last(); var33 != null; var33 = (TileItem)var34.previous()) {
								if ((var5 & 32767) == var33.itemID) {
									var33.remove();
									break;
								}
							}
							if (var34.last() == null) { // L: 7299
								Client.groundItems[GrandExchangeOfferTotalQuantityComparator.Client_plane][var3][var4] = null;
							}
							WallDecoration.updateItemPile(var3, var4); // L: 7300
						}
					}
				} else {
					if (ZoneUpdate.AREA_SOUND == var0) {
						var2 = var1.readUnsignedByte(); // SETTINGS
						var3 = var2 >> 4 & 15;
						var4 = var2 & 7;
						var5 = var1.readUByteSub(); // TILE
						var6 = (var5 >> 4 & 7) + ItemComposition.Zone_Y;
						var7 = (var5 & 7) + Actor.ZONE_X;
						var8 = var1.readUByteNeg(); // DELAY
						var9 = var1.readUShortLE(); // SOUND
						if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
							var10 = var3 + 1;
							if (HealthBarDefinition.localPlayer.pathX[0] >= var6 - var10 && HealthBarDefinition.localPlayer.pathX[0] <= var6 + var10 && HealthBarDefinition.localPlayer.pathY[0] >= var7 - var10 && HealthBarDefinition.localPlayer.pathY[0] <= var7 + var10 && class408.clientPreferences.areaSoundEffectsVolume != 0 && var4 > 0 && Client.soundEffectCount < 50) { // L: 7316 7317
								Client.soundEffectIds[Client.soundEffectCount] = var9;
								Client.queuedSoundEffectLoops[Client.soundEffectCount] = var4;
								Client.queuedSoundEffectDelays[Client.soundEffectCount] = var8;
								Client.soundEffects[Client.soundEffectCount] = null;
								Client.soundLocations[Client.soundEffectCount] = var3 + (var7 << 8) + (var6 << 16);
								++Client.soundEffectCount;
							}
						}
					}

					if (ZoneUpdate.OBJ_ADD == var0) {
						var2 = var1.readUShortLE(); // ItemID
						var3 = var1.readUShortAdd(); // Amount
						var4 = var1.readUByteAdd(); // TILE
						var5 = (var4 >> 4 & 7) + ItemComposition.Zone_Y;
						var6 = (var4 & 7) + Actor.ZONE_X;
						if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
							var33 = new TileItem();
							var33.itemID = var2;
							var33.quantity = var3;
							if (Client.groundItems[GrandExchangeOfferTotalQuantityComparator.Client_plane][var5][var6] == null) {
								Client.groundItems[GrandExchangeOfferTotalQuantityComparator.Client_plane][var5][var6] = new NodeDeque();
							}

							Client.groundItems[GrandExchangeOfferTotalQuantityComparator.Client_plane][var5][var6].addFirst(var33);
							WallDecoration.updateItemPile(var5, var6);
						}

					} else {
						if (ZoneUpdate.PREFETCH_GAMEOBJECTS == var0) { // L: 7344
							var2 = var1.readUShortAdd(); // L: 7345
							var3 = var1.readShortAddLE(); // L: 7346
							var4 = var1.readUByteNeg(); // L: 7347
							var5 = var4 >> 2; // L: 7348
							var6 = var4 & 3; // L: 7349
							var7 = Client.field530[var5]; // L: 7350
							byte var38 = var1.readByteAdd(); // L: 7351
							byte var40 = var1.readByteSub(); // L: 7352
							byte var41 = var1.readByteAdd(); // L: 7353
							var11 = var1.readUShortAdd(); // L: 7354
							var12 = var1.readUnsignedShort(); // L: 7355
							byte var13 = var1.readByte(); // L: 7356
							var14 = var1.readUByteAdd(); // L: 7357
							int var15 = (var14 >> 4 & 7) + ItemComposition.Zone_Y; // L: 7358
							int var16 = (var14 & 7) + Actor.ZONE_X; // L: 7359
							Player var17;
							if (var11 == Client.localPlayerIndex) { // L: 7361
								var17 = HealthBarDefinition.localPlayer;
							} else {
								var17 = Client.players[var11]; // L: 7362
							}

							if (var17 != null) { // L: 7363
								ObjectComposition var18 = KitDefinition.getObjectDefinition(var12); // L: 7364
								int var19;
								int var20;
								if (var6 != 1 && var6 != 3) { // L: 7367
									var19 = var18.sizeX; // L: 7372
									var20 = var18.sizeY; // L: 7373
								} else {
									var19 = var18.sizeY; // L: 7368
									var20 = var18.sizeX; // L: 7369
								}

								int var21 = var15 + (var19 >> 1); // L: 7375
								int var22 = var15 + (var19 + 1 >> 1); // L: 7376
								int var23 = var16 + (var20 >> 1); // L: 7377
								int var24 = var16 + (var20 + 1 >> 1); // L: 7378
								int[][] var25 = Tiles.Tiles_heights[GrandExchangeOfferTotalQuantityComparator.Client_plane]; // L: 7379
								int var26 = var25[var22][var24] + var25[var21][var23] + var25[var22][var23] + var25[var21][var24] >> 2; // L: 7380
								int var27 = (var15 << 7) + (var19 << 6); // L: 7381
								int var28 = (var16 << 7) + (var20 << 6); // L: 7382
								Model var29 = var18.getModel(var5, var6, var25, var27, var26, var28); // L: 7383
								if (var29 != null) { // L: 7384
									WorldMapLabelSize.updatePendingSpawn(GrandExchangeOfferTotalQuantityComparator.Client_plane, var15, var16, var7, -1, 0, 0, var3 + 1, var2 + 1); // L: 7385
									var17.animationCycleStart = var3 + Client.cycle; // L: 7386
									var17.animationCycleEnd = var2 + Client.cycle; // L: 7387
									var17.model0 = var29; // L: 7388
									var17.field1042 = var19 * 64 + var15 * 128; // L: 7389
									var17.field1052 = var20 * 64 + var16 * 128; // L: 7390
									var17.tileHeight2 = var26; // L: 7391
									byte var30;
									if (var41 > var13) { // L: 7392
										var30 = var41; // L: 7393
										var41 = var13; // L: 7394
										var13 = var30; // L: 7395
									}

									if (var38 > var40) { // L: 7397
										var30 = var38; // L: 7398
										var38 = var40; // L: 7399
										var40 = var30; // L: 7400
									}

									var17.minX = var41 + var15; // L: 7402
									var17.maxX = var15 + var13; // L: 7403
									var17.minY = var16 + var38; // L: 7404
									var17.maxY = var40 + var16; // L: 7405
								}
							}
						}

						if (ZoneUpdate.MAP_ANIM == var0) {
							var2 = var1.readShortAddLE(); // ID
							var3 = var1.readUnsignedByte(); // HEIGHT
							var4 = var1.readShortAddLE(); // DELAY
							var5 = var1.readUByteNeg(); // TILE
							var6 = (var5 >> 4 & 7) + ItemComposition.Zone_Y; // L: 7414
							var7 = (var5 & 7) + Actor.ZONE_X; // L: 7415
							if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) { // L: 7416
								var6 = var6 * 128 + 64; // L: 7417
								var7 = var7 * 128 + 64; // L: 7418
								GraphicsObject var32 = new GraphicsObject(var2, GrandExchangeOfferTotalQuantityComparator.Client_plane, var6, var7, class392.getTileHeight(var6, var7, GrandExchangeOfferTotalQuantityComparator.Client_plane) - var3, var4, Client.cycle); // L: 7419
								Client.graphicsObjects.addFirst(var32); // L: 7420
							}

						} else if (ZoneUpdate.LOC_ANIM == var0) { // L: 7424
							var2 = var1.readUnsignedShort(); // Maybe || id
							var3 = var1.readUByteNeg(); // Tile
							var4 = (var3 >> 4 & 7) + ItemComposition.Zone_Y;
							var5 = (var3 & 7) + Actor.ZONE_X;
							var6 = var1.readUByteSub(); // SETTINGS
							var7 = var6 >> 2;
							var8 = var6 & 3;
							var9 = Client.field530[var7];
							if (var4 >= 0 && var5 >= 0 && var4 < 103 && var5 < 103) {
								if (var9 == 0) {
									BoundaryObject var31 = GameBuild.scene.method4301(GrandExchangeOfferTotalQuantityComparator.Client_plane, var4, var5);
									if (var31 != null) {
										var11 = Entity_unpackID(var31.tag);
										if (var7 == 2) {
											var31.renderable1 = new DynamicObject(var11, 2, var8 + 4, GrandExchangeOfferTotalQuantityComparator.Client_plane, var4, var5, var2, false, var31.renderable1); // L: 7439
											var31.renderable2 = new DynamicObject(var11, 2, var8 + 1 & 3, GrandExchangeOfferTotalQuantityComparator.Client_plane, var4, var5, var2, false, var31.renderable2); // L: 7440
										} else {
											var31.renderable1 = new DynamicObject(var11, var7, var8, GrandExchangeOfferTotalQuantityComparator.Client_plane, var4, var5, var2, false, var31.renderable1); // L: 7442
										}
									}
								}

								if (var9 == 1) { // L: 7445
									WallDecoration var43 = GameBuild.scene.method4410(GrandExchangeOfferTotalQuantityComparator.Client_plane, var4, var5); // L: 7446
									if (var43 != null) { // L: 7447
										var11 = Entity_unpackID(var43.tag); // L: 7448
										if (var7 != 4 && var7 != 5) { // L: 7449
											if (var7 == 6) { // L: 7450
												var43.renderable1 = new DynamicObject(var11, 4, var8 + 4, GrandExchangeOfferTotalQuantityComparator.Client_plane, var4, var5, var2, false, var43.renderable1);
											} else if (var7 == 7) { // L: 7451
												var43.renderable1 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, GrandExchangeOfferTotalQuantityComparator.Client_plane, var4, var5, var2, false, var43.renderable1);
											} else if (var7 == 8) { // L: 7452
												var43.renderable1 = new DynamicObject(var11, 4, var8 + 4, GrandExchangeOfferTotalQuantityComparator.Client_plane, var4, var5, var2, false, var43.renderable1); // L: 7453
												var43.renderable2 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, GrandExchangeOfferTotalQuantityComparator.Client_plane, var4, var5, var2, false, var43.renderable2); // L: 7454
											}
										} else {
											var43.renderable1 = new DynamicObject(var11, 4, var8, GrandExchangeOfferTotalQuantityComparator.Client_plane, var4, var5, var2, false, var43.renderable1);
										}
									}
								}

								if (var9 == 2) { // L: 7458
									GameObject var44 = GameBuild.scene.getGameObject(GrandExchangeOfferTotalQuantityComparator.Client_plane, var4, var5); // L: 7459
									if (var7 == 11) { // L: 7460
										var7 = 10;
									}

									if (var44 != null) { // L: 7461
										var44.renderable = new DynamicObject(Entity_unpackID(var44.tag), var7, var8, GrandExchangeOfferTotalQuantityComparator.Client_plane, var4, var5, var2, false, var44.renderable);
									}
								}

								if (var9 == 3) { // L: 7463
									FloorDecoration var45 = GameBuild.scene.getFloorDecoration(GrandExchangeOfferTotalQuantityComparator.Client_plane, var4, var5); // L: 7464
									if (var45 != null) { // L: 7465
										var45.renderable = new DynamicObject(Entity_unpackID(var45.tag), 22, var8, GrandExchangeOfferTotalQuantityComparator.Client_plane, var4, var5, var2, false, var45.renderable);
									}
								}
							}

						}
					}
				}
			}
		}
	} // L: 7218 7231 7254 7281 7303 7342 7422 7468 7470

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "148255026"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.CLAN_JOINCHAT_LEAVECHAT, Client.packetWriter.isaacCipher); // L: 11822
		var0.packetBuffer.writeByte(0); // L: 11823
		Client.packetWriter.addNode(var0); // L: 11824
	} // L: 11825
}
