package org.studyeasy;

import org.studyeasy.phone.Nokia3310;
import org.studyeasy.phone.Phone;
import org.studyeasy.phone.SamSungNote8;

public class Hello {

    public static void main(String[] args) {

        Phone note8 = new Hello().phone(2);
        System.out.println(note8.getModel());
        note8.features();

        Phone nokia3310 = new Hello().phone(1);
        System.out.println(nokia3310.getModel());
        nokia3310.features();

    }
        static public Phone phone(int dailyDriver) {
            switch (dailyDriver)
            {
                case 1: return new Nokia3310("3310");
                case 2: return new SamSungNote8("Note 5");
            }
            return null;
        }
}
