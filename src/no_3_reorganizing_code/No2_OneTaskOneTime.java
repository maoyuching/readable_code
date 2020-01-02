package no_3_reorganizing_code;

public class No2_OneTaskOneTime {

    //  当一个方法里 代码变得交织在一起，把任务拆解成 有序的子任务
    // 然后一个一个写
    // 这时可能会增加一些中间变量，以便把交织在一起的代码分开来
    void fun() {
        // task: 设置两个时间
        long now1 = System.currentTimeMillis();
        long now2 = System.currentTimeMillis();

        // task: 打印两个时间
        System.out.println(now1);
        System.out.println(now2);
    }


}
