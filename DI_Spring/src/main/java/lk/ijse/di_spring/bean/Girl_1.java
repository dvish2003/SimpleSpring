package lk.ijse.di_spring.bean;

import org.springframework.stereotype.Component;

/**
 * Author: vishmee
 * Date: 1/23/25
 * Time: 10:59 AM
 * Description:
 */
@Component
public class Girl_1 implements Aggrement{
    public Girl_1() {
        System.out.println("I am Girl constructor");
    }


    @Override
    public void chat() {
        System.out.println("Chating.............. girl");
    }
}
