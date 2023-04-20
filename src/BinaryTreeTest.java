import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {

	static BinaryTree<Integer> tree1;
	static BinaryTree<Integer> tree2;
	static BinaryTree<Integer> tree3;
	static BinaryTree<Integer> tree4;

	@BeforeAll
	public static void setUp() {
		// Tree 1 - Empty Tree

		tree1 = new BinaryTree<>();

		// Tree 2 - Small Tree

		tree2 = new BinaryTree<>();

		tree2.root = new Node<>(1);
		tree2.root.left = new Node<>(10);
		tree2.root.right = new Node<>(5);

		// Tree 3 - Medium Tree

		tree3 = new BinaryTree<>();

		tree3.root = new Node<>(1);
		tree3.root.left = new Node<>(10);
		tree3.root.right = new Node<>(5);

		tree3.root.left.left = new Node<>(17);

		tree3.root.right.left = new Node<>(7);
		tree3.root.right.right = new Node<>(9);

		// Tree 4 - Big Tree

		tree4 = new BinaryTree<>();

		tree4.root = new Node<>(1);
		tree4.root.left = new Node<>(10);
		tree4.root.right = new Node<>(5);

		tree4.root.left.left = new Node<>(17);

		tree4.root.right.left = new Node<>(7);
		tree4.root.right.right = new Node<>(9);

		tree4.root.right.left.right = new Node<>(15);

		tree4.root.right.right.left = new Node<>(20);
		tree4.root.right.right.right = new Node<>(25);
	}

	@Test
	public void testSize() {
		assertEquals(0, tree1.size(tree1.root));
		assertEquals(3, tree2.size(tree2.root));
		assertEquals(6, tree3.size(tree3.root));
		assertEquals(9, tree4.size(tree4.root));
	}

	@Test
	public void testLeafCount() {
		assertEquals(0, tree1.leafCount(tree1.root));
		assertEquals(2, tree2.leafCount(tree2.root));
		assertEquals(3, tree3.leafCount(tree3.root));
		assertEquals(4, tree4.leafCount(tree4.root));
	}

	@Test
	public void testHeight() {
		assertEquals(0, tree1.height(tree1.root));
		assertEquals(2, tree2.height(tree2.root));
		assertEquals(3, tree3.height(tree3.root));
		assertEquals(4, tree4.height(tree4.root));
	}

}
