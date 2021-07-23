package by.epam.texthandling.entity;

public enum ComponentType {
    TEXT,
    PARAGRAPH ("    "),
    SENTENCE_AFFIRMATIVE(". "),
    SENTENCE_INTERROGATIVE("? "),
    SENTENCE_EXCLAMATION("! "),
    SENTENCE_UNSAID("... ")
    ;

    private String delimiter = "";

    ComponentType() {
    }

    ComponentType(String delimiter) {
        this.delimiter = delimiter;
    }
}
