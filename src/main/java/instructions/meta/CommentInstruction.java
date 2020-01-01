package instructions.meta;

import instructions.Instruction;
import machine.Program;
import machine.State;

public class CommentInstruction implements Instruction {

  @Override
  public void apply(State currentState, Program program) {
    currentState.incrementProgramIndex();
  }

}
