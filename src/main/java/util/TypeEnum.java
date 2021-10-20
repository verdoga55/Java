package util;

public enum TypeEnum {
    INT_STATE("Int"),
    STRING_STATE("String"),
    DEFAULT_STATE("Default");

    private String property;

    private TypeEnum(String property) {
        this.property = property;
    }

    public String getType() {
        return this.property;
    }
}
