package instructions.meta;

import instructions.Instruction;
import machine.Program;
import machine.State;

public class GotoInstruction implements Instruction {

  private String targetAnchorName;

  public GotoInstruction(String targetAnchorName) {
    this.targetAnchorName = targetAnchorName;
  }

  @Override
  public void apply(State currentState, Program program) {
    currentState.setProgramIndex(program.getIndexForAnchor(targetAnchorName));
  }

}
