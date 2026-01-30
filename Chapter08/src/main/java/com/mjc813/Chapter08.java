package com.mjc813;

public class Chapter08 {
    public void RemoteControlEx() {
        RemoteControl rc;
        rc = new Television();
        rc.turnOn();


        rc = new Audio();
        rc.turnOn();
    }

    public void RemoteControlEx2() {
        System.out.println("리모콘 최대 볼륨: " + RemoteControl.MAX_VOLUME);
        System.out.println("리모콘 최소 볼륨: " + RemoteControl.MIN_VOLUME);
    }

    public void RemoteControlEx3() {
        RemoteControl rc;

        rc = new Television();
        rc.turnOn();
//        rc.setVolume(5);
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
//        rc.setVolume(5);
        rc.turnOff();

//        rc.setMute(true);
//        rc.setMute(false);

        System.out.println();

        rc = new Audio();
        rc.turnOn();
//        rc.setVolume(5);
//
//        rc.setMute(true);
//        rc.setMute(false);

        System.out.println();

        RemoteControl.changeBattery();
    }

    public void ServiceEx() {
        Service service = new ServiceImpl();

        service.defaultMethod1();
        System.out.println();
        service.defaultMethod2();
        System.out.println();

        Service.staticMethod1();
        System.out.println();
        Service.staticMethod2();
        System.out.println();
    }

    public void MultiInterfaceImplEx() {
        RemoteControl rc = new SmartTelevision();

        rc.turnOn();
        rc.turnOff();

        Searchable searchable = new SmartTelevision();

        searchable.search("https://www.youtube.com");
    }

    public void ExtendsEx() {
        InterfaceCImpl impl = new InterfaceCImpl();

        InterfaceA ia = impl;
        ia.methodA();
        System.out.println();

        InterfaceB ib = impl;
        ib.methodB();
        System.out.println();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }

    public void CastingEx() {
        Vehicle vehicle = new Bus();

        vehicle.run();

        Bus bus = (Bus) vehicle;
        bus.run();
//        bus.checkFare();
    }

    public void CarEx() {
        Car myCar = new Car();

        myCar.run();

        myCar.tire1 = new KumhoTire();
        myCar.tire2 = new KumhoTire();

        myCar.run();
    }

    public void DriverEx() {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);
        driver.drive(taxi);
    }

    public void InstanceofEx() {
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        ride(taxi);
        System.out.println();
        ride(bus);
    }

    public void ride(Vehicle vehicle) {

        if(vehicle instanceof Bus bus) {
            bus.checkFare();
        }

        vehicle.run();
    }

    public void SealedEx() {
        ImplClass impl = new ImplClass();

        InterfaceA ia = impl;
        ia.methodA();

        System.out.println();

        InterfaceB ib = impl;
        ib.methodA();
        ib.methodB();

        System.out.println();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
