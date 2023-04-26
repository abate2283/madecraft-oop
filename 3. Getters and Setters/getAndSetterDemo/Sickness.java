package getAndSetterDemo;

import java.util.ArrayList;
import java.util.List;

public class Sickness {
    private String name;
    private boolean curable;
    public Sickness(String name, boolean curable){
        this.name = name;
        this.curable = curable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCurable() {
        return curable;
    }

    public void setCurable(boolean curable) {
        this.curable = curable;
    }
    public String toString(){
        return (name + curable);
    }

    public static void main(String[] args) {
        Sickness breast = new Sickness("Cancer", true);
        Sickness tropical = new Sickness("malaria", true);
        Sickness cough = new Sickness("COPD", true);
        Sickness cold = new Sickness("flu", true);
        Sickness SOB = new Sickness("COVID", false);
        Sickness chestPain = new Sickness("CORONA", false);

        List<Sickness>aSickness = new ArrayList<>();
        aSickness.add(breast);
        aSickness.add(tropical);
        aSickness.add(cold);
        aSickness.add(cough);

        for(Sickness sickness: aSickness)
        System.out.println("What sickness is this? " + breast.getName() + " Is this curable? " + breast.isCurable());
        System.out.println();
    }
}
