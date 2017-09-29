package C0929;

import C0929.network.Network;

public class NetworkTest {
    static public void main (String[] arg){
        Network net1 = new Network();
        Network net2 = new Network();
        //Network.Member mem1 = new Network.Member("fred"); // 중첩클래스처럼 그냥 만들 수 없음. outer class만들 수 없음.

        Network.Member fred = net1.enroll("fred");

        Network.Member jane = net1.new Member("jane"); // outer를 설정해줌. net1.new

        System.out.println(fred.belongsTo(net1));

    }
}

