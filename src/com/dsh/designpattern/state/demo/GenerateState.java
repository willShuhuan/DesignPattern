package com.dsh.designpattern.state.demo;

/**
 * @author DSH
 * @date 2020/7/16
 * @description
 */
public class GenerateState extends AbstractState {
    @Override
    public void checkEvent(Context context) { context.setState(new ReviewState());
    }


    @Override
    public void checkFailEvent(Context context) { context.setState(new FeedBackState());
    }


    @Override
    public String getCurrentState() {
        return StateEnum.GENERATE.getValue();
    }

}
