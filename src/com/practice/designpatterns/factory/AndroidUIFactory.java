package com.practice.designpatterns.factory;

import com.practice.designpatterns.factory.components.button.AndroidButton;
import com.practice.designpatterns.factory.components.button.Button;
import com.practice.designpatterns.factory.components.dropdown.AndroidDropDown;
import com.practice.designpatterns.factory.components.dropdown.DropDown;
import com.practice.designpatterns.factory.components.menu.AndroidMenu;
import com.practice.designpatterns.factory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
