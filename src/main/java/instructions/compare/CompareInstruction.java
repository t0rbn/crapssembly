package instructions.compare;

import instructions.Instruction;
import instructions.InstructionUtils;
import machine.Program;
import machine.State;

public abstract class CompareInstruction implements Instruction {

  private String compareValue1;
  private String compareValue2;
  private String ifAnchor;
  private String elseAnchor;

  public CompareInstruction(String compareValue1, String compareValue2, String ifAnchor, String elseAnchor) {
    this.compareValue1 = compareValue1;
    this.compareValue2 = compareValue2;
    this.ifAnchor = ifAnchor;
    this.elseAnchor = elseAnchor;
  }

  abstract boolean isIfCase(double v1, double v2);

  @Override
  public void apply(State currentState, Program program) {
    var v1 = InstructionUtils.getVarOrParseValue(compareValue1, currentState);
    var v2 = InstructionUtils.getVarOrParseValue(compareValue2, currentState);

    if (isIfCase(v1, v2)) {
      currentState.setProgramIndex(program.getIndexForAnchor(ifAnchor));
    } else {
      currentState.setProgramIndex(program.getIndexForAnchor(elseAnchor));
    }
  }

}
