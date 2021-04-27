package com.practise.robot;

import com.practise.robot.hands.IHand;
import com.practise.robot.heads.IHead;
import com.practise.robot.legs.ILeg;

import java.util.Scanner;

public class Robot implements IRobot {
    private IHead head;
    private IHand hand;
    private ILeg leg;
    private int price;
    private Scanner scanner = new Scanner(System.in);

    public Robot(IHead head, IHand hand, ILeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public IHead getHead() {
        return head;
    }

    public void setHead(IHead head) {
        this.head = head;
    }

    public IHand getHand() {
        return hand;
    }

    public void setHand(IHand hand) {
        this.hand = hand;
    }

    public ILeg getLeg() {
        return leg;
    }

    public void setLeg(ILeg leg) {
        this.leg = leg;
    }


    @Override
    public void action() {
        System.out.println("Введите номер действия: ");
        int num = scanner.nextInt();
        while (num < 0 && num > 4) {
            num = scanner.nextInt();
        }

        switch (num) {
            case 1:
                head.speek();
                break;
            case 2:
                hand.upHand();
                break;
            case 3:
                leg.step();
                break;
        }
    }


    @Override
    public int getPrice() {
        return head.getPrice() + hand.getPrice() + leg.getPrice();
    }
}
