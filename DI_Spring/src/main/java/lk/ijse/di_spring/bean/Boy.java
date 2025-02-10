package lk.ijse.di_spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Author: vishmee
 * Date: 1/23/25
 * Time: 11:00 AM
 * Description:
 */
@Component
public class Boy {
    @Autowired
    Aggrement girl;

    public Boy() {
        System.out.println("I am boy");
    }

    public void chatWithGirl(){
        girl.chat();

    }

}
