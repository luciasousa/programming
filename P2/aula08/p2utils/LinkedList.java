package p2utils;

public class LinkedList<E extends Comparable<E>> {

  private Node<E> first = null;
  private Node<E> last = null;
  private int size = 0;

  /**
   * {@code LinkedList} constructor, empty so far.
   */
  public LinkedList() { }

  /** Returns the number of elements in the list.
   * @return Number of elements in the list
   */
  public int size() { return size; }

  /** Checks if the list is empty.
   * @return  {@code true} if list empty, otherwise {@code false}.
   */
  public boolean isEmpty() { return size == 0; }

  /** Returns the first element in the list.
   * @return  First element in the list
   */
  public E first() {
    assert !isEmpty(): "empty!";

    return first.elem;
  }

  /** Returns the last element in the list.
   * @return Last element in the list
   */
  public E last() {
    assert !isEmpty(): "empty!";

    return last.elem;
  }

  /** Adds the given element to the start of the list.
   * @param e the element to add
   */
  public void addFirst(E e) {
    first = new Node<>(e, first);
    if (isEmpty())
      last = first;
    size++;

    assert !isEmpty(): "empty!";
    assert first().equals(e) : "wrong element";
  }

  /** Adds the given element to the end of the list.
   * @param e the element to add
   */
  public void addLast(E e) {
    Node<E> newest = new Node<>(e);
    if (isEmpty())
      first = newest;
    else
      last.next = newest;
    last = newest;
    size++;

    assert !isEmpty(): "empty!";
    assert last().equals(e) : "wrong element";
  }

  /** Removes the first element in the list.
   */
  public void removeFirst() {
    assert !isEmpty(): "empty!";
    first = first.next;
    size--;
    if (isEmpty())
      last = null;
  }

  /** Removes all elements.
   */
  public void clear() {
    first = last = null;
    size = 0;
  }

  /** Checks if the given element exists in the list.
   * @param e an element
   * @return {@code true} if the element exists and {@code false} otherwise
   */
  public boolean contains(E e) { 
    return contains(first,e); 
  }
  private boolean contains(Node<E> n,E e) {
    if (n == null) return false;
    if (n.elem==null) return e==null; //dispensável, se impedirmos elem==null
    if (n.elem.equals(e)) return true; 
    return contains(n.next,e);
  }
  
  public int compareTo(E n){
	  
	  if(first < n){
		  
		  return -1;
	  }
	  else if(first > n){
		  
		  return 1;
	  }
	  else{
		  
		  return 0;
	  }
  }
  
    public boolean isSorted() { 
    if (size < 2)
      return true;
    return isSorted(first,first.next); 
  }
  private boolean isSorted(Node<E> prev,Node<E> n) {
    if (n == null) return true;
    if (n.elem < prev.elem) return false;
    return isSorted(n,n.next);
  }
  
  public boolean contains(E e){
	  boolean b = false;
	  
	  if(e == first.next){
		b = true;  
	  }
	  
	  else{
		  b = false;
	  }
	  
	  return b;
  }
  
  public String toString(){
	  String s = "";
	  LinkedList<E> lst  = new LinkedList<E>();
	  
	  do{
		  s = first;
		  removeFirst();
	  }while(lst != null);
		
	  return s;
  }
  
  public LinkedList<E> merge(LinkedList<E> lst2){

	  LinkedList<E> lst = new LinkedList<E>();
	  LinkedList<E> lst1 = new LinkedList<E>();
	  lst2 = new LinkedList<E>();
	  if(lst2 == null){
		  lst = lst1;
	  }
	  else if(lst1 == null){
		  lst = lst2;
	  }
	  else{
		  lst = lst1.merge(lst2);
	  }
	  return lst;
  }

}
