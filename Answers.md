# COMP 271 002 F17 Lab 5 (Week 7)

# Question 1
The linkedStack does not require an explicit constructor becasue it is an implementation 
of the ABT IStack.

# Question 2
where n is the number of items in the stack at most
Push: O(4) extra space: temp Node
Peek: O(2) extra space:none
Pop:  O(3) extra space: popped element
isEmpty: O(2) extra space:none
asList: O(n) extra space: the new list
reversLines: O(n) extraspace: the list ontop of the stack as well as the temp line

# Question 3
we could have done it with a linkedlist directly. The asList would simply return
the list itself and the other methods would act on the first element itself and 
add would add elements at only the first index

# Question 4
if push and pop returned the stack this would violate information hiding.
it would make more sense for push because we have access to the same amount of 
information however for pop it would make little sense as the programmer would have to 
use peek in congunction with pop to get the same effect.
This would help out in situations where our goal is to work on the stack itself because 
we wouldnt have to reconstruct the stack into some individual list or other data structure
because pop or push would give us the stack itself