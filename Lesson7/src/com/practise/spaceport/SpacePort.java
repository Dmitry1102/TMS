package com.practise.spaceport;

public class SpacePort {
    private IStart start;

    public IStart getStart() {
        return start;
    }

    public void setStart(IStart start) {
        this.start = start;
    }

    public void startSpacePort(IStart iStart) {
        if (iStart.checkOutSystem()) {
            iStart.startEngine();
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
            }
            iStart.start();
        } else {
            System.out.println("Предстартовая проверка провалена:");
        }

    }


}
