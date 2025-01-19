public class Main {
    public static void main(String[] args) {
        Society mySociety = new Society("My Professional Society");
        mySociety.addStandardMember("Alice Smith", "123 Main St");
        mySociety.addSeniorMember("Bob Johnson", "456 Oak Ave", 50);
        mySociety.addStandardMember("Charlie Brown", "789 Pine Ln");

        System.out.println("Society Name: "+mySociety.getName());
        System.out.println("Total Fees: " + mySociety.getFeeTotal());
        mySociety.printAllMembers();
    }
}
