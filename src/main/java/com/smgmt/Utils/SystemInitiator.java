package com.smgmt.Utils;

import java.util.Scanner;

import com.smgmt.Helpers.Menu;

public class SystemInitiator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Menu ob = new Menu();
        ob.displayMainMenu(sc);
    }
}
