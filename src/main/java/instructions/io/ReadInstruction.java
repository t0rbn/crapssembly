package instructions.io;

import instructions.Instruction;
import machine.Program;
import machine.State;

import java.util.Scanner;

public class ReadInstruction implements Instruction {

  final String targetVarName;

  public ReadInstruction(String targetVarName) {
    this.targetVarName = targetVarName;
  }

  @Override
  public void apply(State currentState, Program program) {
    var scanner = new Scanner(System.in);
    var read = scanner.nextDouble();

    currentState.setVar(targetVarName, read);
    currentState.incrementProgramIndex();
  }
}
