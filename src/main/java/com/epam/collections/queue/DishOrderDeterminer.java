package com.epam.collections.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> dishes = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<=numberOfDishes; i++) {
            dishes.add(i);
        }

        int dishnum = 0;
        while (!dishes.isEmpty()){
            Integer dish = dishes.remove();
            dishnum++;

            if(dishnum!=everyDishNumberToEat){
                dishes.add(dish);
            } else {
                dishnum =0;
                queue.add(dish);
            }
        }

        return queue.stream().toList();
    }
}
