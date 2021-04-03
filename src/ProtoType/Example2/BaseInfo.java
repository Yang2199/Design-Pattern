package ProtoType.Example2;

public class BaseInfo {
    private String address;
    private String parents;

    public BaseInfo(String address, String parents) {
        this.address = address;
        this.parents = parents;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getParents() {
        return parents;
    }

    public void setParents(String parents) {
        this.parents = parents;
    }

    @Override
    public String toString() {
        return "BaseInfo{" +
                "address='" + address + '\'' +
                ", parents='" + parents + '\'' +
                '}';
    }
}
