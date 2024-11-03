package flower.store;

import lombok.Getter;

@Getter
public enum FlowerColor {
    RED("#FF0000"), BLUE("#0000FF");
    private final String colorCode;

    FlowerColor(String colorCode) {
        this.colorCode = colorCode;
    }

    @Override
    public String toString() {
        return colorCode;
    }

    public static FlowerColor getColor(String color) {
        for (FlowerColor flowerColor : FlowerColor.values()) {
            if (flowerColor.toString().equals(color)) {
                return flowerColor;
            }
        }
        return null;
    }  
}
