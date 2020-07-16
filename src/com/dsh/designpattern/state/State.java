package com.dsh.designpattern.state;

/**
 * @author DSH
 * @date 2020/7/16
 * @description
 */
public abstract class State {
    abstract void deduceMoney();//扣除积分 -50
    abstract boolean raffle();//是否抽中奖品
    abstract void dispensePrize();//发放奖品
}
