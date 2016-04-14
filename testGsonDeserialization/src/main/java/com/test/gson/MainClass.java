package com.test.gson;
/*
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
*/
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


/**
 * Created by alexa_000 on 12/04/2016.
 */
public class MainClass {
    public static void main(String[] args) {
        String fileName = "\\\\spbfs02.nwx.local\\vmmlibrary\\bugs_attachements\\AT_ADDITIONAL_INFORMATION\\SmokeDbl_2016.04.11_22.28.34\\NAC_8.0\\Data\\ExpectedChanges.txt";
        try (Stream<String> lines = Files.lines(Paths.get(fileName), Charset.defaultCharset())) {
            lines.forEachOrdered(line -> process(line));
            lines.forEachOrdered(System.out::println);
            lines.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void process(String line) {

    }
    /*
    private transient static final Log LOG = LogFactory.getLog(RecursiveFileLineReader.class);

    public static List<String> readAllLineFromAllFilesRecursively(final String path, final String extension) {

        final List<String> lines = new ArrayList<>();
        try (final Stream<Path> pathStream = Files.walk(Paths.get(path), FileVisitOption.FOLLOW_LINKS)) {
            pathStream
                    .filter((p) -> !p.toFile().isDirectory() && p.toFile().getAbsolutePath().endsWith(extension))
                    .forEach(p -> fileLinesToList(p, lines));
        } catch (final IOException e) {
            LOG.error(e.getMessage(), e);
        }
        return lines;
    }

    private static void fileLinesToList(final Path file, final List<String> lines) {
        try (Stream<String> stream = Files.lines(file, Charset.defaultCharset())) {
            stream
                    .map(String::trim)
                    .filter(s -> !s.isEmpty())
                    .forEach(lines::add);
        } catch (final IOException e) {
            LOG.error(e.getMessage(), e);
        }
    }
    */

}
