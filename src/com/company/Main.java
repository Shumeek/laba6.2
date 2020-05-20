package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int num;
        Server serv = new Server(4, 20);

        Bicycle b;
        Car c;
        Roll r;
        Jumpers j;

        for (int i = 0; i < 20; i++) {
            num = random.nextInt(4);
            switch (num) {
                case 0:
                    c = new Car(i);
                    serv.addTransport(0, c, i);
                    break;
                case 1:
                    r = new Roll(i);
                    serv.addTransport(1, r, i);
                    break;
                case 2:
                    b = new Bicycle(i);
                    serv.addTransport(2, b, i);
                    break;
                case 3:
                    j = new Jumpers(i);
                    serv.addTransport(3, j, i);
                    break;
            }
        }

        int veh[] = serv.getCountVehicles();
        System.out.println("Машин:       " + veh[0]);
        System.out.println("Роликов:     " + veh[1]);
        System.out.println("Велосипедов: " + veh[2]);
        System.out.println("Джамперов:   " + veh[3]);
        // write your code here

        System.out.println("_____________________________________________________________________");

        Bus m1;
        Tractor m2;
        TractorCrawler m3;
        TractorWheeled m4;
        ServerMachines sm = new ServerMachines(4,20);

        for(int i=0;i<20;i++) {
            num = random.nextInt(4);
            switch (num) {
                case 0:
                    m1 = new Bus("Автобус",322.32,99.9,28);
                    sm.addTransport(num,m1);
                    break;
                case 1:
                    m2 = new Tractor("Трактор обычный",32322.32,919.9,2,"xz");
                    sm.addTransport(num,m2);
                    break;
                case 2:
                    m3 = new TractorCrawler("Трактор-ползун",32622.32,119.9,2,"xz");
                    sm.addTransport(num,m3);
                    break;
                case 3:
                    m4 = new TractorWheeled("Трактор с колесами",31122.32,219.9,2,"xz");
                    sm.addTransport(num,m4);
                    break;
            }
        }

        int mach[] = sm.getCountVehicles();
        System.out.println("Автобусов всего: " + mach[0]);
        System.out.println("Тракторов всего: " + mach[1]);
        System.out.println("Тракторов-ползунов всего: " + mach[2]);
        System.out.println("Трактор с колесами всего: " + mach[3]);
    }
}

