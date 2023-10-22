
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("\"McDonald's에 오신걸 환영합니다.\"");
        Order.mainMenu();

        while (true) {

            input = scanner.nextLine();
            if (input.equals("1")) {
                // 버거 메뉴 호출
                Order.printBurgersMenus();
                Order.selectburger();
                // 사이드 메뉴 호출
            } else if (input.equals("2")) {
                Order.printSidesMenu();
                Order.selectSides();
                // 음료 메뉴 호출
            } else if (input.equals("3")) {
                Order.printDrinksMenu();
                Order.selectDrinks();
                // 장바구니 호출
            } else if (input.equals("4")) {
                Order.orderScreen();
                // 주문 취소
            } else if (input.equals("5")) {
                Order.cancelScreen();

            } else {
                System.out.println("올바른 값을 입력하세요.");
            }
        }
    }
}