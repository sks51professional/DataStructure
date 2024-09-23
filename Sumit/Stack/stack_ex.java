// Stack implementation in Java
// this is a new program

class Stack {

  // store elements of stack
  private int arr[];
  // represent top of stack
  private int top;
  // total capacity of the stack
  private int max_size;

  // Creating a stack
  Stack(int size) {
    // initialize the array
    // initialize the stack variables
    arr = new int[size];
    max_size = size;
    top = -1;
  }

  // push elements to the top of stack
  public void push(int x) {
    if (isFull()) {
      System.out.println("Stack OverFlow"); 
    }
    else
    {
        // insert element on top of stack
        System.out.println("Inserting " + x);
        //arr[++top] = x; 
        top = top + 1;
        arr[top] = x;
    }
  }

  // pop elements from top of stack
  public void pop() {
    // if stack is empty
    // no element to pop
    if (isEmpty()) {
      System.out.println("STACK EMPTY");
    }
    else{
        System.out.println("The item popped is " + arr[top]);
        arr[top] = 0;
        top--;
    }
  }

  // return size of the stack
  public int getSize() {
    return top + 1;
  }

  // check if the stack is empty
  public Boolean isEmpty() {
    //return top == -1;
    if(top == -1)
        return true;
    else
        return false;
  }

  // check if the stack is full
  public Boolean isFull() {
    if(top+1 == max_size)
        return true;
    else 
        return false;    
  }

  // display elements of stack
  public void printStack() {
    for (int i = 0; i <= top; i++) {
      System.out.print(arr[i] + ", ");
    }
  }

  public static void main(String[] args) {
    Stack stack = new Stack(3);

    stack.push(1);
    stack.push(2);
    stack.push(3);

    System.out.print("Stack: ");
    stack.printStack();

    // remove element from stack
    stack.pop();
    System.out.println("\nAfter popping out");
    stack.printStack();

  }
}
