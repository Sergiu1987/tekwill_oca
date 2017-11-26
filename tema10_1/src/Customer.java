public class Customer {
    private String name;
    private String ssn;

    public String getName() {
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public String getSsn(){
        return ssn;
    }

    public Customer(String name, String ssn){
        this.name = name;
        this.ssn = ssn;
    }
}
