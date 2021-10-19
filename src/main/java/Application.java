import utiles.EnumBuilder;

public class Application{
    public static void main(String[] args) {
        EnumBuilder enumchik = EnumBuilder.STRING_STATE;
        TypeEnum enumchikTest = TypeEnum.STRING_STATE;
        System.out.println(enumchik.name());
        System.out.println(enumchik.order());
        System.out.println(enumchikTest.ordinal());
        for (EnumBuilder counter : enumchik.values()){
            System.out.println(counter.name());
        }
        EnumBuilder enumchik2 = EnumBuilder.valueOf("STRING_STATE");
        System.out.println(enumchik2.name());
    }
}

enum TypeEnum{
    INT_STATE("Int"),
    STRING_STATE("String"),
    DEFAULT_STATE("Default");

    private String property;

    TypeEnum(String property){
        this.property = property;
    }

    public String getType(){
        return this.property;
    }
}