package eginkizuna2;

public interface OrderedListADT<T extends Comparable<T>>  extends ListADT<T> {
	
	public void add(T elem);
	// elementu bat gehitzen du listan (dagokion tokian)

}
