package utiles;


import java.util.ArrayList;
import java.util.List;
//Test//
public class EnumBuilder {

    private static List<EnumBuilder> listOfTypes = new ArrayList<>();
    public static final EnumBuilder INT_STATE = orderEnumBuilder("Int", "INT_STATE");
    public static final EnumBuilder STRING_STATE = orderEnumBuilder("String", "STRING_STATE");
    public static final EnumBuilder DEFAULT_STATE = orderEnumBuilder("Default", "DEFAULT_STATE");

    public static final EnumBuilder valueOf(String name) {
        for (EnumBuilder counter : listOfTypes) {
            if (counter.name().equals(name)) {
                return counter;
            }
        }
        throw new NullPointerException("No such type");
    }

    private static final EnumBuilder orderEnumBuilder(String property, String name) {
        EnumBuilder proxy = new EnumBuilder(property, name);
        listOfTypes.add(proxy);
        return (proxy);
    }

    private String property;
    private String nameOfType;

    private EnumBuilder(String property, String name) {
        this.property = property;
        this.nameOfType = name;
    }

    public final int order() {
        return this.findByName();
    }

    public final String name() {
        return this.nameOfType;
    }

    public final List<EnumBuilder> values() {
        return listOfTypes;
    }

    private int findByName() {
        for (EnumBuilder counter : listOfTypes) {
            if (counter.name().equals(this.name())) {
                return listOfTypes.indexOf(counter);
            }
        }
        return (-1);
    }
}