package instructions.io;

import instructions.Instruction;
import instructions.InstructionUtils;
import machine.Program;
import machine.ProgramException;
import machine.State;

public class SetInstruction implements Instruction {

  private String name;
  private String value;

  public SetInstruction(String varname, String value) {
    this.name = varname;
    this.value = value;
  }

  @Override
  public void apply(State currentState, Program program) {
    try {
      Double.parseDouble(this.name);
      throw new ProgramException("variable name must not be a number");
    } catch (NumberFormatException e) {
      // this is intended
    }

    currentState.setVar(this.name, InstructionUtils.getVarOrParseValue(value, currentState));
    currentState.incrementProgramIndex();
  }

}
