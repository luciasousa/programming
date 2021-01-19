import pt.ua.p2utils.*;

public class Dock {

  private final Stack<Container> containerStack;
  private final Queue<Container> accessExtension;
  private final int maxStack; // maximum number of containers in a stack

  public Dock(int maxStack) {
    accessExtension = new Queue<>();
    containerStack = new Stack<>();
    this.maxStack = maxStack; // controla-se o size fora da pilha
  }

  public boolean stackEmpty() {
    return containerStack.isEmpty();
  }

  public boolean stackFull() {
    return containerStack.size()==maxStack;
  }

  public boolean accessExtensionEmpty() {
    return accessExtension.isEmpty();
  }

  public int count() {
    return containerStack.size()+accessExtension.size();
  }

  public String toString() {
    return "In stack:" + containerStack.toString() + 
      " / In access: " + accessExtension.toString();
  }

  // a new container arrives and must be added to the queue
  public void enterContainer(Container c) {
	assert !accessExtensionEmpty() && c!=null;
    accessExtension.in(c);
  }

  // top container in stack is removed (it will be shipped)
  public Container shipContainer() {
    Container topo = containerStack.top();
    containerStack.pop();
    return topo;
  }

  // Moves containers from the accessExtension to the dock stack
  //fila para pilha
  public void moveFromAccessToStack() {
    while(!accessExtensionEmpty() && !stackFull()) {
		containerStack.push(accessExtension.peek());
		accessExtension.out();
	}
	assert containerStack.size() <= maxStack;
  }

  // pick the first container from the queue
  // and insert it in the stack in such way the stack
  // is sorted by distance to destination
  // (largest distance at the top)
  public void insertFirstInStack() {
    assert !stackFull() && !accessExtensionEmpty();
    
    Stack<Container> aux = new Stack<Container>();
    //Peeks the queue and removes the next element
	Container containerInQueue = accessExtension.peek();
	accessExtension.out();
	//Will keep removing elements until the distance is smaller
	Container containerInStack = null;
	
	while(!stackEmpty() && containerInQueue.distance <= containerInStack.distance){
		containerInStack = containerStack.top();
		aux.push(containerInStack);
		containerStack.pop();
	}
	containerStack.push(containerInQueue);
	while(!aux.isEmpty()){
		containerStack.push(aux.top());
		aux.pop();
	}
	
  }
}

