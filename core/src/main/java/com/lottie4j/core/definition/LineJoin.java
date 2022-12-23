package com.lottie4j.core.definition;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * https://lottiefiles.github.io/lottie-docs/constants/#linejoin
 */
public enum LineJoin {
    MITER(1, "Miter"),
    ROUND(2, "Round"),
    BEVEL(3, "Bevel");

    @JsonValue
    private final int value;
    private final String label;

    LineJoin(int value, String label) {
        this.value = value;
        this.label = label;
    }

    public int value() {
        return value;
    }

    public String label() {
        return label;
    }
}
