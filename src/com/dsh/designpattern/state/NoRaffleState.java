package com.dsh.designpattern.state;

/**
 * @author DSH
 * @date 2020/7/16
 * @description  不能抽奖的状态
 */
public class NoRaffleState extends State {

    // 初始化时传入活动引用，扣除积分后改变其状态
    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    //当前状态是可以扣积分的，扣除后，将状态设置成抽象状态
    @Override
    public void deduceMoney() {
        System.out.println("扣除 50 积分成功，您可以抽奖了");
        activity.setState(activity.getCanRaffleState());
    }

    @Override
    public boolean raffle() {
        System.out.println("扣了积分才能抽奖喔！");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品");
    }
}
