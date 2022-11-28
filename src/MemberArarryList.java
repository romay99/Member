import java.util.ArrayList;
import java.util.Scanner;

public class MemberArarryList {
    Scanner sc = new Scanner(System.in);

    //생성자 정의
    private ArrayList<Member> list; // private

    public MemberArarryList(){
        list = new ArrayList<>();
    }

    public void addMember(Member member){
        list.add(member);
    }

    public void removeMember(int id) {
        for (int i = 0; i < list.size(); i++) {
            Member member = list.get(i);
            int tmpid = member.getMemberId();
            if( id == tmpid ){
                list.remove(i);
                System.out.println(id + "회원이 삭제되었습니다.");
                return ;
            }
        }
        System.out.println("회원이 존재하지 않습니다.");

    }

    public void showAllMember(){
        for (Member m : list) {
            System.out.println(m);
        }
    }

}
