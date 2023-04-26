package getAndSetterDemo;

import java.util.ArrayList;
import java.util.List;

public class Disease {
    private String name;
    private boolean curable;

    boolean isCurable(){
        return this.curable;
    }

    public String getName() {
        return name;
    }

    public Disease(String name, boolean curable){
        this.name = name;
        this.curable = curable;
    }

    void setName(String name){
        this.name= name;
    }
    void setCurable(boolean curable){
        this.curable = curable;
    }

    public static void main(String[] args) {
        Disease heart_disease = new Disease("Stroke", true);
        Disease lung_disease = new Disease("COPD", true);
        Disease brain_disease = new Disease("Tumor", true);
        Disease kidney_disease = new Disease("ESRF", true);
        Disease cancer = new Disease("Brain Cancer", false);

    List<Disease> listOfDiseases = new ArrayList<>();
                listOfDiseases.add(heart_disease);
                listOfDiseases.add(lung_disease);
                listOfDiseases.add(brain_disease);
                listOfDiseases.add(kidney_disease);
                listOfDiseases.add(cancer);

        for (Disease disease: listOfDiseases
             )
        if (!disease.isCurable()){
            System.out.println("Is " + disease.getName() + " curable? " + disease.isCurable());
        } else if (disease.curable){
            System.out.println("Very good");
        }

    }


    }




