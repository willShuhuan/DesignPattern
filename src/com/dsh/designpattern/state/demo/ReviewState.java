package com.dsh.designpattern.state.demo;

/**
 * @author DSH
 * @date 2020/7/16
 * @description
 */
public class ReviewState extends AbstractState{
    @Override
    public void makePriceEvent(Context context) { context.setState(new PublishState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.REVIEWED.getValue();
    }
}
