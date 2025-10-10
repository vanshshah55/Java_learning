class laptop{
    String model;
    int price;

    // public String toString(){
    //     return model + " - " + price;
    // }

    // public boolean equals(laptop that){
    //     return this.model.equals(that.model) && this.price==that.price ;
    // }


    // GENERATED THROUGH SOURCE ACTION
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        laptop other = (laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "laptop [model=" + model + ", price=" + price + "]";
    }

    



    


}

public class a43_ObjectClassequalstoStringhashCode {
    public static void main(String[] args) {
        
        laptop obj = new laptop();
        obj.model = "Lenovo";
        obj.price = 50000;

        laptop obj2 = new laptop();
        obj2.model = "Lenovo";
        obj2.price = 50000;

        boolean result = obj.equals(obj2);

        System.out.println(obj);
        System.out.println(obj.toString());

        System.out.println(result);




    }
}
