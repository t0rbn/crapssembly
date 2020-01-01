package interpreter;

import machine.Machine;
import parsing.SourceTextParser;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class InterpreterApplication {

  public static void main(String[] args) {
    var program = new SourceTextParser(readInputFile(args[0])).toProgram();
    var machine = new Machine(program);
    machine.run();
  }

  private static String readInputFile(String path) {
    var contentBuilder = new StringBuilder();
    try (Stream<String> stream = Files.lines(Paths.get(path), StandardCharsets.UTF_8)) {
      stream.forEach(s -> contentBuilder.append(s).append("\n"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    return contentBuilder.toString();
  }


}





