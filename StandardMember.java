public class StandardMember extends Member {
    private static final int STANDARD_FEE = 30;

    public StandardMember(String name, String address) {
        super(name, address);
    }

    @Override
    public int getFee() {
        return STANDARD_FEE;
    }
}
