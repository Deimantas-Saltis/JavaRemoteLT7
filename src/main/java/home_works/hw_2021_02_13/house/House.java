package home_works.hw_2021_02_13.house;

public class House {

    private double houseArea;
    private String district;
    private int builtYear;
    private String condition; //    fitted`, `partially finished`, `not finished`

    public House(double houseArea, String district, int builtYear, String condition) {
        this.houseArea = houseArea;
        this.district = district;
        this.builtYear = builtYear;
        this.condition = condition;
    }

    public int getBuiltYear() {
        return builtYear;
    }

    public double getHouseArea() {
        return houseArea;
    }

    public String getCondition() {
        return condition;
    }

    public String toString() {
        return "House{" +
                "houseArea=" + houseArea +
                ", district='" + district + '\'' +
                ", builtYear=" + builtYear +
                ", condition='" + condition + '\'' +
                '}';
    }
}
