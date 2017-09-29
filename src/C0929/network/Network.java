package C0929.network;

import java.util.ArrayList;

public class Network {
    public class Member{
        final private String name;
        private ArrayList<Member> friends;
        // 어레이리스트는 길이를 모를때 쓸 수 있음
        public Member(String name){ // 내부에서만 가시성ㅇㅣ 있으면 됨 생성자가 안에서만.
            this.name = name;
            this.friends = new ArrayList<>();
        }
        public void leave(){ // inner class를 이용하는 이유는 부모클래스의 field에 접근하기 위함
            unEnroll(this);// outer.가 생략된 상태임. 바깥쪽 class에 대한 참조

        }

        public boolean belongsTo(Network n){
            return n == Network.this;
        }
    }

    //Network ------------------------------------------------
    private ArrayList<Member> members = new ArrayList<>();

    public Member enroll(String name){
        // this == new Network() == net1 == newMember.outer
        Member newMember = this.new Member(name);
        members.add(newMember);
        return newMember;
    }
    public void unEnroll(Member member){
        members.remove(member);

    }
}
