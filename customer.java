public class customer {
    public static void main(String[] args) {
        CustomerBuild obj = new CustomerBuild();
        CustomerBuild obj1 = new CustomerBuild("Raj",1200,"thama@gmail.com");
        CustomerBuild obj2 = new CustomerBuild("Thanamai","kalahastithanmai@gmail.com");

        System.out.println(obj2.getEmail());
        System.out.println(obj1.getName());
    }
}
