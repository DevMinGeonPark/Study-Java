// 2번과제

//Scanner
import java.util.Scanner;

public class MenuScript {
    public static void main(String[] args) {
        while(true) {
            PrintMenuInfo();
            //메인에 많이 넣는 것 보다 메서드로 처리하는게 깔끔해보여서 정리하고 boolean값을 받아 결과 판멸
            boolean isDone = MenuChoice();
            //참을 받으면 무한루프 탈출
            if (isDone) {
                break;
            }
            //거짓이면 자동으로 무한루프
        }
    }
    //코드 자체가 길지않아 리소스 사용이 적고 무한루프에서 계속 사용되며 class을 벗어나지 않아 private와 static으로 처리.
    private static void PrintMenuInfo() {
        System.out.println("[메뉴선택]");
        System.out.println("1. 회원 관리");
        System.out.println("2. 과목 관리");
        System.out.println("3. 수강 관리");
        System.out.println("4. 결제 관리");
        System.out.println("5. 종료");
        System.out.print("선택 메뉴 : ");
    }
    //코드 자체가 길지않아 리소스 사용이 적고 무한루프에서 계속 사용되며 class을 벗어나지 않아 private와 static으로 처리.
    private static boolean MenuChoice() {
        //메인에서는 스캐너를 사용하지 않으니 해당 메서드에 선언
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("회원 관리 메뉴를 선택했습니다.");
                break;
            case 2:
                System.out.println("과목 관리 메뉴를 선택했습니다.");
                break;
            case 3:
                System.out.println("수강 관리 메뉴를 선택했습니다.");
                break;
            case 4:
                System.out.println("결제 관리 메뉴를 선택했습니다.");
                break;
            default:
                System.out.println("프로그램을 종료합니다.");
                //return을 만나면 메서드를 벗어나기때문에 break를 작성하지않음.
                return true;
        }
        //switch에서 리턴을 만나지않았으면 무조건 반복이니 false 반환
        return false;
    }
}
