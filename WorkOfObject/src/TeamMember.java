public class TeamMember implements TaskObserver {
    private String name;

    public TeamMember(String name) {
        this.name = name;
    }

    @Override
    public void update(String taskName, String status) {
        System.out.println(name + " received update: Task '" + taskName + "' changed status to '" + status + "'.");
    }
}