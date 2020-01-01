package machine;

import instructions.Instruction;
import instructions.meta.AnchorInstruction;

import java.util.ArrayList;
import java.util.List;

public class Program {

  private List<Instruction> instructions;

  public Program() {
    this.instructions = new ArrayList<>();
  }

  public void addInstruction(Instruction i) {
    this.instructions.add(i);
  }

  public Instruction getInstructionAtIndex(int index) {
    if (index >= this.instructions.size()) {
      return null;
    }
    return this.instructions.get(index);
  }

  public int getIndexForAnchor(String anchorName) {
    for (int i = 0; i < instructions.size(); i++) {
      var ins = instructions.get(i);
      if (ins instanceof AnchorInstruction && ((AnchorInstruction) ins).getName().equals(anchorName)) {
        return i;
      }
    }
    throw new ProgramException("Anchor not defined");
  }

}
