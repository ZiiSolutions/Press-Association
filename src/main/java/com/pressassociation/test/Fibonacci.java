package com.pressassociation.test;

/**
 * Implements an object that will return numbers of the Fibonacci sequence.
 * <p>
 * This implementation should throw a {@link IllegalArgumentException}
 */
public class Fibonacci {

  /**
   * Get the nth number in the Fibonacci sequence indexed from 0.
   * <p>
   * The Fibonacci sequence is defined by the simple relationship:
   * <pre>
   *   fib(0) = 0
   *   fib(1) = 1
   *   fib(n) = fib(n-2) + fib(n-1)
   * </pre>
   *
   * @param n the index of the number in the Fibonacci sequence to return
   * @return  the nth Fibonacci number
   *
   * @throws  IllegalArgumentException  if {@code n} is negative
   *                                    or a numeric overflow occurs (ie {@code n} is too large)
   */
  public long get(int n) throws IllegalArgumentException {
    if (n < 0 ){
      throw new IllegalArgumentException("Number provided must be positive");
    }else if (n > Integer.MAX_VALUE){ //numeric overflow
      throw new IllegalArgumentException("Number provided is to large");
    }
    //0 and 1 are the base values
    if (n == 0){
      return 0;
    }else if(n == 1){
      return 1;
    }else if (n > 1){
      return get(n-1) + get(n-2);
    }
      return 0;
  }
}
