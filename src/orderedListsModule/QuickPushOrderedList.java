package orderedListsModule;

public abstract class QuickPushOrderedList<T> extends OptimizedLinkedList<T> {
	
    public QuickPushOrderedList() {
    	this.length = 0;
        this.head = null;
    }

    /*
     * Method used to optimally insert a new element (node) to the Ordered List
     */
    @Override
	public void push(T elem) {
    	
		LinkedListNode<T> newNode = new LinkedListNode<T>(elem);

        if (this.head == null) {
            this.head = newNode;
        } else {
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        }
        this.length += 1;
	}
	
	
	/*
     * Method used to remove an element (node) from the Ordered List based on the ordering logic
     */
    @Override
	public void pop() {
		
    	if(this.length == 0) {
        	System.out.println("The Quick Push List is empty, there is nothing to remove! :(");
        	return;
    	}
    	
    	LinkedListNode<T> currentNode  = this.head;
    	
    	// The node that is going to be removed
    	LinkedListNode<T> maxNode = this.head;
    	
    	while(currentNode != null) {
    		if(compare(currentNode.value, maxNode.value)) {
    			maxNode = currentNode;
    		}
    		currentNode = currentNode.next;
    	}
    	
    	System.out.println("Removing the following value from Push optimized -> " + maxNode.value);
    	
    	// If the max node is actually the head
    	if(maxNode == head) {
    		this.head = this.head.next;
    		if(this.head != null ) {
    			this.head.prev = null;
    		}
    	} else {
    		// Connect the prev and the next nodes of the MaxNode
    		maxNode.prev.next = maxNode.next;
    		if(maxNode.next != null) {
        		maxNode.next.prev = maxNode.prev;
    		}
    	}
		this.length-=1;
	}
    
    
    /*
     * Method that displays the content of the list
     */
    @Override
	public void displayList() {
		
		LinkedListNode<T> currentNode = this.head;
	    
	    while (currentNode != null) {
	        System.out.print(currentNode.value + " ");
	        currentNode = currentNode.next;
	    }
	    System.out.println();
	}
	
    
    /*
     * Method that returns true if newElem and oldElem meet the sorting logic
     */
	public abstract Boolean compare(T elem1, T elem2);

}
