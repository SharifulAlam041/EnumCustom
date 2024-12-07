package org.example;

public enum EnumSampleOverride implements MyInterface {
    MONDAY {
        @Override
        public void dummyAbstract() {
            System.out.println("Abstract");
        }
    },
    TUESDAY {
        @Override
        public void dummyAbstract() {
            System.out.println("Abstract");
        }
    },
    WEDNESDAY {
        @Override
        public void dummyAbstract() {
            System.out.println("Abstract");
        }
    },
    THURSDAY {
        @Override
        public void dummyAbstract() {
            System.out.println("Abstract");
        }
    },
    FRIDAY {
        @Override
        public void getDummy() {
            System.out.println("Weekend!");
        }
        @Override
        public void dummyAbstract() {
            System.out.println("Abstract");
        }
    },
    SATURDAY {
        @Override
        public void getDummy() {
            System.out.println("Weekend!");
        }
        @Override
        public void dummyAbstract() {
            System.out.println("Abstract");
        }
    },
    SUNDAY {
        @Override
        public void dummyAbstract() {
            System.out.println("Abstract");
        }
    };

    public void getDummy() {
        System.out.println("Weekdays!");
    }
    public abstract void dummyAbstract();//Same thing we can achieve with Interface,In More readable and nice way

    @Override
    public String toLowerCase() {
        return this.name().toLowerCase();
    }
}
