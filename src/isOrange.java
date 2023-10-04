public interface isOrange extends isColor{
    @Override
    default String iscolor() {
        return "Orange";
    };
}