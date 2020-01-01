package instructions.meta;

import instructions.Instruction;
import machine.Program;
import machine.State;

public class AnchorInstruction implements Instruction {

  private String name;

  public AnchorInstruction(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public void apply(State currentState, Program program) {
    currentState.incrementProgramIndex();
  }

}
