import java.io.File;
import java.io.IOException;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by StackOverFlow forum long, long time ago
 */
public class DirHierarchy {
    public static void main(String[] args) throws IOException {

        Path parent = Paths.get("D:\\myjava\\com.hillel.core\\Homework");
        Files.walkFileTree(parent, new SimpleFileVisitor<Path>() {

            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                int count = dir.getNameCount() - parent.getNameCount() + 1;
                count += dir.getFileName().toString().length();

                //выравнивание по правому краю
                String text = String.format("%" + count + "s", dir.getFileName());
                text = text.replaceAll("[\\s]", "-");
                System.out.println(text);
                return FileVisitResult.CONTINUE;
            }
        });
    }

}
