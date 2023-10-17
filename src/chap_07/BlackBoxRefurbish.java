package chap_07;

public class BlackBoxRefurbish {
    String modelName;
    String resolution;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResolution() {
        if(resolution == null || resolution.isEmpty()){
            return "판매자에게 문의하세요";

        }
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getPrice() {
        if (price < 100000){
            this.price = 100000;
        }
        this.price = price;
        return getPrice();
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    int price;
    String color;
}
