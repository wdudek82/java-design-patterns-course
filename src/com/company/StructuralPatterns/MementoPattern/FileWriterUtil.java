package com.company.StructuralPatterns.MementoPattern;

public class FileWriterUtil {
    private String filename;
    private StringBuilder content;

    public FileWriterUtil(String file) {
        this.filename = file;
        this.content = new StringBuilder();
    }

    @Override
    public String toString() {
        return content.toString();
    }

    public void write(String str) {
        content.append(str);
    }

    // create the memento
    public Memento save() {
        return new Memento(this.filename, this.content);
    }

    // restore into its earlier state
    public void undoToLastSave(Object obj) {
        Memento memento = (Memento) obj;
        this.filename = memento.filename;
        this.content = memento.content;
    }

    private class Memento {
        private final String filename;
        private final StringBuilder content;

        public Memento(String filename, StringBuilder content) {
            this.filename = filename;
            this.content = new StringBuilder(content);  // create a deep copy
        }
    }
}
