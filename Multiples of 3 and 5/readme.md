# Problem
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.

# Answer
That's easy. Yep, I know. But the matter is we'll do it by mathematics.

Let's go
### We need to find all of number that are multiples of 3 or 5 and less than 1000.
  - The numbers that are multiples of 3 less than 1000 is 3, 6, 9, 12, 15,..., 999. And sum of them is: S3 = 3 + 6 + 9 +...+ 999
  - The numbers that are multiples of 5 less than 1000 is 5, 10, 15, 20, ....995. And sum of them is: S5 = 5 + 10 + 15 + 20 +...+ 995
  - As you see, we counted 15, 30, 45,.., 990  two times because they're muliples of 3 and 5. So, sum of them is: S15 = 15 + 30 + 45 + ...+ 990
  - Sum = S3 + S5 - S15
  
### How to calculate S. 
  - Let imagine, we have an Arithmetic Sequence that was separated by k unit. Like that: A1, A2, A3, A4, A5, ... , An
  
  ```
  // A2 = A1 + k, A3 = A2 + k, A4 = A3 +k , ... ? How many numbers in this list
  An = An-1 + k
     = (An-2 + k) + k = An-2 + 2*k
     = (( An-3 + k) + k) + k = An-3 + 3*k
     ...
     ...
     = A3 + (m-3)*k
     = A2 + (m-2)*k
     = A1 + (m-1)*k
     
     => m = ((An - A1) / k) + 1
     
  // Sum of them ?
  S =  A1 + A2 + ...+ An-1 + An
  and
  S =  An + An-1 + ......+ A2 + A1
  => 2*S = (A1 + An) + (A2 + An-1) + ...+ (An-1 + 2) + (An + 1) = (A1 + An) * m = ( A1+ An ) *  (((An - A1) / k) + 1)
  S = (( A1+ An ) *  (((An - A1) / k) + 1)) / 2
  ```
  
  ### How to calculate S3, S5, S15. 
  
  Now we can calculate:
  
  S3 = (999+3)* ((999-3)/3 +1 )/2 = 166,833
  
  S5 =  (995+5) * ( (995-5)/5+1)/2 = 99,500
  
  S15 = ( 990 +15) * ((990 - 15)/15 +1) /2 = 33,165
  
  S = S3+S5-S15 = 233,168 
  
  Cheers !!!
  
  
