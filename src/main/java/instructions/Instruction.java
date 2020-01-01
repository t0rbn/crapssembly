package instructions;

import machine.Program;
import machine.State;

public interface Instruction {

  void apply(State currentState, Program program);

}
