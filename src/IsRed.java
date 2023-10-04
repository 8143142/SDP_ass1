public interface IsRed extends isColor {
    @Override
    default String iscolor() {
        return "red";
    }
}
