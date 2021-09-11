package structuralPatterns.decorator.test;

public class JavaTeamLead extends Decorator {
    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendReadReport(){
        return "Send week report to customer";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendReadReport();
    }
}
