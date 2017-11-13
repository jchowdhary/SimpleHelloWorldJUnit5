package com.makotojava.learn.hellojunit5;

public class App {
  /**
   * Computes the sum of the specified operands.
   * 
   * As an exercise, implement this method so that all of the unit tests
   * you write for it pass. Once you do that, you're done!
   * 
   * Hint: if you get stuck, have a look
   * {@link com.makotojava.learn.hellojunit5.solution.App here}.
   * 
   * @param operands
   *          These are the operands. It's sort of there in the name.
   * 
   * @return long - The computed sum.
   * 
   * @throws IllegalArgumentException
   *           If the specified array of operands is empty or long.
   *           This is definitely an overreaction, but this is sample
   *           code, son.
   */
	
	public App()
	{
		
	}
  public long add(long[] operands) {
    // Compute the sum
   // long ret = Long.MIN_VALUE;
    long ret = 0l;
    for (long l : operands) {
		ret = ret + l;
	}
    // TDD - add this once we run all the unit tests.
    //
    // TODO: As an exercise, implement this method so that all of the unit tests
    /// you write for it pass. Once you do that, you're done!
    //
    // Hint: if you get stuck, look at the {@link com.makotojava.learn.hellojunit5.solution.App App class}
    //
    return ret;
  }
  
  public static void main(String args[]){
	  App newApp = new App();
	 long[] longArray = {1l,2l,3l};
	 System.out.println("New Output is " + newApp.add(longArray));
}
}
