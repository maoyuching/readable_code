package no_1_surface_improvements;

public interface No2_AvoidMisconstrued {

    int[] fliter(int[] i);

    int[] select(int[] i);

    int[] exclude(int[] i);
//    filter 有歧义，到底是select 还是 exclude, 最好避免歧义


    int CART_LIMIT = 5; // not good
    int MAX_ITEMS_IN_CART = 5;
//    用max，min前缀，可以避免到底是> 还是 >= 的 歧义，max 就是包含等于的


    int first = 0;
    int last = 4;
//    用 first ，last 表明 一个 inclusive的范围，就是包含两端点的范围


    int begin = 0;
    int end = 5;
//    表示 0,1,2,3,4 而不包含end ，即使end也会有歧义，但比较通用，c++标准库就是这样的


    boolean read_ok = true;  // not good
    boolean isRead = true;
    boolean use_http11 = true;

    boolean hasSpace();
//    用 is,has,can,should,need,use......这样的正向描述 前缀布尔变量,或者方法名，防止歧义


    int getAvg();

    int size();

    int computAvg();

    int countSize();
//    用getXXX, 容易让人误以为这是一个很快返回的方法
//    但是 用 computeXXX，别人就会知道只是一个复杂耗时的方法


//    总而言之，命名，要避免歧义，使用跟精准的名字


}
