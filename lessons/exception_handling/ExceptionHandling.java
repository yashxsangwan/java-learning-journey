package lessons.exception_handling;

class StackOverFlowException extends Exception {
    @Override
    public String toString() {
        return "Stack is full!";
    }
}

class StackUnderFlowException extends Exception {
    @Override
    public String toString() {
        return "Stack is empty!";
    }
}

class Stack {
    int[] stack;
    public Stack(int size) {
        stack = new int[size];
    }
    int top = 0;
    
    public void _push(int a) throws StackOverFlowException {
        if(top >= stack.length) {
            throw new StackOverFlowException();
        } 
        stack[top] = a;
        top++;
    }

    public void _pop() throws StackUnderFlowException {
        if(top <= 0) {
            throw new StackUnderFlowException();
        }
        top--;  
    }

    public void push(int a) {
        try {
            _push(a);
        }
        catch(StackOverFlowException e) {
            System.out.println(e);
        }
    }
    public void pop() {
        try {
            _pop();
        }
        catch(StackUnderFlowException e) {
            System.out.println(e);
        }
    }
}


public class ExceptionHandling {
    public static void main(String[] args) {
        Stack obj = new Stack(5);
        
        for(int i = 1; i < 6; i++) {
            obj.push(5*i);
        }

        obj.push(99);

        for(int i = 0; i < 5; i++) {
            obj.pop();
        }

        obj.pop();

    }

}

