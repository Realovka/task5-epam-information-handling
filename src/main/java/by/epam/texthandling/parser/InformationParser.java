package by.epam.texthandling.parser;

import by.epam.texthandling.entity.TextComponent;
import by.epam.texthandling.exception.TextException;

public interface InformationParser {
    TextComponent parse(String component) throws TextException;
}
