import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean cnd = true;
        Scanner sc = new Scanner(System.in);
        MemberArarryList list = new MemberArarryList();

        while (cnd) {
            System.out.println("회원 관리 프로그램");
            System.out.println("1.회원추가");
            System.out.println("2.회원 삭제");
            System.out.println("3.전체 회원 출력");
            System.out.println("4. 프로그램 종료");
            System.out.println("선택하려는 프로그램 번호를 입력해주세요.");
            int sel = sc.nextInt();
            sc.nextLine();

            switch (sel){

                case 1 :
                    System.out.println("추가할 회원의 아이디는?");
                    int id = sc.nextInt();


                    System.out.println("추가할 회원의 이름은?");
                    String name = sc.next();
                    Member m = new Member(id,name);
                    list.addMember(m);
                    break;

                case 2 :
                    System.out.println("삭제할 회원의 아이디는?");
                    id = sc.nextInt();
                    list.removeMember(id);
                    break;

                case 3 :
                    list.showAllMember();
                    break;

                case 4 :
                    cnd = false;
                    System.out.println("프로그램을 종료합니다");

                default:
                    System.out.println("잘못된 입력입니다.");
                    continue;


            }




        }//while
    }
}
