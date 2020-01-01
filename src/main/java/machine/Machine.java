package machine;

public class Machine {

  private final State state;
  private final Program program;


  public Machine(Program program) {
    this.state = new State();
    this.program = program;
  }

  public void run() {
    try {
      var currentInstruction = program.getInstructionAtIndex(state.getProgramIndex());
      if (currentInstruction != null) {
        currentInstruction.apply(state, program);
        run();
      }
    } catch (ProgramException e) {
      System.out.println("===== ERROR =====");
      System.out.println(e.getMessage());
    }

  }
}
