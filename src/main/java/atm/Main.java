package atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//        Bank bankXYZ = new Bank("XYZ bank", new DataSourceDB());
//        Bank bankABC = new Bank("ABC bank", new DataSourceFile("customersABC.txt"));
//        ATM atm = new ATM(bankABC);

        //ApplicationContext context = new AnnotationConfigApplicationContext(ATMConfig.class);
        //ใช้กับ code config

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        AtmUI atmUI = context.getBean(AtmUI.class);
        atmUI.run();
    }
}
