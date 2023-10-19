package com.practice.designpatterns.factory;

import com.practice.designpatterns.factory.UIFactory;
import com.practice.designpatterns.factory.components.button.Button;
import com.practice.designpatterns.factory.components.button.IOSButton;
import com.practice.designpatterns.factory.components.dropdown.DropDown;
import com.practice.designpatterns.factory.components.dropdown.IOSDropDown;
import com.practice.designpatterns.factory.components.menu.IOSMenu;
import com.practice.designpatterns.factory.components.menu.Menu;

public class IOSUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }
}
