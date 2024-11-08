# Delete Empty Folders - Java Program

This Java program recursively traverses a specified directory and its subdirectories, finding and deleting all empty folders. It uses the modern `java.nio.file` API to walk the file tree and check for empty directories.

## Features

- Recursively searches through all subdirectories.
- Identifies and deletes empty directories.
- Simple and easy to use.

## Prerequisites

- Java 8 or later installed on your system.

## How to Use

1. Clone or download this repository.
2. Open the `DeleteEmptyFolders.java` file in your preferred Java IDE or text editor.
3. Modify the `startDir` variable in the `main()` method to the path of the directory you want to clean up.

    ```java
    Path startDir = Paths.get("path/to/your/directory"); // Set your directory path here
    ```

4. Compile and run the program.

### Example

```bash
javac DeleteEmptyFolders.java
java DeleteEmptyFolders
```
The program will recursively check the directory and its subdirectories for empty folders and delete them. It will print the path of each deleted folder to the console.

## Notes
The program only deletes empty directories. It does not remove directories that contain files or subdirectories.
Make sure you have a backup of important data before running the program to avoid accidental deletion of directories.
