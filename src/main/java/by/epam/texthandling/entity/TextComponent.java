package by.epam.texthandling.entity;

import by.epam.texthandling.exception.TextException;

import java.util.List;

public interface TextComponent {
    List<TextComponent> getChildren();
    void add(TextComponent component);
}
