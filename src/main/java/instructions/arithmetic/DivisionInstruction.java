package instructions.arithmetic;

import instructions.Instruction;
import instructions.InstructionUtils;
import machine.Program;
import machine.State;

public class DivisionInstruction implements Instruction {

  private String var1;
  private String var2;
  private String targetVar;

  public DivisionInstruction(String var1, String var2, String targetVar) {
    this.var1 = var1;
    this.var2 = var2;
    this.targetVar = targetVar;
  }

  @Override
  public void apply(State currentState, Program program) {
    var result = InstructionUtils.getVarOrParseValue(var1, currentState) / InstructionUtils.getVarOrParseValue(var2, currentState);
    currentState.setVar(targetVar, result);
    currentState.incrementProgramIndex();
  }

}
