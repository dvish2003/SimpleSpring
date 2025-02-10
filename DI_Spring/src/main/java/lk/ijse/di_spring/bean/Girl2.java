package lk.ijse.di_spring.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Author: vishmee
 * Date: 1/23/25
 * Time: 11:19 AM
 * Description:
 */
@Component
@Primary // ekama class dekakat ekm interface e implement wela hind hilght kr penwimt @peimary use kri
 public class Girl2 implements Aggrement {

    public Girl2() {
        System.out.println("Girl 2 Constructor");
    }

    @Override
    public void chat() {
        System.out.println("Chat With Girl 2");
    }
}
