public class Sandwich {
    String mainIngredient;
    String breadType;
    double price;


    public String getMainIngredient() {
        return mainIngredient;
    }

    public String getBreadType(){
        return breadType;
    }

    public double getPrice(){
        return price;
    }

    public void setMainIngredient(String mainIngredient){
        this.mainIngredient = mainIngredient;
    }

    public void setBreadType(String breadType){
        this.breadType = breadType;
    }

    public void setPrice(double price){
        this.price = price;
    }
}
