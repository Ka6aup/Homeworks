package homework07Addition;


public class Adult extends Person{
    public Adult(String name, int money, int age, int creditPotential) {
        super(name, money);
        this.age = age;
        this.creditPotential = creditPotential;
    }
    @Override
    public int tryToBySmth(Product currentProduct){
        if(this.getMoney() + creditPotential >= currentProduct.getPrice()){
            this.addProductsToBag(currentProduct);
            this.setMoney(this.getMoney() - currentProduct.getPrice());
            System.out.println(this.getName() + " купил " + currentProduct.getProductName());
            return  0;
        }
        else{
            System.out.println(this.getName() + " - не достаточно средств для покупки " + currentProduct.getProductName());
            return 1;
        }
    }
}
