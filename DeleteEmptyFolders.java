import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DeleteEmptyFolders
{
    public static void main(String[] args)
    {
        Path startDir = Paths.get("path/to/your/directory"); // Set your directory path here
        try
        {
            Files.walkFileTree(startDir, new SimpleFileVisitor<Path>()
            {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
                {
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                    // Check if the directory is empty
                    try
                    {
                        if (Files.list(dir).findAny().isEmpty())
                        {
                            Files.delete(dir); // Delete the empty directory
                            System.out.println("Deleted empty folder: " + dir);
                        }
                    }
                    catch (IOException e)
                    {
                        System.err.println("Error checking or deleting folder " + dir + ": " + e.getMessage());
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
        }
        catch (IOException e)
        {
            System.err.println("Error walking file tree: " + e.getMessage());
        }
    }
}