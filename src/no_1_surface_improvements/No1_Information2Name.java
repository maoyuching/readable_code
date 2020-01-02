package no_1_surface_improvements;

public class No1_Information2Name {

//    代码易读 就是 让别人 最快理解
//    别人 也可能是几天以后 的你
//    代码易读 不是 代码量最少，而是理解的时间最少


    void getPage(){}
    void  downloadPage(){}
//  get 太宽泛， 而 download 则专用 得多


    int sum() {
       int ans = 0;
       int sum_squares = 0;
//     ans 表意不清, 而， sum_squares 则表达了 变量的含义

        for (int ci = 0; ci < 5; ci++) {
            for (int mi = 0; mi < 9; mi++) {
                System.out.println("hi");
            }
        }
//        用i j k 会造成混淆，不如 在i 前面增加信息
       return  sum_squares;
    }


    String id = "af8";
    String hex_id = "af8";
//    单单用id 表达不了这是一个十六进制的id ，不妨附加上信息


    int start_ms = 10;
//    表示数量的变量 不妨带上 单位
//    尽可能 给名字附加上 信息，形成类似于偏正短语一样的名字


    {
        int m = 1;
        m += 1;
        System.out.println(m);
    }
//    变量m的范围非常小，即使变量没有详细的名字也没关系，反正一两行就看完了，反之，名字要足够详细


    Object BEManager;
//    这是什么鬼。。。。。反正，除了常用的简写如Str，eval之外，不要用简写，缩写




}
