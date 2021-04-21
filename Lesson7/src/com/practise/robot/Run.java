package com.practise.robot;


import com.practise.robot.hands.IHand;
import com.practise.robot.hands.SamsungHand;
import com.practise.robot.hands.SonyHand;
import com.practise.robot.hands.ToshibaHand;
import com.practise.robot.heads.IHead;
import com.practise.robot.heads.SamsungHead;
import com.practise.robot.heads.SonyHead;
import com.practise.robot.heads.ToshibaHead;
import com.practise.robot.legs.ILeg;
import com.practise.robot.legs.SamsungLeg;
import com.practise.robot.legs.SonyLeg;
import com.practise.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        IHead headSony = new SonyHead();
        IHead headSamsung = new SamsungHead();
        IHead headToshiba = new ToshibaHead();

        IHand handSamsung = new SamsungHand();
        IHand handSony = new SonyHand();
        IHand handToshiba = new ToshibaHand();

        ILeg legSamsung = new SamsungLeg();
        ILeg legSony = new SonyLeg();
        ILeg legToshiba = new ToshibaLeg();

        System.out.println("My first robot:");
        Robot robot1 = new Robot(headSony, handSamsung, legToshiba);
        robot1.action();
        System.out.println();

        System.out.println("My second robot:");
        Robot robot2 = new Robot(headSamsung, handToshiba, legSony);
        robot2.action();
        System.out.println();

        System.out.println("My third robot:");
        Robot robot3 = new Robot(headToshiba, handSony, legSamsung);
        robot3.action();
        System.out.println();

        System.out.println("Who cost more?");
        System.out.println(maxCost(robot1.getPrice(), robot2.getPrice(), robot3.getPrice()));


       /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
    }

    static int maxCost(int first, int second, int third) {
        if (first > second && first > third) {
            System.out.println("First Robot most expensive");
            return first;
        } else if (second > first && second > third) {
            System.out.println("Second Robot most expensive");
            return second;
        } else {
            System.out.println("Third Robot most expensive");
            return third;
        }

    }

}
