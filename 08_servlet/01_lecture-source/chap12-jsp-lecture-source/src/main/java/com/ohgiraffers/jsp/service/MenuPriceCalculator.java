package com.ohgiraffers.jsp.service;

public class MenuPriceCalculator {


    public int calcTotalPrice(String menuName, int amount) {

        int totalPrice = 0;

        switch (menuName) {
            case "햄버거" :
                    totalPrice = 9000 * amount; break;
            case "짜짱면" :
                    totalPrice = 7000 * amount; break;
            case "불고기백반" :
                    totalPrice = 11000 * amount; break;
            case "순대국" :
                    totalPrice = 8000 * amount; break;
        }

        return totalPrice;
    }
}
