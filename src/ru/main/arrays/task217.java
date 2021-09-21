package ru.main.arrays;

import java.util.HashSet;
import java.util.Set;

public class task217 {
    //https://leetcode.com/problems/contains-duplicate/

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n: nums){
            if(set.contains(n)) return true;
            set.add(n);
        }
        return false;
    }
}