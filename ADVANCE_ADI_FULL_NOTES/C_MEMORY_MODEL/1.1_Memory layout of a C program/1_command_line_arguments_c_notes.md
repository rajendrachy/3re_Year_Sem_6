# Command Line Arguments in C

## 1. Introduction

In the **C programming language**, command line arguments allow users to
pass inputs to a program while executing it from the terminal or command
prompt.\
Instead of taking input during program execution (using functions like
`scanf()`), the program receives values directly when it starts running.

This feature is commonly used in system programs, utilities, and
scripts.

------------------------------------------------------------------------

## 2. Syntax of main() Function

To use command line arguments, the `main()` function is written as:

``` c
int main(int argc, char *argv[])
```

### Explanation

  -----------------------------------------------------------------------
  Parameter                               Meaning
  --------------------------------------- -------------------------------
  `argc`                                  Argument Count -- number of
                                          arguments passed to the program

  `argv`                                  Argument Vector -- array of
                                          strings that stores the
                                          arguments
  -----------------------------------------------------------------------

------------------------------------------------------------------------

## 3. How It Works

When a program runs from the terminal, arguments typed after the program
name are stored in the `argv` array.

Example command:

    ./program Hello World

The values stored will be:

  Index       Value
  ----------- -----------
  argv\[0\]   ./program
  argv\[1\]   Hello
  argv\[2\]   World

`argc = 3` because three arguments are present.

------------------------------------------------------------------------

## 4. Example Program

``` c
#include <stdio.h>

int main(int argc, char *argv[])
{
    printf("Total arguments: %d\n", argc);

    for(int i = 0; i < argc; i++)
    {
        printf("Argument %d: %s\n", i, argv[i]);
    }

    return 0;
}
```

------------------------------------------------------------------------

## 5. Compilation and Execution

### Step 1: Compile the program

    gcc program.c

### Step 2: Run the program with arguments

    ./a.out Apple Mango Banana

### Output

    Total arguments: 4
    Argument 0: ./a.out
    Argument 1: Apple
    Argument 2: Mango
    Argument 3: Banana

------------------------------------------------------------------------

## 6. Important Points

-   `argv` stores arguments as **strings**.
-   `argv[0]` always contains the **program name**.
-   Arguments start from `argv[1]`.
-   `argc` always includes the program name in the count.
-   Command line arguments are useful for **automation and scripting**.

------------------------------------------------------------------------

## 7. Advantages

1.  Allows input without interactive prompts.
2.  Useful for running programs with different parameters.
3.  Helps automate tasks in shell scripts.
4.  Widely used in system-level applications.

------------------------------------------------------------------------

## 8. Simple Example (Adding Two Numbers)

``` c
#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[])
{
    if(argc != 3)
    {
        printf("Please provide two numbers.\n");
        return 1;
    }

    int a = atoi(argv[1]);
    int b = atoi(argv[2]);

    printf("Sum = %d\n", a + b);

    return 0;
}
```

### Run

    ./a.out 5 7

### Output

    Sum = 12

------------------------------------------------------------------------

## 9. Short Exam Definition

**Command line arguments are parameters passed to a C program at the
time of execution through the command line using `argc` and `argv`.**

------------------------------------------------------------------------

## 10. Summary

-   Command line arguments provide input during program execution.
-   Implemented using `int main(int argc, char *argv[])`.
-   `argc` stores number of arguments.
-   `argv` stores arguments as an array of strings.
-   Commonly used in utilities and scripting.
