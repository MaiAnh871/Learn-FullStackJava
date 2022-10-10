package org.studyeasy.shop;

public class Door {
    private Lock lock = new Lock() {
        @Override
        public boolean isUnlocked(String keyCode) {
            if (keyCode.equals("qwerty")) {
                return true;
            }
            else {
                return false;
            }
        }
    };

    public Lock getLock() {
        return lock;
    }
}
