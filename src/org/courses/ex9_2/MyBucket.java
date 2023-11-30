package org.courses.ex9_2;

import java.util.ArrayList;
import java.util.List;

class MyList<T extends Number>{

    private List<T> container;

    public MyList() {
        this.container = new ArrayList<>();
    }

    public T getElement(int index) {
        return this.container.get(index);
    }

    public void add(T t){
        this.container.add(t);
    }

    public int getSize(){
       return this.container.size();
    }

}
