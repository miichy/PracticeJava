package pattern.proxy;

public class IvoryTower implements WizardTower{
    @Override
    public void enter(Wizard wizard) {
        System.out.println( wizard + "  actuarly do entering action!");
    }
}
