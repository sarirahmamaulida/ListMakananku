package id.ac.poliban.sari.listmakananku;

class Food {
    private String gambar;
    private String foodName;
    private String foodDesc;

    public Food(String gambar, String foodName, String foodDesc) {
        this.gambar = gambar;
        this.foodName = foodName;
        this.foodDesc = foodDesc;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodDesc() {
        return foodDesc;
    }

    public void setFoodDesc(String foodDesc) {
        this.foodDesc = foodDesc;
    }

    @Override
    public String toString() {
        return String.format("%30s", getFoodName());
    }
}
