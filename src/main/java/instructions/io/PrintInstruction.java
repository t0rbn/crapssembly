package instructions.io;

import instructions.Instruction;
import machine.Program;
import machine.State;

public class PrintInstruction implements Instruction {

  private String printString;

  public PrintInstruction(String printString) {
    this.printString = printString;
  }

  @Override
  public void apply(State currentState, Program program) {
    System.out.println(this.printString);
    currentState.incrementProgramIndex();
  }

}
