public class Topping {
    private String category;
    private String type;
    private boolean extra;

    public Topping(String category, String type, boolean extra){
        this.category = category;
        this.type = type;
        this.extra = extra;
    }

    public String getCategory(){
        return category;
    }
    public boolean isExtra(){
        return extra;
    }

    public void add(Topping topping) {
    }

}
