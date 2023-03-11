class This_method
{
    private String Brand;
    private int quantity;

    public void setBrand(String Brand) //setter
    {       
        this.Brand=Brand;
    }
    public void setQuantity(int quantity)
    {
        this.quantity=quantity;
    }

    public String getBrand() //getter
    {
        return Brand;
    }
    public int getQuantity()
    {
        return quantity;
    }
}
 class ice_cream{ 
    public static void main(String[] args) {
        This_method Shop=new This_method();
        Shop.setBrand("Amul");
        Shop.setQuantity(2);

        System.out.println("Ice-cream brand is " +Shop.getBrand());                 //output is:-
        System.out.println("Having quantity is "+Shop.getQuantity() +" liters");            //Ice-cream brand is Amul
                                                                                            //Having quantity is 2 liters
    }                                                                               
}                                                          
