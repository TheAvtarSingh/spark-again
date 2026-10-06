# spark-again

A Java practice project with array problem solutions and basic pattern exercises.

## Project Structure

- `/home/runner/work/spark-again/spark-again/src/Main.java` – entry point to run array operations.
- `/home/runner/work/spark-again/spark-again/src/Array_Easy` – easy array problem implementations.
- `/home/runner/work/spark-again/spark-again/src/patterns` – pattern-related practice code.

## Run Locally

From `/home/runner/work/spark-again/spark-again`:

```bash
javac src/Main.java src/Array_Easy/*.java
java -cp src Main
```

Then provide:
1. Array size `n`
2. `n` integer elements

The program prints:
- Largest element
- Second largest and second smallest
- Sorted check result
- Size after duplicate removal (for sorted arrays)
- Updated array view
