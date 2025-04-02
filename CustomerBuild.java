public class CustomerBuild {

    private String name;
    private int credit_limit;
    private String email;

    public String getName(){
        return name;
    }

    public int getCredit_limit() {
        return credit_limit;
    }

    public String getEmail() {
        return email;
    }
    public CustomerBuild(String name, int credit_limit, String email){
        this.name = name;
        this.credit_limit = credit_limit;
        this.email = email;
    }
    public CustomerBuild(){
        this("Harsha",1000,"harsharaj2001@gmail.com");
    }
    public CustomerBuild(String name,String email){
        this(name,2000,email);
    }

}
