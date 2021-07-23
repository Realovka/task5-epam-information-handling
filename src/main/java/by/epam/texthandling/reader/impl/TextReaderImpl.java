package by.epam.texthandling.reader.impl;

import by.epam.texthandling.exception.TextException;
import by.epam.texthandling.reader.TextReader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TextReaderImpl implements TextReader {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public String readTextFromFile(String pathToFile) throws TextException {
        Path path = Paths.get(pathToFile);
        List<String> textLines;
        try (Stream<String> fileLines = Files.lines(path)) {
            textLines = fileLines
                    .collect(Collectors.toList());
        } catch (IOException e) {
            logger.log(Level.ERROR, "File can't be open " + e);
            throw new TextException("File can't be open " + e);
        }
        logger.log(Level.INFO, "Collection of strings from file " + textLines);
        return String.join(" ", textLines);
    }

}


