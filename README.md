# What the 🦀?

## Example
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


## Instruction Set


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


### Run your crapsemmbly code
Run the interpreter jar with java. The first - and only - argument must be the path to your crapsemmbly code file.
```
java -jar crapssembly-1.0-SNAPSHOT.jar path/to/your/code.file

```
