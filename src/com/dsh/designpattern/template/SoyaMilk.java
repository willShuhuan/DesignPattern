package com.dsh.designpattern.template;

/**
 * @author DSH
 * @date 2020/7/8
 * @description
 */
public abstract class SoyaMilk {
    //模板方法 make  一般声明为final  防止子类重写
    final void make(){
        select();
        if (customerWantCondiments()) {
            addCondiments();
        }
        soak();
        beat();
    }

    //选材
    void select(){
        System.out.println("第一步，选择好的新鲜黄豆");
    }

    //添加不同配料，子类具体实现
    abstract void addCondiments();

    //浸泡
     void soak(){
        System.out.println("第三步，黄豆和配料开始浸泡，需要3个小时");
    }

    //打豆浆
    void beat(){
        System.out.println("第四步，黄豆和配料放到豆浆机去打碎");
    }

    //钩子方法，决定是否需要添加配料
    boolean customerWantCondiments() {
        return true;
    }


}
