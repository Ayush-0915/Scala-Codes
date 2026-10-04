# Scala Codes

A structured collection of Scala learning programs, laboratory exercises, and assignment solutions. The repository begins with small syntax examples and gradually moves through control flow, functions, collections, object-oriented programming, traits, polymorphism, and exception handling.

## Learning Path

The examples are arranged so that they can be studied in this order:

1. Start with the root-level programs for Scala syntax and object-oriented fundamentals.
2. Work through `Lab Manual/Exp 1` to `Lab Manual/Exp 8` in sequence.
3. Use `Scala Assignment/` for focused practice with expressions, loops, inheritance, overriding, encapsulation, and polymorphism.
4. Use `Assignment 2/` for larger, self-contained OOP examples with sample output included in the source files.

## Topics Covered

- `val` and `var`, type inference, primitive and reference data types
- String interpolation and type conversion
- Arithmetic, comparison, and logical operators
- `if` expressions, block expressions, `for`, `while`, and `do-while` loops
- Named, default, variable-length, recursive, tail-recursive, anonymous, local, and curried functions
- Strings, arrays, lists, maps, mutable collections, and collection methods
- Classes, objects, primary and auxiliary constructors
- Encapsulation using private state and public methods
- Single-level inheritance, method overriding, abstract classes, and runtime polymorphism
- Traits, trait composition, and multiple inheritance-style method resolution
- Case classes, sealed traits, pattern matching, and exception handling

## Repository Structure

```text
Scala-Codes/
├── README.Md
├── Root examples/
│   ├── Hello.scala
│   ├── Variables.scala
│   ├── Update.scala
│   ├── Control.scala
│   ├── Loops.scala
│   ├── Operators.scala
│   ├── Function_2.scala
│   ├── input.scala
│   ├── Classes_Objects.scala
│   ├── Constructor.scala
│   ├── Encapsulation.scala
│   ├── Inheritance.scala
│   ├── Overridding.scala
│   ├── traits.scala
│   ├── multiple.scala
│   └── try_catch.scala
├── Lab Manual/
│   ├── EXPERIMENT_1.scala
│   ├── Exp 1/  # Basics, variables, types, operators, interpolation, conversion
│   ├── Exp 2/  # Conditions, loops, factorial, tables, and menu calculator
│   ├── Exp 3/  # Functions, recursion, tail recursion, anonymous functions, currying
│   ├── Exp 4/  # Strings, arrays, counting, and searching
│   ├── Exp 5/  # Lists, maps, safe access, and mutable versus immutable collections
│   ├── Exp 6/  # Classes, collection methods, sorting, taking/dropping, comprehensions
│   ├── Exp 7/  # Student grading, encapsulation, bank account, and case classes
│   └── Exp 8/  # Inheritance, abstract classes, polymorphism, and traits
├── Scala Assignment/
│   ├── block_expression.scala
│   ├── Loops_Control_Statement.scala
│   ├── Function_overriding.scala
│   ├── Polymorphism_Encapsulation.scala
│   └── single_level_inheritence.scala
└── Assignment 2/
    ├── Class_Object_Basics.scala
    ├── Constructors.scala
    ├── Encapsulation.scala
    ├── Inheritance.scala
    ├── Runtime_Polymorphism.scala
    ├── Abstract_Class_vs_Trait.scala
    ├── Traits_Multiple_Inheritance.scala
    └── Case_Classes_Pattern_Matching.scala
```

## Root Examples

| File | Concepts demonstrated |
| --- | --- |
| `Hello.scala` | Scala 3-style top-level definition and `@main` entry point |
| `Variables.scala` | Immutable `val`, mutable `var`, type annotations, and inference |
| `Update.scala` | Updating mutable values while keeping immutable values unchanged |
| `Control.scala` | `if` expressions and block expressions |
| `Loops.scala` | `for` and `while` loops |
| `Operators.scala` | Arithmetic, comparison, and boolean operators |
| `Function_2.scala` | A two-parameter function and common data types |
| `input.scala` | Console input practice |
| `Classes_Objects.scala` | A class declared inside an object and an instance method |
| `Constructor.scala` | Constructor parameters and object creation |
| `Encapsulation.scala` | Private account balance with deposit and withdrawal methods |
| `Inheritance.scala` | A `Student` class inheriting from `Person` |
| `Overridding.scala` | Overriding one parent method while inheriting another |
| `traits.scala` | Abstract members and concrete methods in a trait |
| `multiple.scala` | Trait composition and linearized method calls |
| `try_catch.scala` | `try`, `catch`, and `finally` with arithmetic exception handling |

## Lab Manual

Each experiment folder contains short independent programs. Files are named alphabetically because they correspond to individual questions or tasks in the practical manual.

### Experiment 1: Scala Fundamentals

Hello World, `val` and `var`, primitive data types, arithmetic/relational/logical operations, string interpolation, and explicit type conversion. `EXPERIMENT_1.scala` combines these demonstrations into one interactive program.

### Experiment 2: Control Flow

Positive/negative/zero checking, largest-of-three comparison, multiplication tables, `to`/`until`/`by` ranges, guarded loops, factorial calculation, and a menu-driven calculator with division-by-zero protection.

### Experiment 3: Functions

Positional and named arguments, default parameters, repeated parameters, recursion, tail recursion with `@tailrec`, anonymous functions, currying, and nested local functions.

### Experiment 4: Strings and Arrays

String length and case conversion, substring extraction, vowel/consonant counting, array statistics, and linear search.

### Experiment 5: Collections

Immutable list operations, map insertion/update/removal, safe map lookup with `contains` and `getOrElse`, and comparison of immutable `List` with mutable `ListBuffer`.

### Experiment 6: Collection Processing

Constructor-based classes, `exists`, `forall`, `find`, `count`, `partition`, `sortBy`, `sortWith`, `take`, `takeWhile`, `dropWhile`, and for-comprehensions with guards.

### Experiment 7: OOP and Case Classes

Student grading, private bank-account state, and case-class employee records used to find the highest salary.

### Experiment 8: Inheritance and Traits

Single inheritance with method overriding, abstract shape classes, runtime polymorphism over a list of shapes, timestamp behavior supplied by a trait, and a printable case class extending a trait.

## Assignments

### `Scala Assignment/`

These programs provide focused exercises for block evaluation, loop and control statements, method overriding, single-level inheritance, and the combination of encapsulation with polymorphism.

### `Assignment 2/`

This set expands the OOP coverage with student percentage calculation, primary and auxiliary constructors, bank-account validation, animal sound polymorphism, payment-method dispatch, abstract class plus trait composition, multiple traits, and sealed-trait pattern matching over vehicles.

## Requirements

- Scala 2.13+ or Scala 3 installed and available on `PATH`
- A compatible Java Development Kit (JDK)
- A terminal, or an IDE with Scala support

The repository does not currently contain a `build.sbt`; each source file is intended to be compiled or run independently. Some files use Scala 3 syntax, such as `@main` and `while ... do`, while most examples use syntax compatible with Scala 2.13 and Scala 3.

## Running a Program

From the repository root, use quotes around paths containing spaces.

### Scala 3 / direct execution

```powershell
scala .\Variables.scala
scala '.\Lab Manual\Exp 8\f.scala'
```

### Compile and run

```powershell
scalac .\Variables.scala
scala Basics
```

For a file in a subdirectory, compile and run from that directory so the generated class files are easy to locate:

```powershell
Set-Location '.\Assignment 2'
scalac .\Case_Classes_Pattern_Matching.scala
scala Case_Classes_Pattern_Matching
```

The class or object name used with `scala` is the entry point declared in the file, not always the filename. For example, `Variables.scala` runs `Basics`, and `Lab Manual/Exp 8/f.scala` runs `PrintableDemo8f`.

### Interactive programs

Programs such as `input.scala`, `Lab Manual/EXPERIMENT_1.scala`, `Lab Manual/Exp 1/d.scala`, and `Lab Manual/Exp 2/g.scala` read values from standard input. Run them in a terminal and enter the requested values when prompted.

## Output and Generated Files

Compiled `.class` files and Scala build metadata are generated locally and are ignored by `.gitignore`. The checked-in source files remain small, standalone learning examples; no external libraries are required.

## Author

Ayush Singh

## License

This repository is maintained for educational and personal learning purposes.
