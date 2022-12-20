public enum Colours {
    WHITE("W"),
    BLACK("B"),
    YELLOW("Y");
    private String colorName;

    Colours(String colorName) {
        this.colorName = colorName;
    }
    public String getColorName(){
        return colorName;

    }
}
