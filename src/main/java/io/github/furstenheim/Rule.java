package io.github.furstenheim;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.jsoup.nodes.Node;

class Rule {

    private final Predicate<Node> filter;
    private final BiFunction<String, Node, String> replacement;

    public Supplier<String> getAppend() {
        return append;
    }

    private Supplier<String> append = null;

    public void setName(final String name) {
        this.name = name;
    }

    private String name;

    Rule(final String filter, final BiFunction<String, Node, String> replacement) {
        this.filter = (el) -> el.nodeName().toLowerCase().equals(filter);
        this.replacement = replacement;
    }

    Rule(final String[] filters, final BiFunction<String, Node, String> replacement) {
        final Set<String> availableFilters = new HashSet<String>(Arrays.asList(filters));
        filter = (element -> availableFilters.contains(element.nodeName()));
        this.replacement = replacement;
    }

    Rule(final Predicate<Node> filter, final BiFunction<String, Node, String> replacement) {
        this.filter = filter;
        this.replacement = replacement;
    }
    Rule(

        final Predicate<Node> filter, final BiFunction<String, Node, String> replacement,
        final Supplier<String> append) {
        this.filter = filter;
        this.replacement = replacement;
        this.append = append;
    }

    Predicate<Node> getFilter() {
        return filter;
    }

    BiFunction<String, Node, String> getReplacement() {
        return replacement;
    }
}
