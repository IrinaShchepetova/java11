package java11;

public class Course {
    private final String[] obstacles;

    public Course(String[] obstacles){
        this.obstacles=obstacles;
    }
    public void doIt(Team team){
        int i;
        for (i=0;i<=team.getPlayers().length;i++){
            int j;
            for (j=0;j<=obstacles.length;i++){
                if (!team.getStatus()) {
                    break;
                }
            }
        }
    }



}
