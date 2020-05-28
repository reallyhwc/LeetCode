package com.xuhu.LeetCode.mid.midBefore200.mid0146;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author xuhu
 * @date 2020-05-27 19:26
 */
class LRUCache01 {


    private int capacity;
    private Map<Integer,Long> times;
    private Map<Integer,Integer> keyValue;

    public LRUCache01(int capacity) {
        times = new HashMap<>();
        keyValue = new HashMap<>();
        this.capacity = capacity;
    }

    public int get(int key) {
        if(!keyValue.containsKey(key)){
            return -1;
        }else {
            times.put(key,System.currentTimeMillis());
            return keyValue.get(key);
        }
    }

    public void put(int key, int value) {
        if(keyValue.containsKey(key)){
            // 原有key存在，更新一下即可
            times.put(key,System.currentTimeMillis());
            keyValue.put(key,value);
        }else {
            while (keyValue.size() >= capacity){
                removeByKey(getLastKey());
            }
            keyValue.put(key,value);
            times.put(key,System.currentTimeMillis());
        }
    }

    /**
     * 获取Last的key
     * @return last key
     */
    private Integer getLastKey(){
        Set<Map.Entry<Integer,Long>> entries = times.entrySet();
        Integer ansKey = null;
        long lastTime = Long.MAX_VALUE;
        for (Map.Entry<Integer,Long> entry : entries){
            if(entry.getValue() < lastTime){
                lastTime = entry.getValue();
                ansKey = entry.getKey();
            }
        }
        return ansKey;
    }

    private void removeByKey(Integer key){
        keyValue.remove(key);
        times.remove(key);
    }
}