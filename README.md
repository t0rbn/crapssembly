# What the 🦀?
Crapsemmbly is a ~~programming language~~ brainfart inspired by assembly and sleep deprivation. It minimizes readability while maximizing the use of emoji. Use at your own risk.

## Example: Fibonacci Sequence
This "simple" code calculates as many fibonacci numbers as the user chooses. Or as many as the interpreter can handle before wetting the bed with StackOverflowExceptions.  

```
🖨 How many fibonacci numbers do you need?

📖 👔
🖨 👍
💵 🌙 1
💵 🏕 🌙
💵 💖 🌙
⚓ 🔑
🍊 👔 💖 💤 🔥
⚓ 💤
🏦 🌙
➕ 🌙 🏕 🚗
💵 🌙 🏕
💵 🏕 🚗
➕ 1 💖 💖
🚶 🔑
⚓ 🔥
```

## How does this work?
Every line consists of an instruction followed by parameters, all separated by spaces. Parameters may be variable names or floating point numbers. Variable names may be any UTF-8 string but must not contain whitespace chracters. There are two special instructions, 💬 and 🖨, that are followed by strings which may contain whitespaces.

Arithmetic instructions (➕, ➖, ➗ and ✖️) take the two arguments of their calculation as the first two parameters; the third parameter is the variable to which the result will be written, e.g. `➕ A 5 foo` takes the value stored as A, adds 5 and saves the result as `foo`.

The keywords 💵 and 📖 set variables either programatically or by reading user input. To output data to the user, use the commands 🖨 (print string parameter) and 🏦 (print variable).

The program execution can be controlled with the keywords ⚓ (define anchor point), 🚶 (goto anchor point) or with comparison instructions. Comparison instructions take the left and right side of the comparing operator in the first two params, the next two parameters are the names of the program anchors to which the execution will jump according to the result of the comparision. For example the line `🍌 foo 4 foo bar` means that if the value stored as `foo` is less than four, the program will jump to the anchor `foo`, otherwise to `bar`.

Comments can be added using the keyword `💬`.

### Example: Fahrenheit to Celsius converter.
This example might cast some light on the instruction syntax:

```
💬 Print this question to the user
🖨 What's the temperature (in Fahrenheit)?

💬 Read the user's input and save it in the variable 🌡️
📖 🌡️

💬 Subract 32 from 🌡 and save️ the result in 🌡
➖ 🌡️ 32 🌡️
💬 Now divide 🌡 by 1.8 and save️ the result in 🌡
➗ 🌡️ 1.8 🌡️

💬 Again, print static text
🖨 Converted to Celsius:

💬 Print what we've just calculated
🏦 🌡️
```

More examples can be found in this repo under `/examples`.

### Instruction Set Reference

| Key | Instruction        | Param 1           | Param 2    | Param 3         | Param 4         |
|:---:|--------------------|-------------------|------------|-----------------|-----------------|
|➕   | addition           | 1st addend        | 2nd addend | target variable |                 |
|➖   | subtraction        | minuend           | subtracted | target variable |                 |
|➗   | division           | dividend          | divisor    | target variable |                 |
|✖️    | multiplication     | 1st factor        | 2nd factor | target variable |                 |
|🍌   | less than          | left side         | right side | anchor if true  | anchor if false |
|🍆   | less or equal      | left side         | right side | anchor if true  | anchor if false |
|🍉   | greater than       | left side         | right side | anchor if true  | anchor if false |
|🍊   | greater or equal   | left side         | right side | anchor if true  | anchor if false |
|🍋   | equal              | left side         | right side | anchor if true  | anchor if false |
|🍍   | not equal          | left side         | right side | anchor if true  | anchor if false |
|🖨   |️ print text         | text to print (1) |            |                 |                 |
|🏦   | print variable     | variable to print |            |                 |                 |
|💵   | set variable       | variable name     |            |                 |                 |
|📖   | read input         | variable name     | value      |                 |                 |
|⚓    | define anchor      | anchor name       |            |                 |                 |
|🚶   | goto anchor        | anchor to go to   |            |                 |                 |
|💬   | comment            | comment text (1)  |            |                 |                 |

(1) Whitespaces allowed

# Try it yourself!
Why the heck would you?!

## Build the interpreter
### Needed dependencies
* Java 13
* Gradle

### Build with gradle
To build the interpreter, run
```bash
gradle clean build
```
in the project directory. This creates a runnable jar in ` build/libs/crapssembly-1.0-SNAPSHOT.jar`

## Run your crapsemmbly code
Run the interpreter jar with java. The first - and only - argument must be the path to your crapsemmbly code file.
```
java -jar crapssembly-1.0-SNAPSHOT.jar path/to/your/code.file

```
