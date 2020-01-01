package machine;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class State {

  private Map<String, Double> values;
  private int programIndex;

  public State() {
    this.values = new HashMap<>();
    this.programIndex = 0;
  }

  public double getVar(String name) {
    var value = this.values.get(name);
    if (value == null) {
      throw new ProgramException("variable is undefined");
    }
    return value;
  }

  public boolean hasVar(String name) {
    return this.values.get(name) != null;
  }

  public void setVar(String name, double value) {
    this.values.put(name, value);
  }

  public void incrementProgramIndex() {
    this.programIndex++;
  }

  public void setProgramIndex(int programIndex) {
    this.programIndex = programIndex;
  }

  public int getProgramIndex() {
    return this.programIndex;
  }

  @Override
  public String toString() {
    return this.values.keySet().stream().map(k -> k + " = " + this.getVar(k)).collect(Collectors.joining("\n"));
  }

}
