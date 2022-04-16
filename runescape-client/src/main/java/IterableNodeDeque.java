import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
@Implements("IterableNodeDeque")
public class IterableNodeDeque implements Iterable, Collection {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	@Export("sentinel")
	Node sentinel;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	Node field3816;

	public IterableNodeDeque() {
		this.sentinel = new Node(); // L: 7
		this.sentinel.previous = this.sentinel; // L: 11
		this.sentinel.next = this.sentinel; // L: 12
	} // L: 13

	@ObfuscatedName("i")
	@Export("rsClear")
	public void rsClear() {
		while (this.sentinel.previous != this.sentinel) { // L: 16
			this.sentinel.previous.remove(); // L: 17
		}

	} // L: 19

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lns;)V"
	)
	@Export("addFirst")
	public void addFirst(Node var1) {
		if (var1.next != null) { // L: 22
			var1.remove();
		}

		var1.next = this.sentinel.next; // L: 23
		var1.previous = this.sentinel; // L: 24
		var1.next.previous = var1; // L: 25
		var1.previous.next = var1; // L: 26
	} // L: 27

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lns;)V"
	)
	@Export("addLast")
	public void addLast(Node var1) {
		if (var1.next != null) { // L: 30
			var1.remove();
		}

		var1.next = this.sentinel; // L: 31
		var1.previous = this.sentinel.previous; // L: 32
		var1.next.previous = var1; // L: 33
		var1.previous.next = var1; // L: 34
	} // L: 35

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "()Lns;"
	)
	@Export("last")
	public Node last() {
		return this.method5608((Node)null); // L: 46
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lns;)Lns;"
	)
	Node method5608(Node var1) {
		Node var2;
		if (var1 == null) { // L: 51
			var2 = this.sentinel.previous;
		} else {
			var2 = var1; // L: 52
		}

		if (var2 == this.sentinel) { // L: 53
			this.field3816 = null; // L: 54
			return null; // L: 55
		} else {
			this.field3816 = var2.previous; // L: 57
			return var2; // L: 58
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "()Lns;"
	)
	@Export("previous")
	public Node previous() {
		Node var1 = this.field3816; // L: 62
		if (var1 == this.sentinel) { // L: 63
			this.field3816 = null; // L: 64
			return null; // L: 65
		} else {
			this.field3816 = var1.previous; // L: 67
			return var1; // L: 68
		}
	}

	@ObfuscatedName("p")
	int method5610() {
		int var1 = 0; // L: 72

		for (Node var2 = this.sentinel.previous; var2 != this.sentinel; var2 = var2.previous) { // L: 73 74 76
			++var1; // L: 75
		}

		return var1; // L: 78
	}

	@ObfuscatedName("j")
	public boolean method5633() {
		return this.sentinel.previous == this.sentinel; // L: 82
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "()[Lns;"
	)
	Node[] method5612() {
		Node[] var1 = new Node[this.method5610()]; // L: 86
		int var2 = 0; // L: 87

		for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) { // L: 88 89 91
			var1[var2++] = var3; // L: 90
		}

		return var1; // L: 93
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lns;)Z"
	)
	boolean method5615(Node var1) {
		this.addFirst(var1); // L: 127
		return true; // L: 128
	}

	public boolean isEmpty() {
		return this.method5633(); // L: 105
	}

	public boolean contains(Object var1) {
		throw new RuntimeException(); // L: 109
	}

	public Object[] toArray() {
		return this.method5612(); // L: 113
	}

	public Object[] toArray(Object[] var1) {
		int var2 = 0; // L: 117

		for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) { // L: 118 119 121
			var1[var2++] = var3; // L: 120
		}

		return var1; // L: 123
	}

	public boolean addAll(Collection var1) {
		throw new RuntimeException(); // L: 140
	}

	public boolean removeAll(Collection var1) {
		throw new RuntimeException(); // L: 144
	}

	public boolean add(Object var1) {
		return this.method5615((Node)var1); // L: 156
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 160
	}

	public int hashCode() {
		return super.hashCode(); // L: 164
	}

	public boolean remove(Object var1) {
		throw new RuntimeException(); // L: 132
	}

	public int size() {
		return this.method5610(); // L: 101
	}

	public boolean containsAll(Collection var1) {
		throw new RuntimeException(); // L: 136
	}

	public Iterator iterator() {
		return new IterableNodeDequeDescendingIterator(this); // L: 97
	}

	public boolean retainAll(Collection var1) {
		throw new RuntimeException(); // L: 148
	}

	public void clear() {
		this.rsClear(); // L: 152
	} // L: 153

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lns;Lns;)V"
	)
	@Export("IterableNodeDeque_addBefore")
	public static void IterableNodeDeque_addBefore(Node var0, Node var1) {
		if (var0.next != null) { // L: 38
			var0.remove();
		}

		var0.next = var1; // L: 39
		var0.previous = var1.previous; // L: 40
		var0.next.previous = var0; // L: 41
		var0.previous.next = var0; // L: 42
	} // L: 43
}
