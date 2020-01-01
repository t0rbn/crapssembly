package instructions;

import machine.ProgramException;

import java.util.Arrays;

public enum InstructionSet {
  ADDITION("➕"),
  SUBTRACTION("➖"),
  DIVISION("➗"),
  MULTIPLICATION("✖️"),
  LESS_THAN("🍌"),
  LESS_OR_EQUAL("🍆"),
  GREATER_THAN("🍉"),
  GREATER_OR_EQUAL("🍊"),
  EQUAL("🍋"),
  NOT_EQUAL("🍍"),
  PRINT("🖨"),
  PRINT_VAR("🏦"),
  SET("💵"),
  READ_INPUT("📖"),
  ANCHOR("⚓"),
  GOTO("🚶"),
  COMMENT("💬");

  private final String keyword;

  InstructionSet(String keyword) {
    this.keyword = keyword;
  }

  public final String getKeyWord() {
    return this.keyword;
  }

  public static InstructionSet fromKeyword(String keyword) {
    return Arrays.stream(InstructionSet.values())
            .filter(i -> i.getKeyWord().equals(keyword))
            .findAny()
            .orElseThrow(() -> new ProgramException(("unknown instruction " + keyword)));
  }

}
