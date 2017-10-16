package edu.luc.cs271.linkedstack;

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;
  
  // DONE why don't we need an explicit constructor?

  @Override
  public E push(final E obj) {
    // DONE
    if(top == null){
      top = new Node<E>(obj);
    }
    else{
      Node<E> temp = new Node(top.data, top.next);
      top = new Node(obj);
      top.next = new Node(temp.data, temp.next);
    }
    return obj;
  }

  @Override
  public E peek() {
    // DONE
    if(top != null){
      if(top.data != null){
      return top.data;
      }
    }
    
    else throw new NoSuchElementException();
    return null;
  }

  @Override
  public E pop() {
    // DONE
    if(top == null) throw new NoSuchElementException();
    if(top.data == null) throw new NoSuchElementException();
    E popped = top.data;
    top = top.next;
    return popped;
  }

  @Override
  public boolean isEmpty() {
    // DONE
    if(top == null) return true;
    if(top.data == null) return true;
    else return false;
  }

  @Override
  public List<E> asList() {
    // DONE implement using an ArrayList preallocated with the right size
    // DONE add any instance variable(s) required to support this
    ArrayList<E> list = new ArrayList<E>();
    while(!this.isEmpty()){
      list.add(this.pop());
    }
    return list;
  }
}
