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

4. Compile and run the program using the following commands:

    ```bash
    javac DeleteEmptyFolders.java
    java DeleteEmptyFolders
    ```

   The program will recursively check the specified directory and its subdirectories for empty folders and delete them. It will print the path of each deleted folder to the console.

## Notes

- The program **only deletes empty directories**. It will not remove directories that contain files or subdirectories.
- The program does **not** ask for confirmation before deleting a directory, so be cautious.
- Always make sure to **back up important data** before running the program to avoid accidental deletion of directories.
- You may want to run the program on a **test directory** first to ensure it works as expected.

## Example

Here’s an example of how to run the program:

1. After modifying the `startDir` variable to your desired directory path, save the file.
2. Run the following commands in your terminal:

    ```bash
    javac DeleteEmptyFolders.java
    java DeleteEmptyFolders
    ```

   The program will output something like this if it deletes any empty directories:

    ```
    Deleted empty folder: path/to/empty/directory1
    Deleted empty folder: path/to/empty/directory2
    ```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
