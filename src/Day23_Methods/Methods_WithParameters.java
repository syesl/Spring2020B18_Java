package Day23_Methods;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Methods_WithParameters {
    public static void main(String[] args) {
        EligibleToBuyAlcohol(45); // explicit casting

    }

    public static void EligibleToBuyAlcohol(int age) {
        if (age >= 21) {
            System.out.println("Eligible to buy alcohol");
        } else {
            System.out.println("Eligible to buy milk");
        }

    }
}
