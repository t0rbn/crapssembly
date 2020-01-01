package instructions.io;

import instructions.Instruction;
import machine.Program;
import machine.State;

public class PrintVarInstruction implements Instruction {

  private String varName;

  public PrintVarInstruction(String varName) {
    this.varName = varName;
  }

  @Override
  public void apply(State currentState, Program program) {
    System.out.println(currentState.getVar(this.varName));
    currentState.incrementProgramIndex();
  }
}
