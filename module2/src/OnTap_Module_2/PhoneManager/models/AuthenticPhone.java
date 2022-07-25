package OnTap_Module_2.PhoneManager.models;

public class AuthenticPhone extends Phone{
    private int granteeByYear;
    private String granteeByCode;

    public AuthenticPhone(int granteeByYear, String granteeByCode) {
        this.granteeByYear = granteeByYear;
        this.granteeByCode = granteeByCode;
    }

    public AuthenticPhone(int id, String name, double price, String manufacturer, int granteeByYear, String granteeByCode) {
        super(id, name, price, manufacturer);
        this.granteeByYear = granteeByYear;
        this.granteeByCode = granteeByCode;
    }

    @Override
    public String toString() {
        return "AuthenticPhone{" +
                "granteeByYear=" + granteeByYear +
                ", granteeByCode='" + granteeByCode + '\'' +
                '}'+super.toString();
    }
    public String toData(){
        return String.format("%s,%s,%s,0",super.toData(),granteeByYear,granteeByCode);
    }
}
