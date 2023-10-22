import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// 주문 클래스
class Order {
    static Scanner scanner = new Scanner(System.in);

    static String input;
    // 사용자 입력값
    private static List<McdonaldsMenu> cart = new ArrayList<>();
    // 장바구니

    private static int orderNumber = 0;
    // 주문번호

    // 버거 메뉴
    static McdonaldsMenu bigMac = new McdonaldsMenu("Big Mac", "패티 두 장에 빅맥만의 특별한 소스. 버거의 대명사.", 6000);
    static McdonaldsMenu shanghaiBurger = new McdonaldsMenu("Shanghai Burger", "닭가슴 통살 위에 양상추와 토마토. 입맛도 기분도 화끈하게!", 6000);
    static McdonaldsMenu quarterPounderCheese = new McdonaldsMenu("Quarter Pounder Cheese", "순 쇠고기 패티와 부드러운 치즈 두 장의 환상궁합!", 6300);

    // 사이드 메뉴
    static McdonaldsMenu frenchFries = new McdonaldsMenu("French Fries", "맥도날드의 역사가 담긴 월드 클래스 후렌치 후라이.", 2800);
    static McdonaldsMenu mcNuggets = new McdonaldsMenu("McNuggets", "바삭하고 촉촉한 치킨이 한 입에 쏙", 3300);
    static McdonaldsMenu cheeseSticks = new McdonaldsMenu("Cheese Sticks", "모짜렐라 치즈로 빈틈 없이 고소한 맥도날드 치즈스틱.", 3300);

    // 음료 메뉴
    static McdonaldsMenu coke = new McdonaldsMenu("Coke", "코카콜라", 2400);
    static McdonaldsMenu sprite = new McdonaldsMenu("Sprite", "스프라이트", 2400);
    static McdonaldsMenu fanta = new McdonaldsMenu("Fanta", "환타 오렌지맛", 2400);




    public static void mainMenu() {
        // 메인 메뉴판 출력
        System.out.println("아래 메뉴를 보시고 상품을 골라 '번호'를 입력해주세요.");
        System.out.println();
        System.out.println("[ MENU ]");
        System.out.println("1. Burgers     | 주문 즉시 바로 조리해 더욱 맛있는, 맥도날드의 다양한 버거를 소개합니다.");
        System.out.println("2. Sides       | 가볍게 즐겨도, 버거와 함께 푸짐하게 즐겨도, 언제나 맛있는 사이드 메뉴!");
        System.out.println("3. Drinks      | 언제나 즐겁게, 다양한 음료를 부담없이 즐기세요!");
        System.out.println();
        System.out.println("[ ORDER MENU ]");
        System.out.println("4. Order       | 장바구니를 확인 후 주문합니다.");
        System.out.println("5. Cancel      | 진행중인 주문을 취소합니다.");
    }

    public static void printBurgersMenus() {
        // 버거 메뉴판 출력
        System.out.println("아래 메뉴를 보시고 상품을 골라 '번호'를 입력해주세요.");
        System.out.println();
        System.out.println("[ Burgers MENU ]");
        System.out.println();
        System.out.println("1. Big Mac                | W 6000 | 패티 두 장에 빅맥만의 특별한 소스. 버거의 대명사.");
        System.out.println("2. Shanghai Burger        | W 6000 | 닭가슴 통살 위에 양상추와 토마토. 입맛도 기분도 화끈하게!");
        System.out.println("3. Quarter Pounder Cheese | W 6300 | 순 쇠고기 패티와 부드러운 치즈 두 장의 환상궁합!");
        }


    public static void selectburger() { // 버거 메뉴 선택 및 장바구니에 추가
        input = scanner.nextLine();
        if (input.equals("1")) {
            purchaseScreen();
            if (input.equals("1")) {

                cart.add(bigMac);
                System.out.println("상품이 장바구니에 추가되었습니다!");
                try {
                    Thread.sleep(1000); // 1초 대기
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                new Thread(() -> {
                    mainMenu(); // 1초 후에 메인 메뉴 호출
                }).start();

            } else if (input.equals("2")) {

                System.out.println("취소 하였습니다.");
                printBurgersMenus();
                selectburger();

            } else {
                System.out.println("올바른 값을 입력하세요.");
                printBurgersMenus();
                selectburger();
            }

        } else if (input.equals("2")) {
            purchaseScreen();
            if (input.equals("1")) {

                cart.add(shanghaiBurger);
                System.out.println("상품이 장바구니에 추가되었습니다!");
                try {
                    Thread.sleep(1000); // 1초 대기
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                new Thread(() -> {
                    mainMenu(); // 1초 후에 메인 메뉴 호출
                }).start();

            } else if (input.equals("2")) {

                System.out.println("취소 하였습니다.");
                printBurgersMenus();
                selectburger();

            } else {
                System.out.println("올바른 값을 입력하세요.");
                printBurgersMenus();
                selectburger();
            }

        } else if (input.equals("3")) {
            purchaseScreen();
            if (input.equals("1")) {

                cart.add(quarterPounderCheese);
                System.out.println("상품이 장바구니에 추가되었습니다!");
                try {
                    Thread.sleep(1000); // 1초 대기
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                new Thread(() -> {
                    mainMenu(); // 1초 후에 메인 메뉴 호출
                }).start();

            } else if (input.equals("2")) {

                System.out.println("취소 하였습니다.");
                printBurgersMenus();
                selectburger();

            } else {
                System.out.println("올바른 값을 입력하세요.");
                printBurgersMenus();
                selectburger();
            }

        } else {
            System.out.println("올바른 값을 입력하세요.");
            printBurgersMenus();
            selectburger();
        }
    }

    public static void printSidesMenu() {
        // 사이드 메뉴판 출력
        System.out.println("아래 메뉴를 보시고 상품을 골라 '번호'를 입력해주세요.");
        System.out.println();
        System.out.println("[ Sides MENU ]");
        System.out.println();
        System.out.println("1. French Fries    | W 2800 | 맥도날드의 역사가 담긴 월드 클래스 후렌치 후라이.");
        System.out.println("2. McNuggets       | W 3300 | 바삭하고 촉촉한 치킨이 한 입에 쏙!");
        System.out.println("3. Cheese Sticks   | W 3300 | 모짜렐라 치즈로 빈틈 없이 고소한 맥도날드 치즈스틱.");
    }

    public static void selectSides() {
        // 사이드 메뉴 선택 및 장바구니에 추가
        input = scanner.nextLine();
        if (input.equals("1")) {
            purchaseScreen();
            if (input.equals("1")) {

                cart.add(frenchFries);
                System.out.println("상품이 장바구니에 추가되었습니다!");
                try {
                    Thread.sleep(1000); // 1초 대기
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                new Thread(() -> {
                    mainMenu(); // 1초 후에 메인 메뉴 호출
                }).start();

            } else if (input.equals("2")) {

                System.out.println("취소 하였습니다.");
                printSidesMenu();
                selectSides();

            } else {

                System.out.println("올바른 값을 입력하세요.");
                printSidesMenu();
                selectSides();
            }

        } else if (input.equals("2")) {
            purchaseScreen();
            if (input.equals("1")) {

                cart.add(mcNuggets);
                System.out.println("상품이 장바구니에 추가되었습니다!");
                try {
                    Thread.sleep(1000); // 1초 대기
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                new Thread(() -> {
                    mainMenu(); // 1초 후에 메인 메뉴 호출
                }).start();

            } else if (input.equals("2")) {

                System.out.println("취소 하였습니다.");
                printSidesMenu();
                selectSides();

            } else {
                System.out.println("올바른 값을 입력하세요.");
                printSidesMenu();
                selectSides();
            }

        } else if (input.equals("3")) {
            purchaseScreen();
            if (input.equals("1")) {

                cart.add(cheeseSticks);
                System.out.println("상품이 장바구니에 추가되었습니다!");
                try {
                    Thread.sleep(1000); // 1초 대기
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                new Thread(() -> {
                    mainMenu(); // 1초 후에 메인 메뉴 호출
                }).start();

            } else if (input.equals("2")) {

                System.out.println("취소 하였습니다.");
                printSidesMenu();
                selectSides();

            } else {
                System.out.println("올바른 값을 입력하세요.");
                printSidesMenu();
                selectSides();
            }

        } else {
            System.out.println("올바른 값을 입력하세요.");
            printSidesMenu();
            selectSides();
        }
    }

    public static void printDrinksMenu() {
        // 음료 메뉴판 출력
        System.out.println("아래 메뉴를 보시고 상품을 골라 '번호'를 입력해주세요.");
        System.out.println();
        System.out.println("[ Drinks MENU ]");
        System.out.println();
        System.out.println("1. Coke   | W 2400 | 코카콜라");
        System.out.println("2. Sprite | W 2400 | 스프라이트");
        System.out.println("3. Fanta  | W 2400 | 환타 오렌지맛");
    }

    public static void selectDrinks() {
        // 음료 메뉴 선택 및 장바구니에 추가
        input = scanner.nextLine();
        if (input.equals("1")) {
            purchaseScreen();
            if (input.equals("1")) {

                cart.add(coke);
                System.out.println("상품이 장바구니에 추가되었습니다!");
                try {
                    Thread.sleep(1000); // 1초 대기
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                new Thread(() -> {
                    mainMenu(); // 1초 후에 메인 메뉴 호출
                }).start();

            } else if (input.equals("2")) {

                System.out.println("취소 하였습니다.");
                printDrinksMenu();
                selectDrinks();

            } else {

                System.out.println("올바른 값을 입력하세요.");
                printDrinksMenu();
                selectDrinks();
            }

        } else if (input.equals("2")) {
            purchaseScreen();
            if (input.equals("1")) {

                cart.add(sprite);
                System.out.println("상품이 장바구니에 추가되었습니다!");
                try {
                    Thread.sleep(1000); // 1초 대기
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                new Thread(() -> {
                    mainMenu(); // 1초 후에 메인 메뉴 호출
                }).start();

            } else if (input.equals("2")) {

                System.out.println("취소 하였습니다.");
                printDrinksMenu();
                selectDrinks();

            } else {
                System.out.println("올바른 값을 입력하세요.");
                printDrinksMenu();
                selectDrinks();
            }

        } else if (input.equals("3")) {
            purchaseScreen();
            if (input.equals("1")) {

                cart.add(fanta);
                System.out.println("상품이 장바구니에 추가되었습니다!");
                try {
                    Thread.sleep(1000); // 1초 대기
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                new Thread(() -> {
                    mainMenu(); // 1초 후에 메인 메뉴 호출
                }).start();

            } else if (input.equals("2")) {

                System.out.println("취소 하였습니다.");
                printDrinksMenu();
                selectDrinks();

            } else {
                System.out.println("올바른 값을 입력하세요.");
                printDrinksMenu();
                selectDrinks();
            }

        } else {
            System.out.println("올바른 값을 입력하세요.");
            printDrinksMenu();
            selectDrinks();
        }
    }

    public static void purchaseScreen() {
        // 선택 상품 구매여부 확인
        System.out.println("이 상품을 장바구니에 담으시겠습니까?");
        System.out.println();
        System.out.println("1. Yes");
        System.out.println("2. No");
        input = scanner.nextLine();
    }
        public static void orderScreen() {
            // 장바구니 출력 및 주문
            System.out.println("아래와 같이 주문 하시겠습니까?");
            System.out.println();
            System.out.println("[ Orders ]");

            // 장바구니 목록 출력
            for (McdonaldsMenu item : cart) {
                System.out.println(item.getName());
            }
            System.out.println();
            System.out.println("[ Total Price ]");

            // 장바구니 목록의 가격 총합 출력
            int totalPrice = 0;
            for (McdonaldsMenu item : cart) {
                totalPrice += item.getPrice();
            }
            System.out.println("W " + totalPrice);
            System.out.println();
            System.out.println("1. 주문 확정");
            System.out.println("2. 메인 메뉴");
            input = scanner.nextLine();
            if (input.equals("1")) {
                orderCompleteScreen();
            } else if (input.equals("2")) {
                mainMenu();
            } else {
                System.out.println("올바른 값을 입력하세요.");
                orderScreen();
            }

        }

        public static void orderCompleteScreen() {
            // 주문 확정: 대기번호 출력 및 장바구니 초기화
            ++orderNumber;
            cart.clear();
            System.out.println("주문이 완료되었습니다!");
            System.out.println();
            System.out.println("대기번호는 [ " + orderNumber + " ] 번 입니다.");
            System.out.println("(3초 후 메뉴판으로 돌아갑니다.)");

            try {
                Thread.sleep(3000); // 3초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            new Thread(() -> {
                mainMenu(); // 3초 후에 메인 메뉴 호출
            }).start();
        }

        public static void cancelScreen() {
        // 주문 취소 화면 출력
            System.out.println("진행하던 주문을 취소 하시겠습니까?");
            System.out.println("1. 확인");
            System.out.println("2. 취소");

            input = scanner.nextLine();
            if (input.equals("1")) {
                cart.clear();
                System.out.println("진행하던 주문이 취소 되었습니다.");
                try {
                    Thread.sleep(1000); // 1초 대기
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                new Thread(() -> {
                    mainMenu(); // 1초 후에 메인 메뉴 호출
                }).start();
            } else if (input.equals("2")) {
                mainMenu();
            }
        }
}
