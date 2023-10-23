package Project1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Order> list = new ArrayList<Order>();
        double total = 0;

        while (true) {

            Coment.coment();

            Scanner sc = new Scanner(System.in);

            String[] menus = new String[]{"Burgers", "Foren Custard", "Drink", "Beer", "Order", "Cancel"};
            String[] exp = new String[]{"앵거스 비프 통살을 다져만든 버거", "매장에서 신선하게 만드는 아이스크림", "매장에서 직접 만드는 음료",
                    "뉴욕 브루클린 브루어리에서 양조한 맥주", "장바구니를 확인 후 주문합니다.",
                    "진행중인 주문을 취소합니다."};
            Menu[] menuSet = new Menu[6];

            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menus.length; i++) {
                Menu menu = new Menu(menus[i], exp[i]);
                menuSet[i] = menu;
                System.out.print((i + 1) + ". ");
                menu.printing(menu.name, menu.exp);
                if (i == 3) {
                    System.out.println();
                    System.out.println("[ ORDER MENU ]");
                }
            }
            int select1 = sc.nextInt();

            if (select1 == 1) {
                System.out.println("[ " + menuSet[0].name + " MENU ]");
                String[] burgers = new String[]{"ShackBurger", "SmokeShack", "Shroom Burger", "Cheesburger", "Hamburger"};
                double[] prices = new double[]{6.9, 8.9, 9.4, 6.9, 5.4};
                String[] burger_exp = new String[]{"토마토, 양상추, 쉑소스가 토핑된 치즈버거", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거",
                        "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", "비프패티를 기반으로 야채가 들어간 기본버거"};
                Goods[] burgerSet = new Goods[5];

                for (int i = 0; i < burgers.length; i++) {
                    Goods goods = new Goods(burgers[i], burger_exp[i], prices[i]);
                    burgerSet[i] = goods;
                    System.out.print((i + 1) + ". ");
                    goods.printing(burgers[i], burger_exp[i], prices[i]);
                }
                int select2 = sc.nextInt();

                switch (select2) {
                    case 1:
                        burgerSet[0].printing(burgerSet[0].name, burgerSet[0].exp, burgerSet[0].price);
                        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                        System.out.println("1. 확인        2. 취소");
                        break;
                    case 2:
                        burgerSet[1].printing(burgerSet[1].name, burgerSet[1].exp, burgerSet[1].price);
                        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                        System.out.println("1. 확인        2. 취소");
                        break;
                    case 3:
                        burgerSet[2].printing(burgerSet[2].name, burgerSet[2].exp, burgerSet[2].price);
                        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                        System.out.println("1. 확인        2. 취소");
                        break;
                    case 4:
                        burgerSet[3].printing(burgerSet[3].name, burgerSet[3].exp, burgerSet[3].price);
                        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                        System.out.println("1. 확인        2. 취소");
                        break;
                    case 5:
                        burgerSet[4].printing(burgerSet[4].name, burgerSet[4].exp, burgerSet[4].price);
                        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                        System.out.println("1. 확인        2. 취소");
                        break;
                    default:
                        System.out.println("잘못된 입력 값입니다. 종료합니다.");
                        break;
                }
                int select3 = sc.nextInt();
                if (select3 == 1) {
                    System.out.println(burgerSet[select2 - 1].name + " 가 장바구니에 추가되었습니다.");
                    total += burgerSet[select2 - 1].price;
                    Order orders = new Order(burgerSet[select2 - 1].name, burgerSet[select2 - 1].exp, burgerSet[select2 - 1].price);
                    list.add(orders);
                } else {
                    System.out.println("기존 화면으로 돌아갑니다.");
                }
            }
            else if(select1 == 5){
                System.out.printf("아래와 같이 주문하시겠습니까?\n\n");
                System.out.println("[ Orders ]");
                for(int i=0; i<list.size(); i++){
                    Order od = (Order) list.get(i);
                    System.out.printf("%-13s | %2.1f | %s\n", od.getName(), od.getPrice(), od.getExp());
                }
                System.out.println("[ ToTal ]");
                System.out.printf("%.1f"+"\n\n", total);
                System.out.println("1. 주문      2. 메뉴판");
                int select4 = sc.nextInt();
            }
            else if(select1 == 6){
                System.out.println("주문을 취소합니다. 이용해주셔서 감사합니다.");
                break;
            }
            else{
                System.out.println("준비중인 기능입니다.");
            }
        }
    }
}
