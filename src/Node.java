public class Node<T> {
	public T element;
	public Node<T> left;
	public Node<T> right;

	public Node() {}

	public Node(T element) {
		this.element = element;
	}
}
