package com.practice.designpatterns.factory;

import com.practice.designpatterns.factory.components.button.Button;
import com.practice.designpatterns.factory.components.button.WindowsButton;
import com.practice.designpatterns.factory.components.dropdown.DropDown;
import com.practice.designpatterns.factory.components.dropdown.WindowsDropDown;
import com.practice.designpatterns.factory.components.menu.Menu;
import com.practice.designpatterns.factory.components.menu.WindowsMenu;

public class WindowsFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new WindowsDropDown();
    }
}
