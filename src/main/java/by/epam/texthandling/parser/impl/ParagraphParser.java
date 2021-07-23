package by.epam.texthandling.parser.impl;

import by.epam.texthandling.entity.TextComponent;
import by.epam.texthandling.exception.TextException;
import by.epam.texthandling.parser.InformationParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ParagraphParser implements InformationParser {
    private static final Logger logger = LogManager.getLogger();
    private static final String PARAGRAPH_SPLIT_REGEX = "^[\\s]{4}";
    private InformationParser parser;

    public ParagraphParser(InformationParser parser) {
        this.parser = parser;
    }

    @Override
    public TextComponent parse(String component) throws TextException {
        return null;
    }
}
