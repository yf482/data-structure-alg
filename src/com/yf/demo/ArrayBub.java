package com.yf.demo;

/**
 * @author yunfeng
 * @version V.1.0
 * @title
 * @Desc bubble sort
 * @create 2017-11-22 0:30
 **/
public class ArrayBub {
    private long [] a;
    private int nElems;


    public ArrayBub(int max){
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }

    public void display(){
        for(int i=0; i<nElems;i++){
            System.out.println(a[i] + " ");
        }
    }

    public void bubbleSort(){
        int out,in;
        for( out = nElems -1; out>1;out--){
            for(in =0 ; in<out;in++){
                if(a[in] > a[in+1]){
                    swap(in, in+1);
                }
            }
        }
    }

    private void swap(int in, int out) {
        long temp = a[in];
        a[in] = a[out];
        a[out] = temp;
    }

    public static void main(String[] args) {
        int maxSize = 50;
        ArrayBub arr = new ArrayBub(maxSize);

        arr.insert(12);
        arr.insert(10);
        arr.insert(11);
        arr.insert(19);
        arr.insert(14);
        arr.display();
        System.out.println("-------");
        arr.bubbleSort();
        arr.display();
    }

}
