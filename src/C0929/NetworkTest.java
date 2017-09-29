package C0929;

import C0929.network.Network;
import C0929.network.Network2;

public class NetworkTest {
    static public void main (String[] arg){
        Network net1 = new Network();
        Network net2 = new Network();
        //Network.Member mem1 = new Network.Member("fred"); // 중첩클래스처럼 그냥 만들 수 없음. outer class만들 수 없음.

        Network.Member fred = net1.enroll("fred");

        Network.Member jane = net1.new Member("jane"); // outer를 설정해줌. net1.new

        System.out.println(fred.belongsTo(net1));


        Network2 n1 = new Network2();
        Network2 n2 = new Network2();
        Network2.Member a = n1.enroll("a");
        a.leave();
        Network2.Member b = new Network2.Member(n1,"b");
        Network2.Member c = new Network2.Member(n2,"b");

    }
}

