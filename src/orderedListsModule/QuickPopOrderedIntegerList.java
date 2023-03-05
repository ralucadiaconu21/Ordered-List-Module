package orderedListsModule;

public class QuickPopOrderedIntegerList extends QuickPopOrderedList<Integer> {
	
	/*
     * Method that returns true if newElem and oldElem meet the sorting logic (desc)
     */
	@Override
	public Boolean compare(Integer newElem, Integer oldElem) {
		return newElem >= oldElem;
	}

}
