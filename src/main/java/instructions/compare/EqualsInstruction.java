package instructions.compare;

import instructions.Instruction;
import machine.Program;

public class EqualsInstruction extends CompareInstruction implements Instruction {

  public EqualsInstruction(String var1NName, String var2Name, String ifAnchor, String elseAnchor) {
    super(var1NName, var2Name, ifAnchor, elseAnchor);
  }

  @Override
  boolean isIfCase(double v1, double v2) {
    return v1 >= v2;
  }

}
