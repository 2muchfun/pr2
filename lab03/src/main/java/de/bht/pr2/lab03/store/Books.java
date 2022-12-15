package de.bht.pr2.lab03.store;

import java.util.Objects;

public final class Books {
    private final String title;
    private final String typeBook;
    private final double preis;
    private final int auflage;
    private final String version;

    Books(String title, String typeBook, double preis, int auflage, String version) {
        this.title = title;
        this.typeBook = typeBook;
        this.preis = preis;
        this.auflage = auflage;
        this.version = version;
    }

    public String title() {
        return title;
    }

    public String typeBook() {
        return typeBook;
    }

    public double preis() {
        return preis;
    }

    public int auflage() {
        return auflage;
    }

    public String version() {
        return version;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Books) obj;
        return Objects.equals(this.title, that.title) &&
                Objects.equals(this.typeBook, that.typeBook) &&
                Double.doubleToLongBits(this.preis) == Double.doubleToLongBits(that.preis) &&
                this.auflage == that.auflage &&
                this.version == that.version;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, typeBook, preis, auflage, version);
    }

    @Override
    public String toString() {
        return "Books[" +
                "title=" + title + ", " +
                "typeBook=" + typeBook + ", " +
                "preis=" + preis + ", " +
                "auflage=" + auflage + ", " +
                "version=" + version + ']';
    }

}
