package by.epam.texthandling.entity.impl;

import by.epam.texthandling.entity.ComponentType;
import by.epam.texthandling.entity.TextComponent;
import by.epam.texthandling.exception.TextException;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class TextComposite implements TextComponent {
    private static final List<TextComponent> components = new ArrayList<>();
    private ComponentType componentType;

    public TextComposite(ComponentType componentType) {
        EnumSet<ComponentType> componentTypes = EnumSet.range(ComponentType.TEXT, ComponentType.SENTENCE_UNSAID);
        this.componentType = componentType;
    }


    @Override
    public List<TextComponent> getChildren() {
        return components;
    }

    @Override
    public void add(TextComponent component) {
       components.add(component);
    }
}
