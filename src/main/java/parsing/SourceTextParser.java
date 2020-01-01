package parsing;

import machine.Program;

public class SourceTextParser {

  private final String sourceText;

  public SourceTextParser(String sourceText) {
    this.sourceText = sourceText;
  }

  public Program toProgram() {
    Program program = new Program();

    for (String line : sourceText.split("\n")) {
      if (!line.isEmpty()) {
        var parser = new InstructionParser(line);
        program.addInstruction(parser.toInstruction());
      }
    }

    return program;
  }

}
