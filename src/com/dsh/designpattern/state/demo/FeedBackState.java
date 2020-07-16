package com.dsh.designpattern.state.demo;

/**
 * @author DSH
 * @date 2020/7/16
 * @description
 */

//各种具体状态类
class FeedBackState extends AbstractState {

    @Override
    public String getCurrentState() {
        return StateEnum.FEED_BACKED.getValue();
    }
}
