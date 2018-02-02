import java.io.IOException;
import java.nio.file.DirectoryStream.Filter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Solution {

  public static void main(String[] args) {
    Path mainFile = Paths.get("main.md");
    Path rootDir = Paths.get(System.getProperty("user.dir") + "//src");
    Path readme = Paths.get(System.getProperty("user.dir") + "//README.md");

    init(mainFile, readme);
    dirWalk(rootDir, mainFile);

  }

  static void dirWalk(Path rootDir, Path mainFile) {
    Filter<Path> filter = entry -> {
//      if (entry.toString().endsWith(".md") || entry.toString().endsWith(".java")) {
      if (entry.toString().endsWith(".md")) {
        writeToFile(mainFile, entry);
        return false;
      } else {
        return Files.isDirectory(entry);
      }
    };

    try {
      Files.newDirectoryStream(rootDir, filter).forEach(x -> dirWalk(x, mainFile));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  static void writeToFile(Path copyTo, Path copyFrom) {
    try {
      if (copyFrom.toString().endsWith(".java")) {
        Files.write(copyTo, "```java\n".getBytes(), StandardOpenOption.APPEND);
        Files.write(copyTo, Files.readAllLines(copyFrom), StandardOpenOption.APPEND);
        Files.write(copyTo, "```\n".getBytes(), StandardOpenOption.APPEND);
      } else {
        Files.write(copyTo, Files.readAllLines(copyFrom), StandardOpenOption.APPEND);
      }
      Files.write(copyTo, "\n".getBytes(), StandardOpenOption.APPEND);
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  static void init(Path mainFile, Path readme) {
    try {
      Files.deleteIfExists(mainFile);
      Files.copy(readme, mainFile);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}

