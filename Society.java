import java.util.ArrayList;

public class Society {
    private String name;
    private ArrayList<Member> members;

    public Society(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    public void addStandardMember(String name, String address) {
        members.add(new StandardMember(name, address));
    }

    public void addSeniorMember(String name, String address, int fee) {
        members.add(new SeniorMember(name, address, fee));
    }

    public int getFeeTotal() {
        int totalFees = 0;
        for (Member member : members) {
            totalFees += member.getFee();
        }
        return totalFees;
    }

    public void printAllMembers() {
        for (int i = 0; i < members.size(); i++) {
            Member mb = members.get(i);
            System.out.println("i = " + i + " Name = " + mb.getName() +
                    " Address = " + mb.getAddress() + " Fees = " + mb.getFee());
        }
    }
    public String getName(){
        return this.name;
    }
}