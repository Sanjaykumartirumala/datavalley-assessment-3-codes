class Organization implements Cloneable
  {
    private int orgCode;
    private String orgName;
    private String orgAddress;

    public Organization(int code, String name, String address) 
    {
        this.orgCode = code;
        this.orgName = name;
        this.orgAddress = address;
    }

    public void displayDetails()
    {
        System.out.println("Organization Code: " + orgCode);
        System.out.println("Organization Name: " + orgName);
        System.out.println("Organization Address: " + orgAddress);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    public static void main(String[] args)
    {
        Organization org = new Organization(123, "Coalition Technologies", "123 Web Street");
        try
          {
            Organization clonedOrg = (Organization) org.clone();
            clonedOrg.displayDetails();
        } catch (CloneNotSupportedException e)
          {
            e.printStackTrace();
        }
    }
}
