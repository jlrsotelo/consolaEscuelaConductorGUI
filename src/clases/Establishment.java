package clases;

public class Establishment {
    private Long cEstablishment;
    private String cUbigeo;
    private String nRuc;
    private String type;
    private String name;
    private String address;
    private String state;
    private String email;
    private String phone;

    public Establishment() {
    }

    public Establishment(Long cEstablishment, String cUbigeo, String nRuc, String type, String name, String address, String state, String email, String phone) {
        this.cEstablishment = cEstablishment;
        this.cUbigeo = cUbigeo;
        this.nRuc = nRuc;
        this.type = type;
        this.name = name;
        this.address = address;
        this.state = state;
        this.email = email;
        this.phone = phone;
    }

    public Long getcEstablishment() {
        return cEstablishment;
    }

    public void setcEstablishment(Long cEstablishment) {
        this.cEstablishment = cEstablishment;
    }

    public String getcUbigeo() {
        return cUbigeo;
    }

    public void setcUbigeo(String cUbigeo) {
        this.cUbigeo = cUbigeo;
    }

    public String getnRuc() {
        return nRuc;
    }

    public void setnRuc(String nRuc) {
        this.nRuc = nRuc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Establishment{" +
                "cEstablishment=" + cEstablishment +
                ", cUbigeo='" + cUbigeo + '\'' +
                ", nRuc='" + nRuc + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", state='" + state + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
