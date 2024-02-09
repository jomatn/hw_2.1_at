public class Scale {
    private ColorOfScale colorOfScale;
    private Firmness firmness;

    public ColorOfScale getColorOfScale() {
        return colorOfScale;
    }

    public Firmness getFirmness() {
        return firmness;
    }

    public Scale(ColorOfScale colorOfScale, Firmness firmness) {
        this.colorOfScale = colorOfScale;
        this.firmness = firmness;
    }
}
