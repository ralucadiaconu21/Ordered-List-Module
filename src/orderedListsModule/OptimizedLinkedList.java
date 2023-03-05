package orderedListsModule;

public abstract class OptimizedLinkedList<T> implements OptimizedList<T> {
	
	protected LinkedListNode<T> head;
	protected Integer length;
	
    protected class LinkedListNode<T> {
        T value;
        LinkedListNode<T> prev;
        LinkedListNode<T> next;

        LinkedListNode(T value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }
    
    /*
     * Method that displays the content of the list
     */
	protected abstract void displayList();
}
