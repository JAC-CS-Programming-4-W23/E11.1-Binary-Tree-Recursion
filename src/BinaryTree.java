public class BinaryTree<T> {

	public Node<T> root;

	public BinaryTree() {
		this.root = null;
	}

	public int size(Node<T> root) {
		if (root == null) {
			return 0;
		}

//		int count = 1;
//
//		count += size(root.left);
//		count += size(root.right);
//
//		return count;

		return size(root.left) + size(root.right) + 1;
	}

	public int leafCount(Node<T> root) {
		if (root == null) {
			return 0;
		}

		if (root.left == null && root.right == null) {
			return 1;
		}

		return leafCount(root.left) + leafCount(root.right);
	}

	public int height(Node<T> root) {
		if (root == null) {
			return 0;
		}

//		int h1 = height(root.left);
//		int h2 = height(root.right);
//
//		if (h1 > h2) {
//			return h1 + 1;
//		}
//		else {
//			return h2 + 1;
//		}

		return Math.max(height(root.left), height(root.right)) + 1;
	}

}
