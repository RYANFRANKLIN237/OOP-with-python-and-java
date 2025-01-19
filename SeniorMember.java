public class SeniorMember extends Member {
    private int fee;

    public SeniorMember(String name, String address, int fee) {
        super(name, address);
        this.fee = fee;
    }

    @Override
    public int getFee() {
        return fee;
    }
}