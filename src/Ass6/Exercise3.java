package Ass6;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

import static java.lang.System.exit;

class  Exercise3 {
    public static void main(String[] args){
        MyStack myStack =new MyStack();
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("\n============================\n  Stack Operations Menu\n============================");
            System.out.println("1. Add items\n2. Delete items\n3. Show the number of items\n4. Show min and max items\n5. Find an item\n6. Print all items\n7. Exit");
            System.out.print("Enter your choice: ");

            int type_of_op = scanner.nextInt();
            switch(type_of_op)
            {
                case 1:
                    System.out.print("Enter your element which you want to push: ");
                    myStack.push(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Element  you want to pop is "+ myStack.pop());
                    break;
                case 3:
                    System.out.print("The number of items: ");
                    myStack.getSize();
                    break;
                case 4:
                    System.out.println("Min of stack is "+ myStack.getMin());
                    System.out.println("Max of stack is "+ myStack.getMax());
                    break;

                case 5:
                    System.out.print("Enter the element which you are looking for: ");
                    int item =scanner.nextInt();
                    myStack.find(item);
                    break;
                case 6:  
                    System.out.print("stack element is: ");
                    myStack.print();
                    break;
                case 7: 
                    System.out.println("Exit stack.");
                    exit(0);
                    break;
                default: 
                    System.out.println("You have entered the wrong choice");
            }
        }
    }
}
class MyStack {
    int min = -1; 
    int max = -1;
    int maxBefore;
    Stack<Integer> stack = new Stack<>();
    int getMin() { return min; }
    int getMax() { return max; }
    void push(int val){
        if (stack.isEmpty() || val < min) {
            min = val;
        }
        if (stack.isEmpty() || val > max) {
            maxBefore = max;
            max = val;
        }
        stack.push(val);
    }

    int pop(){
        if (stack.isEmpty() ) {
            System.out.println("stack underflow");
            return -1;
        }
        int val = stack.pop();
        if (!stack.isEmpty())
            min = stack.peek() ;
        else
            min = -1;
        if (!stack.isEmpty())
            max = maxBefore;
        else
            max = 0;
        return val; 
    }
    void print(){
        if (stack.isEmpty() ) {
            System.out.println("stack underflow");
        }
        else {
            String values = Arrays.toString(stack.toArray());
            System.out.println(values);
        }
    }
    void getSize() {
        System.out.print(stack.size());
    }
    void find(int item){
        if (stack.isEmpty() ) {
            System.out.println("stack underflow");
        }
        else {
            System.out.println("index of item: " + stack.search(item));
        }
    }
}
