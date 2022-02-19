package vladislav.templates;

import vladislav.templates.singleton.Singleton;

/**
 * Author Vladislav Domaniewski
 * This class show my templates in action
 * Version J.0.2
 * For company Andersen Laboratory (C)
 */
public class mainForTemplates {
    public static void main(String[] args) {
        Singleton single = Singleton.getInstance("Moto");
        Singleton singleTwo = Singleton.getInstance("Robot");
        System.out.println(single.getValue());
        System.out.println(singleTwo.getValue());


    }
}
