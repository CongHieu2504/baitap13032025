public class Main {
    public static void main(String[] args) {
        Task task = new Task("Design Module", "Pending");

        TeamMember member1 = new TeamMember("Hieu");
        TeamMember member2 = new TeamMember("Duy");

        task.addObserver(member1);
        task.addObserver(member2);

        System.out.println("Status changed 1");
        task.setStatus("In Progress");

        System.out.println("Status changed 2");
        task.setStatus("Completed");
    }
}