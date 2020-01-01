package parsing;

import instructions.Instruction;
import instructions.InstructionSet;
import instructions.arithmetic.AdditionInstruction;
import instructions.arithmetic.DivisionInstruction;
import instructions.arithmetic.MultiplicationInstruction;
import instructions.arithmetic.SubtractionInstruction;
import instructions.compare.*;
import instructions.io.PrintInstruction;
import instructions.io.PrintVarInstruction;
import instructions.io.ReadInstruction;
import instructions.io.SetInstruction;
import instructions.meta.AnchorInstruction;
import instructions.meta.CommentInstruction;
import instructions.meta.GotoInstruction;
import machine.ProgramException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InstructionParser {

  private final String textLine;

  public InstructionParser(String textLine) {
    this.textLine = textLine;
  }

  private String getInstructionKeyword() {
    return this.textLine.split("\\s+")[0].trim();
  }

  private List<String> getArgs() {
    return Arrays.stream(this.textLine.split("\\s+", 2)[1].split("\\s+"))
            .map(String::trim)
            .collect(Collectors.toList());
  }

  private String getArg(int index) {
    return getArgs().get(index);
  }

  public Instruction toInstruction() {
    switch (InstructionSet.fromKeyword(getInstructionKeyword())) {
      case PRINT:
        return new PrintInstruction(String.join(" ", getArgs()));
      case PRINT_VAR:
        return new PrintVarInstruction(getArg(0));
      case SET:
        return new SetInstruction(getArg(0), getArg(1));
      case READ_INPUT:
        return new ReadInstruction(getArg(0));
      case ANCHOR:
        return new AnchorInstruction(getArg(0));
      case COMMENT:
        return new CommentInstruction();
      case GOTO:
        return new GotoInstruction(getArg(0));
      case LESS_THAN:
        return new LessInstruction(getArg(0), getArg(1), getArg(2), getArg(3));
      case LESS_OR_EQUAL:
        return new LessEqualInstruction(getArg(0), getArg(1), getArg(2), getArg(3));
      case GREATER_THAN:
        return new GreaterInstruction(getArg(0), getArg(1), getArg(2), getArg(3));
      case GREATER_OR_EQUAL:
        return new GreaterEqualInstruction(getArg(0), getArg(1), getArg(2), getArg(3));
      case EQUAL:
        return new EqualsInstruction(getArg(0), getArg(1), getArg(2), getArg(3));
      case NOT_EQUAL:
        return new NotEqualInstruction(getArg(0), getArg(1), getArg(2), getArg(3));
      case ADDITION:
        return new AdditionInstruction(getArg(0), getArg(1), getArg(2));
      case SUBTRACTION:
        return new SubtractionInstruction(getArg(0), getArg(1), getArg(2));
      case MULTIPLICATION:
        return new MultiplicationInstruction(getArg(0), getArg(1), getArg(2));
      case DIVISION:
        return new DivisionInstruction(getArg(0), getArg(1), getArg(2));
    }
    throw new ProgramException("Unknown instruction " + getInstructionKeyword());
  }

}
