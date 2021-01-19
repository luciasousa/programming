package p2utils;

/** This class implements a "dynamic" array of elements of generic type.
 * The capacity of a dynamic array grows automatically, as needed.
 * It implements a random access abstract data type, with two main methods:
 * set and get.
 */
public class DynamicArray<E> {

  private E[] array;
  private int maxidx = -1;  // maximum index ever set
  private int dim = 0;
  private static final int BLOCK = 256;
  private E v;
  
  // Define the constructor to initialize the fields
  public DynamicArray(){
	  
	  array = (E[]) new Object[dim];
  }
  
  /** Returns the length of the array.
   * The "length" is defined as 1 plus the maximum index that was set.
   * @return Number of elements in the array
   */
  public int length() { return 1+maxidx; }

  /** Set the element in position idx to given value.
   */
  public void set(int idx, E value) {
    assert idx >= 0;
    
    checkgrow(idx);
    
	array[idx] = value;
	
  }
  
  public void checkgrow(int idx){
	  
	  if(idx < array.length){
		  
		  dim = BLOCK;
	  }
	  
	  else{
		  
		  int newlen = ((BLOCK + idx)/BLOCK)*BLOCK;
		  
		  E[] array2 = (E[]) new Object[newlen];

		  System.arraycopy(array, 0, array2, 0, dim);
	  }
  }
  
  /** Return the element in a given position in the list.
   * @param idx  the index of the element (0 is the first).
   * @return value at position idx of the array, or null, if not set yet.
   */
  public E get(int idx) {
    assert idx >= 0;
    
    if(v == array[idx]){
		v = array[idx];
	}
	
	if(array[idx] == null){
		v = null;
	}
	return v;
  }

  // Define the second get method
  public E get(int idx, E b) {
    assert idx >= 0;

    if(v == array[idx]){
		return v;
	}
	
	if(array[idx] == null){
		return b;
	}
	return b;
  }

}
