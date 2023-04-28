package com.epam.collections.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> dishes = new LinkedList<>();
        List<Integer> dishOrder = new LinkedList<>();

        for(int i=1; i<=numberOfDishes; i++) {
            dishes.add(i);
        }

        int dishNum = 0;
        while (!dishes.isEmpty()) {
            Integer dish = dishes.remove();
            dishNum++;

            if(dishNum == everyDishNumberToEat) {
                dishOrder.add(dish);
                dishNum = 0;
            } else {
                dishes.add(dish);
            }
        }

        return dishOrder;
    }
}
