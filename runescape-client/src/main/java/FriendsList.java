import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
@Implements("FriendsList")
public class FriendsList extends UserList {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1344623889
	)
	int field3929;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("friendLoginUpdates")
	public LinkDeque friendLoginUpdates;

	@ObfuscatedSignature(
		descriptor = "(Lni;)V"
	)
	public FriendsList(LoginType var1) {
		super(400); // L: 18
		this.field3929 = 1; // L: 14
		this.friendLoginUpdates = new LinkDeque(); // L: 15
		this.loginType = var1; // L: 19
	} // L: 20

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Lla;",
		garbageValue = "-450730044"
	)
	@Export("newInstance")
	User newInstance() {
		return new Friend(); // L: 23
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lla;",
		garbageValue = "91"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Friend[var1]; // L: 27
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpb;ZI)Z",
		garbageValue = "-294857324"
	)
	@Export("isFriended")
	public boolean isFriended(Username var1, boolean var2) {
		Friend var3 = (Friend)this.getByUsername(var1); // L: 31
		if (var3 == null) {
			return false; // L: 32
		} else {
			return !var2 || var3.world != 0; // L: 33
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lop;II)V",
		garbageValue = "563373210"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (true) {
			if (var1.offset < var2) { // L: 38
				boolean var3 = var1.readUnsignedByte() == 1; // L: 39
				Username var4 = new Username(var1.readString(), this.loginType); // L: 40
				Username var5 = new Username(var1.readString(), this.loginType); // L: 41
				int var6 = var1.readUnsignedShort(); // L: 42
				int var7 = var1.readUnsignedByte(); // L: 43
				int var8 = var1.readUnsignedByte(); // L: 44
				boolean var9 = (var8 & 2) != 0; // L: 45
				boolean var10 = (var8 & 1) != 0; // L: 46
				if (var6 > 0) { // L: 47
					var1.readString(); // L: 48
					var1.readUnsignedByte(); // L: 49
					var1.readInt(); // L: 50
				}

				var1.readString(); // L: 52
				if (var4 != null && var4.hasCleanName()) { // L: 53
					Friend var11 = (Friend)this.getByCurrentUsername(var4); // L: 54
					if (var3) { // L: 55
						Friend var12 = (Friend)this.getByCurrentUsername(var5); // L: 56
						if (var12 != null && var12 != var11) { // L: 57
							if (var11 != null) { // L: 58
								this.remove(var12); // L: 59
							} else {
								var11 = var12; // L: 62
							}
						}
					}

					if (var11 != null) { // L: 66
						this.changeName(var11, var4, var5); // L: 67
						if (var6 != var11.world) { // L: 68
							boolean var14 = true; // L: 69

							for (FriendLoginUpdate var13 = (FriendLoginUpdate)this.friendLoginUpdates.last(); var13 != null; var13 = (FriendLoginUpdate)this.friendLoginUpdates.previous()) { // L: 70
								if (var13.username.equals(var4)) { // L: 71
									if (var6 != 0 && var13.world == 0) { // L: 72
										var13.remove(); // L: 73
										var14 = false; // L: 74
									} else if (var6 == 0 && var13.world != 0) { // L: 76
										var13.remove(); // L: 77
										var14 = false; // L: 78
									}
								}
							}

							if (var14) { // L: 82
								this.friendLoginUpdates.addFirst(new FriendLoginUpdate(var4, var6));
							}
						}
					} else {
						if (this.getSize() >= 400) { // L: 85
							continue;
						}

						var11 = (Friend)this.addLast(var4, var5); // L: 86
					}

					if (var6 != var11.world) { // L: 89
						var11.int2 = ++this.field3929 - 1; // L: 90
						if (var11.world == -1 && var6 == 0) { // L: 91
							var11.int2 = -(var11.int2 * -939883657) * -641382841;
						}

						var11.world = var6; // L: 92
					}

					var11.rank = var7; // L: 94
					var11.field3942 = var9; // L: 95
					var11.field3941 = var10; // L: 96
					continue; // L: 97
				}

				throw new IllegalStateException();
			}

			this.sort(); // L: 98
			return; // L: 99
		}
	}
}
