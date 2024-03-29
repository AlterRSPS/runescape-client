import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
@Implements("ModeWhere")
public enum ModeWhere implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4125("", 0, new class327[]{class327.field4109}),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4126("", 1, new class327[]{class327.field4108, class327.field4109}),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4127("", 2, new class327[]{class327.field4108, class327.field4110, class327.field4109}),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4130("", 3, new class327[]{class327.field4108}),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4129("", 4),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4138("", 5, new class327[]{class327.field4108, class327.field4109}),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4131("", 6, new class327[]{class327.field4109}),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4132("", 8, new class327[]{class327.field4108, class327.field4109}),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4128("", 9, new class327[]{class327.field4108, class327.field4110}),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4134("", 10, new class327[]{class327.field4108}),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4135("", 11, new class327[]{class327.field4108}),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4136("", 12, new class327[]{class327.field4108, class327.field4109}),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4133("", 13, new class327[]{class327.field4108});

	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1167171757
	)
	@Export("id")
	final int id;
	@ObfuscatedName("t")
	final Set field4137;

	static {
		method5894(); // L: 28
	} // L: 29

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lls;)V"
	)
	ModeWhere(String var3, int var4, class327[] var5) {
		this.field4137 = new HashSet();
		this.id = var4; // L: 43
		class327[] var6 = var5; // L: 45

		for (int var7 = 0; var7 < var6.length; ++var7) { // L: 46
			class327 var8 = var6[var7]; // L: 47
			this.field4137.add(var8); // L: 48
		}

	} // L: 51

	ModeWhere(String var3, int var4) {
		this.field4137 = new HashSet(); // L: 32
		this.id = var4; // L: 39
	} // L: 40

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 55
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)[Llz;",
		garbageValue = "-298356237"
	)
	static ModeWhere[] method5894() {
		return new ModeWhere[]{field4126, field4138, field4127, field4130, field4129, field4136, field4133, field4132, field4128, field4135, field4134, field4131, field4125}; // L: 35
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "1808500640"
	)
	@Export("menuAction")
	static final void menuAction(int var0_slot, int var1_hash, int var2, int var3_item_npc_index, String var4, String var5, int var6, int var7) {
		if (var2 >= 2000) { // L: 8923
			var2 -= 2000;
		}
		System.out.println("MENUaction: var2: " + var2);
		PacketBufferNode var8;
		if (var2 == 1) { // L: 8924
			Client.mouseCrossX = var6; // L: 9291
			Client.mouseCrossY = var7; // L: 9292
			Client.mouseCrossColor = 2; // L: 9293
			Client.mouseCrossState = 0; // L: 9294
			Client.destinationX = var0_slot; // L: 9295
			Client.destinationY = var1_hash; // L: 9296
			var8 = WallDecoration.getPacketBufferNode(ClientPacket.OPLOCU, Client.packetWriter.isaacCipher); // L: 9298
			var8.packetBuffer.writeInt(class20.component); // L: 9299
			var8.packetBuffer.writeShortLE(GrandExchangeOfferOwnWorldComparator.baseY + var1_hash); // L: 9300
			var8.packetBuffer.writeShortAdd(var0_slot + SecureRandomCallable.baseX); // L: 9301
			var8.packetBuffer.writeShortAddLE(FloorUnderlayDefinition.item); // L: 9302
			var8.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9303
			var8.packetBuffer.writeShortAddLE(var3_item_npc_index); // L: 9304
			var8.packetBuffer.writeShortLE(PcmPlayer.clickedSlot); // L: 9305
			Client.packetWriter.addNode(var8); // L: 9306
		} else if (var2 == 2) {
			Client.mouseCrossX = var6; // L: 9100
			Client.mouseCrossY = var7; // L: 9101
			Client.mouseCrossColor = 2; // L: 9102
			Client.mouseCrossState = 0; // L: 9103
			Client.destinationX = var0_slot; // L: 9104
			Client.destinationY = var1_hash; // L: 9105
			var8 = WallDecoration.getPacketBufferNode(ClientPacket.OPLOCT, Client.packetWriter.isaacCipher); // L: 9106
			var8.packetBuffer.writeShortAdd(var0_slot + SecureRandomCallable.baseX); // L: 9107
			var8.packetBuffer.writeShort(GrandExchangeOfferOwnWorldComparator.baseY + var1_hash); // L: 9108
			var8.packetBuffer.writeShortAdd(Client._201Verify); // L: 9109
			var8.packetBuffer.writeShortAdd(Client._201SpellSlot); // L: 9110
			var8.packetBuffer.writeShortAddLE(var3_item_npc_index); // L: 9111
			var8.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9112
			var8.packetBuffer.writeIntIME(ArchiveDiskActionHandler._201Hash); // L: 9113
			Client.packetWriter.addNode(var8); // L: 9114
		} else if (var2 == 3) {
			Client.mouseCrossX = var6; // L: 8938
			Client.mouseCrossY = var7; // L: 8939
			Client.mouseCrossColor = 2; // L: 8940
			Client.mouseCrossState = 0; // L: 8941
			Client.destinationX = var0_slot; // L: 8942
			Client.destinationY = var1_hash; // L: 8943
			var8 = WallDecoration.getPacketBufferNode(ClientPacket.OPLOC1, Client.packetWriter.isaacCipher); // L: 8945
			var8.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8946
			var8.packetBuffer.writeShortLE(var3_item_npc_index); // L: 8947
			var8.packetBuffer.writeShortAddLE(var0_slot + SecureRandomCallable.baseX); // L: 8948
			var8.packetBuffer.writeShortAdd(GrandExchangeOfferOwnWorldComparator.baseY + var1_hash); // L: 8949
			Client.packetWriter.addNode(var8); // L: 8950
		} else if (var2 == 4) {
			Client.mouseCrossX = var6; // L: 9554
			Client.mouseCrossY = var7; // L: 9555
			Client.mouseCrossColor = 2; // L: 9556
			Client.mouseCrossState = 0; // L: 9557
			Client.destinationX = var0_slot; // L: 9558
			Client.destinationY = var1_hash; // L: 9559
			var8 = WallDecoration.getPacketBufferNode(ClientPacket.OPLOC2, Client.packetWriter.isaacCipher); // L: 9561
			var8.packetBuffer.writeShortAddLE(var3_item_npc_index); // L: 9562
			var8.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9563
			var8.packetBuffer.writeShortLE(GrandExchangeOfferOwnWorldComparator.baseY + var1_hash); // L: 9564
			var8.packetBuffer.writeShortLE(var0_slot + SecureRandomCallable.baseX); // L: 9565
			Client.packetWriter.addNode(var8); // L: 9566
		} else if (var2 == 5) {
			Client.mouseCrossX = var6; // L: 9014
			Client.mouseCrossY = var7; // L: 9015
			Client.mouseCrossColor = 2; // L: 9016
			Client.mouseCrossState = 0; // L: 9017
			Client.destinationX = var0_slot; // L: 9018
			Client.destinationY = var1_hash; // L: 9019
			var8 = WallDecoration.getPacketBufferNode(ClientPacket.OPLOC3, Client.packetWriter.isaacCipher); // L: 9021
			var8.packetBuffer.writeShortAddLE(GrandExchangeOfferOwnWorldComparator.baseY + var1_hash); // L: 9022
			var8.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9023
			var8.packetBuffer.writeShort(var0_slot + SecureRandomCallable.baseX); // L: 9024
			var8.packetBuffer.writeShortLE(var3_item_npc_index); // L: 9025
			Client.packetWriter.addNode(var8); // L: 9026
		} else if (var2 == 6) {
			Client.mouseCrossX = var6; // L: 9160
			Client.mouseCrossY = var7; // L: 9161
			Client.mouseCrossColor = 2; // L: 9162
			Client.mouseCrossState = 0; // L: 9163
			Client.destinationX = var0_slot; // L: 9164
			Client.destinationY = var1_hash; // L: 9165
			var8 = WallDecoration.getPacketBufferNode(ClientPacket.OPLOC4, Client.packetWriter.isaacCipher); // L: 9167
			var8.packetBuffer.writeShort(var3_item_npc_index); // L: 9168
			var8.packetBuffer.writeShort(GrandExchangeOfferOwnWorldComparator.baseY + var1_hash); // L: 9169
			var8.packetBuffer.writeShort(var0_slot + SecureRandomCallable.baseX); // L: 9170
			var8.packetBuffer.wirteByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9171
			Client.packetWriter.addNode(var8); // L: 9172
		} else {
			PacketBufferNode var9;
			NPC var13;
			if (var2 == 7) {
				var13 = Client.npcs[var3_item_npc_index]; // L: 9572
				if (var13 != null) { // L: 9573
					Client.mouseCrossX = var6; // L: 9574
					Client.mouseCrossY = var7; // L: 9575
					Client.mouseCrossColor = 2; // L: 9576
					Client.mouseCrossState = 0; // L: 9577
					Client.destinationX = var0_slot; // L: 9578
					Client.destinationY = var1_hash; // L: 9579
					var9 = WallDecoration.getPacketBufferNode(ClientPacket.OPNPCU, Client.packetWriter.isaacCipher); // L: 9581
					var9.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9582
					var9.packetBuffer.writeShort(FloorUnderlayDefinition.item); // L: 9583
					var9.packetBuffer.writeInt(class20.component); // L: 9584
					var9.packetBuffer.writeShort(var3_item_npc_index); // L: 9585
					var9.packetBuffer.writeShort(PcmPlayer.clickedSlot); // L: 9586
					Client.packetWriter.addNode(var9); // L: 9587
				}
			} else if (var2 == 8) {
				var13 = Client.npcs[var3_item_npc_index]; // L: 9635
				if (var13 != null) { // L: 9636
					Client.mouseCrossX = var6; // L: 9637
					Client.mouseCrossY = var7; // L: 9638
					Client.mouseCrossColor = 2; // L: 9639
					Client.mouseCrossState = 0; // L: 9640
					Client.destinationX = var0_slot; // L: 9641
					Client.destinationY = var1_hash; // L: 9642
					var9 = WallDecoration.getPacketBufferNode(ClientPacket.OPNPCT, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeShortAddLE(var3_item_npc_index); // npc index
					var9.packetBuffer.writeShort(Client._201Verify);
					var9.packetBuffer.wirteByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // MOVEMENT TYPE
					var9.packetBuffer.writeShortAdd(Client._201SpellSlot); // COmponent slot
					var9.packetBuffer.writeIntLE(ArchiveDiskActionHandler._201Hash); // component hash
					Client.packetWriter.addNode(var9); // L: 9649
				}
			} else if (var2 == 9) {
				var13 = Client.npcs[var3_item_npc_index]; // L: 9591
				if (var13 != null) { // L: 9592
					Client.mouseCrossX = var6; // L: 9593
					Client.mouseCrossY = var7; // L: 9594
					Client.mouseCrossColor = 2; // L: 9595
					Client.mouseCrossState = 0; // L: 9596
					Client.destinationX = var0_slot; // L: 9597
					Client.destinationY = var1_hash; // L: 9598
					var9 = WallDecoration.getPacketBufferNode(ClientPacket.OPNPC1, Client.packetWriter.isaacCipher); // L: 9600
					var9.packetBuffer.writeShortAdd(var3_item_npc_index); // L: 9601
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9602
					Client.packetWriter.addNode(var9); // L: 9603
				}
			} else if (var2 == 10) {
				var13 = Client.npcs[var3_item_npc_index]; // L: 9391
				if (var13 != null) { // L: 9392
					Client.mouseCrossX = var6; // L: 9393
					Client.mouseCrossY = var7; // L: 9394
					Client.mouseCrossColor = 2; // L: 9395
					Client.mouseCrossState = 0; // L: 9396
					Client.destinationX = var0_slot; // L: 9397
					Client.destinationY = var1_hash; // L: 9398
					var9 = WallDecoration.getPacketBufferNode(ClientPacket.OPNPC2, Client.packetWriter.isaacCipher); // L: 9400
					var9.packetBuffer.writeShortLE(var3_item_npc_index); // L: 9401
					var9.packetBuffer.wirteByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9402
					Client.packetWriter.addNode(var9); // L: 9403
				}
			} else if (var2 == 11) {
				var13 = Client.npcs[var3_item_npc_index]; // L: 9275
				if (var13 != null) { // L: 9276
					Client.mouseCrossX = var6; // L: 9277
					Client.mouseCrossY = var7; // L: 9278
					Client.mouseCrossColor = 2; // L: 9279
					Client.mouseCrossState = 0; // L: 9280
					Client.destinationX = var0_slot; // L: 9281
					Client.destinationY = var1_hash; // L: 9282
					var9 = WallDecoration.getPacketBufferNode(ClientPacket.OPNPC3, Client.packetWriter.isaacCipher); // L: 9284
					var9.packetBuffer.wirteByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9285
					var9.packetBuffer.writeShortAddLE(var3_item_npc_index); // L: 9286
					Client.packetWriter.addNode(var9); // L: 9287
				}
			} else if (var2 == 12) {
				var13 = Client.npcs[var3_item_npc_index]; // L: 8953
				if (var13 != null) { // L: 8954
					Client.mouseCrossX = var6; // L: 8955
					Client.mouseCrossY = var7; // L: 8956
					Client.mouseCrossColor = 2; // L: 8957
					Client.mouseCrossState = 0; // L: 8958
					Client.destinationX = var0_slot; // L: 8959
					Client.destinationY = var1_hash; // L: 8960
					var9 = WallDecoration.getPacketBufferNode(ClientPacket.OPNPC4, Client.packetWriter.isaacCipher); // L: 8962
					var9.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8963
					var9.packetBuffer.writeShortAddLE(var3_item_npc_index); // L: 8964
					Client.packetWriter.addNode(var9); // L: 8965
				}
			} else if (var2 == 13) {
				var13 = Client.npcs[var3_item_npc_index]; // L: 9375
				if (var13 != null) { // L: 9376
					Client.mouseCrossX = var6; // L: 9377
					Client.mouseCrossY = var7; // L: 9378
					Client.mouseCrossColor = 2; // L: 9379
					Client.mouseCrossState = 0; // L: 9380
					Client.destinationX = var0_slot; // L: 9381
					Client.destinationY = var1_hash; // L: 9382
					var9 = WallDecoration.getPacketBufferNode(ClientPacket.OPNPC5, Client.packetWriter.isaacCipher); // L: 9384
					var9.packetBuffer.writeShortLE(var3_item_npc_index); // L: 9385
					var9.packetBuffer.wirteByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9386
					Client.packetWriter.addNode(var9); // L: 9387
				}
			} else {
				Player var15;
				if (var2 == 14) {
					var15 = Client.players[var3_item_npc_index]; // L: 9435
					if (var15 != null) { // L: 9436
						Client.mouseCrossX = var6; // L: 9437
						Client.mouseCrossY = var7; // L: 9438
						Client.mouseCrossColor = 2; // L: 9439
						Client.mouseCrossState = 0; // L: 9440
						Client.destinationX = var0_slot; // L: 9441
						Client.destinationY = var1_hash; // L: 9442
						var9 = WallDecoration.getPacketBufferNode(ClientPacket.OPPLAYERU, Client.packetWriter.isaacCipher); // L: 9444
						var9.packetBuffer.writeShortAdd(PcmPlayer.clickedSlot); // L: 9445
						var9.packetBuffer.writeShortAddLE(var3_item_npc_index); // L: 9446
						var9.packetBuffer.writeInt(class20.component); // L: 9447
						var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9448
						var9.packetBuffer.writeShortAddLE(FloorUnderlayDefinition.item); // L: 9449
						Client.packetWriter.addNode(var9); // L: 9450
					}
				} else if (var2 == 15) {
					var15 = Client.players[var3_item_npc_index]; // L: 9479
					if (var15 != null) { // L: 9480
						Client.mouseCrossX = var6; // L: 9481
						Client.mouseCrossY = var7; // L: 9482
						Client.mouseCrossColor = 2; // L: 9483
						Client.mouseCrossState = 0; // L: 9484
						Client.destinationX = var0_slot; // L: 9485
						Client.destinationY = var1_hash; // L: 9486
						var9 = WallDecoration.getPacketBufferNode(ClientPacket.OPPLAYERT, Client.packetWriter.isaacCipher); // L: 9487
						var9.packetBuffer.writeInt(ArchiveDiskActionHandler._201Hash); // L: 9488
						var9.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9489
						var9.packetBuffer.writeShortLE(Client._201Verify); // L: 9490
						var9.packetBuffer.writeShort(Client._201SpellSlot); // L: 9491
						var9.packetBuffer.writeShortAddLE(var3_item_npc_index); // L: 9492
						Client.packetWriter.addNode(var9); // L: 9493
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var6; // L: 9520
					Client.mouseCrossY = var7; // L: 9521
					Client.mouseCrossColor = 2; // L: 9522
					Client.mouseCrossState = 0; // L: 9523
					Client.destinationX = var0_slot; // L: 9524
					Client.destinationY = var1_hash; // L: 9525
					var8 = WallDecoration.getPacketBufferNode(ClientPacket.OPOBJU, Client.packetWriter.isaacCipher); // L: 9527
					var8.packetBuffer.writeShortAddLE(var0_slot + SecureRandomCallable.baseX); // L: 9528
					var8.packetBuffer.writeShortLE(GrandExchangeOfferOwnWorldComparator.baseY + var1_hash); // L: 9529
					var8.packetBuffer.writeShortAddLE(FloorUnderlayDefinition.item); // L: 9530
					var8.packetBuffer.writeIntLE(class20.component); // L: 9531
					var8.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9532
					var8.packetBuffer.writeShortAddLE(PcmPlayer.clickedSlot); // L: 9533
					var8.packetBuffer.writeShortAdd(var3_item_npc_index); // L: 9534
					Client.packetWriter.addNode(var8); // L: 9535
				} else if (var2 == 17) {
					Client.mouseCrossX = var6; // L: 9351
					Client.mouseCrossY = var7; // L: 9352
					Client.mouseCrossColor = 2; // L: 9353
					Client.mouseCrossState = 0; // L: 9354
					Client.destinationX = var0_slot; // L: 9355
					Client.destinationY = var1_hash; // L: 9356
					var8 = WallDecoration.getPacketBufferNode(ClientPacket.OPOBJT, Client.packetWriter.isaacCipher); // L: 9357
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9358
					var8.packetBuffer.writeShortAdd(Client._201Verify); // L: 9359
					var8.packetBuffer.writeShortAddLE(Client._201SpellSlot); // L: 9360
					var8.packetBuffer.writeShort(var3_item_npc_index); // L: 9361
					var8.packetBuffer.writeShortAddLE(GrandExchangeOfferOwnWorldComparator.baseY + var1_hash); // L: 9362
					var8.packetBuffer.writeInt(ArchiveDiskActionHandler._201Hash); // L: 9363
					var8.packetBuffer.writeShort(var0_slot + SecureRandomCallable.baseX); // L: 9364
					Client.packetWriter.addNode(var8); // L: 9365
				} else if (var2 == 18) {
					Client.mouseCrossX = var6; // L: 9056
					Client.mouseCrossY = var7; // L: 9057
					Client.mouseCrossColor = 2; // L: 9058
					Client.mouseCrossState = 0; // L: 9059
					Client.destinationX = var0_slot; // L: 9060
					Client.destinationY = var1_hash; // L: 9061
					var8 = WallDecoration.getPacketBufferNode(ClientPacket.OPOBJ1, Client.packetWriter.isaacCipher); // L: 9063
					var8.packetBuffer.writeShortLE(var0_slot + SecureRandomCallable.baseX); // L: 9064
					var8.packetBuffer.writeShortAdd(var3_item_npc_index); // L: 9065
					var8.packetBuffer.writeShortAddLE(GrandExchangeOfferOwnWorldComparator.baseY + var1_hash); // L: 9066
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9067
					Client.packetWriter.addNode(var8); // L: 9068
				} else if (var2 == 19) {
					Client.mouseCrossX = var6; // L: 9688
					Client.mouseCrossY = var7; // L: 9689
					Client.mouseCrossColor = 2; // L: 9690
					Client.mouseCrossState = 0; // L: 9691
					Client.destinationX = var0_slot; // L: 9692
					Client.destinationY = var1_hash; // L: 9693
					var8 = WallDecoration.getPacketBufferNode(ClientPacket.OPOBJ2, Client.packetWriter.isaacCipher); // L: 9695
					var8.packetBuffer.wirteByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9696
					var8.packetBuffer.writeShortLE(var0_slot + SecureRandomCallable.baseX); // L: 9697
					var8.packetBuffer.writeShortAddLE(GrandExchangeOfferOwnWorldComparator.baseY + var1_hash); // L: 9698
					var8.packetBuffer.writeShortAdd(var3_item_npc_index); // L: 9699
					Client.packetWriter.addNode(var8); // L: 9700
				} else if (var2 == 20) {
					Client.mouseCrossX = var6; // L: 9249
					Client.mouseCrossY = var7; // L: 9250
					Client.mouseCrossColor = 2; // L: 9251
					Client.mouseCrossState = 0; // L: 9252
					Client.destinationX = var0_slot; // L: 9253
					Client.destinationY = var1_hash; // L: 9254
					var8 = WallDecoration.getPacketBufferNode(ClientPacket.OPOBJ3, Client.packetWriter.isaacCipher); // L: 9256
					var8.packetBuffer.writeShort(GrandExchangeOfferOwnWorldComparator.baseY + var1_hash); // L: 9257
					var8.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9258
					var8.packetBuffer.writeShortAdd(var0_slot + SecureRandomCallable.baseX); // L: 9259
					var8.packetBuffer.writeShortAddLE(var3_item_npc_index); // L: 9260
					Client.packetWriter.addNode(var8); // L: 9261
				} else if (var2 == 21) {
					Client.mouseCrossX = var6; // L: 9188
					Client.mouseCrossY = var7; // L: 9189
					Client.mouseCrossColor = 2; // L: 9190
					Client.mouseCrossState = 0; // L: 9191
					Client.destinationX = var0_slot; // L: 9192
					Client.destinationY = var1_hash; // L: 9193
					var8 = WallDecoration.getPacketBufferNode(ClientPacket.OPOBJ4, Client.packetWriter.isaacCipher); // L: 9195
					var8.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9196
					var8.packetBuffer.writeShortLE(var0_slot + SecureRandomCallable.baseX); // L: 9197
					var8.packetBuffer.writeShort(var3_item_npc_index); // L: 9198
					var8.packetBuffer.writeShort(GrandExchangeOfferOwnWorldComparator.baseY + var1_hash); // L: 9199
					Client.packetWriter.addNode(var8); // L: 9200
				} else if (var2 == 22) {
					Client.mouseCrossX = var6; // L: 8983
					Client.mouseCrossY = var7; // L: 8984
					Client.mouseCrossColor = 2; // L: 8985
					Client.mouseCrossState = 0; // L: 8986
					Client.destinationX = var0_slot; // L: 8987
					Client.destinationY = var1_hash; // L: 8988
					var8 = WallDecoration.getPacketBufferNode(ClientPacket.OPOBJ5, Client.packetWriter.isaacCipher); // L: 8990
					var8.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8991
					var8.packetBuffer.writeShortLE(var3_item_npc_index); // L: 8992
					var8.packetBuffer.writeShortAdd(GrandExchangeOfferOwnWorldComparator.baseY + var1_hash); // L: 8993
					var8.packetBuffer.writeShortAddLE(var0_slot + SecureRandomCallable.baseX); // L: 8994
					Client.packetWriter.addNode(var8); // L: 8995
				} else if (var2 == 23) {
					if (Client.isMenuOpen) { // L: 9664
						class175.scene.setViewportWalking(); // L: 9665
					} else {
						class175.scene.menuOpen(class128.Client_plane, var0_slot, var1_hash, true); // L: 9668
					}
				} else {
					PacketBufferNode var11;
					Widget var16;
					if (var2 == 24) {
						var16 = class92.getWidget(var1_hash); // L: 9466
						if (var16 != null) { // L: 9467
							boolean var12 = true; // L: 9468
							if (var16.contentType > 0) { // L: 9469
								var12 = ReflectionCheck.method599(var16);
							}

							if (var12) { // L: 9470
								var11 = WallDecoration.getPacketBufferNode(ClientPacket.BUTTON_CLICK, Client.packetWriter.isaacCipher); // L: 9472
								var11.packetBuffer.writeInt(var1_hash); // L: 9473
								Client.packetWriter.addNode(var11); // L: 9474
							}
						}
					} else {
						if (var2 == 25) {
							var16 = ApproximateRouteStrategy.getWidgetChild(var1_hash, var0_slot); // L: 9175
							if (var16 != null) { // L: 9176
								MusicPatchNode2.Widget_runOnTargetLeave(); // L: 9177
								class93.selectSpell(var1_hash, var0_slot, WorldMapSection1.Widget_unpackTargetMask(UrlRequester.getWidgetFlags(var16)), var16.item); // L: 9178
								Client.isItemSelected = 0; // L: 9179
								Client.selectedSpellActionName = TriBool.Widget_getSpellActionName(var16); // L: 9180
								if (Client.selectedSpellActionName == null) { // L: 9181
									Client.selectedSpellActionName = "null";
								}

								if (var16.isIf3) { // L: 9182
									Client.selectedSpellName = var16.dataText + class166.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = class166.colorStartTag(65280) + var16.spellName + class166.colorStartTag(16777215); // L: 9183
								}
							}

							return; // L: 9185
						}

						if (var2 == 26) {
							Varps.method5366(); // L: 9569
						} else {
							int var10;
							Widget var14;
							if (var2 == 28) {
								var8 = WallDecoration.getPacketBufferNode(ClientPacket.BUTTON_CLICK, Client.packetWriter.isaacCipher); // L: 9498
								var8.packetBuffer.writeInt(var1_hash); // L: 9499
								Client.packetWriter.addNode(var8); // L: 9500
								var14 = class92.getWidget(var1_hash); // L: 9501
								if (var14 != null && var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) { // L: 9502
									var10 = var14.cs1Instructions[0][1]; // L: 9503
									Varps.Varps_main[var10] = 1 - Varps.Varps_main[var10]; // L: 9504
									class321.changeGameOptions(var10); // L: 9505
								}
							} else if (var2 == 29) {
								var8 = WallDecoration.getPacketBufferNode(ClientPacket.BUTTON_CLICK, Client.packetWriter.isaacCipher); // L: 9072
								var8.packetBuffer.writeInt(var1_hash); // L: 9073
								Client.packetWriter.addNode(var8); // L: 9074
								var14 = class92.getWidget(var1_hash); // L: 9075
								if (var14 != null && var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) { // L: 9076
									var10 = var14.cs1Instructions[0][1]; // L: 9077
									if (Varps.Varps_main[var10] != var14.cs1ComparisonValues[0]) { // L: 9078
										Varps.Varps_main[var10] = var14.cs1ComparisonValues[0]; // L: 9079
										class321.changeGameOptions(var10); // L: 9080
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) { // L: 9368
									Skills.resumePauseWidget(var1_hash, var0_slot); // L: 9369
									Client.meslayerContinueWidget = ApproximateRouteStrategy.getWidgetChild(var1_hash, var0_slot); // L: 9370
									GrandExchangeOfferTotalQuantityComparator.invalidateWidget(Client.meslayerContinueWidget); // L: 9371
								}
							} else if (var2 == 31) {
								var8 = WallDecoration.getPacketBufferNode(ClientPacket.OPHELDU, Client.packetWriter.isaacCipher); // L: 8970
								var8.packetBuffer.writeIntLE(var1_hash); // L: 8971
								var8.packetBuffer.writeShortLE(var3_item_npc_index); // L: 8972
								var8.packetBuffer.writeShortAddLE(PcmPlayer.clickedSlot); // L: 8973
								var8.packetBuffer.writeIntME(class20.component); // L: 8974
								var8.packetBuffer.writeShortLE(var0_slot); // L: 8975
								var8.packetBuffer.writeShortAdd(FloorUnderlayDefinition.item); // L: 8976
								Client.packetWriter.addNode(var8); // L: 8977
								Client.field598 = 0; // L: 8978
								NPCComposition.field1991 = class92.getWidget(var1_hash); // L: 8979
								Client.field599 = var0_slot; // L: 8980
							} else if (var2 == 32) {
								var8 = WallDecoration.getPacketBufferNode(ClientPacket.OPHELDT, Client.packetWriter.isaacCipher); // L: 9204
								var8.packetBuffer.writeShortLE(var0_slot); // item slot
								var8.packetBuffer.writeShort(Client._201SpellSlot); // spell_slot
								var8.packetBuffer.writeIntIME(var1_hash); // to_hash
								var8.packetBuffer.writeIntIME(ArchiveDiskActionHandler._201Hash); // from_hash
								var8.packetBuffer.writeShortLE(var3_item_npc_index); // item_id
								Client.packetWriter.addNode(var8); // L: 9210
								Client.field598 = 0; // L: 9211
								NPCComposition.field1991 = class92.getWidget(var1_hash); // L: 9212
								Client.field599 = var0_slot; // L: 9213
							} else if (var2 == 33) {
								var8 = WallDecoration.getPacketBufferNode(ClientPacket.OPHELD1, Client.packetWriter.isaacCipher); // L: 9150
								var8.packetBuffer.writeShort(var0_slot); // L: 9151
								var8.packetBuffer.writeShort(var3_item_npc_index); // L: 9152
								var8.packetBuffer.writeIntIME(var1_hash); // L: 9153
								Client.packetWriter.addNode(var8); // L: 9154
								Client.field598 = 0; // L: 9155
								NPCComposition.field1991 = class92.getWidget(var1_hash); // L: 9156
								Client.field599 = var0_slot; // L: 9157
							} else if (var2 == 34) {
								var8 = WallDecoration.getPacketBufferNode(ClientPacket.OPHELD2, Client.packetWriter.isaacCipher); // L: 9510
								var8.packetBuffer.writeShortAdd(var3_item_npc_index); // L: 9511
								var8.packetBuffer.writeInt(var1_hash); // L: 9512
								var8.packetBuffer.writeShortAddLE(var0_slot); // L: 9513
								Client.packetWriter.addNode(var8); // L: 9514
								Client.field598 = 0; // L: 9515
								NPCComposition.field1991 = class92.getWidget(var1_hash); // L: 9516
								Client.field599 = var0_slot; // L: 9517
							} else if (var2 == 35) {
								var8 = WallDecoration.getPacketBufferNode(ClientPacket.OPHELD3, Client.packetWriter.isaacCipher); // L: 9408
								var8.packetBuffer.writeIntIME(var1_hash); // L: 9409
								var8.packetBuffer.writeShortAdd(var0_slot); // L: 9410
								var8.packetBuffer.writeShortAdd(var3_item_npc_index); // L: 9411
								Client.packetWriter.addNode(var8); // L: 9412
								Client.field598 = 0; // L: 9413
								NPCComposition.field1991 = class92.getWidget(var1_hash); // L: 9414
								Client.field599 = var0_slot; // L: 9415
							} else if (var2 == 36) {
								var8 = WallDecoration.getPacketBufferNode(ClientPacket.OPHELD4, Client.packetWriter.isaacCipher); // L: 9619
								var8.packetBuffer.writeShortAddLE(var3_item_npc_index); // L: 9620
								var8.packetBuffer.writeShortAddLE(var0_slot); // L: 9621
								var8.packetBuffer.writeInt(var1_hash); // L: 9622
								Client.packetWriter.addNode(var8); // L: 9623
								Client.field598 = 0; // L: 9624
								NPCComposition.field1991 = class92.getWidget(var1_hash); // L: 9625
								Client.field599 = var0_slot; // L: 9626
							} else if (var2 == 37) {
								var8 = WallDecoration.getPacketBufferNode(ClientPacket.OPHELD5, Client.packetWriter.isaacCipher); // L: 9030
								var8.packetBuffer.writeShortLE(var0_slot); // L: 9031
								var8.packetBuffer.writeShort(var3_item_npc_index); // L: 9032
								var8.packetBuffer.writeInt(var1_hash); // L: 9033
								Client.packetWriter.addNode(var8); // L: 9034
								Client.field598 = 0; // L: 9035
								NPCComposition.field1991 = class92.getWidget(var1_hash); // L: 9036
								Client.field599 = var0_slot; // L: 9037
							} else {
								if (var2 == 38) {
									MusicPatchNode2.Widget_runOnTargetLeave(); // L: 9454
									var16 = class92.getWidget(var1_hash); // L: 9455
									Client.isItemSelected = 1; // L: 9456
									PcmPlayer.clickedSlot = var0_slot; // L: 9457
									class20.component = var1_hash; // L: 9458
									FloorUnderlayDefinition.item = var3_item_npc_index; // L: 9459
									GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var16); // L: 9460
									Client.selectedItemName = class166.colorStartTag(16748608) + FileSystem.ItemDefinition_get(var3_item_npc_index).name + class166.colorStartTag(16777215); // L: 9461
									if (Client.selectedItemName == null) { // L: 9462
										Client.selectedItemName = "null";
									}

									return; // L: 9463
								}

								if (var2 == 39) {
									var8 = WallDecoration.getPacketBufferNode(ClientPacket.IF1_BUTTON1, Client.packetWriter.isaacCipher); // L: 9320
									var8.packetBuffer.writeShort(var3_item_npc_index); // L: 9321
									var8.packetBuffer.writeShortAdd(var0_slot); // L: 9322
									var8.packetBuffer.writeIntME(var1_hash); // L: 9323
									Client.packetWriter.addNode(var8); // L: 9324
									Client.field598 = 0; // L: 9325
									NPCComposition.field1991 = class92.getWidget(var1_hash); // L: 9326
									Client.field599 = var0_slot; // L: 9327
								} else if (var2 == 40) {
									var8 = WallDecoration.getPacketBufferNode(ClientPacket.IF1_BUTTON2, Client.packetWriter.isaacCipher); // L: 9654
									var8.packetBuffer.writeShortAdd(var3_item_npc_index); // L: 9655
									var8.packetBuffer.writeShortAdd(var0_slot); // L: 9656
									var8.packetBuffer.writeIntME(var1_hash); // L: 9657
									Client.packetWriter.addNode(var8); // L: 9658
									Client.field598 = 0; // L: 9659
									NPCComposition.field1991 = class92.getWidget(var1_hash); // L: 9660
									Client.field599 = var0_slot; // L: 9661
								} else if (var2 == 41) {
									var8 = WallDecoration.getPacketBufferNode(ClientPacket.IF1_BUTTON3, Client.packetWriter.isaacCipher); // L: 9608
									var8.packetBuffer.writeShortAddLE(var0_slot); // L: 9609
									var8.packetBuffer.writeShortAdd(var3_item_npc_index); // L: 9610
									var8.packetBuffer.writeInt(var1_hash); // L: 9611
									Client.packetWriter.addNode(var8); // L: 9612
									Client.field598 = 0; // L: 9613
									NPCComposition.field1991 = class92.getWidget(var1_hash); // L: 9614
									Client.field599 = var0_slot; // L: 9615
								} else if (var2 == 42) {
									var8 = WallDecoration.getPacketBufferNode(ClientPacket.IF1_BUTTON4, Client.packetWriter.isaacCipher); // L: 9265
									var8.packetBuffer.writeShortAddLE(var0_slot); // L: 9266
									var8.packetBuffer.writeIntLE(var1_hash); // L: 9267
									var8.packetBuffer.writeShortLE(var3_item_npc_index); // L: 9268
									Client.packetWriter.addNode(var8); // L: 9269
									Client.field598 = 0; // L: 9270
									NPCComposition.field1991 = class92.getWidget(var1_hash); // L: 9271
									Client.field599 = var0_slot; // L: 9272
								} else if (var2 == 43) {
									var8 = WallDecoration.getPacketBufferNode(ClientPacket.IF1_BUTTON5, Client.packetWriter.isaacCipher); // L: 9331
									var8.packetBuffer.writeShortAddLE(var0_slot); // L: 9332
									var8.packetBuffer.writeShortLE(var3_item_npc_index); // L: 9333
									var8.packetBuffer.writeInt(var1_hash); // L: 9334
									Client.packetWriter.addNode(var8); // L: 9335
									Client.field598 = 0; // L: 9336
									NPCComposition.field1991 = class92.getWidget(var1_hash); // L: 9337
									Client.field599 = var0_slot; // L: 9338
								} else if (var2 == 44) {
									var15 = Client.players[var3_item_npc_index]; // L: 9672
									if (var15 != null) { // L: 9673
										Client.mouseCrossX = var6; // L: 9674
										Client.mouseCrossY = var7; // L: 9675
										Client.mouseCrossColor = 2; // L: 9676
										Client.mouseCrossState = 0; // L: 9677
										Client.destinationX = var0_slot; // L: 9678
										Client.destinationY = var1_hash; // L: 9679
										var9 = WallDecoration.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher); // L: 9681
										var9.packetBuffer.writeShort(var3_item_npc_index); // L: 9682
										var9.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9683
										Client.packetWriter.addNode(var9); // L: 9684
									}
								} else if (var2 == 45) {
									var15 = Client.players[var3_item_npc_index]; // L: 9133
									if (var15 != null) { // L: 9134
										Client.mouseCrossX = var6; // L: 9135
										Client.mouseCrossY = var7; // L: 9136
										Client.mouseCrossColor = 2; // L: 9137
										Client.mouseCrossState = 0; // L: 9138
										Client.destinationX = var0_slot; // L: 9139
										Client.destinationY = var1_hash; // L: 9140
										var9 = WallDecoration.getPacketBufferNode(ClientPacket.OPPLAYER2, Client.packetWriter.isaacCipher); // L: 9142
										var9.packetBuffer.writeShortLE(var3_item_npc_index); // L: 9143
										var9.packetBuffer.wirteByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9144
										Client.packetWriter.addNode(var9); // L: 9145
									}
								} else if (var2 == 46) {
									var15 = Client.players[var3_item_npc_index]; // L: 8998
									if (var15 != null) { // L: 8999
										Client.mouseCrossX = var6; // L: 9000
										Client.mouseCrossY = var7; // L: 9001
										Client.mouseCrossColor = 2; // L: 9002
										Client.mouseCrossState = 0; // L: 9003
										Client.destinationX = var0_slot; // L: 9004
										Client.destinationY = var1_hash; // L: 9005
										var9 = WallDecoration.getPacketBufferNode(ClientPacket.OPPLAYER3, Client.packetWriter.isaacCipher); // L: 9007
										var9.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9008
										var9.packetBuffer.writeShort(var3_item_npc_index); // L: 9009
										Client.packetWriter.addNode(var9); // L: 9010
									}
								} else if (var2 == 47) {
									var15 = Client.players[var3_item_npc_index]; // L: 9117
									if (var15 != null) { // L: 9118
										Client.mouseCrossX = var6; // L: 9119
										Client.mouseCrossY = var7; // L: 9120
										Client.mouseCrossColor = 2; // L: 9121
										Client.mouseCrossState = 0; // L: 9122
										Client.destinationX = var0_slot; // L: 9123
										Client.destinationY = var1_hash; // L: 9124
										var9 = WallDecoration.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher); // L: 9126
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9127
										var9.packetBuffer.writeShortAddLE(var3_item_npc_index); // L: 9128
										Client.packetWriter.addNode(var9); // L: 9129
									}
								} else if (var2 == 48) {
									var15 = Client.players[var3_item_npc_index]; // L: 9040
									if (var15 != null) { // L: 9041
										Client.mouseCrossX = var6; // L: 9042
										Client.mouseCrossY = var7; // L: 9043
										Client.mouseCrossColor = 2; // L: 9044
										Client.mouseCrossState = 0; // L: 9045
										Client.destinationX = var0_slot; // L: 9046
										Client.destinationY = var1_hash; // L: 9047
										var9 = WallDecoration.getPacketBufferNode(ClientPacket.OPPLAYER5, Client.packetWriter.isaacCipher); // L: 9049
										var9.packetBuffer.writeShort(var3_item_npc_index); // L: 9050
										var9.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9051
										Client.packetWriter.addNode(var9); // L: 9052
									}
								} else if (var2 == 49) {
									var15 = Client.players[var3_item_npc_index]; // L: 9703
									if (var15 != null) { // L: 9704
										Client.mouseCrossX = var6; // L: 9705
										Client.mouseCrossY = var7; // L: 9706
										Client.mouseCrossColor = 2; // L: 9707
										Client.mouseCrossState = 0; // L: 9708
										Client.destinationX = var0_slot; // L: 9709
										Client.destinationY = var1_hash; // L: 9710
										var9 = WallDecoration.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher); // L: 9712
										var9.packetBuffer.writeShortAddLE(var3_item_npc_index); // L: 9713
										var9.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9714
										Client.packetWriter.addNode(var9); // L: 9715
									}
								} else if (var2 == 50) {
									var15 = Client.players[var3_item_npc_index]; // L: 9538
									if (var15 != null) { // L: 9539
										Client.mouseCrossX = var6; // L: 9540
										Client.mouseCrossY = var7; // L: 9541
										Client.mouseCrossColor = 2; // L: 9542
										Client.mouseCrossState = 0; // L: 9543
										Client.destinationX = var0_slot; // L: 9544
										Client.destinationY = var1_hash; // L: 9545
										var9 = WallDecoration.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher); // L: 9547
										var9.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9548
										var9.packetBuffer.writeShortAddLE(var3_item_npc_index); // L: 9549
										Client.packetWriter.addNode(var9); // L: 9550
									}
								} else if (var2 == 51) {
									var15 = Client.players[var3_item_npc_index]; // L: 9216
									if (var15 != null) { // L: 9217
										Client.mouseCrossX = var6; // L: 9218
										Client.mouseCrossY = var7; // L: 9219
										Client.mouseCrossColor = 2; // L: 9220
										Client.mouseCrossState = 0; // L: 9221
										Client.destinationX = var0_slot; // L: 9222
										Client.destinationY = var1_hash; // L: 9223
										var9 = WallDecoration.getPacketBufferNode(ClientPacket.OPPLAYER8, Client.packetWriter.isaacCipher); // L: 9225
										var9.packetBuffer.wirteByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9226
										var9.packetBuffer.writeShortAddLE(var3_item_npc_index); // L: 9227
										Client.packetWriter.addNode(var9); // L: 9228
									}
								} else {
									label655: {
										if (var2 != 57) {
											if (var2 == 58) {
												var16 = ApproximateRouteStrategy.getWidgetChild(var1_hash, var0_slot); // L: 9235
												if (var16 != null) { // L: 9236
													var9 = WallDecoration.getPacketBufferNode(ClientPacket.IF_BUTTONT, Client.packetWriter.isaacCipher); // L: 9238
													var9.packetBuffer.writeIntME(ArchiveDiskActionHandler._201Hash); // L: 9239
													var9.packetBuffer.writeIntLE(var1_hash);
													var9.packetBuffer.writeShort(var16.item);
													var9.packetBuffer.writeShortAdd(Client._201SpellSlot);
													var9.packetBuffer.writeShortLE(var0_slot);
													var9.packetBuffer.writeShortAddLE(Client._201Verify);
													Client.packetWriter.addNode(var9);
												}
												break label655;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var6; // L: 9085
												Client.mouseCrossY = var7; // L: 9086
												Client.mouseCrossColor = 2; // L: 9087
												Client.mouseCrossState = 0; // L: 9088
												Client.destinationX = var0_slot; // L: 9089
												Client.destinationY = var1_hash; // L: 9090
												var8 = WallDecoration.getPacketBufferNode(ClientPacket.OPLOC5, Client.packetWriter.isaacCipher); // L: 9092
												var8.packetBuffer.writeShort(GrandExchangeOfferOwnWorldComparator.baseY + var1_hash); // L: 9093
												var8.packetBuffer.writeShort(var3_item_npc_index); // L: 9094
												var8.packetBuffer.writeShortAddLE(var0_slot + SecureRandomCallable.baseX); // L: 9095
												var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9096
												Client.packetWriter.addNode(var8); // L: 9097
												break label655;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var6; // L: 9309
												Client.mouseCrossY = var7; // L: 9310
												Client.mouseCrossColor = 2; // L: 9311
												Client.mouseCrossState = 0; // L: 9312
												var8 = WallDecoration.getPacketBufferNode(ClientPacket.OPLOC6, Client.packetWriter.isaacCipher); // L: 9314
												var8.packetBuffer.writeShort(var3_item_npc_index); // L: 9315
												Client.packetWriter.addNode(var8); // L: 9316
												break label655;
											}

											if (var2 == 1003) {
												Client.mouseCrossX = var6; // L: 9418
												Client.mouseCrossY = var7; // L: 9419
												Client.mouseCrossColor = 2; // L: 9420
												Client.mouseCrossState = 0; // L: 9421
												var13 = Client.npcs[var3_item_npc_index]; // L: 9422
												if (var13 != null) { // L: 9423
													NPCComposition var17 = var13.definition; // L: 9424
													if (var17.transforms != null) { // L: 9425
														var17 = var17.transform();
													}

													if (var17 != null) { // L: 9426
														var11 = WallDecoration.getPacketBufferNode(ClientPacket.OPNPC6, Client.packetWriter.isaacCipher); // L: 9428
														var11.packetBuffer.writeShortLE(var17.id); // L: 9429
														Client.packetWriter.addNode(var11); // L: 9430
													}
												}
												break label655;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var6; // L: 9341
												Client.mouseCrossY = var7; // L: 9342
												Client.mouseCrossColor = 2; // L: 9343
												Client.mouseCrossState = 0; // L: 9344
												var8 = WallDecoration.getPacketBufferNode(ClientPacket.OPOBJ6, Client.packetWriter.isaacCipher); // L: 9346
												var8.packetBuffer.writeShort(var3_item_npc_index); // L: 9347
												Client.packetWriter.addNode(var8); // L: 9348
												break label655;
											}

											if (var2 == 1005) {
												var16 = class92.getWidget(var1_hash); // L: 8925
												if (var16 != null && var16.itemQuantities[var0_slot] >= 100000) { // L: 8926
													WorldMapEvent.addGameMessage(27, "", var16.itemQuantities[var0_slot] + " x " + FileSystem.ItemDefinition_get(var3_item_npc_index).name);
												} else {
													var9 = WallDecoration.getPacketBufferNode(ClientPacket.OPOBJ6, Client.packetWriter.isaacCipher); // L: 8929
													var9.packetBuffer.writeShort(var3_item_npc_index); // L: 8930
													Client.packetWriter.addNode(var9); // L: 8931
												}

												Client.field598 = 0; // L: 8933
												NPCComposition.field1991 = class92.getWidget(var1_hash); // L: 8934
												Client.field599 = var0_slot; // L: 8935
												break label655;
											}

											if (var2 != 1007) {
												if (var2 == 1009 || var2 == 1011 || var2 == 1008 || var2 == 1010 || var2 == 1012) {
													ServerPacket.worldMap.worldMapMenuAction(var2, var3_item_npc_index, new Coord(var0_slot), new Coord(var1_hash)); // L: 9232
												}
												break label655;
											}
										}

										var16 = ApproximateRouteStrategy.getWidgetChild(var1_hash, var0_slot); // L: 9629
										if (var16 != null) { // L: 9630
											TaskHandler.widgetDefaultMenuAction(var3_item_npc_index, var1_hash, var0_slot, var16.item, var5); // L: 9631
										}
									}
								}
							}
						}
					}
				}
			}
		}

		if (Client.isItemSelected != 0) { // L: 9718
			Client.isItemSelected = 0; // L: 9719
			GrandExchangeOfferTotalQuantityComparator.invalidateWidget(class92.getWidget(class20.component)); // L: 9720
		}

		if (Client.isSpellSelected) { // L: 9722
			MusicPatchNode2.Widget_runOnTargetLeave();
		}

		if (NPCComposition.field1991 != null && Client.field598 == 0) { // L: 9723
			GrandExchangeOfferTotalQuantityComparator.invalidateWidget(NPCComposition.field1991);
		}

	} // L: 9724
}
