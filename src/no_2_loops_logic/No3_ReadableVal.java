package no_2_loops_logic;

public class No3_ReadableVal {

    //prefer write-once  variables
    // 变量若可以再多处改动，将难以追踪
    // 不妨使用 不可变对象，这样就没有任何追踪难度了
    final static long birthTime = System.currentTimeMillis();


    // complete task as quickly as possible
    // 速战速决，不妨在方法里早点返回一些特殊值
    int fun(int i) {
        if (i == 5) return 5;
        if (i == 6) return 6;
        return i++;
    }


    public static void main(String[] args) {

        // useless val don't worth keeping
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);

        // 上面两行代码 相当于 下面一行代码 ,而下面一行代码足够清晰

        System.out.println(System.currentTimeMillis());


        // 不要用 变量来控制流程
        boolean done =false;
        while (!done) {
            if (System.currentTimeMillis() - birthTime > 1000) {
                done = true;
            }
        }

        //上面的代码更难理解，可以用break消除done这个变量
        // 大部分情况下都可以消除这种变量
        while (true) {
            if (System.currentTimeMillis() - birthTime > 1000) {
                break;
            }
        }


        // 避免使用全局变量，这些变量的存在会增加理解负担
        // 变量的 score 越小，外界的复杂度越低

    }
}
