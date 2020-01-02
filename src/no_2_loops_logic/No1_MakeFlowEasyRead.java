package no_2_loops_logic;

public class No1_MakeFlowEasyRead {


    public static void main(String[] args) {

        // 左边, 想要知道的变量，右边则放置常量，easy to read
        int i = 0;
        if (i < 10){}
        if (10 > i){} // not good


        //if,else 先判断容易判断的,或者说先判断 要紧的
        if (i < 5);
        else;
        //而不是:
        if (5 >= i);
        else;


        // 尽量不要用下面这样的三元运算符,除非真的很很很简单
        int a = i < 5? i+9*67+50 :i - (2 * 7) ;
        // here is more neat.......
        if (i < 5) {
            a = i + 9 * 67 + 50;
        } else {
            a = i - (2 * 7);
        }


        // don't use do--while  statement


        // return early in function


        // 嵌套的层级 越小越好










    }
}
