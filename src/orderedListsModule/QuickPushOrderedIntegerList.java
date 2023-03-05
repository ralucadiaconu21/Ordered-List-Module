package orderedListsModule;

public class QuickPushOrderedIntegerList extends QuickPushOrderedList<Integer> {

	/*
     * Method that returns true if newElem and oldElem meet the sorting logic (desc)
     */
	@Override
	public Boolean compare(Integer elem1, Integer elem2) {
		return elem1 >= elem2;
	}
}
