package week02;

import java.util.Objects;
import java.util.Scanner;

public class W03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A 입력 : ");   // A 입력
        String aHand = sc.nextLine();

        System.out.print("B 입력 : ");   // B 입력
        String bHand = sc.nextLine();


        // 두 개의 값을 비교하는 메서드 => Object.equals(좌, 우) : 좌 우가 같은 경우 true, 다른 경우 false
        if (Objects.equals(aHand, "가위")) {
            if (Objects.equals(bHand, "가위")) {
                System.out.println("비겼습니다. ");
            } else if (Objects.equals(bHand,"바위")) {
                System.out.println("B가 이겼습니다. ");
            } else if (Objects.equals(bHand,"보")) {
                System.out.println("A가 이겼습니다. ");
            } else {
                System.out.println("B유저가 값을 잘못 입력하셨습니다.");
            }
        } else if (Objects.equals(aHand, "바위")) {
            if (Objects.equals(bHand, "가위")) {
                System.out.println("A 가 이겼습니다.");
            } else if (Objects.equals(bHand, "바위")) {
                System.out.println("A 와 B 는 비겼습니다.");
            } else if (Objects.equals(bHand, "보")) {
                System.out.println("B 가 이겼습니다.");
            } else {
                System.out.println("B유저가 값을 잘못 입력하셨습니다.");
            }
        } else if (Objects.equals(aHand, "보")) {
            if (Objects.equals(bHand, "가위")) {
                System.out.println("B 가 이겼습니다.");
            } else if (Objects.equals(bHand, "바위")) {
                System.out.println("A 가 이겼습니다.");
            } else if (Objects.equals(bHand, "보")) {
                System.out.println("A 와 B 는 비겼습니다.");
            } else {
                System.out.println("B유저가 값을 잘못 입력하셨습니다.");
            }
        }

    }
}
