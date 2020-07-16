package com.dsh.designpattern.state.demo;

/**
 * @author DSH
 * @date 2020/7/16
 * @description
 */
public class Context extends AbstractState{
    //当前的状态 state, 根据我们的业务流程处理，不停的变化
    private State state;


    @Override
    public void checkEvent(Context context) { state.checkEvent(this); getCurrentState();
    }


    @Override
    public void checkFailEvent(Context context) { state.checkFailEvent(this); getCurrentState();
    }

    @Override
    public void makePriceEvent(Context context) { state.makePriceEvent(this); getCurrentState();
    }


    @Override
    public void acceptOrderEvent(Context context) { state.acceptOrderEvent(this); getCurrentState();
    }


    @Override
    public void notPeopleAcceptEvent(Context context) { state.notPeopleAcceptEvent(this); getCurrentState();
    }

    @Override
    public void payOrderEvent(Context context) { state.payOrderEvent(this); getCurrentState();
    }

    @Override
    public void orderFailureEvent(Context context) { state.orderFailureEvent(this); getCurrentState();
    }


    @Override
    public void feedBackEvent(Context context) { state.feedBackEvent(this); getCurrentState();
    }


    public State getState() { return state;
    }


    public void setState(State state) { this.state = state;
    }


    @Override
    public String getCurrentState() {
        System.out.println("当前状态 : " + state.getCurrentState()); return state.getCurrentState();
    }



}
