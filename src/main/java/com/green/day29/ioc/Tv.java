package com.green.day29.ioc;



public abstract class Tv {
    protected Speaker speaker;
    protected boolean isMute;

    public void toggleMute () {
        isMute = !isMute;
    }
    public void sound() {
        if (!isMute) {
            speaker.sound();
        }
    }
}
