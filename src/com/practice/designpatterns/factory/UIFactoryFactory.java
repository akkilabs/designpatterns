package com.practice.designpatterns.factory;

import com.practice.designpatterns.factory.SupportedPlatform;
import com.practice.designpatterns.factory.UIFactory;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(SupportedPlatform platform){

      /*  if(platform.equals(SupportedPlatform.ANDROID))
            return new AndroidUIFactory();
        else
            return new IOSUIFactory();    */


//Instead of if -- else better implement same in switch case

            return switch (platform){
                case ANDROID -> new AndroidUIFactory();
                case IOS -> new IOSUIFactory();
                case WINDOW -> new WindowsFactory();
            };

/*
    UIFactory --> creates objects of UI elements like Button, Menu, DropDown etc.
    UIFactoryFactory --> creates objects of UIFactory like AndroidFactory, IOSFactory etc.
    */

    }
}
