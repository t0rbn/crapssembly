package instructions;

import machine.ProgramException;
import machine.State;

public class InstructionUtils {

  public static double getVarOrParseValue(String varOrValue, State state) {
    if (state.hasVar(varOrValue)) {
      return state.getVar(varOrValue);
    }

    try {
      return state.hasVar(varOrValue) ? state.getVar(varOrValue) : Double.parseDouble(varOrValue);
    } catch (NumberFormatException e) {
      throw new ProgramException("value " + varOrValue + "cannot be processed");
    }
  }

}
