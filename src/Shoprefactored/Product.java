package Shoprefactored;

public abstract class Product {

    private final String producttitle;
    private double factor = 0;
    private int id = -1;
    private boolean uigeleend = true;

    public Product(){
        this.producttitle = "lol";
    }
    public Product(String producttitle, String invuitgeleend ,int index) {
        this.producttitle = producttitle;
        this.setId(index);
        if(invuitgeleend.equals("false")) this.uigeleend = false;

    }

    public Product(String producttitle) {
        this.producttitle = producttitle;
    }

    public String getProducttitle() {
        return producttitle;
    }

    public int getId() {
        return id;
    }

    public double getFactor() { return factor; }

    protected void setFactor(double factor){ this.factor = factor; }

    public abstract int getRentalproduct(int days);

    public void setId(int id) {
        if(this.id == -1) this.id = id;
    }

    public boolean isUigeleend() { return uigeleend; }

    public void setUigeleend() {
        if(!this.uigeleend) uigeleend = true;
        uigeleend = false;
    }
    @Override
    public String toString() {
        return  "producttitle='" + producttitle +
                ", id=" + id;
    }
}
