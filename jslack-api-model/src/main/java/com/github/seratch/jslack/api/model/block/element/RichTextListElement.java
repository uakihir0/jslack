package com.github.seratch.jslack.api.model.block.element;

import java.util.ArrayList;
import java.util.List;

/**
 * https://api.slack.com/changelog/2019-09-what-they-see-is-what-you-get-and-more-and-less
 */
public class RichTextListElement extends BlockElement implements RichTextElement {

    public static final String TYPE = "rich_text_list";
    private final String type = TYPE;
    private List<RichTextElement> elements = new ArrayList<>();
    private String style; // bullet, ordered
    private Integer indent;

    public RichTextListElement(List<RichTextElement> elements, String style, Integer indent) {
        this.elements = elements;
        this.style = style;
        this.indent = indent;
    }

    public RichTextListElement() {
    }

    public static RichTextListElementBuilder builder() {
        return new RichTextListElementBuilder();
    }

    public String getType() {
        return this.type;
    }

    public List<RichTextElement> getElements() {
        return this.elements;
    }

    public String getStyle() {
        return this.style;
    }

    public Integer getIndent() {
        return this.indent;
    }

    public void setElements(List<RichTextElement> elements) {
        this.elements = elements;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setIndent(Integer indent) {
        this.indent = indent;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RichTextListElement)) return false;
        final RichTextListElement other = (RichTextListElement) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$elements = this.getElements();
        final Object other$elements = other.getElements();
        if (this$elements == null ? other$elements != null : !this$elements.equals(other$elements)) return false;
        final Object this$style = this.getStyle();
        final Object other$style = other.getStyle();
        if (this$style == null ? other$style != null : !this$style.equals(other$style)) return false;
        final Object this$indent = this.getIndent();
        final Object other$indent = other.getIndent();
        if (this$indent == null ? other$indent != null : !this$indent.equals(other$indent)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RichTextListElement;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $elements = this.getElements();
        result = result * PRIME + ($elements == null ? 43 : $elements.hashCode());
        final Object $style = this.getStyle();
        result = result * PRIME + ($style == null ? 43 : $style.hashCode());
        final Object $indent = this.getIndent();
        result = result * PRIME + ($indent == null ? 43 : $indent.hashCode());
        return result;
    }

    public static class RichTextListElementBuilder {
        private List<RichTextElement> elements;
        private String style;
        private Integer indent;

        RichTextListElementBuilder() {
        }

        public RichTextListElement.RichTextListElementBuilder elements(List<RichTextElement> elements) {
            this.elements = elements;
            return this;
        }

        public RichTextListElement.RichTextListElementBuilder style(String style) {
            this.style = style;
            return this;
        }

        public RichTextListElement.RichTextListElementBuilder indent(Integer indent) {
            this.indent = indent;
            return this;
        }

        public RichTextListElement build() {
            return new RichTextListElement(elements, style, indent);
        }

        public String toString() {
            return "RichTextListElement.RichTextListElementBuilder(elements=" + this.elements + ", style=" + this.style + ", indent=" + this.indent + ")";
        }
    }
}