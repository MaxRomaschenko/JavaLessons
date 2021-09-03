package behavioralPatterns.state.main;

public class Bus {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity(){
        if (activity instanceof Rides){
            setActivity(new Stands());
        } else if (activity instanceof Stands){
            setActivity(new LettingPeopleOut());
        } else if (activity instanceof LettingPeopleOut){
            setActivity(new PickUpPeople());
        } else if (activity instanceof PickUpPeople){
            setActivity(new Rides());
        }
    }

    public void working(){
        activity.working();
    }
}
