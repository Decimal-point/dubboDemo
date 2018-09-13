package com.lin.dubbo;

import java.util.ArrayList;
import java.util.List;

public class ApiServiceImpl implements ApiService {
    @Override
    public List<String> getPession(Long id) {
        ArrayList<String> list = new ArrayList<>();
        list.add(String.format("pession_%d",id-1));
        list.add(String.format("pession_%d",id));
        list.add(String.format("pession_%d",id+1));
        return list;
    }
}
