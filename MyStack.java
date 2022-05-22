/*  Yadiel Mercado Rivera 
    801-19-5597 
    High Level Languages - CCOM4029-0U1
    Prof. Ordonez 



Name: MyStack.java
Desc: A simple Stack ADT implementation in a generic way
Therefore, it should accept any type of data and work it as a Stack normally should.

*/

import java.util.*;

public class MyStack<Type>{
   ArrayList<Type> Array;
   int top;
    

    //push is a void function whose sole purpose is to push its given item into the stack.
   void push(Type item){   
        Array.add(item); 
        top++;
    }

    //pop is a void function whose sole purpose is to pop the element at the top of the stack and update it.
   void pop(){
    if(isEmpty()){
        System.exit(-1);
       }
    Array.remove(top--);
   }

    //top is a public function who yells out who is at the top of the stack.
   public Type top(){
    if(top < 0){
        System.out.println("Empty Stack");
        }

    return Array.get(top);
    }
 
    //isEmpty is a boolean function who lets the user know whether or not the stack is empty.
   boolean isEmpty(){
    return -1 == top;
}
    //Constructa man
   MyStack(){
    this.Array = new ArrayList<Type>();
    this.top = -1; 
    }


}
