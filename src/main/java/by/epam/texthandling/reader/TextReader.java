package by.epam.texthandling.reader;

import by.epam.texthandling.exception.TextException;

import java.util.List;

public interface TextReader {
    String readTextFromFile(String pathToFile) throws TextException;
}
