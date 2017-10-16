package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {

  public static void main(final String[] args) {
    // DONE read successive input lines until EOF, then print out in reverse order


    IStack<String> stack = new LinkedStack<>();
    
    final Scanner input = new Scanner(System.in);
    while (input.hasNextLine()) {
      final String line = input.nextLine();
      if (line.equals("EOF")) break;
      stack.push(line);
    }

    while(!stack.isEmpty()){
      System.out.println(stack.pop());
    }
    

  }
}
