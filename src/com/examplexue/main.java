package com.examplexue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class main {
    public static void main(String[] args){

        testClass test = new testClass();
        test.setTest1("test1");
        test.setTest2("test2");
        //输出读取前设置的字符
        System.out.println("test1: " + test.getTest1());
        System.err.println("test2: " + test.getTest2());

        try {
            //创建文件test.txt
            ObjectOutputStream os = new ObjectOutputStream(
                    new FileOutputStream("D:/test.txt"));
            os.writeObject(test); // 将test对象写进文件
            os.flush();
            os.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("===========================================");
        //下面是输出文件内容
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream(
                    "D:/test.txt"));
            test = (testClass) is.readObject(); // 从流中读取User的数据
            is.close();
            //输出从文件中取出
            System.out.println("test1: " + test.getTest1());
            System.err.println("test2: " + test.getTest2());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    }
