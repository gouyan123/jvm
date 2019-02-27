package com.gupao.edu.vip.course.chaper2;

public class StackAllocation {

    public StackAllocation obj;

    /**方法内的局部变量 跑到了方法外面
     * 逃逸
     * @return
     */
    public StackAllocation getInstance(){
        return  obj == null?new StackAllocation():obj;
    }

    /**方法内的局部变量 跑到了方法外面
     * 逃逸
     * @return
     */
    public void setObj() {
        this.obj = new StackAllocation();
    }

    /**
     * 没有逃逸
     * 方法内 没有逃逸的 局部变量 在栈内存分配空间
     */
    public void useStackAllocation(){
        StackAllocation stackAllocation = new StackAllocation();
    }
}
