package by.epam.texthandling.parser.impl;

import by.epam.texthandling.entity.ComponentType;
import by.epam.texthandling.entity.TextComponent;
import by.epam.texthandling.entity.impl.TextComposite;
import by.epam.texthandling.exception.TextException;
import by.epam.texthandling.parser.InformationParser;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TextParser implements InformationParser {
    private static final Logger logger = LogManager.getLogger();
    private static final String TEXT_SPLIT_REGEX = "^[\\s]{4}";
    private InformationParser parser;

    public TextParser(InformationParser parser) {
        this.parser = parser;
    }

    public TextComponent parse(String text) throws TextException{
        if(text.isBlank()) {
            logger.log(Level.ERROR, "The text is missing");
            throw new TextException("The text is missing");
        }
        String[] paragraphs = text.split(TEXT_SPLIT_REGEX);
        TextComponent component = new TextComposite(ComponentType.TEXT);
        for (String paragraph : paragraphs) {
            TextComponent paragraphComponent = parser.parse(paragraph);
            component.add(paragraphComponent);
        }
        logger.log(Level.INFO, "Text parsed successfully: " + text);
        return component;
    }
}
