package orderedListsModule;

public abstract class QuickPopOrderedList<T> extends OptimizedLinkedList<T> {
		
	public QuickPopOrderedList() {
    	this.length = 0;
        this.head = null;
    }
	
	
    /*
     * Method used to insert a new element (node) to the Ordered List based on the ordering logic
     */
    @Override
	public void push(T elem) {
    	
    	LinkedListNode<T> newNode = new LinkedListNode<T>(elem);
    	
    	// Check if the list is empty. If yes, then the new node is the head
    	if(this.head == null) {
    		this.head = newNode;
    		
    	} else if(compare(elem, this.head.value)) {
    			// In this case, the new element should be added as the first one in the list
                newNode.next = this.head;
                this.head.prev = newNode;
                this.head = newNode;   
    		}
    		
    		else {
	    		LinkedListNode<T> currentNode = this.head;
	    		
	    		// Find the node after which the new element should be to added
	    		while(currentNode.next != null && !compare(elem, currentNode.next.value) ) {
	    			currentNode = currentNode.next;
	    		}
	    		
	    		// Add the element
	            newNode.next = currentNode.next;
	            newNode.prev = currentNode;
	            
	            // If the element is added to the tail of the list, there is no need to fix the next.prev link, as there is no next
	            if(currentNode.next != null) {
	                currentNode.next.prev = newNode;
	            }
	            currentNode.next = newNode;
    		}
    	
    		this.length += 1;
    	
    	/* Displaying the list to debug
    	LinkedListNode<T>  currentNode = this.head;
    	while(currentNode != null) {
    		System.out.print(currentNode.value + " ");
    		currentNode = currentNode.next;
    	}
		System.out.println();*/
	}
	
    
    /*
     * Method used to optimally remove an element (node) from the Ordered List 
     */
    @Override
	public void  pop() {
    	
    	if(this.length == 0) {
        	System.out.println("The Quick POP List is empty, there is nothing to remove! :(");
        	return;
    	}
    	
    	//Displaying the value we are going to remove
    	System.out.println("Removing the following value from Pop optimized -> " + this.head.value);
    	
    	// If there is only one element, it is the head and it should be made null
    	if(this.length == 1) {
    		this.head = null;		
    	} else {
    		this.head = this.head.next;
    		this.head.prev = null;
    	}
    	
    	this.length -= 1;
	}
    
	
    /*
     * Method that returns true if newElem and oldElem meet the sorting logic
     */
	protected abstract Boolean compare(T newElem, T oldElem);

}
