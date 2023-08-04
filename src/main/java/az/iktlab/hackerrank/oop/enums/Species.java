package az.iktlab.hackerrank.oop.enums;

public enum Species {
    CAT(false, 4, true),
    DOG(false, 4, true),
    BIRD(true, 2, false),
    FISH(false,0,false),
    ROBOTCAT(false,4,true),
    UNKNOWN;
    private boolean canFly;
    private int numberOfLegs;
    private boolean hasFur;

    Species() {
    }

    Species(boolean canFly, int numberOfLegs, boolean hasFur) {
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public boolean isHasFur() {
        return hasFur;
    }
}
